package com.poly.snicker.services.impl;

import com.poly.snicker.models.Address;
import com.poly.snicker.repositories.AddressRepository;
import com.poly.snicker.services.AddressService;
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
public class AddressServiceImpl implements AddressService {

    @Autowired
    AddressRepository addressRepository;


    @Override
    public List<Address> findAll() {
        return null;
    }

    @Override
    public Address findById(Integer id) {
        return null;
    }

    @Override
    public Address create(Address product) {
        return null;
    }

    @Override
    public Address update(Address product) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
