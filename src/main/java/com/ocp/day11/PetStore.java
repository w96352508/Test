package com.ocp.day11;

import java.util.stream.Stream;

public class PetStore {
    public static void main(String[] args) {
        System.out.println(Animal.name);
        Dog dog = new Dog();
        Pig pig = new Pig();
        Bird bird = new Bird();
        playsound(dog,pig,bird);
       goToSleep(dog,pig,bird);
                            }
    public static void playsound(Animal...animals) {
     Stream.of(animals).forEach(a->a.sound());
    }
     public static void goToSleep(Animal...animals)
     {
        Stream.of(animals).forEach(a->a.sleep());  
     }
}
