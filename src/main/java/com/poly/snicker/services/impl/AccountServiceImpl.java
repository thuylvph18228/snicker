package com.poly.snicker.services.impl;

import com.poly.snicker.models.Account;
import com.poly.snicker.repositories.AccountRepository;
import com.poly.snicker.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    AccountRepository accountRepository;

    @Override
    public List<Account> findAll() {
        return accountRepository.findAll();
    }

    @Override
    public Account findById(Integer id) {
        return accountRepository.getById(id);
    }

    @Override
    public Account create(Account account) {
        return accountRepository.saveAndFlush(account);
    }

    @Override
    public Account update(Account account) {
        return accountRepository.saveAndFlush(account);
    }

    @Override
    public void delete(Integer id) {
        accountRepository.deleteAllInBatch();
    }
}
