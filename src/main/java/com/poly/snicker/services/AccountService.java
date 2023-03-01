package com.poly.snicker.services;

import com.poly.snicker.models.Account;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public interface AccountService {
    List<Account> findAll();

    List<Account> findAll(Sort sort);

    List<Account> findAllById(Iterable<Integer> longs);

    <S extends Account> List<S> saveAll(Iterable<S> entities);

    void flush();

    <S extends Account> S saveAndFlush(S entity);

    <S extends Account> List<S> saveAllAndFlush(Iterable<S> entities);

    @Deprecated
    void deleteInBatch(Iterable<Account> entities);

    void deleteAllInBatch(Iterable<Account> entities);

    void deleteAllByIdInBatch(Iterable<Long> longs);

    void deleteAllInBatch();

    @Deprecated
    Account getOne(Long aLong);

    @Deprecated
    Account getById(Long aLong);

    Account getReferenceById(Long aLong);

    <S extends Account> List<S> findAll(Example<S> example);

    <S extends Account> List<S> findAll(Example<S> example, Sort sort);

    Page<Account> findAll(Pageable pageable);

    <S extends Account> Optional<S> findOne(Example<S> example);

    <S extends Account> Page<S> findAll(Example<S> example, Pageable pageable);

    <S extends Account> long count(Example<S> example);

    <S extends Account> boolean exists(Example<S> example);

    <S extends Account, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction);
}
