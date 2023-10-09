package design_patterns_01.com.mgsystems.strategy;

public class ICMS implements Imposto {

	@Override
	public Double calcular(Orcamento orcamento) {
		
		return (orcamento.getValor() * 0.05) + 50.00;
		
	}

}
