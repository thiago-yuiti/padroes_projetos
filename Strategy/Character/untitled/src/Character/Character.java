package Character;

public class Character {
    WeaponBehavior weaponBehavior;
    public void Character() {}

    public void fight() {
        weaponBehavior.useWeapon();
    }
    public void setWeapon(WeaponBehavior wp) {
        this.weapon = wp;
    }
}
