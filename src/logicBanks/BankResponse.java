package logicBanks;

public class BankResponse {

	private boolean approved;
	
	public BankResponse(boolean ap) {
		approved = ap;
	}
	public boolean getApproved() {
		return approved;
	}
}
