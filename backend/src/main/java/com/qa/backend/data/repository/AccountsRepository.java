package com.qa.backend.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.qa.backend.data.entity.Account;

@Repository
public interface AccountsRepository extends JpaRepository<Account, Long> {

}
