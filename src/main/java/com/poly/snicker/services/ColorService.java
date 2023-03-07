package com.poly.snicker.services;

import com.poly.snicker.models.Colors;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public interface ColorService {
    public List<Colors> findAll();

    public Colors findById(Integer id) ;

    public Colors create(Colors product) ;

    public Colors update(Colors product) ;

    public void delete(Integer id) ;
}
