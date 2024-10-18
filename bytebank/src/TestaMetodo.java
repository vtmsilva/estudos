
public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaV = new Conta();
		contaV.titular = "victor";
		Conta contaX = new Conta();
		contaV.saldo = 100;
		contaV.deposita(50);
		contaV.deposita(35);
		System.out.println(contaV.saldo);
		contaV.saca(10);
		boolean conseguiuRetirar = contaV.saca(200);
		System.out.println(contaV.saldo);
		System.out.println("conseguiuRetirar " + conseguiuRetirar);
		boolean conseguiuTrans = contaV.transfere(50, contaX);
		System.out.println("saldo conta victor " + contaV.saldo + " saldo conta X " + contaX.saldo);
		System.out.println("conseguiuTrans " + conseguiuTrans);
	}

}
