package system.main.entities;

public class Address extends Thread{
	
	private String city;
	private String country;
	private String uf;
	
	public Address() {}
	
	public Address(String city, String country, String uf) {
		this.city = city;
		this.country = country;
		this.uf = uf;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	@Override
	public void run() {
		System.out.println(
				"\t \t \t \t--------ADDRESS-------- \n \n \n"
				+"city:" 
				+ getCity()
				+"\t \t"
				+"country:"
				+getCountry()
				+"\t \t"
				+"UF:"
				+getUf()
				+". \n \n \n ");
	}
}
