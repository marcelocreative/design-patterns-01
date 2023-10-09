package design_patterns_01.com.mgsystems.strategy;

public class ICCC implements Imposto {

	@Override
	public Double calcular(Orcamento orcamento) {
		
		if(orcamento.getValor() < 1000.00) {
			return orcamento.getValor() * 0.05;
		}
		else if(orcamento.getValor() <=3000.00) {
			return orcamento.getValor() * 0.07;
		}
		else {
			return orcamento.getValor() * 0.08 + 30.00;
		}
		
	}

}
