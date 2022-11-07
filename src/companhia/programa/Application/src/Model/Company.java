package Model;

import Controller.Status;

public class Company {
	
	private Status status;
	private String companyAdress;
	private String type;
	
	public Company() {
		
	}
	
	public Company(Status status, String companyAdress, String type) {
		super();
		this.status = status;
		companyAdress = companyAdress;
		this.type = type;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getCompanyAdress() {
		return companyAdress;
	}

	public void setCompanyAdress(String companyAdress) {
		companyAdress = companyAdress;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return  "status:" 
				+ getStatus() 
				+ ", "
				+ "company adress:" 
				+ getCompanyAdress() 
				+","
				+"type:" 
				+ getType()
				+".";
	}	
}
