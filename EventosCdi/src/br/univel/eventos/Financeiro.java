package br.univel.eventos;

import javax.enterprise.event.Observes;

public class Financeiro {
	public void processarVenda(@Observes Venda venda) {
		System.out.println("Financeiro recebeu: " + venda.toString());
	}
}
