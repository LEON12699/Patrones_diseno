
package designpatterns.strategy.characters;


public class Knigth extends Character{

    public Knigth() {
        weapon = new Knife();
    }

    @Override
    public String toString() {
        return "Soy un caballero ";
    }
    
    
    
}
