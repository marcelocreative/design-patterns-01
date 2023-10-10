package design_patterns_01.com.mgsystems.classes;

public interface Desconto {
	
	public Double calcularDesconto(Orcamento orcamento);
	public void ProximoDesconto(Desconto proximo);

}
