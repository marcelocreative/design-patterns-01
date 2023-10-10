package design_patterns_01.com.mgsystems.testes;

import design_patterns_01.com.mgsystems.classes.ICPP;
import design_patterns_01.com.mgsystems.classes.IHIT;
import design_patterns_01.com.mgsystems.classes.IKCV;
import design_patterns_01.com.mgsystems.classes.Imposto;
import design_patterns_01.com.mgsystems.classes.Item;
import design_patterns_01.com.mgsystems.classes.Orcamento;

public class TesteCalculadorImpostoTemplateMethod {

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
