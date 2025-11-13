/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstproject.Beginners;

import java.text.NumberFormat;

public class FormattingNumber {
    public static void main(String[] args) {
        
        NumberFormat percent = NumberFormat.getPercentInstance();
        String result = percent.format(5.7);
        System.out.println(result);
    }
    
}
