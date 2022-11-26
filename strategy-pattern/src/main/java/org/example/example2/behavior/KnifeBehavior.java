package org.example.example2.behavior;

public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Stab enemy with knife!");
    }
}
