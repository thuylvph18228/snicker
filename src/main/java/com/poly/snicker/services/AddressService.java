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
    List<Address> findAll();

    List<Address> findAll(Sort sort);

    List<Address> findAllById(Iterable<Long> longs);

    <S extends Address> List<S> saveAll(Iterable<S> entities);

    void flush();

    <S extends Address> S saveAndFlush(S entity);

    <S extends Address> List<S> saveAllAndFlush(Iterable<S> entities);

    @Deprecated
    void deleteInBatch(Iterable<Address> entities);

    void deleteAllInBatch(Iterable<Address> entities);

    void deleteAllByIdInBatch(Iterable<Long> longs);

    void deleteAllInBatch();

    @Deprecated
    Address getOne(Long aLong);

    @Deprecated
    Address getById(Long aLong);

    Address getReferenceById(Long aLong);

    <S extends Address> List<S> findAll(Example<S> example);

    <S extends Address> List<S> findAll(Example<S> example, Sort sort);

    Page<Address> findAll(Pageable pageable);

    <S extends Address> Optional<S> findOne(Example<S> example);

    <S extends Address> Page<S> findAll(Example<S> example, Pageable pageable);

    <S extends Address> long count(Example<S> example);

    <S extends Address> boolean exists(Example<S> example);

    <S extends Address, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction);
}
