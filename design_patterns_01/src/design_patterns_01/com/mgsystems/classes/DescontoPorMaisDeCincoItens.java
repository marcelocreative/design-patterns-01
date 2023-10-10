package design_patterns_01.com.mgsystems.classes;

public class DescontoPorMaisDeCincoItens implements Desconto {
	
	private Desconto proximo;

	@Override
	public Double calcularDesconto(Orcamento orcamento) {
		
		if(orcamento.getItens().size() > 5) {
			
			return orcamento.getValor() * 0.1;
			
		}
		
		else {
			return proximo.calcularDesconto(orcamento);
		}
		
	}

	@Override
	public void ProximoDesconto(Desconto proximo) {
		
		this.proximo = proximo;

	}

}
