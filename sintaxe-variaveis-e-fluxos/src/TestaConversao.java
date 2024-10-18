
public class TestaConversao {

	public static void main(String[] args) {
		double salario = 1270.50;
		int valor = (int) salario;
		System.out.println(valor);
		System.out.println(salario);

		int x = 2000000000;
		float pontoFlutuante =3.14f;
		long numeroGrande = 2656545454l;
		short valorPequeno = 2131;
		byte b = 127;

		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		System.out.println("total: " + total);


	}
}
