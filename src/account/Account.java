package account;

import interfaces.IAccount;

public abstract class Account implements IAccount {

	protected static final int AGENCIA_PADRAO = 1;

	protected final String clientName;
	
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo = 0;

	public Account(String clientName) {
		this.clientName = clientName;
		this.agencia = 1;
		this.numero = SEQUENCIAL++;
	}

	protected void imprimirAtributos() {
		System.out.println(String.format("Agência: %d",this.agencia));
		System.out.println(String.format("Número: %d",this.numero));
		System.out.println(String.format("Saldo: %.2f",this.saldo));
	}

	
	@Override
	public void sacar(double value) {
		this.saldo -= value;
	}

	@Override
	public void depositar(double value) {
		this.saldo += value;
	}

	@Override
	public void transferir(Account destinyAccount, double value) {
		this.sacar(value);
		destinyAccount.depositar(value);
	}
	
	public double getSaldo() {
		return this.saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}
