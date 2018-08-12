package com.qa.backend.data.webservice;

import com.qa.backend.data.entity.Account;
import com.qa.backend.data.repository.AccountsRepository;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping
public class AccountsController {

    @Autowired
    private AccountsRepository accountsRepository;

    @GetMapping("/get")
    public Iterable<Account> list() {
        return accountsRepository.findAll();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAccount(@PathVariable("id") long id){
        Account account = accountsRepository.getOne(id);
        accountsRepository.delete(account);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/post")
    public ResponseEntity<Void> createAccount(@RequestBody Account account) {
        accountsRepository.save(account);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public int updateAccount(@PathVariable("id") long id, @RequestBody Account account) {
        Account accountToChange = accountsRepository.getOne(id);
        accountToChange.setFirstname(account.getFirstname());
        accountToChange.setSurname(account.getSurname());
        accountToChange.setAccountNumber(account.getAccountNumber());
        accountsRepository.save(accountToChange);
        return Response.SC_ACCEPTED;
    }



}
