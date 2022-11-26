package org.example.example1.duck;

import org.example.example1.behavior.NoFly;
import org.example.example1.behavior.SilentQuack;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new NoFly();
        quackBehavior = new SilentQuack();
    }
}
