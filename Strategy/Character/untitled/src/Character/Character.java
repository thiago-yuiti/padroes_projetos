package Character;

import Weapon.WeaponBehavior;

public abstract class Character {
    WeaponBehavior weaponBehavior;
    public void Character() {}

    public void fight() {
        weaponBehavior.useWeapon();
    }
    public void setWeapon(WeaponBehavior wp) {
        this.weaponBehavior = wp;
    }
}
