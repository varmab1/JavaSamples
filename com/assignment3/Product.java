package com.assignment3;

public class Product {
    private double Price;

    public double getPrice() {
        return this.Price;
    }

    public double getPrice(int quantity){
        return quantity*this.Price;
    }

    public void setPrice(double price) {
        this.Price = price;
    }

    public static void main(String[] args) {
        Product ob=new Product();
        ob.setPrice(10.5);
        System.out.println(ob.getPrice());
        System.out.println(ob.getPrice(5));
    }

}
