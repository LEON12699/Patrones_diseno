package designpatterns.observer.simpleobservable;

public class Example {

	public static void main(String[] args) {
		SimpleSubject simpleSubject = new SimpleSubject();
	
		SimpleObserver simpleObserver = new SimpleObserver();
                SimpleObserver simpleObserver1 = new SimpleObserver();
                simpleSubject.AddObserver(simpleObserver);
                simpleSubject.AddObserver(simpleObserver1);
		simpleSubject.setValue(80);
                simpleSubject.RemoveObserver(simpleObserver);
                simpleSubject.setValue(40);
	}
}
