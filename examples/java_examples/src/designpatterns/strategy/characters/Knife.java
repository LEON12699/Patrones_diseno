
package designpatterns.strategy.characters;


public class Knife implements WeaponBehavior{

    @Override
    public void useWeapon() {
        System.out.println("ataco con mi cuchillo ...");
    }
    
    
}
