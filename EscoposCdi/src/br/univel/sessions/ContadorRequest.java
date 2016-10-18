package br.univel.sessions;

import javax.enterprise.context.RequestScoped;

@RequestScoped
public class ContadorRequest {
	private int count;

	public int getNumero() {
		return ++count;
	}
}
