package com.poly.snicker.services;

import com.poly.snicker.models.Made_In;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public interface MadeInService {
    List<Made_In> findAll();

    List<Made_In> findAll(Sort sort);

    List<Made_In> findAllById(Iterable<Long> longs);

    <S extends Made_In> List<S> saveAll(Iterable<S> entities);

    void flush();

    <S extends Made_In> S saveAndFlush(S entity);

    <S extends Made_In> List<S> saveAllAndFlush(Iterable<S> entities);

    @Deprecated
    void deleteInBatch(Iterable<Made_In> entities);

    void deleteAllInBatch(Iterable<Made_In> entities);

    void deleteAllByIdInBatch(Iterable<Long> longs);

    void deleteAllInBatch();

    @Deprecated
    Made_In getOne(Long aLong);

    @Deprecated
    Made_In getById(Long aLong);

    Made_In getReferenceById(Long aLong);

    <S extends Made_In> List<S> findAll(Example<S> example);

    <S extends Made_In> List<S> findAll(Example<S> example, Sort sort);

    Page<Made_In> findAll(Pageable pageable);

    <S extends Made_In> Optional<S> findOne(Example<S> example);

    <S extends Made_In> Page<S> findAll(Example<S> example, Pageable pageable);

    <S extends Made_In> long count(Example<S> example);

    <S extends Made_In> boolean exists(Example<S> example);

    <S extends Made_In, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction);
}
