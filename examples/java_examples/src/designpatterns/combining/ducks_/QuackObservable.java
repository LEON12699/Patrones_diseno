package designpatterns.combining.ducks_;

public interface QuackObservable {
	public void registerObserver(Observer observer);
	public void notifyObservers();
}
