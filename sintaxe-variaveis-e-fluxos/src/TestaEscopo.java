
public class TestaEscopo {

	public static void main(String[] args) {
		
		int idade = 15;
		int quantidadePessoas = 2;
		boolean acompanhado;
		
		if (quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}

		if (idade >= 18 || acompanhado) {
			System.out.println("pode entrar");
		} else {
			System.out.println("não pode entrar");
		}

		if (idade >= 18 && quantidadePessoas >= 2) {
			System.out.println("pode entrar");
		} else {
			System.out.println("não pode entrar");
		}
	}

}
