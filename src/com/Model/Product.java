package com.Model;

import java.util.Scanner;

public class Product {
    private int id;
    private String name;
    private double price;
    private String descripyion;

    public Product() {
    }

    public Product(int id, String name, double price, String descripyion) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.descripyion = descripyion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescripyion() {
        return descripyion;
    }

    public void setDescripyion(String descripyion) {
        this.descripyion = descripyion;
    }
    public void setProductInfo() {
        Scanner input = new Scanner(System.in);
        System.out.println("ID:");
        this.id = input.nextInt();
        input.nextLine();
        System.out.println("Name:");
        this.name = input.nextLine();
        System.out.println("Price:");
        this.price = input.nextDouble();
        input.nextLine();
        System.out.println("Description:");
        this.descripyion = input.nextLine();
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", descripyion='" + descripyion + '\'' +
                '}';
    }

}
