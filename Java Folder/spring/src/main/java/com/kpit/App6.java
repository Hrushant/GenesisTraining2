package com.kpit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App6 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("myspringAnno.xml");

        Tiger tiger = (Tiger) context.getBean("myTiger");

        BengalTiger bengalTiger = (BengalTiger) context.getBean("myBengalTiger");
        
        Bear bear = (Bear) context.getBean(Bear.class);
        bear.fetchHoney();

    }
}
