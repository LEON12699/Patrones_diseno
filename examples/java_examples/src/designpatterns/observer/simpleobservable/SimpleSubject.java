package designpatterns.observer.simpleobservable;

//import java.util.Observable;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class SimpleSubject {

    private int value = 0;
    PropertyChangeSupport pcs = new PropertyChangeSupport(this);

    public SimpleSubject() {
    }

    public void AddObserver(PropertyChangeListener l) {
        pcs.addPropertyChangeListener("value", l);
    }
    
     public void RemoveObserver(PropertyChangeListener l) {
        pcs.removePropertyChangeListener("value", l);
    }

    public void setValue(int value) {
        int old = this.value;
        this.value = value;
        pcs.firePropertyChange("value", old, value);
    }

    public int getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return "the subjetc object";
    }

}
