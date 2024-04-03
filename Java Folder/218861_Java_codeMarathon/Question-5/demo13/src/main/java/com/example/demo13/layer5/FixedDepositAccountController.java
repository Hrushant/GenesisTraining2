package com.example.demo13.layer5;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo13.layer2.FixedDepositAccount;
import com.example.demo13.layer4.FixedDepositAccountService;

@RestController
@RequestMapping("/accounts")
public class FixedDepositAccountController {

  @Autowired
  FixedDepositAccountService FixedDepositAccountService;

  // For getting all the records
  @GetMapping("/getall")
  public List<FixedDepositAccount> showAllFixedDepositAccounts() {
    return FixedDepositAccountService.findAllFixedDepositAccountService();
  }

  // For getting single record
  @GetMapping("/{num}")
  public ResponseEntity showFixedDepositAccount(@PathVariable("num") int x) {
    try {
      FixedDepositAccount fixedDepoObj = FixedDepositAccountService.findFixedDepositAccountService(x);
      return ResponseEntity.status(HttpStatus.FOUND).body(fixedDepoObj);
    } catch (Exception e) {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
    }
  }

  // For adding the record
  @PostMapping("/add")
  public ResponseEntity addFixedDepositAccount(@RequestBody FixedDepositAccount fixedDepoAccObj) {
    try {
      FixedDepositAccountService.addFixedDepositAccountService(fixedDepoAccObj);
      return ResponseEntity.status(HttpStatus.CREATED).body("Account Created");
    } catch (Exception e) {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
    }
  }

  // for updating the record
  @PutMapping("/update")
  public ResponseEntity updateFixedDepositAccount(@RequestBody FixedDepositAccount fixedDepoAccObj) {
    try {
      FixedDepositAccountService.modifyFixedDepositAccountService(fixedDepoAccObj);
      return ResponseEntity.status(HttpStatus.OK).body("Account Modified");
    } catch (Exception e) {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
    }
  }

  // for deleting the record
  @DeleteMapping("/delete/{num}")
  public ResponseEntity deleteFixedDepositAccount(@PathVariable("num") int x) {
    FixedDepositAccount FixedDepositAccount = new FixedDepositAccount();
    FixedDepositAccount.setAccountNumber(x);
    try {
      FixedDepositAccountService.removeFixedDepositAccountService(FixedDepositAccount);
      return ResponseEntity.status(HttpStatus.OK).body("Account Removed");
    } catch (Exception e) {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
    }
  }
}
