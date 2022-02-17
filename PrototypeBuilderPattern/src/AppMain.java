// Prototype: load once and use its by creating cloning of object with loaded data
public class AppMain {

	public static void main(String[] a) throws Exception {
		
		Shop noveltyA = new Shop("Novelty A");
		//loading the data once
		noveltyA.loadData();
		
		
		Shop noveltyB = (Shop) noveltyA.clone();
		
		noveltyA.getBooks().remove(1);
		
		System.out.println(noveltyA.toString());
		System.out.println(noveltyB.toString());
		
		
		
	}
	

}
