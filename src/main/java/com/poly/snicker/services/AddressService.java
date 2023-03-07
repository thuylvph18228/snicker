package com.poly.snicker.services;

import com.poly.snicker.models.Address;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public interface AddressService {
    public List<Address> findAll();

    public Address findById(Integer id) ;

    public Address create(Address product) ;

    public Address update(Address product) ;

    public void delete(Integer id) ;
}
