package com.kpit;

public class Rose {
    String color;

    public Rose(String color) {
        this.color = color;
    }

    public Rose() {
        System.out.println("Rose is created....");
    }

    void flowring(){
        System.out.println(color+" rose is flowring..."+this);
    }
    
}
