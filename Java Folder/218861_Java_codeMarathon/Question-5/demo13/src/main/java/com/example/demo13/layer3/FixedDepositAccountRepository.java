package com.example.demo13.layer3;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo13.layer2.FixedDepositAccount;

@Repository
public interface FixedDepositAccountRepository extends CrudRepository<FixedDepositAccount, Integer> {

}
