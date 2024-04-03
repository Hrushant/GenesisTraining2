package com.kpit.Sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

public class Test {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("myspringSample.xml");
        System.out.println("Contex is ready " + context);

        PizzaController pizzaController = context.getBean(PizzaController.class);
        pizzaController.takeOrder();
    }
}

@Component
class Pizza {
    Pizza() {
        System.out.println("Pizza() ");
    }

    void typeOfPizza(String typeOfPizza) {
        System.out.println("Pizza : A particular type of pizza is created ..." + typeOfPizza);
    }
}

@Repository
class PizzaRepository {
    @Autowired
    Pizza pizza;

    PizzaRepository() {
        System.out.println("PizzaRepository() ");
    }

    void makingThePizza() {
        System.out.println("PizzaRepository : Making the pizza....");
        pizza.typeOfPizza("Veg Extravaganza");
    }
}

@Service
class PizzaService {
    @Autowired
    PizzaRepository pizzaRepository;

    PizzaService() {
        System.out.println("PizzaService() ");
    }

    void serveThePizza() {

        System.out.println("PizzaService : is serving the pizza..");
        pizzaRepository.makingThePizza();
    }
}

@Controller
class PizzaController {

    @Autowired
    PizzaService pizzaService;

    PizzaController() {
        System.out.println("PizzaController() ");
    }

    void takeOrder() {
        System.out.println("PizzaController : is taking pizza's order....");
        pizzaService.serveThePizza();
    }
}