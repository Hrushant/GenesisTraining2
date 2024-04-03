package com.kpit;

public class Lotus {
    String color;

    public Lotus(String color) {
        this.color = color;
    }

    public Lotus() {
        System.out.println("Lotus is created...");
    }

    void flowring(){
        System.out.println(color+" Lotus is flowring..."+this);
    }
    
}
