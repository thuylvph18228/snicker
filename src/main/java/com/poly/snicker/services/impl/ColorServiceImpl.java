package com.poly.snicker.services.impl;

import com.poly.snicker.models.Colors;
import com.poly.snicker.repositories.ColorRepository;
import com.poly.snicker.services.ColorService;
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
public class ColorServiceImpl implements ColorService {

    @Autowired
    ColorRepository colorRepository;


    @Override
    public List<Colors> findAll() {
        return null;
    }

    @Override
    public Colors findById(Integer id) {
        return null;
    }

    @Override
    public Colors create(Colors product) {
        return null;
    }

    @Override
    public Colors update(Colors product) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
