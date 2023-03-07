package com.poly.snicker.services;

import com.poly.snicker.models.Roles;

import java.util.List;

public interface RoleService {

    public List<Roles> findAll();

    public Roles findById(Integer id) ;

    public Roles create(Roles product) ;

    public Roles update(Roles product) ;

    public void delete(Integer id) ;
}
