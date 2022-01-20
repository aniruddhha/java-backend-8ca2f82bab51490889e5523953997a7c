package com.weektwo.casestudy.controller;

import com.weektwo.casestudy.domain.BankAccount;
import com.weektwo.casestudy.dto.AmountTransferDto;
import com.weektwo.casestudy.dto.AppResponse;
import com.weektwo.casestudy.exception.AccountNotFoundException;
import com.weektwo.casestudy.exception.InActiveAccountException;
import com.weektwo.casestudy.exception.InvalidAmountException;
import com.weektwo.casestudy.service.BankService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/bank")
@RestController // = @Component
public class BankController {

    private final Logger logger = LoggerFactory.getLogger(BankController.class);
    private final String success = AppResponse.Types.SUCCESS.toString();

    @Autowired
    private BankService service;

    @PostMapping // POST -> http://localhost:8080/bank/
    public ResponseEntity<AppResponse<Integer>> createBankAccount(@RequestBody BankAccount ba) {

        logger.info("creating bank account");

        service.createNewAccount(ba);

        var response = new AppResponse<Integer>();
        response.setMsg("account created successfully");
        response.setSts(success);
        response.setBody(0);
        return ResponseEntity.ok(response);
    }

    @PutMapping("/withdraw") // PUT -> http://localhost:8080/123456
    public ResponseEntity<AppResponse<Double>> withdrawMoney(@RequestBody BankAccount ba) {
        try {
            double amt = service.withdraw(ba.getAcNum(), ba.getBalance());
            var response = new AppResponse<Double>();
            response.setMsg("money withdrawn successfully");
            response.setSts(success);
            response.setBody(amt);
            return new ResponseEntity<>(response, HttpStatus.OK);
        }catch (InvalidAmountException e) {
            var response = new AppResponse<Double>();
            response.setMsg(e.getMessage());
            response.setSts("fail");
            response.setBody(0.0);
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/deposit") // PUT -> http://localhost:8080/bank/deposit
    public ResponseEntity<AppResponse<Double>> depositMoney(@RequestBody BankAccount ba) {
        try {
            double amt = service.deposit(ba.getAcNum(), ba.getBalance());
            var response = new AppResponse<Double>();
            response.setMsg("money deposit successfully");
            response.setSts(success);
            response.setBody(amt);
            return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
        }catch (InvalidAmountException e) {
            var response = new AppResponse<Double>();
            response.setMsg(e.getMessage());
            response.setSts("fail");
            response.setBody(0.0);
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/{prefix}")
    public ResponseEntity<AppResponse<List<BankAccount>>> accountsStartWith(@PathVariable String prefix) {
        var response = new AppResponse<List<BankAccount>>();
        response.setMsg("account list");
        response.setSts(success);
        response.setBody(service.namesStartsWith(prefix));

        return ResponseEntity.ok(response);
    }

    @GetMapping
    public ResponseEntity<AppResponse<List<BankAccount>>> allAccounts() {

        var response = new AppResponse<List<BankAccount>>();
        response.setSts(success);
        response.setMsg("list of all accounts");
        response.setBody(service.findAllBankAccounts());

        return ResponseEntity.ok(response);
    }

    @PutMapping("/transfer")
    public ResponseEntity<AppResponse<Integer>> transferMoney(@RequestBody AmountTransferDto dto) {

        try {
            int sts = service.transferMoney(dto.getSrcAc(), dto.getDstAc(), dto.getAmt());
            var response = new AppResponse<Integer>();
            response.setSts("success");
            response.setMsg("money transfer successful");
            response.setBody(sts);

            return ResponseEntity.ok(response);
        }catch (InvalidAmountException | AccountNotFoundException | InActiveAccountException ex) {
            var response = new AppResponse<Integer>();
            response.setSts("fail");
            response.setMsg(ex.getMessage());
            response.setBody(0);

            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }
    }
}
