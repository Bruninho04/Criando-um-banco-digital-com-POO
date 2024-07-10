package main;

import contas.*;

public class Main {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Bruno");
		
		Conta contaCorrente = new ContaCorrente(cliente1);
		Conta contaPoupanca = new ContaPoupanca(cliente1);

		contaCorrente.depositar(1000);
		contaCorrente.transferir(contaPoupanca, 100);
		contaCorrente.sacar(2000);
		contaCorrente.imprimirInfosComuns();
		contaPoupanca.imprimirInfosComuns();
	}

}
