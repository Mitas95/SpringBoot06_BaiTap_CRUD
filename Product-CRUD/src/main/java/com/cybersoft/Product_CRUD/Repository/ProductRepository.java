package com.cybersoft.Product_CRUD.Repository;


import com.cybersoft.Product_CRUD.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository <Product, Long> {
}
