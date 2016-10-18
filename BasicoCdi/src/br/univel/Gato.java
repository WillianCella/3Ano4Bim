package br.univel;

@TipoGato
public class Gato implements Animal {
	@Override
	public String falar() {
		return "Miau";
	}

}
