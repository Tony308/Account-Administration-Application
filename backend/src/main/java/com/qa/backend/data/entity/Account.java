package com.qa.backend.data.entity;

import javax.persistence.*;

@Entity
@Table(name="ACCOUNTS")
public class Account {

    @Id
    @Column(name="ID")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    @Column(name="FIRSTNAME")
    private String firstname;
    @Column(name="SURNAME")
    private String surname;
    @Column(name="ACCOUNT_NUMBER")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private String accountNumber;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
