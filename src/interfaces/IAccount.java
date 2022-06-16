package interfaces;

import account.Account;

public interface IAccount {
	
	public void sacar(double value);
	
	public void depositar(double value);

	public void transferir(Account destinyAccount, double value);

	public void imprimirExtrato();
}
