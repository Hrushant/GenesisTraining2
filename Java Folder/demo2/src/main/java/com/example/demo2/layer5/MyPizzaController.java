package com.example.demo2.layer5;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo2.layer2.Pizza;
import com.example.demo2.layer4.PizzaService;

@RestController
@RequestMapping("/pizzahut")
public class MyPizzaController {

    @GetMapping("/greet")            // http://localhost:8080/pizzahut/greet
    public String welcome() {
        return "<h1> Welcome to Spring Controller </h1>";
    }

    @GetMapping("/home")            // http://localhost:8080/pizzahut/home
    public String myHomePage() {
        return "<h1> Welcome to Home </h1>";
    }

    @Autowired
    PizzaService pizzaService;

    @GetMapping("/getpizzas")   // http://localhost:8080/pizzahut/getpizzas
    public List<Pizza> getAllPizzas(){
        System.out.println("getAllPizzas() is retriving all the pizzas...");
        return pizzaService.getAllPizzas();
    }

    @GetMapping("/getpizza/{pid}")    // http://localhost:8080/pizzahut/getpizza/2
    public Pizza getTheSinglePizza(@PathVariable("pid") int x){
        System.out.println("getSinglePizza(int) is retrieving a single pizza...");
        return pizzaService.orderingAPizza(x);
    }

    
}
