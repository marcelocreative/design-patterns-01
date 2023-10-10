package design_patterns_01.com.mgsystems.templateMethod;

import design_patterns_01.com.mgsystems.chainOfResponsibility.Item;
import design_patterns_01.com.mgsystems.strategy.Imposto;
import design_patterns_01.com.mgsystems.strategy.Orcamento;

public class TesteCalculoImposto {

	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento(600.00);
		orcamento.addItens(new Item("Bolsa de Couro", 250.00));
		orcamento.addItens(new Item("Caderno", 50.00));
		orcamento.addItens(new Item("Lancheira", 150.00));
		orcamento.addItens(new Item("Lapiseira", 30.00));
		orcamento.addItens(new Item("Jogo Canetas", 70.00));
		orcamento.addItens(new Item("Jogo lapis", 40.00));
		orcamento.addItens(new Item("Kit 3 Borrachas", 10.00));
		
		Imposto icpp= new ICPP();
		Imposto ikcv= new IKCV();
		Imposto ihit= new IHIT();
		
		System.out.println(icpp.calcular(orcamento));
		System.out.println(ikcv.calcular(orcamento));
		System.out.println(ihit.calcular(orcamento));

	}

}
