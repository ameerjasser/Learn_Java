/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstproject;

/**
 *
 * @author User
 */
public class StringClass {
    public static void main(String[] args){
        
        String message = ("Hello World" + "!!");
        
        System.out.println(message.endsWith("!!"));
        
        System.out.println(message.startsWith("MA"));
        
        System.out.println(message.length());
        
        System.out.println(message.indexOf("H"));
        // if the syntex or sentens does not exit. it will give you(-1)
        
        message = "Hello! World!!, Amir";
        System.out.println(message.replace("!", "*"));
        // it will replace every (!) to (*)
        
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        
        message = "   Hello Word   ";
        System.out.println(message.trim());
        System.out.println(message);
    }
}
