package br.univel;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;

public class CalcFactory {

	@RequestScoped	
	@Gerenciado
	@Produces
	public Calc criarNovoCalc() {
		System.out.println("\nCriado novo Calc!\n");
		Calc c = new Calc();

		c.setValor(10);

		return c;
	}

	public void theTerminator(@Disposes @Gerenciado Calc calc) {
		System.out.println("\nFinalizando o Calc!\n");
		calc.setValor(0);
	}
}
