package org.example.example2.character;

import org.example.example2.behavior.SwordBehavior;

public class Knight extends Character {
    public Knight() {
        weaponBehavior = new SwordBehavior();
    }
}
