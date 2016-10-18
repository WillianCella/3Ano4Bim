package br.univel.eventos;

import java.io.Serializable;
import java.math.BigDecimal;

public class Produto implements Serializable {
	private static final long serialVersionUID = 5561071286154539252L;
	private int id;
	private String nome;
	private BigDecimal preco;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", preco=" + preco + "]";
	}

}
