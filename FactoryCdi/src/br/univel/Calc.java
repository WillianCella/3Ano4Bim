package br.univel;

import java.io.Serializable;


import javax.enterprise.context.RequestScoped;
@RequestScoped
public class Calc implements Serializable {
	private static final long serialVersionUID = 4583997030787327699L;

	private int valor;

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public void inc() {
		this.valor++;
	}
}
