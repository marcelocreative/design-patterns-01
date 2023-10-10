package design_patterns_01.com.mgsystems.testes;

import design_patterns_01.com.mgsystems.classes.ICCC;
import design_patterns_01.com.mgsystems.classes.ICMS;
import design_patterns_01.com.mgsystems.classes.ISS;
import design_patterns_01.com.mgsystems.classes.Imposto;
import design_patterns_01.com.mgsystems.classes.Orcamento;

public class TesteCalculadorImpostoStrategy {

	public static void main(String[] args) {
		
		Orcamento orcamento= new Orcamento(4000.00);
		
		Imposto iss= new ISS();
		Imposto icms= new ICMS();
		Imposto iccc= new ICCC();
		
		System.out.println(icms.calcular(orcamento));
		System.out.println(iss.calcular(orcamento));
		System.out.println(iccc.calcular(orcamento));

	}

}
