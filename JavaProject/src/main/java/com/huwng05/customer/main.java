/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.huwng05.customer;

import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author huwng05
 */
public class main {
    public static void main(String[] args) {
        try {
            QLKH customers = new QLKH("src/main/resources/khachhang.txt");
            customers.sort();
            System.out.println(customers);
            customers.saveFile("src/main/resources/Top10.txt");
        } catch (CusException.ErrorCreateCustomer ex) {
            System.out.println(ex.getMessage());
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
