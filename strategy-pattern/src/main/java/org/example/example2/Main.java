package org.example.example2;

import org.example.example2.behavior.SwordBehavior;
import org.example.example2.character.Character;
import org.example.example2.character.King;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello world example2");

        Character king = new King();
        king.useWeapon();
        king.setWeaponBehavior(new SwordBehavior());
        king.useWeapon();
    }
}
