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
    List<Colors> findAll();

    List<Colors> findAll(Sort sort);

    List<Colors> findAllById(Iterable<Long> longs);

    <S extends Colors> List<S> saveAll(Iterable<S> entities);

    void flush();

    <S extends Colors> S saveAndFlush(S entity);

    <S extends Colors> List<S> saveAllAndFlush(Iterable<S> entities);

    @Deprecated
    void deleteInBatch(Iterable<Colors> entities);

    void deleteAllInBatch(Iterable<Colors> entities);

    void deleteAllByIdInBatch(Iterable<Long> longs);

    void deleteAllInBatch();

    @Deprecated
    Colors getOne(Long aLong);

    @Deprecated
    Colors getById(Long aLong);

    Colors getReferenceById(Long aLong);

    <S extends Colors> List<S> findAll(Example<S> example);

    <S extends Colors> List<S> findAll(Example<S> example, Sort sort);

    Page<Colors> findAll(Pageable pageable);

    <S extends Colors> Optional<S> findOne(Example<S> example);

    <S extends Colors> Page<S> findAll(Example<S> example, Pageable pageable);

    <S extends Colors> long count(Example<S> example);

    <S extends Colors> boolean exists(Example<S> example);

    <S extends Colors, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction);
}
