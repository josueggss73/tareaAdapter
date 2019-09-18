package logicBanks;

import java.util.HashMap;

public class Banco_Z_API {
	
	private HashMap<String,Float> maxCredit;
	
	
	public Banco_Z_API() {
		maxCredit = new HashMap<String,Float>();
		
		maxCredit.put("Josue Guerrero", 1500000f);
		maxCredit.put("Maria Marin", 1800000f);
		maxCredit.put("Jose Meneses", 700000f);
	}
	
	
	public boolean getCreditAuth(String customer,float amount) throws Exception {
		if(maxCredit.get(customer) >= amount) {
			return true;
		}else {
			throw new Exception("Monto mayor al permitido");
		}
	}
}
