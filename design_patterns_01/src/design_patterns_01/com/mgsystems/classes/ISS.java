package design_patterns_01.com.mgsystems.classes;

public class ISS implements Imposto {

	@Override
	public Double calcular(Orcamento orcamento) {
		
		return orcamento.getValor() * 0.06;
		
	}

}
