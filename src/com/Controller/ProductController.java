package com.Controller;

import com.Model.Product;
import com.Service.ProductService;

public class ProductController {
    ProductService productService = new ProductService();

    public void add(int index, Product student) {
        productService.add(index, student);
    }

    public Product remove(int index) {
        return productService.remove(index);
    }

    public Product set(int index, Product product) {
        return productService.set(index, product);
    }

    public int find(String productName) {
        return productService.find(productName);
    }

    public Product[] showlist() {
        return productService.showlist();
    }

    public int size() {
        return productService.size();
    }

    public void sort() {
        productService.sort();
    }
}
