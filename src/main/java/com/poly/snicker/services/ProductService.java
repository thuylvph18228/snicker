package com.poly.snicker.services;

import com.poly.snicker.models.Products;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public interface ProductService {
    List<Products> findAll();

    List<Products> findAll(Sort sort);

    List<Products> findAllById(Iterable<Long> longs);

    <S extends Products> List<S> saveAll(Iterable<S> entities);

    void flush();

    <S extends Products> S saveAndFlush(S entity);

    <S extends Products> List<S> saveAllAndFlush(Iterable<S> entities);

    @Deprecated
    void deleteInBatch(Iterable<Products> entities);

    void deleteAllInBatch(Iterable<Products> entities);

    void deleteAllByIdInBatch(Iterable<Long> longs);

    void deleteAllInBatch();

    @Deprecated
    Products getOne(Long aLong);

    @Deprecated
    Products getById(Long aLong);

    Products getReferenceById(Long aLong);

    <S extends Products> List<S> findAll(Example<S> example);

    <S extends Products> List<S> findAll(Example<S> example, Sort sort);

    Page<Products> findAll(Pageable pageable);

    <S extends Products> Optional<S> findOne(Example<S> example);

    <S extends Products> Page<S> findAll(Example<S> example, Pageable pageable);

    <S extends Products> long count(Example<S> example);

    <S extends Products> boolean exists(Example<S> example);

    <S extends Products, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction);
}
