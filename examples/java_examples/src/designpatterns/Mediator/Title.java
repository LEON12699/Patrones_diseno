
package designpatterns.Mediator;

import java.awt.event.KeyEvent;
import javax.swing.JTextField;


class Title  extends JTextField implements Component {
    private Mediator mediator;
    
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator=mediator;
    }

    @Override
    protected void processComponentKeyEvent(KeyEvent e) {
        mediator.markNote();
        
    }
    
    

    @Override
    public String getname() {
        return "Title";
    }
    
}
