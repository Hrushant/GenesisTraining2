package com.kpit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//xml driven configuration = scope=prototype
@Component("myTiger")   //<bean>
@Scope("prototype")    //In annotaion driven configuration @Scope is used to specify the bean loading strategy.
public class Tiger {
    String name;

    @Autowired
    Tiger(@Value("Jacky") String name) {
        this.name = name;
        System.out.println("Tiger() constructed..." + name);
    }

}
