package com.kpit;

public class Rose {
    String color;

    public Rose(String color) {
        this.color = color;
    }

    public Rose() {
        System.out.println("Rose is created..." + this);
    }

    void flowering() {
        System.out.println(color + " Rose is flowering...." + this);
    }

}