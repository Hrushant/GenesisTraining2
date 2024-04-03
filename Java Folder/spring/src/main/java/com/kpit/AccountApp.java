package com.kpit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AccountApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("myspringSetterAccount.xml");
    }
}
