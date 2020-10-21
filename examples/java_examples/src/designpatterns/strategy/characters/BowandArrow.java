
package designpatterns.strategy.characters;


public class BowandArrow implements WeaponBehavior{

    @Override
    public void useWeapon() {
        System.out.println("Estoy usando flecha y arco en el ataque ");
    }
    
}
