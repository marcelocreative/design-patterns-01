package design_patterns_01.com.mgsystems.chainOfResponsibility;

import design_patterns_01.com.mgsystems.strategy.Orcamento;

public class CalculadorDesonto {
	
	
	public Double calcularDesconto(Orcamento Orcamento) {
		
		Desconto d1= new DescontoPorMaisDeCincoItens();
		Desconto d2= new DescontoPorMaisQueQuinhentosReais();
		Desconto d3= new SemDesconto();
		
		d1.ProximoDesconto(d2);
		d2.ProximoDesconto(d3);
		
		
		return d1.calcularDesconto(Orcamento);
	}
	

}
