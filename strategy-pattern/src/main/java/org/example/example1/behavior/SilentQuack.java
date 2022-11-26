package org.example.example1.behavior;

public class SilentQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("### silent quack ###");
    }
}
