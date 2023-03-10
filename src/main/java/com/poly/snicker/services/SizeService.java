package com.poly.snicker.services;

import com.poly.snicker.models.Sizes;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public interface SizeService {
    public List<Sizes> findAll();

    public Sizes findById(Integer id) ;

    public Sizes create(Sizes product) ;

    public Sizes update(Sizes product) ;

    public void delete(Integer id) ;
}
