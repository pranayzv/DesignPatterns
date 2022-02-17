
public class Book {
	private int bid;
	private String bookName;
	
	public Book(int bid, String bookName) {
		super();
		this.bid = bid;
		this.bookName = bookName;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String toString() {
		return "bid="+getBid()+", bookName="+getBookName();
	}
}
