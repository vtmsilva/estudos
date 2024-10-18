
public class TestaCondicional2 {
	
	public static void main(String[] args) {
		System.out.println("testando");
		int idade = 15;
		int quantidadePessoas = 2;
		boolean acompanhado = quantidadePessoas >= 2;

		if (idade >= 18 || acompanhado ) {
			System.out.println("pode entrar");
		} else {
			System.out.println("não pode entrar");
		}
		
		if (idade >= 18 && quantidadePessoas >= 2 ) {
			System.out.println("pode entrar");
		} else {
			System.out.println("não pode entrar");
		}
	}

}
