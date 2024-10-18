
public class Conta {
	private double saldo;
	int agencia;
	int numero;
	Cliente titular;

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			destino.deposita(valor);
			System.out.println("transferencia feita com sucesso");
			return true;
		} else {
			System.out.println("sem saldo suficiente");
			return false;

		}
	}
	
	public double getSaldo() {
		return this.saldo;
	}

}