package com.qa.backend.data.entity;

import jdk.nashorn.internal.objects.annotations.Constructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="ACCOUNTS")
public class Account implements Serializable {

    @Id
    @Column(name="ID")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    @Column(name="FIRSTNAME")
    private String firstname;
    @Column(name="SURNAME")
    private String surname;
    @Column(name="ACCOUNT_NUMBER")
    private String accountNumber;

    public Account(String firstname, String surname, String accountNumber) {
        this.firstname = firstname;
        this.surname = surname;
        this.accountNumber = accountNumber;
    }

    protected Account() {

    }
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

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", surname='" + surname + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                '}';
    }
}
