package logicBanks;

public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Client client = new Client("Josue Guerrero","bankX",190000);
		
		BankResponse response = client.getAdapter().sendRequest(new BankRequest(client.getName(),1000));
		
		System.out.println(response.getApproved());
	}

}
