
public class TestaBanco {
	
	public static void main(String[] args) {
		Cliente victor = new Cliente();
		victor.nome = "Victor Marques";
		victor.cpf = "457.120.198.17";
		victor.profissao = "programador";
		
		Conta contaDoVictor = new Conta();
		contaDoVictor.deposita(100);
		contaDoVictor.titular = victor;
		System.out.println(contaDoVictor.titular.nome);
	}
			

}
