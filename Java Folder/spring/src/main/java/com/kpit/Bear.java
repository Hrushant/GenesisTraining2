package com.kpit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Bear {
    String name;

    @Autowired
    Bear(@Value("Tonny") String name) {
        System.out.println("Bear() constructed..."+name);
    }

    void fetchHoney(){
        System.out.println("Bear is fetching honey...");
    }
}
