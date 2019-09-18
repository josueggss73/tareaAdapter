package logicBanks;

public class Bank_X_Adapter implements IAdapter{

	Banco_X_API api = new Banco_X_API();
	
	@Override
	public BankResponse sendRequest(BankRequest request) {
		String response = api.validateCost(request.getCustomer(), (float)request.getAmount()); 
		if(response.equals("Y")) {
			return new BankResponse(true);
		}else {
			return new BankResponse(false);
		}
	}

}
