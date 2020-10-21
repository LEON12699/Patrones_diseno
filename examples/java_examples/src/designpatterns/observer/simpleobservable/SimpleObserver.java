package designpatterns.observer.simpleobservable;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

public class SimpleObserver implements PropertyChangeListener{

   /* private int value;
    private Observable observable;

    public SimpleObserver(Observable observable) {
        this.observable = observable;
        observable.addObserver((Observer) this);
    }
    
    @Override
    public void update(Observable o, Object arg) {
        System.out.println(arg);
        this.value = (int) arg;
        display();
        if (o instanceof SimpleSubject) {
            SimpleSubject simpleSubject = (SimpleSubject) o;
            this.value = simpleSubject.getValue();
            display();
        }
    }
    
    
    public void display() {
        System.out.println("Value: " + value);
    }
    
    */
    
    
    @Override
    public void propertyChange(PropertyChangeEvent evt ) {
       System.out.println("Variation of " + evt.getPropertyName());
       System.out.println("\t(" + evt.getOldValue() + 
							" -> " + evt.getNewValue() + ")");
       System.out.println("Property in object " + evt.getSource());
    }
}
