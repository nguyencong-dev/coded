/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.huwng05.customer;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author huwng05
 */
public class Config {
    public final static DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public final static DecimalFormat BIG_FORMATTER = new DecimalFormat("###,###,###,###");
    public final static int NUM_CUSTOMER = 46;
}
