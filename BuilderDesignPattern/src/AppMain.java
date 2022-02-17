
public class AppMain {
	
	public static void main(String[] args) {
		
		//Builder Design Pattern
		/* 
		  	The builder pattern is a design pattern designed to provide a flexible 
			solution to various object creation problems in object-oriented programming. 
			The intent of the Builder design pattern is to separate the construction of a 
			complex object from its representation. 
		*/
		// -Flexible properties setting no strict constraints of constructors.
		// -dynamic properties setting i.e. order of setting doesn't matter. 
		Phone phone = new PhoneBuilder()
				.setOs("IOS")
				.setRam(2)
				.setBattery(4000)
				.setProcessor("Qualcomm 845")
				.setScreenSize(5.5)
				.getPhone();
		System.out.println(phone);
	}

}
