package org.example.example1.behavior;

public class NoFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly :(");
    }
}
