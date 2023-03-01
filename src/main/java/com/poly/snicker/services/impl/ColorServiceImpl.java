package com.poly.snicker.services.impl;

import com.poly.snicker.models.Colors;
import com.poly.snicker.repositories.ColorRepository;
import com.poly.snicker.services.ColorService;
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
public class ColorServiceImpl implements ColorService {

    @Autowired
    ColorRepository colorRepository;

    @Override
    public List<Colors> findAll() {
        return colorRepository.findAll();
    }

    @Override
    public List<Colors> findAll(Sort sort) {
        return colorRepository.findAll(sort);
    }

    @Override
    public List<Colors> findAllById(Iterable<Long> longs) {
        return colorRepository.findAllById(longs);
    }

    @Override
    public <S extends Colors> List<S> saveAll(Iterable<S> entities) {
        return colorRepository.saveAll(entities);
    }

    @Override
    public void flush() {
        colorRepository.flush();
    }

    @Override
    public <S extends Colors> S saveAndFlush(S entity) {
        return colorRepository.saveAndFlush(entity);
    }

    @Override
    public <S extends Colors> List<S> saveAllAndFlush(Iterable<S> entities) {
        return colorRepository.saveAllAndFlush(entities);
    }

    @Override
    @Deprecated
    public void deleteInBatch(Iterable<Colors> entities) {
        colorRepository.deleteInBatch(entities);
    }

    @Override
    public void deleteAllInBatch(Iterable<Colors> entities) {
        colorRepository.deleteAllInBatch(entities);
    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {
        colorRepository.deleteAllByIdInBatch(longs);
    }

    @Override
    public void deleteAllInBatch() {
        colorRepository.deleteAllInBatch();
    }

    @Override
    @Deprecated
    public Colors getOne(Long aLong) {
        return colorRepository.getOne(aLong);
    }

    @Override
    @Deprecated
    public Colors getById(Long aLong) {
        return colorRepository.getById(aLong);
    }

    @Override
    public Colors getReferenceById(Long aLong) {
        return colorRepository.getReferenceById(aLong);
    }

    @Override
    public <S extends Colors> List<S> findAll(Example<S> example) {
        return colorRepository.findAll(example);
    }

    @Override
    public <S extends Colors> List<S> findAll(Example<S> example, Sort sort) {
        return colorRepository.findAll(example, sort);
    }

    @Override
    public Page<Colors> findAll(Pageable pageable) {
        return colorRepository.findAll(pageable);
    }

    @Override
    public <S extends Colors> Optional<S> findOne(Example<S> example) {
        return colorRepository.findOne(example);
    }

    @Override
    public <S extends Colors> Page<S> findAll(Example<S> example, Pageable pageable) {
        return colorRepository.findAll(example, pageable);
    }

    @Override
    public <S extends Colors> long count(Example<S> example) {
        return colorRepository.count(example);
    }

    @Override
    public <S extends Colors> boolean exists(Example<S> example) {
        return colorRepository.exists(example);
    }

    @Override
    public <S extends Colors, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return colorRepository.findBy(example, queryFunction);
    }
}
