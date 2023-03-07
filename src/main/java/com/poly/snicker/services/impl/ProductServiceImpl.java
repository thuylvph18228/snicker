package com.poly.snicker.services.impl;

import com.poly.snicker.models.Products;
import com.poly.snicker.repositories.ProductRepository;
import com.poly.snicker.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;


    @Override
    public List<Products> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Products findById(Integer id) {
        return null;
    }

    @Override
    public Products create(Products product) {
        return null;
    }

    @Override
    public Products update(Products product) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
