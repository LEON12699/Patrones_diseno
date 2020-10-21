package designpatterns.Mediator;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JTextField;
import javax.swing.ListModel;

public class Filter extends JTextField implements Component {

    private Mediator mediator;
    private ListModel listModel;

    public Filter() {
    }

    public void setListModel(ListModel listModel) {
        this.listModel = listModel;
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String getname() {
        return "Filter";
    }



    
    @Override
    protected void processComponentKeyEvent(KeyEvent e) {
        String start = getText();
        searchElements(start);
    }

    private void searchElements(String start) {
        if (listModel == null) {
            return;
        }

        if (start.equals("")) {
            mediator.setElementsList(listModel);
            return;
        }

        ArrayList<Note> notes = new ArrayList<>();
        for (int i = 0; i < listModel.getSize(); i++) {
            notes.add((Note) listModel.getElementAt(i));

        }

        DefaultListModel<Note> listModel = new DefaultListModel<>();
        for (Note note : notes) {
            if (note.getName().contains(start)) {
                listModel.addElement(note);
            }
        }
        mediator.setElementsList(listModel);
    }

}
