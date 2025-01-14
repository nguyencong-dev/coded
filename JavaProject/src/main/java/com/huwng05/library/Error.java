/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.huwng05.library;

/**
 *
 * @author huwng05
 */
public class Error {
    public static class ProductNotFound extends Exception {
        public ProductNotFound() {
            super("Product not found in list");
        }    
    }
}
