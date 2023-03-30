package com.example.onlineshopapp.respository;

import com.example.onlineshopapp.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {

}
