package contas;

public abstract class Conta {
	private static final int AGENCIA_PADRAO = 1;//deixar a agência padrão para todas as contas criadas

	private static int SEQUENCIAL = 1;//cria uma sequência números para o número da conta
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;//incrementando o núemro da agência a cada conta criada 
		this.cliente = cliente;
	}
	
	//métodos abstratos
	public abstract void sacar(double valor);
	public abstract void depositar(double valor);
	public abstract void transferir(Conta contaDestino,double valor);
	public abstract void imprimirInfosComuns();
}
