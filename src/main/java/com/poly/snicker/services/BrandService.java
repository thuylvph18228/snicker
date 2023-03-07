package com.poly.snicker.services;

import com.poly.snicker.models.Brand;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public interface BrandService {
    public List<Brand> findAll();

    public Brand findById(Integer id) ;

    public Brand create(Brand product) ;

    public Brand update(Brand product) ;

    public void delete(Integer id) ;
}
