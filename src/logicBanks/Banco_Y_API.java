package logicBanks;

import java.util.HashMap;

public class Banco_Y_API {

	private HashMap<String,Double> maxCredit;
	
	public Banco_Y_API() {
		maxCredit = new HashMap<String,Double>();
		
		maxCredit.put("Josue Guerrero", 1100000.0);
		maxCredit.put("Maria Marin", 1400000.0);
		maxCredit.put("Jose Meneses", 1200000.0);
	}
	
	public boolean getApproval(String customer,double amount) {
		if(maxCredit.get(customer) >= amount) {
			return true;	
		}else {
			return false;
		}
	}
}
