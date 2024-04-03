package com.kpit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;



//xml driven configuration = scope=prototype
@Component("myBengalTiger")     //<bean>
@Scope("prototype")            // in annotaion driven configuration @Scope is used to specify the bean loading strategy.
class BengalTiger extends Tiger{

    @Autowired
    BengalTiger(@Value("John") String name){
        super(name);
        System.out.println("BengalTiger() constructed..."+name);
    }
}