
package designpatterns.strategy.characters;


public abstract class Character {
    WeaponBehavior weapon;
    
    public void fight() {
        weapon.useWeapon();
    }

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }
    
    
    
}
