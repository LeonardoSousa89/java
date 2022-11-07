package Model;

public class Client {
	/*dados do usuário*/
	private String name;
	private String sex;
	private String adress;
	private String phoneNumber;
	private int age;
	
	public Client() {
		
	}

	public Client(String name, String sex, String adress, String phoneNumber, int age) {
		super();
		this.name = name;
		this.sex = sex;
		this.adress = adress;
		this.phoneNumber = phoneNumber;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "name:" 
				+ getName() 
				+ ","
				+ "age:"
				+ getAge()
				+","
				+ " sex:" 
				+ getSex() 
				+ ", "
				+ "adress:"
				+ getAdress() 
				+ ", "
				+ "phoneNumber:" 
				+ getPhoneNumber();
	}
	
	
}
