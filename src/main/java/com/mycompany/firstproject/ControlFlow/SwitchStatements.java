/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstproject.ControlFlow;

/**
 *
 * @author User
 */
public class SwitchStatements {
    public static void main(String[] args) {
        String role = "Admin";
        switch (role){
            case "Admin":
                System.out.println("You're an admin");
                break;
            case "admin":
                System.out.println("You're a moderator");
                break;
            default:
                System.out.println("You're a guest");
            
        }
    }
}
