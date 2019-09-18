package logicBanks;

import java.util.HashMap;

public class Banco_X_API {

private HashMap<String,Float> maxCredit;
	
	public Banco_X_API() {
		maxCredit = new HashMap<String,Float>();
		
		maxCredit.put("Josue Guerrero", 1500000f);
		maxCredit.put("Maria Marin", 2300000f);
		maxCredit.put("Jose Meneses", 2000000f);
	}
	
	public String validateCost(String customer, float amount){
		if(maxCredit.get(customer) >= amount) {
			return "Y";	
		}else {
			return "N";
		}
	}
}
