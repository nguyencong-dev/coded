/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.huwng05.library;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 *
 * @author huwng05
 */
public class QLSP {
    List<SanPham> list = new ArrayList<>();
    private String filePath;
    private static String sources = "com.huwng05.library";    
    public void add(SanPham... p) {
        list.addAll(List.of(p));
    }

    public QLSP(String filePath) {
        this.filePath = filePath;
    }

    public QLSP() {
        this.filePath = null;
    }
    
    public void loadFile() {
        try(Scanner file = new Scanner(new File(this.filePath))) {
            while(file.hasNextLine()) {
                String line = file.nextLine().trim();
                if (line == "" || line.startsWith("\\")) continue;
                String[] inf = line.split(", ");
                String path = sources + "." + inf[0];
                    Class<?> clazz = Class.forName(path);
                    Constructor<?> constuctor = clazz.getConstructor(
                    String.class, String.class, BigDecimal.class, int.class);
                    SanPham obj = (SanPham) constuctor.newInstance(inf[1], inf[2], new  BigDecimal(inf[3]),
                            Integer.parseInt(inf[4]));
                    this.list.add(obj);               
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public SanPham find(String id) {
        SanPham tmp = list.stream().filter(p->p.getMaSanPham().equals(id))
                .findFirst().orElse(null);
        return tmp;
    }
    
    public List<SanPham> find(String name, String classPath) {
        try {
            if (classPath.trim()=="") classPath="com.huwng05.library.SanPham";
            Class<?> classFind = Class.forName(classPath);
            return list.stream().filter(p->p.getTenSanPham().contains(name)
                    && classFind.isInstance(p)).collect(Collectors.toList());
        } catch (ClassNotFoundException ex) {
            System.out.print(ex.getMessage());
            return List.of();
        }
    }
    
    public void show() {
        this.list.forEach(p->System.out.print(p));
    }
    
    public List<SanPham> findName(String name) {
        return find(name,"");
    }
    
    public void remove (String id) {
        SanPham p = this.find(id);
        if (p == null) try {
            throw new Error.ProductNotFound();
        } catch (Error.ProductNotFound ex) {
            System.out.println(ex.getMessage());
        }
        list.remove(p);
    }
    
    public List<SanPham> sort() {
        List<SanPham> tmp = this.list;
        Collections.sort(tmp, Comparator.reverseOrder());
        return tmp;
    }
    
    public List<SanPham> getList() {
        return list;
    }

    public void setList(List<SanPham> list) {
        this.list = list;
    }
    
}
