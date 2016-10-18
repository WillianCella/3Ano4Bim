package br.univel;

@TipoCachorro
public class Cachorro implements Animal {
	@Override
	public String falar() {
		return "Woof";
	}
}
