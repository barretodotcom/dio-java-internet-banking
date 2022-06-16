package account;

public class Main {
	
	public static void main(String[] args) {
		
		Account cc = new CheckingAccount("João");
		Account savingAccount = new SavingsAccount("João");
		
		cc.transferir(savingAccount,1000);
		cc.imprimirExtrato();
		
		savingAccount.imprimirExtrato();
	}
	
}
