package design_patterns_01.com.mgsystems.classes;

public class IKCV extends TemplateDeImpostoCondicional {

	@Override
	public Double minimaTaxacao(Orcamento orcamento) {
		
		return orcamento.getValor() * 0.06;
		
	}

	@Override
	public Double maximaTaxacao(Orcamento orcamento) {
		
		return orcamento.getValor() * 0.1;
		
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		
		return orcamento.getValor() > 500.00 && temItemMaiorQue100Reais(orcamento);
		
	}

	private boolean temItemMaiorQue100Reais(Orcamento orcamento) {
		
		for(Item item : orcamento.getItens()) {
			
			if(item.getValor() > 100) {
				return true;
			}
			
		}
		
		return false;
	}

}
