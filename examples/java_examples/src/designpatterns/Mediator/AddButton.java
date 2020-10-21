
package designpatterns.Mediator;

import java.awt.event.ActionEvent;
import javax.swing.JButton;


@SuppressWarnings("serial")
public class AddButton extends JButton implements Component{
    private Mediator mediator;
    
    public AddButton(){
        super("Add");
    }
    
    
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator=mediator;
    }

    @Override
    public String getname() {
        return "AddButton";
    }

    @Override
    protected void fireActionPerformed(ActionEvent event) {
        mediator.addNewNote(new Note());
          
    }
    
    
    
}
