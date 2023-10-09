package design_patterns_01.com.mgsystems.strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import design_patterns_01.com.mgsystems.chainOfResponsibility.Item;

public class Orcamento {

	private final Double valor;
	private List<Item> itens;
	
	public Orcamento(Double valor) {
		this.valor = valor;
		itens= new ArrayList<>();
	}

	public Double getValor() {
		return valor;
	}

	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}
	
	public void addItens(Item item) {
		
		itens.add(item);
		
	}
}
