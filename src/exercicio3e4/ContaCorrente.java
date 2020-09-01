package exercicio3e4;

public class ContaCorrente extends Conta {

	@Override
	public Double rendimento() {
		return this.getSaldo() * 0.03;
	}

	@Override
	public Double calcularImposto() {
		return rendimento() * 0.25;
	}
}
