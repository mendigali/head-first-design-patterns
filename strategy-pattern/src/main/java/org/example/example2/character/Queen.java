package org.example.example2.character;

import org.example.example2.behavior.BowAndArrowBehavior;

public class Queen extends Character {
    public Queen() {
        weaponBehavior = new BowAndArrowBehavior();
    }
}
