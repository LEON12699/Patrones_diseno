
package designpatterns.strategy.characters;

/**
 *
 * @author leon12699
 */
public class Knife implements WeaponBehavior{

    @Override
    public void useWeapon() {
        System.out.println("ataco con mi cuchillo ...");
    }
    
    
}
