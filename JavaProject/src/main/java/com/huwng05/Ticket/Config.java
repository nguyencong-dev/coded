/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.huwng05.Ticket;

import java.text.DecimalFormat;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author huwng05
 */
public class Config {
    public static DateTimeFormatter DATE_FOMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public static DecimalFormat BIG_DECIMAL = new DecimalFormat("###,###,###VND");
}
