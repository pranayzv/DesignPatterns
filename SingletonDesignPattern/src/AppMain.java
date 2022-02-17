
public class AppMain {
	
	/*
	 * 
	 * The primary purpose of a Single class is to restrict the limit of the number of 
	 * object creation to only one. This often ensures that there is access control to 
	 * resources, for example, socket or database connection.

	   The memory space wastage does not occur with the use of the
	    singleton class because it restricts the instance creation. 
	    As the object creation will take place only once instead of creating 
	    it each time a new request is made.
	 * 
	 * */

	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		System.out.println(singleton.getData());
		
		//Same memory location we get whenever we get a instance
		for(int i=1;i<10;i++) {
			System.out.println(Singleton.getInstance());
		}

	}

}
