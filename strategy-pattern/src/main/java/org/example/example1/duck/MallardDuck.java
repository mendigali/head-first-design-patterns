package org.example.example1.duck;

import org.example.example1.behavior.FlyWithWings;
import org.example.example1.behavior.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
}
