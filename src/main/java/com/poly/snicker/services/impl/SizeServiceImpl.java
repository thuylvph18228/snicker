package com.poly.snicker.services.impl;

import com.poly.snicker.models.Sizes;
import com.poly.snicker.repositories.SizeRepository;
import com.poly.snicker.services.SizeService;
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
public class SizeServiceImpl implements SizeService {

    @Autowired
    SizeRepository sizeRepository;

    @Override
    public List<Sizes> findAll() {
        return sizeRepository.findAll();
    }

    @Override
    public List<Sizes> findAll(Sort sort) {
        return sizeRepository.findAll(sort);
    }

    @Override
    public List<Sizes> findAllById(Iterable<Long> longs) {
        return sizeRepository.findAllById(longs);
    }

    @Override
    public <S extends Sizes> List<S> saveAll(Iterable<S> entities) {
        return sizeRepository.saveAll(entities);
    }

    @Override
    public void flush() {
        sizeRepository.flush();
    }

    @Override
    public <S extends Sizes> S saveAndFlush(S entity) {
        return sizeRepository.saveAndFlush(entity);
    }

    @Override
    public <S extends Sizes> List<S> saveAllAndFlush(Iterable<S> entities) {
        return sizeRepository.saveAllAndFlush(entities);
    }

    @Override
    @Deprecated
    public void deleteInBatch(Iterable<Sizes> entities) {
        sizeRepository.deleteInBatch(entities);
    }

    @Override
    public void deleteAllInBatch(Iterable<Sizes> entities) {
        sizeRepository.deleteAllInBatch(entities);
    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {
        sizeRepository.deleteAllByIdInBatch(longs);
    }

    @Override
    public void deleteAllInBatch() {
        sizeRepository.deleteAllInBatch();
    }

    @Override
    @Deprecated
    public Sizes getOne(Long aLong) {
        return sizeRepository.getOne(aLong);
    }

    @Override
    @Deprecated
    public Sizes getById(Long aLong) {
        return sizeRepository.getById(aLong);
    }

    @Override
    public Sizes getReferenceById(Long aLong) {
        return sizeRepository.getReferenceById(aLong);
    }

    @Override
    public <S extends Sizes> List<S> findAll(Example<S> example) {
        return sizeRepository.findAll(example);
    }

    @Override
    public <S extends Sizes> List<S> findAll(Example<S> example, Sort sort) {
        return sizeRepository.findAll(example, sort);
    }

    @Override
    public Page<Sizes> findAll(Pageable pageable) {
        return sizeRepository.findAll(pageable);
    }

    @Override
    public <S extends Sizes> Optional<S> findOne(Example<S> example) {
        return sizeRepository.findOne(example);
    }

    @Override
    public <S extends Sizes> Page<S> findAll(Example<S> example, Pageable pageable) {
        return sizeRepository.findAll(example, pageable);
    }

    @Override
    public <S extends Sizes> long count(Example<S> example) {
        return sizeRepository.count(example);
    }

    @Override
    public <S extends Sizes> boolean exists(Example<S> example) {
        return sizeRepository.exists(example);
    }

    @Override
    public <S extends Sizes, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return sizeRepository.findBy(example, queryFunction);
    }
}
