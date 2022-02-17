import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
	
	private String name;

	List<Observer> subscribers = new ArrayList<>();
	
	public Channel(String name) {
		this.name=name;
	}
	
	public String getName() {
		return this.name;
	}

	@Override
	public void addObserver(Observer observer) {
		subscribers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		subscribers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for(Observer observer: subscribers) {
			observer.update();
		}
	}

}
