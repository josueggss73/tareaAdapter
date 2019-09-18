package logicBanks;

public class Bank_Z_Adapter implements IAdapter{

	Banco_Z_API api = new Banco_Z_API();
	
	@Override
	public BankResponse sendRequest(BankRequest request) {
		
		boolean response = false;
		try {
			response = api.getCreditAuth(request.getCustomer(), (float)request.getAmount()); 
		}catch(Exception e) {
			return new BankResponse(false);
		}
		return new BankResponse(response);
	}

}
