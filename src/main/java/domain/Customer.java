package domain;

public class Customer {
	private String name;
	private String customerId;
	private String address;
	private String noOfOrdersMade;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getNoOfOrdersMade() {
		return noOfOrdersMade;
	}
	public void setNoOfOrdersMade(String noOfOrdersMade) {
		this.noOfOrdersMade = noOfOrdersMade;
	}
	
	public Customer() {
		super();
	}
}
