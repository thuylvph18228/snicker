package com.poly.snicker.services;

import com.poly.snicker.models.Account;

import java.util.List;

public interface AccountService {
    public List<Account> findAll();

    public Account findById(Integer id) ;

    public Account create(Account product) ;

    public Account update(Account product) ;

    public void delete(Integer id) ;
}
