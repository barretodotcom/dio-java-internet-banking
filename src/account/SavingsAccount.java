package account;

public class SavingsAccount extends Account{

	public SavingsAccount(String clientName) {
		super(clientName);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("Extrato conta Corrente");
		super.imprimirAtributos();
	}
}
