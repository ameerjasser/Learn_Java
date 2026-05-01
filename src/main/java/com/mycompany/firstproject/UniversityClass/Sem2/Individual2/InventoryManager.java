package com.mycompany.firstproject.UniversityClass.Sem2.Individual2;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class InventoryManager {
    private ArrayList<Integer> ids = new ArrayList<Integer>();
    private ArrayList<String> names = new ArrayList<String>();
    private ArrayList<Double> prices = new ArrayList<Double>();
    private ArrayList<Integer> Stock = new ArrayList<Integer>();
    private int productNumber =0;
    private Product[] products;

    public InventoryManager(){
        loadFromFile("Inventory.txt");
        saveToFile();
    }
    public void addProduct(Product p){
        if (isExist(p)){
            System.out.println("This product is already here!!");    //p.increaseStock();
            return;
        }

        ids.add(p.getId());
        names.add(p.getName());
        prices.add(p.getPrice());
        // new Product(p.getId(), p.getName(), p.getPrice());
    }

    private boolean isExist(Product p) {
        for(int i=0;i<ids.size();i++){
            if(ids.get(i).equals(p.getId())){
                return true;
            }
        }
        return false;
    }

    public void saveToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt", true))) {
            for(int i=0; i<productNumber; i++) {
                writer.write(ids.get(i).toString() +","+
                        names.get(i) +","+
                        prices.get(i).toString() +","+
                        Stock.get(i).toString());
                writer.newLine(); // Adds a platform-independent newline
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadFromFile(String filename) {
        try (Scanner sc = new Scanner(new File(filename))) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] values = line.split(","); // Use your delimiter here
                if (values.length >= 4) {
                    ids.add(Integer.parseInt(values[0]));
                    names.add(values[1]);
                    prices.add(Double.parseDouble(values[2]));
                    Stock.add(Integer.parseInt(values[3]));
                    // Process the four values
                    productNumber++;
                }
            }
        } catch (FileNotFoundException e) { e.printStackTrace(); }
    }
}
