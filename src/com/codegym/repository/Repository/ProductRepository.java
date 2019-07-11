package com.codegym.repository.Repository;

import com.Model.Product;

public class ProductRepository implements GeneralRepository<Product> {
    Product[] listProduct = new Product[SIZE];
    {
        listProduct[0] = new Product(1, "Samsung", 20,"Hang chinh hang");
        listProduct[1] = new Product(2, "Iphone", 5,"Hnag trung quoc");
        listProduct[2] = new Product(3, "Nokia", 24,"Hang viet nam");

    }
    public int size() {
        int size = 0;
        for (int i = 0; i < SIZE; i++) {
            if (listProduct[i] != null) {
                size++;
            }
        }
        return size;
    }

    @Override
    public Product[] showlist() {
        return listProduct;
    }

    @Override
    public void add(int index, Product element) {
        Product[] newListStudents = new Product[SIZE];
        for (int i = 0; i < index; i++) {
            newListStudents[i] = listProduct[i];
        }
        newListStudents[index] = element;
        for (int i = index + 1; i < SIZE; i++) {
            newListStudents[i] = listProduct[i - 1];
        }

        for (int i = 0; i < SIZE; i++) {
            listProduct[i] = newListStudents[i];
        }
    }

    @Override
    public Product remove(int index) {
        Product temp = listProduct[index];
        for (int i = index; i < SIZE - 1; i++) {
            listProduct[i] = listProduct[i + 1];
        }
        return temp;
    }

    @Override
    public Product set(int index, Product product) {
        listProduct[index] = product;
        return listProduct[index];
    }

    @Override
    public int find(String productName) {
        int index = -1;
        for (int i = 0; i < SIZE; i++) {
            if (listProduct[i].getName().equalsIgnoreCase(productName)) {
                index = i;
                break;
            }
        }
        return index;
    }

    @Override
    public Product[] sort() {
        for (int i = 0; i < listProduct.length; i++) {
            if (listProduct[i] != null) {
                for (int j = i; j < listProduct.length; j++) {
                    if (listProduct[j] != null) {
                        if (listProduct[i].getPrice() > listProduct[j].getPrice()) {
                            Product temp = listProduct[i];
                            listProduct[i] = listProduct[j];
                            listProduct[j] = temp;
                        }
                    }
                }
            }
        }return listProduct;
    }
}
