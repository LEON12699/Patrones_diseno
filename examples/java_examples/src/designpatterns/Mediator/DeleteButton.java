
package designpatterns.Mediator;

import java.awt.event.ActionEvent;
import javax.swing.JButton;


public class DeleteButton extends JButton implements Component{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Mediator mediator;

    public DeleteButton() {
        super("Del");
    }

    
    
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
    
    

    @Override
    public String getname() {
        return "DeleteButton";
    }

    @Override
    protected void fireActionPerformed(ActionEvent event) {
        mediator.deleteNote();
    }
    
    
    
}
