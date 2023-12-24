/*
 *
 * You can use the following import statements
 * 
 * import java.util.ArrayList;
 * 
 */
package com.example.nxttrendz2.repository;

import java.util.*;
import com.example.nxttrendz2.model.Product;
import com.example.nxttrendz2.model.Category;

public interface ProductRepository {
    ArrayList<Product> getProducts();

    Product getProductbyId(int productId);

    Product addProduct(Product product);

    Product updateProduct(int productId, Product product);

    void deleteProduct(int productId);

    Category getProductCategory(int productId);
}