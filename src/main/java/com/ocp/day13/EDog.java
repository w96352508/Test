package com.ocp.day13;

public class EDog  implements Animal{

    @Override
    public void eat() {
    System.out.println("吃電"); 
    }

    @Override
    public void move() {
        System.out.println("隨你所欲"); 
    }
    
}
