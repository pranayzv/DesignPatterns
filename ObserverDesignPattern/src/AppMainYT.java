
public class AppMainYT {

	public static void main(String[] args) {

		Channel pzv = new Channel("PZV");
		
		Subscriber s1 = new Subscriber("A");
		Subscriber s2 = new Subscriber("B");
		Subscriber s3 = new Subscriber("C");
		
		pzv.addObserver(s1); pzv.addObserver(s2); pzv.addObserver(s3);
		
		s1.subscribeSubject(pzv); s2.subscribeSubject(pzv); s3.subscribeSubject(pzv);
		
		//Pushing the notification to all the subscribers. 
		pzv.notifyObservers();
		

	}

}
