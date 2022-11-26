package org.example.example2.character;

import org.example.example2.behavior.KnifeBehavior;

public class King extends Character {
    public King() {
        weaponBehavior = new KnifeBehavior();
    }
}
