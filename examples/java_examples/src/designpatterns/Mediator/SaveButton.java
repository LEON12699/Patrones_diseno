
package designpatterns.Mediator;

import java.awt.event.ActionEvent;
import javax.swing.JButton;


public class SaveButton extends JButton implements Component{

    private Mediator mediator;

    public SaveButton() {
        super("save");
    }
    
    
    

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String getname() {
        return "SaveButton";
    }

    @Override
    protected void fireActionPerformed(ActionEvent event) {
        mediator.saveChanges();
    }
     
    
}
