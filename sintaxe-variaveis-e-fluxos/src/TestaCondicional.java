
public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("testando");
		int idade = 15;
		int quantidadePessoas = 3;

		if (idade >= 18) {
			System.out.println("maior de idade");
			System.out.println("baum demai");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("não tem 18 mas pode entrar");
			} else {
				System.out.println("não pode entrar");
			}
		}
	}
}
