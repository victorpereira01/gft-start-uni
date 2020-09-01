package exercicio3e4;

public class Main {

	public static void main(String[] args) {
		Conta corrente = new ContaCorrente();
		Conta poupanca = new ContaPoupanca();
		
		corrente.setNumero(12983);
		corrente.setTitular("Victor");
		corrente.setSaldo(100.00);
		
		poupanca.setNumero(18233);
		poupanca.setTitular("Ana");
		poupanca.setSaldo(100.00);
		
		System.out.println(corrente.toString());
		System.out.println(poupanca.toString());
	}
}
