package com.mycompany.firstproject.UniversityClass.Sem2.Individual2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Management {
    private ArrayList<Integer> ids = new ArrayList<Integer>();
    private ArrayList<String> names;
    private ArrayList<Integer> prices;
    private ArrayList<String> Stocks;

    public Management(){
        try (Scanner sc = new Scanner(new File("Inventory.txt"))) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] values = line.split(","); // Use your delimiter here
                if (values.length >= 4) {
                    ids.add(Integer.parseInt(values[0]));            
                    names.add(values[1]);
                    prices.add(Integer.parseInt(values[2]));
                    Stocks.add(values[3]);
                    // Process your four values
                }
            }
        } catch (FileNotFoundException e) { e.printStackTrace(); }
    }

}
