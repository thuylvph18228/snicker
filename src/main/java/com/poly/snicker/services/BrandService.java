package com.poly.snicker.services;

import com.poly.snicker.models.Brand;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public interface BrandService {
    List<Brand> findAll();

    List<Brand> findAll(Sort sort);

    List<Brand> findAllById(Iterable<Long> longs);

    <S extends Brand> List<S> saveAll(Iterable<S> entities);

    void flush();

    <S extends Brand> S saveAndFlush(S entity);

    <S extends Brand> List<S> saveAllAndFlush(Iterable<S> entities);

    @Deprecated
    void deleteInBatch(Iterable<Brand> entities);

    void deleteAllInBatch(Iterable<Brand> entities);

    void deleteAllByIdInBatch(Iterable<Long> longs);

    void deleteAllInBatch();

    @Deprecated
    Brand getOne(Long aLong);

    @Deprecated
    Brand getById(Long aLong);

    Brand getReferenceById(Long aLong);

    <S extends Brand> List<S> findAll(Example<S> example);

    <S extends Brand> List<S> findAll(Example<S> example, Sort sort);

    Page<Brand> findAll(Pageable pageable);

    <S extends Brand> Optional<S> findOne(Example<S> example);

    <S extends Brand> Page<S> findAll(Example<S> example, Pageable pageable);

    <S extends Brand> long count(Example<S> example);

    <S extends Brand> boolean exists(Example<S> example);

    <S extends Brand, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction);
}
