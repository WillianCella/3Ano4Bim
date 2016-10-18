package br.univel.eventos;

import java.io.Serializable;
import java.util.List;

public class Venda implements Serializable {
	private static final long serialVersionUID = -5218406093689461650L;

	private String cliente;
	private List<Produto> produtos;

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	@Override
	public String toString() {
		return "Venda [cliente=" + cliente + ", produtos=" + produtos + "]";
	}

}
