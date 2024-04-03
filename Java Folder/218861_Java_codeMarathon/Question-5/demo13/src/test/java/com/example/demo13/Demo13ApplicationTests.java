package com.example.demo13;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo13.layer2.FixedDepositAccount;
import com.example.demo13.layer3.FixedDepositAccountRepository;
import com.example.demo13.layer4.FixedDepositAccountService;



@SpringBootTest
class Demo13ApplicationTests {

	@Autowired
	FixedDepositAccountRepository fixedDepoAccRepo;
	
	/*---- crud repo test cases */
	@Test
	public void insertFixedDepositAccountTest() {
		FixedDepositAccount fixedDepositAccount = new FixedDepositAccount();
		fixedDepositAccount.setAccountNumber(102);
		fixedDepositAccount.setAccountHolderName("Jane");
		fixedDepositAccount.setAccountBalance(60000);
		fixedDepoAccRepo.save(fixedDepositAccount);
	}

	@Test
	void updatefixedDepositAccountTest() {
		Optional<FixedDepositAccount> fixedDepositAccountObj = fixedDepoAccRepo.findById(102);
		if(fixedDepositAccountObj.isPresent()) {
			FixedDepositAccount actualfixedDepositAccountObject = fixedDepositAccountObj.get();
			System.out.println("--fixedDepoent details --");
			System.out.println("acc no   : "+actualfixedDepositAccountObject.getAccountNumber());
			System.out.println("acc name : "+actualfixedDepositAccountObject.getAccountHolderName());
			System.out.println("acc bal  : "+actualfixedDepositAccountObject.getAccountBalance());		
		
			actualfixedDepositAccountObject.setAccountHolderName("JANET");
			actualfixedDepositAccountObject.setAccountBalance(65000);
			fixedDepoAccRepo.save(actualfixedDepositAccountObject);
			System.out.println("fixedDepoent account updated...");
		}
		else {
			throw new RuntimeException("fixedDepoent account not found ...");
		}
	}
	@Test
	void deletefixedDepositAccountTest() {
		Optional<FixedDepositAccount> fixedDepositAccountObj = fixedDepoAccRepo.findById(102);
		if(fixedDepositAccountObj.isPresent()) {
			FixedDepositAccount actualfixedDepositAccountObject = fixedDepositAccountObj.get();
			System.out.println("--fixedDepoent details --");
			System.out.println("acc no   : "+actualfixedDepositAccountObject.getAccountNumber());
			System.out.println("acc name : "+actualfixedDepositAccountObject.getAccountHolderName());
			System.out.println("acc bal  : "+actualfixedDepositAccountObject.getAccountBalance());		
		
		//	actualfixedDepositAccountObject.setAccountHolderName("JANET");
		//	actualfixedDepositAccountObject.setAccountBalance(65000);
			fixedDepoAccRepo.delete(actualfixedDepositAccountObject);
			System.out.println("fixedDepoent account deleted...");
		}
		else {
			throw new RuntimeException("fixedDepoent account not found ...");
		}
	}
	@Test
	void selectfixedDepositAccountTest() {
		Optional<FixedDepositAccount> fixedDepositAccountObj = fixedDepoAccRepo.findById(103);
		if(fixedDepositAccountObj.isPresent()) {
			FixedDepositAccount actualfixedDepositAccountObject = fixedDepositAccountObj.get();
			System.out.println("--fixedDepoent details --");
			System.out.println("acc no   : "+actualfixedDepositAccountObject.getAccountNumber());
			System.out.println("acc name : "+actualfixedDepositAccountObject.getAccountHolderName());
			System.out.println("acc bal  : "+actualfixedDepositAccountObject.getAccountBalance());		
		
			fixedDepoAccRepo.save(actualfixedDepositAccountObject);
			System.out.println("fixedDepoent account found...");
		}
	}

	
	@Test
	void selectAllfixedDepositAccountTest() {
		List<FixedDepositAccount> fixedDepositAccountList = (List<FixedDepositAccount>) fixedDepoAccRepo.findAll();
		for (FixedDepositAccount fixedDepositAccount : fixedDepositAccountList) {
			System.out.println("acc no   : "+fixedDepositAccount.getAccountNumber());
			System.out.println("acc name : "+fixedDepositAccount.getAccountHolderName());
			System.out.println("acc bal  : "+fixedDepositAccount.getAccountBalance());		
			System.out.println("-------------");
		}
	}
	/*---------------- below are service test cases */


	@Autowired
	FixedDepositAccountService fixedDepoService; //spring will bring the object of fixedDepositAccountServiceImpl's class

	@Test
	public void serviceTestingForAddingfixedDepositAccount() {
		FixedDepositAccount fixedDepositAccount = new FixedDepositAccount();
		fixedDepositAccount.setAccountNumber(103);
		fixedDepositAccount.setAccountHolderName("Ruchitha");
		fixedDepositAccount.setAccountBalance(52000);
		fixedDepoService.addFixedDepositAccountService(fixedDepositAccount);
	}
	@Test
	public void serviceTestingForModifyingfixedDepositAccount() {
		FixedDepositAccount fixedDepositAccount = new FixedDepositAccount();
		fixedDepositAccount.setAccountNumber(103);
		fixedDepositAccount.setAccountHolderName("RUCHITHA B is happy");
		fixedDepositAccount.setAccountBalance(82000);
		fixedDepoService.modifyFixedDepositAccountService(fixedDepositAccount);
	}

	@Test
	public void serviceTestingForDeletingfixedDepositAccount() {
		FixedDepositAccount fixedDepositAccount = new FixedDepositAccount();
		fixedDepositAccount.setAccountNumber(112);
		fixedDepoService.removeFixedDepositAccountService(fixedDepositAccount);
	}

	@Test
	public void serviceTestingForFindingSinglefixedDepositAccount() {
		FixedDepositAccount fixedDepositAccount = fixedDepoService.findFixedDepositAccountService(103);
		System.out.println("Account found...");
		System.out.println("acc no   : "+fixedDepositAccount.getAccountNumber());
		System.out.println("acc name : "+fixedDepositAccount.getAccountHolderName());
		System.out.println("acc bal  : "+fixedDepositAccount.getAccountBalance());		
	
	}

	@Test
	public void serviceTestingForFindingAllfixedDepositAccounts() {
		List<FixedDepositAccount> fixedDepositAccountList = fixedDepoService.findAllFixedDepositAccountService();

		for (FixedDepositAccount fixedDepositAccount : fixedDepositAccountList) {
			System.out.println("acc no   : "+fixedDepositAccount.getAccountNumber());
			System.out.println("acc name : "+fixedDepositAccount.getAccountHolderName());
			System.out.println("acc bal  : "+fixedDepositAccount.getAccountBalance());		
		}
	}

}
