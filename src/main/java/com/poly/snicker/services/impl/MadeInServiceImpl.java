package com.poly.snicker.services.impl;
import com.poly.snicker.models.Made_In;
import com.poly.snicker.repositories.MadeInRepository;
import com.poly.snicker.services.MadeInService;
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
public class MadeInServiceImpl implements MadeInService {

    @Autowired
    MadeInRepository madeInRepository;

    @Override
    public List<Made_In> findAll() {
        return madeInRepository.findAll();
    }

    @Override
    public List<Made_In> findAll(Sort sort) {
        return madeInRepository.findAll(sort);
    }

    @Override
    public List<Made_In> findAllById(Iterable<Long> longs) {
        return madeInRepository.findAllById(longs);
    }

    @Override
    public <S extends Made_In> List<S> saveAll(Iterable<S> entities) {
        return madeInRepository.saveAll(entities);
    }

    @Override
    public void flush() {
        madeInRepository.flush();
    }

    @Override
    public <S extends Made_In> S saveAndFlush(S entity) {
        return madeInRepository.saveAndFlush(entity);
    }

    @Override
    public <S extends Made_In> List<S> saveAllAndFlush(Iterable<S> entities) {
        return madeInRepository.saveAllAndFlush(entities);
    }

    @Override
    @Deprecated
    public void deleteInBatch(Iterable<Made_In> entities) {
        madeInRepository.deleteInBatch(entities);
    }

    @Override
    public void deleteAllInBatch(Iterable<Made_In> entities) {
        madeInRepository.deleteAllInBatch(entities);
    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {
        madeInRepository.deleteAllByIdInBatch(longs);
    }

    @Override
    public void deleteAllInBatch() {
        madeInRepository.deleteAllInBatch();
    }

    @Override
    @Deprecated
    public Made_In getOne(Long aLong) {
        return madeInRepository.getOne(aLong);
    }

    @Override
    @Deprecated
    public Made_In getById(Long aLong) {
        return madeInRepository.getById(aLong);
    }

    @Override
    public Made_In getReferenceById(Long aLong) {
        return madeInRepository.getReferenceById(aLong);
    }

    @Override
    public <S extends Made_In> List<S> findAll(Example<S> example) {
        return madeInRepository.findAll(example);
    }

    @Override
    public <S extends Made_In> List<S> findAll(Example<S> example, Sort sort) {
        return madeInRepository.findAll(example, sort);
    }

    @Override
    public Page<Made_In> findAll(Pageable pageable) {
        return madeInRepository.findAll(pageable);
    }

    @Override
    public <S extends Made_In> Optional<S> findOne(Example<S> example) {
        return madeInRepository.findOne(example);
    }

    @Override
    public <S extends Made_In> Page<S> findAll(Example<S> example, Pageable pageable) {
        return madeInRepository.findAll(example, pageable);
    }

    @Override
    public <S extends Made_In> long count(Example<S> example) {
        return madeInRepository.count(example);
    }

    @Override
    public <S extends Made_In> boolean exists(Example<S> example) {
        return madeInRepository.exists(example);
    }

    @Override
    public <S extends Made_In, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return madeInRepository.findBy(example, queryFunction);
    }
}
