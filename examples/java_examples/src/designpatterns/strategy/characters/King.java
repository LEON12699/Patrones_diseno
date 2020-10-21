
package designpatterns.strategy.characters;


public class King extends Character{

    public King() {
        weapon = new Sword();
    }

    @Override
    public String toString() {
        return "Soy un rey";
    }
    
    
}
