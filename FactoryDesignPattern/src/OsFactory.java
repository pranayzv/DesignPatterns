
public class OsFactory {
	
	public static OS getInstance(String osName) {
		if(osName.equals("openSource")) {
			return new Android();
		}
		else if(osName.equals("closedSource")) {
			return new IOS();
		}
		else {
			return new Windows();
		}
	}

}
