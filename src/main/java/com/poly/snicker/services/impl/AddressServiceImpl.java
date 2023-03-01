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
        return addressRepository.findAll();
    }

    @Override
    public List<Address> findAll(Sort sort) {
        return addressRepository.findAll(sort);
    }

    @Override
    public List<Address> findAllById(Iterable<Long> longs) {
        return addressRepository.findAllById(longs);
    }

    @Override
    public <S extends Address> List<S> saveAll(Iterable<S> entities) {
        return addressRepository.saveAll(entities);
    }

    @Override
    public void flush() {
        addressRepository.flush();
    }

    @Override
    public <S extends Address> S saveAndFlush(S entity) {
        return addressRepository.saveAndFlush(entity);
    }

    @Override
    public <S extends Address> List<S> saveAllAndFlush(Iterable<S> entities) {
        return addressRepository.saveAllAndFlush(entities);
    }

    @Override
    @Deprecated
    public void deleteInBatch(Iterable<Address> entities) {
        addressRepository.deleteInBatch(entities);
    }

    @Override
    public void deleteAllInBatch(Iterable<Address> entities) {
        addressRepository.deleteAllInBatch(entities);
    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {
        addressRepository.deleteAllByIdInBatch(longs);
    }

    @Override
    public void deleteAllInBatch() {
        addressRepository.deleteAllInBatch();
    }

    @Override
    @Deprecated
    public Address getOne(Long aLong) {
        return addressRepository.getOne(aLong);
    }

    @Override
    @Deprecated
    public Address getById(Long aLong) {
        return addressRepository.getById(aLong);
    }

    @Override
    public Address getReferenceById(Long aLong) {
        return addressRepository.getReferenceById(aLong);
    }

    @Override
    public <S extends Address> List<S> findAll(Example<S> example) {
        return addressRepository.findAll(example);
    }

    @Override
    public <S extends Address> List<S> findAll(Example<S> example, Sort sort) {
        return addressRepository.findAll(example, sort);
    }

    @Override
    public Page<Address> findAll(Pageable pageable) {
        return addressRepository.findAll(pageable);
    }

    @Override
    public <S extends Address> Optional<S> findOne(Example<S> example) {
        return addressRepository.findOne(example);
    }

    @Override
    public <S extends Address> Page<S> findAll(Example<S> example, Pageable pageable) {
        return addressRepository.findAll(example, pageable);
    }

    @Override
    public <S extends Address> long count(Example<S> example) {
        return addressRepository.count(example);
    }

    @Override
    public <S extends Address> boolean exists(Example<S> example) {
        return addressRepository.exists(example);
    }

    @Override
    public <S extends Address, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return addressRepository.findBy(example, queryFunction);
    }
}
