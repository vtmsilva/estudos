
public class TestagetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(1233, 84841528);
		Conta conta2 = new Conta(1233, 86841528);
		System.out.println("o total de contas é " +  Conta.getTotal());
		System.out.println(conta.getNumero());
		System.out.println(conta.getAgencia());
        Cliente victor = new Cliente();
        victor.setNome("victor marques");
        conta.setTitular(victor);
        System.out.println(conta.getTitular().getNome());
        
        conta.getTitular().setProfissao("programador");
//        da pra fazer assim tbm
        Cliente titularDaConta = conta.getTitular();
        titularDaConta.setCpf("21232343434");
        
        System.out.println(conta.getTitular().getCpf());
        System.out.println(titularDaConta.getCpf());
        
        

	}

}
