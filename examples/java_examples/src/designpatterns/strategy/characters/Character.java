
package designpatterns.strategy.characters;

/**
 *
 * @author leon12699
 */
public abstract class Character {
    WeaponBehavior weapon;
    
    public void fight() {
        weapon.useWeapon();
    }

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }
    
    
    
}
