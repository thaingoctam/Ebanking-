/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Ebanking.entities;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author solid
 */
@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int accountID;
    private double ballance;
    private String accountType;
    private boolean status;
    @ManyToOne
    @JoinColumn(name = "customerID")
    private Customer customer;
    @OneToMany(mappedBy = "senderAccount")
    private Set<Transaction> senders;
    @OneToMany(mappedBy = "receiverAccount")
    private Set<Transaction> receivers;
    @ManyToOne
    @JoinColumn(name = "bankID")
    private Bank bank;

    public Account() {
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public double getBallance() {
        return ballance;
    }

    public void setBallance(double ballance) {
        this.ballance = ballance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Set<Transaction> getSenders() {
        return senders;
    }

    public void setSenders(Set<Transaction> senders) {
        this.senders = senders;
    }

    public Set<Transaction> getReceivers() {
        return receivers;
    }

    public void setReceivers(Set<Transaction> receivers) {
        this.receivers = receivers;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

}
