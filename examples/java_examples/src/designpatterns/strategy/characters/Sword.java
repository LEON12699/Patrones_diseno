
package designpatterns.strategy.characters;

/**
 *
 * @author leon12699
 */
public class Sword implements WeaponBehavior
{

    @Override
    public void useWeapon() {
        System.out.println("Estoy usando la espada ");
    }
    
}
