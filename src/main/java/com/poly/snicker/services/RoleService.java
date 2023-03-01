package com.poly.snicker.services;

import com.poly.snicker.models.Roles;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public interface RoleService {

    public List<Roles> findAll();

    public Roles findById(Integer id) ;

    public Roles create(Roles product) ;

    public Roles update(Roles product) ;

    public void delete(Integer id) ;
}
