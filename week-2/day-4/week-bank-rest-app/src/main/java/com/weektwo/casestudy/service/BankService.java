package com.weektwo.casestudy.service;

import com.weektwo.casestudy.domain.BankAccount;

import java.util.List;

public interface BankService {

    int createNewAccount(BankAccount ba);

    int updateAccountDetails(BankAccount ba);

    boolean activateAccount(Long acNum);

    boolean deActivateAccount(Long acNum);

    double withdraw(Long acNum, int amt);

    double deposit(Long acNum, int amt);

    int transferMoney(Long srcAc, Long dstAc, int amt);

    BankAccount findAccountByAcNum(Long acNum);

    List<BankAccount> findAllBankAccounts();
}
