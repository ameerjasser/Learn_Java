/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstproject.ControlFlow;

/**
 *
 * @author User
 */
public class LogicalOperators {
    public static void main(String[] args) {
        
        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        
        boolean isEligible = ((hasHighIncome || hasGoodCredit) && !hasCriminalRecord);
        System.out.println(isEligible);
    }
    
}
