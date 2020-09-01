package exercicio2;

public class Main {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		
		p.setNome("Victor Pereira");
		p.setEndereco("Rua Jasmin");
		p.setTelefone("993812938");
		
		System.out.println(p.toString());
	}
}
