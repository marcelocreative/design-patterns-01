package design_patterns_01.com.mgsystems.chainOfResponsibility;

import design_patterns_01.com.mgsystems.strategy.Orcamento;

public class SemDesconto implements Desconto {

	@Override
	public Double calcularDesconto(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return 0.0;
	}

	@Override
	public void ProximoDesconto(Desconto proximo) {
		// TODO Auto-generated method stub

	}

}
