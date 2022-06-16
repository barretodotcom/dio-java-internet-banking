package account;

public class CheckingAccount extends Account {

	public CheckingAccount(String clientName) {
		super(clientName);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("Extrato conta Corrente");
		super.imprimirAtributos();
	}

}
