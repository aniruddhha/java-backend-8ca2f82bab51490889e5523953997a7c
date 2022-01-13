package com.weektwo.casestudy.service;

import com.weektwo.casestudy.domain.BankAccount;

import java.util.List;

public interface BankService {

    void createNewAccount(BankAccount ba);

    int updateAccountDetails(BankAccount ba);

    boolean activateAccount(Long acNum);

    boolean deActivateAccount(Long acNum);

    double withdraw(Long acNum, double amt);

    double deposit(Long acNum, double amt);

    int transferMoney(Long srcAc, Long dstAc, double amt);

    BankAccount findAccountByAcNum(Long acNum);

    List<BankAccount> findAllBankAccounts();

    List<BankAccount> namesStartsWith(String prefix);
}
