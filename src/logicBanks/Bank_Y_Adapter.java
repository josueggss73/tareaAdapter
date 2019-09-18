package logicBanks;

public class Bank_Y_Adapter implements IAdapter{

	Banco_Y_API api = new Banco_Y_API(); 
	
	@Override
	public BankResponse sendRequest(BankRequest request) {
		
		boolean response = api.getApproval(request.getCustomer(), request.getAmount());
		
		return new BankResponse(response);
	}

}
