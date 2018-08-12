package com.qa.backend.service;

import com.qa.backend.data.entity.Account;
import com.qa.backend.data.repository.AccountsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountsService {

    private AccountsRepository accountsRepository;

    @Autowired
    public AccountsService(AccountsRepository accountsRepository) {
        this.accountsRepository = accountsRepository;
    }

    public Account addAccount(String firstname, String surname, String accountNumber) {
        if (accountsRepository.count() == 0) {
            accountsRepository.save(new Account(firstname, surname, accountNumber));
        }
        return null;
    }

    public Iterable<Account> lookUp() {
        return accountsRepository.findAll();
    }

    public long total() {
        return accountsRepository.count();
    }
    public List<Account> getAllAccounts() {
        List<Account> accounts = new ArrayList<>();
        this.accountsRepository.findAll().forEach(accounts::add);
        return accounts;
    }

}
