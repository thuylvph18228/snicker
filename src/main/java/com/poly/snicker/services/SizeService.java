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
    List<Sizes> findAll();

    List<Sizes> findAll(Sort sort);

    List<Sizes> findAllById(Iterable<Long> longs);

    <S extends Sizes> List<S> saveAll(Iterable<S> entities);

    void flush();

    <S extends Sizes> S saveAndFlush(S entity);

    <S extends Sizes> List<S> saveAllAndFlush(Iterable<S> entities);

    @Deprecated
    void deleteInBatch(Iterable<Sizes> entities);

    void deleteAllInBatch(Iterable<Sizes> entities);

    void deleteAllByIdInBatch(Iterable<Long> longs);

    void deleteAllInBatch();

    @Deprecated
    Sizes getOne(Long aLong);

    @Deprecated
    Sizes getById(Long aLong);

    Sizes getReferenceById(Long aLong);

    <S extends Sizes> List<S> findAll(Example<S> example);

    <S extends Sizes> List<S> findAll(Example<S> example, Sort sort);

    Page<Sizes> findAll(Pageable pageable);

    <S extends Sizes> Optional<S> findOne(Example<S> example);

    <S extends Sizes> Page<S> findAll(Example<S> example, Pageable pageable);

    <S extends Sizes> long count(Example<S> example);

    <S extends Sizes> boolean exists(Example<S> example);

    <S extends Sizes, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction);
}