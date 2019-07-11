package com.Service;

import com.Model.Product;
import com.codegym.repository.Repository.ProductRepository;

public class ProductService implements GeneralService<Product> {
    ProductRepository productRepository = new ProductRepository();
    @Override
    public Product[] showlist() {
        return productRepository.showlist();
    }

    @Override
    public void add(int index, Product product) {
        productRepository.add(index,product );
    }

    @Override
    public Product remove(int index) {
        return productRepository.remove(index);
    }

    @Override
    public Product set(int index, Product product) {
        return productRepository.set(index,product);
    }

    @Override
    public int find(String productName) {
        return productRepository.find(productName);
    }

    @Override
    public Product[] sort() {
        return productRepository.sort();}

    @Override
    public int size() {
        return productRepository.size();
    }
}
