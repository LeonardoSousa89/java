package testing.Entities;

public class Client {
	private String name;
	private String sex;
	
	public Client() {
		
	}

	public Client(String name, String sex) {
		this.name = name;
		this.sex = sex;
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

	@Override
	public String toString() {
		return "Client:"
				+ "name:" 
				+ getName()
				+ ","
				+ "sex:" 
				+ getSex()
				+ ".";
	}
}
