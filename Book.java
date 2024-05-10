package assignment3_books;

public class Book 
{
	
	private int bkid;
	
	private String bkName;
	
	private double bkPrice;
	
	

	public Book(int bkID, String bkName, double bkPrice) {
		super();
		this.bkid = bkID;
		this.bkName = bkName;
		this.bkPrice = bkPrice;
	}

	public int getBkid() {
		return bkid;
	}

	public void setBkid(int bkID) {
		this.bkid = bkID;
	}

	public String getBkName() {
		return bkName;
	}

	public void setBkName(String bkName) {
		this.bkName = bkName;
	}

	public double getBkPrice() {
		return bkPrice;
	}

	public void setBkPrice(double bkPrice) {
		this.bkPrice = bkPrice;
	}

	@Override
	public String toString() {
		return "id = " + bkid + ", Name = " + bkName + ", Price = " + bkPrice + "\n";
	}
	
	
	

}
