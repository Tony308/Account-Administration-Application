package com.qa.backend.data.webservice;

import com.qa.backend.data.repository.AccountsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class AccountsController {
    @Autowired
    private AccountsRepository repository;

}
