/*
 *
 * You can use the following import statements
 * 
 * import org.springframework.beans.factory.annotation.Autowired;
 * import org.springframework.web.bind.annotation.*;
 * import java.util.ArrayList;
 * 
 */

package com.example.nxttrendz2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

import com.example.nxttrendz2.model.Product;
import com.example.nxttrendz2.service.ProductJpaService;
import com.example.nxttrendz2.repository.ProductRepository;
import com.example.nxttrendz2.model.Category;
import com.example.nxttrendz2.service.CategoryJpaService;

@RestController

public class ProductController {

    @Autowired
    public ProductJpaService productJpaService;

    @GetMapping("/categories/products")
    public ArrayList<Product> getProducts() {
        return productJpaService.getProducts();
    }

    @GetMapping("/categories/products/{productId}")
    public Product getProductById(@PathVariable("productId") int productId) {
        return productJpaService.getProductbyId(productId);
    }

    @PostMapping("/categories/products")
    public Product addProduct(@RequestBody Product product) {
        return productJpaService.addProduct(product);
    }

    @PutMapping("/categories/products/{productId}")
    public Product updateProduct(@PathVariable("productId") int productId, @RequestBody Product product) {
        return productJpaService.updateProduct(productId, product);
    }

    @DeleteMapping("/categories/products/{productId}")
    public void deleteProduct(@PathVariable("productId") int productId) {
        productJpaService.deleteProduct(productId);
    }

    @GetMapping("/products/{productId}/category")
    public Category getProductCategory(@PathVariable("productId") int productId) {
        return productJpaService.getProductCategory(productId);
    }
}