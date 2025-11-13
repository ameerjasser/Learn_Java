/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstproject.Class;

/**
 *
 * @author User
 */
public class T01 {
    public static void main(String[] args) {
        String string =  "BHAJJSj";
        int isUpperCase = 0;
        for(int i = 0; i<string.length();i++){
            if (string.toUpperCase()== string){
                isUpperCase++;
            }           
        }
        
        if (isUpperCase == string.length())
            System.out.println("All latters are upper case");
        else
            System.out.println("False");
    }
    
}
