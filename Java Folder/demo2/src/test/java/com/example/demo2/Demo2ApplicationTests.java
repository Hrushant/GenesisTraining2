package com.example.demo2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demo2ApplicationTests {

	@Test
	void contextLoads() {
		System.out.println("line 1 is running here...");
		System.out.println("line 2 is running here...");
		Assertions.assertTrue(100 > 50);
		System.out.println("line 3 is running here...");
		System.out.println("line 4 is running here...");
		System.out.println("line 5 is running here...");

	}

}
