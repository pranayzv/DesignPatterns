import java.util.ArrayList;
import java.util.List;

public class Shop implements Cloneable{
	
	private List<Book> books = new ArrayList<>();
	private String shopName;
	
	public Shop() {}
	
	public Shop(String shopName) {
		this.shopName= shopName;
	}
	
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	
	
	public void loadData() {
		for(int i=1;i<=10;i++) {
			getBooks().add(new Book(i,"Book "+i));
		}
	}
	
	@Override
	public String toString() {
		return "Shop[ shopName="+getShopName()+" , books={"+getBooks()+"} ]";
	}
	//Creates and returns a copy of this object. 
	//The precise meaning of "copy" may depend on the class of the object. 
	
	
	//Deep Clone/Prototype
	//It is depended on your custom implementation of overrided clone() method
	//In this if one property is changed in one object then no other object reflects changes. 
	//Independent Object.
	@Override
	public Shop clone() throws CloneNotSupportedException {
		//This returns a Object of this only. i.e. the reference not a new object
		Shop shop = new Shop();
		shop.getBooks().addAll(getBooks());
		return shop;
	}
	
	//Shallow Clone/ Prototype
	//it is based on same object and you only get a reference no new object.
	//In this if one property is changed in one reference the every reference reflects changes.
	/*
	 * @Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	 * 
	 * */
	
	

}
