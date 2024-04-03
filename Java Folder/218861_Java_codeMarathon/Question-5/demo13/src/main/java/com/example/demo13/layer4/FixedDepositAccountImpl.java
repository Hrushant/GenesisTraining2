package com.example.demo13.layer4;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo13.layer2.FixedDepositAccount;
import com.example.demo13.layer3.FixedDepositAccountRepository;
import com.example.demo13.myexceptions.FixedDepositAccountAlreadyExistsException;
import com.example.demo13.myexceptions.FixedDepositAccountNotFoudException;

@Service
public class FixedDepositAccountImpl implements FixedDepositAccountService {

    @Autowired
    FixedDepositAccountRepository fixRepo;

    @Override
    public void addFixedDepositAccountService(FixedDepositAccount obj) {
        // TODO Auto-generated method stub
        Optional<FixedDepositAccount> fixObj = fixRepo.findById(obj.getAccountNumber());
        if (fixObj.isPresent()) {
            throw new FixedDepositAccountAlreadyExistsException("Account already exists...");
        } else {
            fixRepo.save(obj);
            System.out.println("Account added...");
        }
    }

    @Override
    public void modifyFixedDepositAccountService(FixedDepositAccount obj) {
        Optional<FixedDepositAccount> fixObj = fixRepo.findById(obj.getAccountNumber());
        if (fixObj.isPresent()) {
            fixRepo.save(obj);
            System.out.println("Account modified...");
        } else {
            throw new FixedDepositAccountNotFoudException("Account not found...");
        }
    }

    @Override
    public void removeFixedDepositAccountService(FixedDepositAccount obj) {
        Optional<FixedDepositAccount> fixObj = fixRepo.findById(obj.getAccountNumber());
        if (fixObj.isPresent()) {
            fixRepo.delete(obj);
            System.out.println("Account deleted...");
        } else {
            throw new FixedDepositAccountNotFoudException("Account not found...");
        }
    }

    @Override
    public FixedDepositAccount findFixedDepositAccountService(int acno) {
        FixedDepositAccount FixedDepositAccount = null;
        Optional<FixedDepositAccount> fixObj = fixRepo.findById(acno);
        if (fixObj.isPresent()) {
            FixedDepositAccount = fixObj.get();
            System.out.println("Account found");
        } else {
            throw new FixedDepositAccountNotFoudException("Account not found...");
        }
        return FixedDepositAccount;
    }

    @Override
    public List<FixedDepositAccount> findAllFixedDepositAccountService() {

        List<FixedDepositAccount> fixObjList = (List<FixedDepositAccount>) fixRepo.findAll();
        return fixObjList;
    }
}
