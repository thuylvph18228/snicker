package com.poly.snicker.services;

import java.util.List;

public interface MadeInService {
    public List<MadeIn> findAll();

    public MadeIn findById(Integer id) ;

    public MadeIn create(MadeIn product) ;

    public MadeIn update(MadeIn product) ;

    public void delete(Integer id) ;
}
