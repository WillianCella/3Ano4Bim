package br.univel.eventos;

import javax.enterprise.event.Observes;

public class Estoque {
	public void baixarEstoque(@Observes Venda venda) {
		System.out.println("Atualizando estoque: " + venda.toString());
	}
}
