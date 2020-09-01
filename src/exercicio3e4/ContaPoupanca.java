package exercicio3e4;

public class ContaPoupanca extends Conta {
	
	@Override
	public Double rendimento() {
		return this.getSaldo() * 0.05;
	}

	@Override
	public Double calcularImposto() {
		return rendimento() * 0.10;
	}
}
