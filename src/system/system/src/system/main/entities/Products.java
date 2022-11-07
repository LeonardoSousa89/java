package system.main.entities;

public class Products extends Thread{
	
	private String itemName;
	private String price;
	private String quantity;

	public Products() {}
	
	public Products(String itemName, String price, String quantity) {
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public void run() {
		System.out.println(
				"\t \t \t \t--------PRODUCTS-------- \n \n \n"
				+"item:" 
				+ getItemName()
				+"\t \t"
				+"price:"
				+getPrice()
				+"\t \t"
				+"quantity:"
				+getQuantity()
				+". \n \n \n");
	}
}
