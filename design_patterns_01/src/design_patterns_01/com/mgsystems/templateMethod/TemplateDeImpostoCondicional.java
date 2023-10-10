package design_patterns_01.com.mgsystems.templateMethod;

import design_patterns_01.com.mgsystems.strategy.Imposto;
import design_patterns_01.com.mgsystems.strategy.Orcamento;

public abstract class TemplateDeImpostoCondicional implements Imposto {

	@Override
	public final Double calcular(Orcamento orcamento) {
		
		if(deveUsarMaximaTaxacao(orcamento)) {
			return maximaTaxacao(orcamento);
		}
		else {
			return minimaTaxacao(orcamento);
		}
		
	}

	protected abstract Double minimaTaxacao(Orcamento orcamento);

	protected abstract Double maximaTaxacao(Orcamento orcamento) ;
	
	protected abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

}
