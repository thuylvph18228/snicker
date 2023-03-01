package com.poly.snicker.services.impl;

import com.poly.snicker.models.Brand;
import com.poly.snicker.repositories.BrandRepository;
import com.poly.snicker.services.BrandService;
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
public class BrandServiceImpl implements BrandService {

    @Autowired
    BrandRepository brandRepository;

    @Override
    public List<Brand> findAll() {
        return brandRepository.findAll();
    }

    @Override
    public List<Brand> findAll(Sort sort) {
        return brandRepository.findAll(sort);
    }

    @Override
    public List<Brand> findAllById(Iterable<Long> longs) {
        return brandRepository.findAllById(longs);
    }

    @Override
    public <S extends Brand> List<S> saveAll(Iterable<S> entities) {
        return brandRepository.saveAll(entities);
    }

    @Override
    public void flush() {
        brandRepository.flush();
    }

    @Override
    public <S extends Brand> S saveAndFlush(S entity) {
        return brandRepository.saveAndFlush(entity);
    }

    @Override
    public <S extends Brand> List<S> saveAllAndFlush(Iterable<S> entities) {
        return brandRepository.saveAllAndFlush(entities);
    }

    @Override
    @Deprecated
    public void deleteInBatch(Iterable<Brand> entities) {
        brandRepository.deleteInBatch(entities);
    }

    @Override
    public void deleteAllInBatch(Iterable<Brand> entities) {
        brandRepository.deleteAllInBatch(entities);
    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {
        brandRepository.deleteAllByIdInBatch(longs);
    }

    @Override
    public void deleteAllInBatch() {
        brandRepository.deleteAllInBatch();
    }

    @Override
    @Deprecated
    public Brand getOne(Long aLong) {
        return brandRepository.getOne(aLong);
    }

    @Override
    @Deprecated
    public Brand getById(Long aLong) {
        return brandRepository.getById(aLong);
    }

    @Override
    public Brand getReferenceById(Long aLong) {
        return brandRepository.getReferenceById(aLong);
    }

    @Override
    public <S extends Brand> List<S> findAll(Example<S> example) {
        return brandRepository.findAll(example);
    }

    @Override
    public <S extends Brand> List<S> findAll(Example<S> example, Sort sort) {
        return brandRepository.findAll(example, sort);
    }

    @Override
    public Page<Brand> findAll(Pageable pageable) {
        return brandRepository.findAll(pageable);
    }

    @Override
    public <S extends Brand> Optional<S> findOne(Example<S> example) {
        return brandRepository.findOne(example);
    }

    @Override
    public <S extends Brand> Page<S> findAll(Example<S> example, Pageable pageable) {
        return brandRepository.findAll(example, pageable);
    }

    @Override
    public <S extends Brand> long count(Example<S> example) {
        return brandRepository.count(example);
    }

    @Override
    public <S extends Brand> boolean exists(Example<S> example) {
        return brandRepository.exists(example);
    }

    @Override
    public <S extends Brand, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return brandRepository.findBy(example, queryFunction);
    }
}
