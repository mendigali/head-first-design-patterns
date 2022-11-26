package org.example.example1;

import org.example.example1.duck.Duck;
import org.example.example1.duck.MallardDuck;
import org.example.example1.duck.RubberDuck;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Duck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        mallardDuck.performSwim();

        Duck rubberDuck = new RubberDuck();
        rubberDuck.performFly();
        rubberDuck.performQuack();
        rubberDuck.performSwim();
    }
}