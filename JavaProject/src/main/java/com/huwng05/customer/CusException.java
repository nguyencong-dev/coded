/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.huwng05.customer;

/**
 *
 * @author huwng05
 */
public class CusException {
    public static class ErrorCreateCustomer extends Exception {
        public ErrorCreateCustomer(String message) {
            super(message);
        }
    }
}
