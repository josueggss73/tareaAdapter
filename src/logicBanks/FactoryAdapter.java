package logicBanks;

public class FactoryAdapter {
	
	public static IAdapter getAdapter(String bank) {
		switch(bank){
		case "bankX":
			return new Bank_X_Adapter();
		case "bankY":
			return new Bank_Y_Adapter();
		case "bankZ":
			return new Bank_Z_Adapter();
		default:
			return null;
		}
	}
}
