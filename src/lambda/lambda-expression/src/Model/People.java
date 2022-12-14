package Model;

public class People {
	
	private String name;
	private String adress;
	private int age;
	
	public People() {
		
	}

	public People(String name, String adress, int age) {
		super();
		this.name = name;
		this.adress = adress;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public boolean comparation() {
		return age >= 60;
	}

	@Override
	public String toString() {
		return "People: \n"
				+ "name:" 
				+ getName()
				+ ", "
				+ "adress:"
				+ getAdress()
				+ ", "
				+ "age:" 
				+ getAge() 
				+ ".";
	}
	
	
}
