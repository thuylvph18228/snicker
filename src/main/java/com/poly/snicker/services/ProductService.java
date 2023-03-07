package com.poly.snicker.services;

import com.poly.snicker.models.Products;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public interface ProductService {
    public List<Products> findAll();

    public Products findById(Integer id) ;

    public Products create(Products product) ;

    public Products update(Products product) ;

    public void delete(Integer id) ;
}
