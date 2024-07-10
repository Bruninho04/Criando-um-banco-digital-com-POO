package contas;

public class ContaCorrente extends Conta{

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void sacar(double valor) {
		if (valor <= saldo) {//verificar se o saldo é suficiente
			saldo -= valor;
		} else {
			System.out.println("Saldo insuficiente para saque.");
		}
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
		
	}

	@Override
	public void transferir(Conta contaDestino, double valor) {
		if (valor <= saldo) {//verificar se o saldo é suficiente
			this.sacar(valor);
			contaDestino.depositar(valor);
		} else {
			System.out.println("Saldo insuficiente para transferência.");
		}
	}

	@Override
	public void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}

}
