package com.poly.snicker.services.impl;

import com.poly.snicker.models.Products;
import com.poly.snicker.repositories.ProductRepository;
import com.poly.snicker.services.ProductService;
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
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public List<Products> findAll() {
        return productRepository.findAll();
    }

    @Override
    public List<Products> findAll(Sort sort) {
        return productRepository.findAll(sort);
    }

    @Override
    public List<Products> findAllById(Iterable<Long> longs) {
        return productRepository.findAllById(longs);
    }

    @Override
    public <S extends Products> List<S> saveAll(Iterable<S> entities) {
        return productRepository.saveAll(entities);
    }

    @Override
    public void flush() {
        productRepository.flush();
    }

    @Override
    public <S extends Products> S saveAndFlush(S entity) {
        return productRepository.saveAndFlush(entity);
    }

    @Override
    public <S extends Products> List<S> saveAllAndFlush(Iterable<S> entities) {
        return productRepository.saveAllAndFlush(entities);
    }

    @Override
    @Deprecated
    public void deleteInBatch(Iterable<Products> entities) {
        productRepository.deleteInBatch(entities);
    }

    @Override
    public void deleteAllInBatch(Iterable<Products> entities) {
        productRepository.deleteAllInBatch(entities);
    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {
        productRepository.deleteAllByIdInBatch(longs);
    }

    @Override
    public void deleteAllInBatch() {
        productRepository.deleteAllInBatch();
    }

    @Override
    @Deprecated
    public Products getOne(Long aLong) {
        return productRepository.getOne(aLong);
    }

    @Override
    @Deprecated
    public Products getById(Long aLong) {
        return productRepository.getById(aLong);
    }

    @Override
    public Products getReferenceById(Long aLong) {
        return productRepository.getReferenceById(aLong);
    }

    @Override
    public <S extends Products> List<S> findAll(Example<S> example) {
        return productRepository.findAll(example);
    }

    @Override
    public <S extends Products> List<S> findAll(Example<S> example, Sort sort) {
        return productRepository.findAll(example, sort);
    }

    @Override
    public Page<Products> findAll(Pageable pageable) {
        return productRepository.findAll(pageable);
    }

    @Override
    public <S extends Products> Optional<S> findOne(Example<S> example) {
        return productRepository.findOne(example);
    }

    @Override
    public <S extends Products> Page<S> findAll(Example<S> example, Pageable pageable) {
        return productRepository.findAll(example, pageable);
    }

    @Override
    public <S extends Products> long count(Example<S> example) {
        return productRepository.count(example);
    }

    @Override
    public <S extends Products> boolean exists(Example<S> example) {
        return productRepository.exists(example);
    }

    @Override
    public <S extends Products, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return productRepository.findBy(example, queryFunction);
    }
}
