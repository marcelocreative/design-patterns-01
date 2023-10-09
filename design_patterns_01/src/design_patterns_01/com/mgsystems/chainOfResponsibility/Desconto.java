package design_patterns_01.com.mgsystems.chainOfResponsibility;

import design_patterns_01.com.mgsystems.strategy.Orcamento;

public interface Desconto {
	
	public Double calcularDesconto(Orcamento orcamento);
	public void ProximoDesconto(Desconto proximo);

}
