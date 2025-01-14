/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.huwng05.customer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author huwng05
 */
public class QLKH {
    private List<KhachHang> customers = new ArrayList<>();
    private String filePath;

    public QLKH(String filePath) throws CusException.ErrorCreateCustomer, FileNotFoundException {
        this.filePath = filePath;
        this.loadFile();
    }
    
    
    private void loadFile() throws CusException.ErrorCreateCustomer, FileNotFoundException {
        try (Scanner sc = new Scanner(new File(filePath))){
            while (sc.hasNextLine()) {
                String line = sc.nextLine().trim();
                if (line.isEmpty() || line.startsWith("//")) continue;
                String[] inf = line.split(", ");
                if (inf.length == 3) this.customers.add(new KhachHang(inf[0], inf[1],
                new BigDecimal(inf[2])));
                else this.customers.add(new KhanhHangVip(inf[0], inf[1],
                        new BigDecimal(inf[2]), inf[3]));
            }
        } catch (FileNotFoundException ex) {
            throw new FileNotFoundException("File Not Found Exception");
        }
    }

    @Override
    public String toString() {
        StringBuffer str = new StringBuffer("Danh sach khach hang\n");
        this.customers.forEach(cus-> str.append(cus.toString()));
        return str.toString();
    }  
    
    public KhachHang find(String hoTen) {
        KhachHang acc = this.customers.stream().filter(cus -> cus.getHoTen().equals(hoTen)).findFirst()
                .orElse(null);
        return acc;
    }
    
    public void sort() {
        Collections.sort(this.customers, Comparator.reverseOrder());
    }
    
    public void saveFile(String file) {
        File save = new File(file);
        try (PrintWriter w = new PrintWriter(save)){
            for (int i = 0; i < 10; i++) {
                w.print(this.customers.get(i).toString());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(QLKH.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
