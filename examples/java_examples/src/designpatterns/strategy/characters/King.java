
package designpatterns.strategy.characters;

/**
 *
 * @author leon12699
 */
public class King extends Character{

    public King() {
        weapon = new Sword();
    }

    @Override
    public String toString() {
        return "Soy un rey";
    }
    
    
}
