package com.example.demo13.layer4;

import org.springframework.stereotype.Service;

import com.example.demo13.layer2.FixedDepositAccount;
import java.util.*;

@Service
public interface FixedDepositAccountService {
    void addFixedDepositAccountService(FixedDepositAccount obj);

    void modifyFixedDepositAccountService(FixedDepositAccount obj);

    void removeFixedDepositAccountService(FixedDepositAccount obj);

    FixedDepositAccount findFixedDepositAccountService(int acno);

    List<FixedDepositAccount> findAllFixedDepositAccountService();
}
