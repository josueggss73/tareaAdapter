package logicBanks;

public class BankRequest {
	
	private String customer;
	private double amount;
	
	public BankRequest(String cust,double amount) {
		customer = cust;
		this.amount = amount;
	}

	public String getCustomer() {
		return customer;
	}

	public double getAmount() {
		return amount;
	}
}
