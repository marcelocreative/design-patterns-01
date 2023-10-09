package design_patterns_01.com.mgsystems.chainOfResponsibility;

import design_patterns_01.com.mgsystems.strategy.Orcamento;

public class TestesCalculadorDesconto {

	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento(500.00);
		orcamento.addItens(new Item("Bolsa de Couro", 250.00));
		orcamento.addItens(new Item("Bolsa de Caderno", 50.00));
		orcamento.addItens(new Item("Lancheira", 50.00));
		orcamento.addItens(new Item("Lapiseira", 30.00));
		orcamento.addItens(new Item("Jogo Canetas", 70.00));
		orcamento.addItens(new Item("Jogo lapis", 40.00));
		orcamento.addItens(new Item("Kit 3 Borrachas", 10.00));
		
		
		CalculadorDesonto calculador = new CalculadorDesonto();
		Double valorDesconto = calculador.calcularDesconto(orcamento);
		
		System.out.println(valorDesconto);

	}

}
