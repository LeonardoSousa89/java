package data.main.products;

public class Products {
	
	private int id;
	private String item;
	private double price;
	private int qtd;
	
	public Products() {}

	public Products(int id, String item, double price, int qtd) {
		this.id = id;
		this.item = item;
		this.price = price;
		this.qtd = qtd;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((item == null) ? 0 : item.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + qtd;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Products other = (Products) obj;
		if (id != other.id)
			return false;
		if (item == null) {
			if (other.item != null)
				return false;
		} else if (!item.equals(other.item))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (qtd != other.qtd)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Products: "
				+ "id:" 
				+ id 
				+ ", item:" 
				+ item 
				+ ", price:" 
				+ price 
				+ ", qtd:" 
				+ qtd;
	}

}
