/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.huwng05.covid19;

import java.time.LocalDate;

/**
 *
 * @author huwng05
 */
public class VaccineRecord {
    private Vaccine vaccine;
    private LocalDate day;
    private String location;

    public VaccineRecord(Vaccine vaccine, String day, String location) {
        this.vaccine = vaccine;
        this.day = LocalDate.parse(day,Config.DATE_FORMATTER);
        this.location = location;
    }
            
}
