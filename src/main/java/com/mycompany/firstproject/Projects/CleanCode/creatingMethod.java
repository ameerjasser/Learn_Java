/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstproject.Projects.CleanCode;

/**
 *
 * @author User
 */
public class creatingMethod {
    public static void main(String[] args) {
        String greet = greetUser("Amir","Baniowda");
        System.out.println(greet);
    }
    
    public static String greetUser(String firstName, String lastName){
        return "Hello " + firstName + " " +lastName;
    }
}
