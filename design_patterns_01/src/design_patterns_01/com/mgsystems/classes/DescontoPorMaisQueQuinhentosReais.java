package design_patterns_01.com.mgsystems.classes;

public class DescontoPorMaisQueQuinhentosReais implements Desconto{
	
	private Desconto proximo;

	@Override
	public Double calcularDesconto(Orcamento orcamento) {
		
		if(orcamento.getValor() > 500.00) {
			return orcamento.getValor() * 0.07;
		}
		
		else {
			return proximo.calcularDesconto(orcamento);
		}
	}

	@Override
	public void ProximoDesconto(Desconto proximo) {
		this.proximo= proximo;
		
	}

}
