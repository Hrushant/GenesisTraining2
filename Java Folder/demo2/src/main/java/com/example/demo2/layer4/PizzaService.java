package com.example.demo2.layer4;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo2.layer2.Pizza;

@Service
public interface PizzaService {

    Pizza orderingAPizza(int id);
    List<Pizza> getAllPizzas();
    void createPizza(Pizza pizza);
    Pizza modifyPizza(Pizza pizza);
    void deletePizza(int id);

}
