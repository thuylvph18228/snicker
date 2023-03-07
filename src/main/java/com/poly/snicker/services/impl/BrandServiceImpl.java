package com.poly.snicker.services.impl;

import com.poly.snicker.models.Brand;
import com.poly.snicker.repositories.BrandRepository;
import com.poly.snicker.services.BrandService;
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
public class BrandServiceImpl implements BrandService {

    @Autowired
    BrandRepository brandRepository;


    @Override
    public List<Brand> findAll() {
        return null;
    }

    @Override
    public Brand findById(Integer id) {
        return null;
    }

    @Override
    public Brand create(Brand product) {
        return null;
    }

    @Override
    public Brand update(Brand product) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
