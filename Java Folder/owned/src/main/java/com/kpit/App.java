package com.kpit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("myspring.xml");

        Rose rose = (Rose) context.getBean("myRose");
        rose.flowring();

        Lotus lotus = (Lotus) context.getBean("myLotus");
        lotus.flowring();

    }
}
