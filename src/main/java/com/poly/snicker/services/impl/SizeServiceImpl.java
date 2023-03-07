package com.poly.snicker.services.impl;

import com.poly.snicker.models.Sizes;
import com.poly.snicker.repositories.SizeRepository;
import com.poly.snicker.services.SizeService;
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
public class SizeServiceImpl implements SizeService {

    @Autowired
    SizeRepository sizeRepository;

    @Override
    public List<Sizes> findAll() {
        return null;
    }

    @Override
    public Sizes findById(Integer id) {
        return null;
    }

    @Override
    public Sizes create(Sizes product) {
        return null;
    }

    @Override
    public Sizes update(Sizes product) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
