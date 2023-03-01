package com.poly.snicker.services.impl;

import com.poly.snicker.models.Roles;
import com.poly.snicker.repositories.RoleRepository;
import com.poly.snicker.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleRepository roleRepository;

    @Override
    public List<Roles> findAll() {
        return roleRepository.findAll();
    }

    @Override
    public Roles findById(Integer id) {
        return null;
    }

    @Override
    public Roles create(Roles product) {
        return null;
    }

    @Override
    public Roles update(Roles product) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
