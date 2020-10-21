
package designpatterns.strategy.characters;


public class Sword implements WeaponBehavior
{

    @Override
    public void useWeapon() {
        System.out.println("Estoy usando la espada ");
    }
    
}
