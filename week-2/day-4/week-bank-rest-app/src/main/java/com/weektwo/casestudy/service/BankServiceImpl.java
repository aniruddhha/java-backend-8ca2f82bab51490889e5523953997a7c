package com.weektwo.casestudy.service;

import com.weektwo.casestudy.domain.BankAccount;
import com.weektwo.casestudy.exception.AccountNotFoundException;
import com.weektwo.casestudy.exception.InActiveAccountException;
import com.weektwo.casestudy.exception.InvalidAmountException;
import com.weektwo.casestudy.repository.BankRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Transactional(
        isolation = Isolation.READ_UNCOMMITTED,
        rollbackFor = {SQLException.class, InActiveAccountException.class, InvalidAmountException.class, AccountNotFoundException.class},
        noRollbackFor = InvalidAmountException.class
)
@Service
public class BankServiceImpl implements BankService{

    private final Logger logger = LoggerFactory.getLogger(BankServiceImpl.class);

    @Autowired
    private BankRepository repository;

    @Override
    public void createNewAccount(BankAccount ba) {
         repository.save(ba);
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
    public double withdraw(Long acNum, double amt) throws InvalidAmountException {

        logger.info("Withdrawing Money from {} with Amount {} ", acNum, amt);
        logger.warn("Make sure amount possittive");
        repository.withdraw(amt, acNum);
        return amt;
    }

    @Override
    public double deposit(Long acNum, double amt) throws InvalidAmountException {

        if(amt <= 0) throw new InvalidAmountException("Amount Should be Non Zero Positive "+amt);

        Optional<BankAccount> op = repository.findById(acNum);

        BankAccount baOld = op.orElseThrow();
        double existingBalance = baOld.getBalance();
        double newBalance = existingBalance + amt;

        BankAccount baNew = new BankAccount();
        baNew.setBalance(newBalance);
        baNew.setAcCrDt(baOld.getAcCrDt());
        baNew.setStatus(baOld.getStatus());
        baNew.setAcHldNm(baOld.getAcHldNm());
        baNew.setAcNum(baOld.getAcNum());

        repository.save(baNew);

        return baNew.getBalance();
    }

    @Override
    public int transferMoney(Long srcAc, Long dstAc, double amt) throws InvalidAmountException, InActiveAccountException, AccountNotFoundException {
        if(amt < 0) throw new InvalidAmountException("Amount should be positive : "+ amt);

        BankAccount sa = repository.findById(srcAc)
                .orElseThrow(
                        () -> new AccountNotFoundException("Source Account Not Found : "+ srcAc)
                );

        if(!Boolean.TRUE.equals(sa.getStatus())) throw new InActiveAccountException("Source Account Not Active Yet");

        BankAccount da = repository.findById(dstAc)
                .orElseThrow(
                        () -> new AccountNotFoundException("Destination Account Not "+ dstAc)
                );

        if(!Boolean.TRUE.equals(da.getStatus())) throw new InActiveAccountException(("Destination Account Not Active Ye"));

        BankAccount uSa = new BankAccount();
        uSa.setAcNum(srcAc);
        uSa.setAcHldNm(sa.getAcHldNm());
        uSa.setAcCrDt(sa.getAcCrDt());
        uSa.setBalance(sa.getBalance() - amt);
        uSa.setStatus(sa.getStatus());

        BankAccount uDa = new BankAccount();
        uDa.setAcNum(dstAc);
        uDa.setAcHldNm(da.getAcHldNm());
        uDa.setAcCrDt(da.getAcCrDt());
        uDa.setBalance(da.getBalance() + amt);
        uDa.setStatus(da.getStatus());

        repository.save(uSa);
        repository.save(uDa);

        return 1;
    }

    @Override
    public BankAccount findAccountByAcNum(Long acNum) {
        return null;
    }

    @Override
    public List<BankAccount> findAllBankAccounts() {
        return repository.findAll();
    }

    @Override
    public List<BankAccount> namesStartsWith(String prefix) {
        return repository.findByAcHldNmStartingWith(prefix);
    }
}
