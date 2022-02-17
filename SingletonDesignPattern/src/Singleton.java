
public class Singleton {

	private static Singleton singleton;
	private String data;
	
	//by changing the access it private, Outsiders can't instantiate it
	private Singleton() {
		//Generating data from DB once:
		this.data="the same Data";
	}
	
	//This is the only way of accessing the instance
	public static Singleton getInstance() {
		if(singleton==null) {
			singleton = new Singleton();
		}
		return singleton;
	}

	public String getData() {
		return data;
	}

	

}
