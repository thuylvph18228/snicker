package com.poly.snicker.services.impl;
import com.poly.snicker.repositories.MadeInRepository;
import com.poly.snicker.services.MadeInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MadeInServiceImpl implements MadeInService {

    @Autowired
    MadeInRepository madeInRepository;


    @Override
    public List<MadeIn> findAll() {
        return null;
    }

    @Override
    public MadeIn findById(Integer id) {
        return null;
    }

    @Override
    public MadeIn create(MadeIn product) {
        return null;
    }

    @Override
    public MadeIn update(MadeIn product) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
