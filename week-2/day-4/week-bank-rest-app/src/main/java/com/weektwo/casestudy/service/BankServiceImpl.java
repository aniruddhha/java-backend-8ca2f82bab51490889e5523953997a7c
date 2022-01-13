package com.weektwo.casestudy.service;

import com.weektwo.casestudy.domain.BankAccount;
import com.weektwo.casestudy.repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankServiceImpl implements BankService{

    @Autowired
    private BankRepository repository;

    @Override
    public int createNewAccount(BankAccount ba) {
        return 0;
    }

    @Override
    public int updateAccountDetails(BankAccount ba) {
        return 0;
    }

    @Override
    public boolean activateAccount(Long acNum) {
        return false;
    }

    @Override
    public boolean deActivateAccount(Long acNum) {
        return false;
    }

    @Override
    public double withdraw(Long acNum, int amt) {
        return 0;
    }

    @Override
    public double deposit(Long acNum, int amt) {
        return 0;
    }

    @Override
    public int transferMoney(Long srcAc, Long dstAc, int amt) {
        return 0;
    }

    @Override
    public BankAccount findAccountByAcNum(Long acNum) {
        return null;
    }

    @Override
    public List<BankAccount> findAllBankAccounts() {
        return null;
    }
}
