package org.example.example2.behavior;

public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Shooting arrow from a bow!");
    }
}
