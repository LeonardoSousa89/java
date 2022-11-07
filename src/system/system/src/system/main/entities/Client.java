package system.main.entities;

public class Client extends Thread{
	
	private String cod;
	private String clienteName;
	private String lastclienteName;
	private String phoneNumber;
	
	public Client() {}
	
	public Client(String cod, String clienteName, String lastclienteName, String phoneNumber) {
		this.cod = cod;
		this.clienteName = clienteName;
		this.lastclienteName = lastclienteName;
		this.phoneNumber = phoneNumber;
	}
	
	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}
	
	public String getclienteName() {
		return clienteName;
	}

	public void setclienteName(String clienteName) {
		this.clienteName = clienteName;
	}

	public String getLastclienteName() {
		return lastclienteName;
	}

	public void setLastclienteName(String lastclienteName) {
		this.lastclienteName = lastclienteName;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public void run() {
		System.out.println( "\t \t \t \t--------CLIENT-------- \n \n \n"
							+"cod:" 
							+ getCod()
							+"\t \t"
							+"name:"
							+getclienteName()
							+"\t \t"
							+"last name:"
							+getLastclienteName()
							+"\t \t"
							+"phone number:"
							+getPhoneNumber()
							+". \n \n \n");
	}
}
