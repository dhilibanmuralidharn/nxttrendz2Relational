/*
 *
 * You can use the following import statements
 * 
 * import org.springframework.data.jpa.repository.JpaRepository;
 * import org.springframework.stereotype.Repository;
 * 
 */

package com.example.nxttrendz2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.nxttrendz2.model.Product;
import com.example.nxttrendz2.model.Category;

@Repository
public interface ProductJpaRepository extends JpaRepository<Product, Integer> {
}