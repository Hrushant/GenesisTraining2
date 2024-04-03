package com.example.demo2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo2.layer2.Pizza;
import com.example.demo2.layer3.PizzaRepository;

@SpringBootTest
class PizzaRepositoryTests {

	@Autowired // spring's concern to bring the implementation object to below ref
	PizzaRepository pizzaRepository;

	// SimpleJpaRepositoryImpl

	@Test
	void showAllPizzas() {
		ArrayList<Pizza> coll = (ArrayList<Pizza>) pizzaRepository.findAll();

		Iterator<Pizza> iterator = coll.iterator();
		while (iterator.hasNext()) {
			Pizza thePizza = iterator.next();
			System.out.println("Pizza : " + thePizza);
		}
	}

	@Test
	public void showSinglePizza() {

		Optional<Pizza> optional = pizzaRepository.findById(1);

		if (optional.isPresent()) {
			Pizza pizza = optional.get();
			System.out.println("pizza " + pizza);
		} else {
			throw new RuntimeException("Pizza not found ");
		}
	}

	@Test
	public void insertPizzaTest() {
		Pizza pizza = new Pizza();
		pizza.setPizzaNumber(7);
		pizza.setTypeOfPizza("CHEESE");
		pizza.setPizzaPrice(333);

		pizzaRepository.save(pizza);  //save is also a merge | update()
	}

	@Test
	public void updatePizzaTest() {

		Optional<Pizza> optionalPizza = pizzaRepository.findById(6);
		if (optionalPizza.isPresent()) {
			Pizza pizza = optionalPizza.get();
			pizza.setTypeOfPizza("CHEESE PIZZA");
			pizza.setPizzaPrice(444);
			pizzaRepository.save(pizza);
			System.out.println("Pizza modified...");
		} else {
			throw new RuntimeException("Pizza not found to modify..");
		}
	}

	@Test
	public void deletePizzaTest() {

		Optional<Pizza> optionalPizza = pizzaRepository.findById(6);
		if (optionalPizza.isPresent()) {
			Pizza pizza = optionalPizza.get();
			pizzaRepository.delete(pizza);
			System.out.println("Pizza deleted...");
		} else {
			throw new RuntimeException("Pizza not found to delete..");
		}
	}

}