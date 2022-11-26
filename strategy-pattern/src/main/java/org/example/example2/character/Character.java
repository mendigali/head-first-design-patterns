package org.example.example2.character;

import org.example.example2.behavior.WeaponBehavior;

public abstract class Character {
    protected WeaponBehavior weaponBehavior;

    public void useWeapon() {
        weaponBehavior.useWeapon();
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}
