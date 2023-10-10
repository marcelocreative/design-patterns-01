package design_patterns_01.com.mgsystems.templateMethod;

import design_patterns_01.com.mgsystems.strategy.Orcamento;

public class ICPP extends TemplateDeImpostoCondicional {

	@Override
	public Double minimaTaxacao(Orcamento orcamento) {
		
		return orcamento.getValor() * 0.05;
		
	}

	@Override
	public Double maximaTaxacao(Orcamento orcamento) {
		
		return orcamento.getValor() * 0.07;
		
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		
		return orcamento.getValor() > 500.00;
	}

}
