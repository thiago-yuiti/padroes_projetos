package Character;

import Weapon.SwordBehavior;

public class Knight extends Character {
    public Knight() {
        weaponBehavior = new SwordBehavior();
    }
}
