package com.example.springbootelasticsearchexample.repo;

import com.example.springbootelasticsearchexample.entity.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.Optional;

public interface ProductRepo extends ElasticsearchRepository<Product,Integer> {

    Optional<Object> findById(int id);

    void deleteById(int id);

    Product save(Product product);

    Iterable<Product> findAll();
}