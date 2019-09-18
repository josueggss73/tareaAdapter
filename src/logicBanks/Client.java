package logicBanks;

public class Client {

	private IAdapter bankAdapter;
	private String name;
	private String bankName;
	private double money;
	
	public Client(String name,String bankName,double money) {
		this.name = name;
		this.bankName = bankName;
		this.money = money;
		bankAdapter = FactoryAdapter.getAdapter(bankName);
	}
	public IAdapter getAdapter() {
		return bankAdapter;
	}
	public String getName() {
		return name;
	}
	public String getBankName() {
		return bankName;
	}
	public double getMoney() {
		return money;
	}
}
