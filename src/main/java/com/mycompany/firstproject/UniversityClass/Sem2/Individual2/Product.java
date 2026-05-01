package com.mycompany.firstproject.UniversityClass.Sem2.Individual2;

public class Product {

    //private Product[] products;
    private int id;
    private String name;
    private double price;
    private int stock =0;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    Product(int id, String name, int price, int stock){
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
//    private boolean isExist(Product p) {
//        for(int i=0;i<products.size();i++){
//            if(products.get(i).equals(p.getId())){
//                return true;
//            }
//        }
//        return false;
//    }
    public int getId() {return id;}
    public void setId(int id) { this.id = id;}

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }
    public void increaseStock(){ stock ++; }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", stock='" + stock + '\'' +
                '}';
    }
}
