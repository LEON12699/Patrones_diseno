
package designpatterns.strategy.characters;

/**
 *
 * @author leon12699
 */
public class Knigth extends Character{

    public Knigth() {
        weapon = new Knife();
    }

    @Override
    public String toString() {
        return "Soy un caballero ";
    }
    
    
    
}
