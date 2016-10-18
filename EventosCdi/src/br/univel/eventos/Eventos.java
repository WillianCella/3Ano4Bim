package br.univel.eventos;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Eventos")
public class Eventos extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Inject
	private Event<Venda> evento;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Venda v = new Venda();
		v.setCliente("João Aurélio");

		List<Produto> lista = new LinkedList<>();

		Produto p1 = new Produto();
		p1.setId(1);
		p1.setNome("Caninha");
		p1.setPreco(new BigDecimal(3000));

		Produto p2 = new Produto();
		p2.setId(2);
		p2.setNome("Maria mole");
		p2.setPreco(new BigDecimal(2500));

		Produto p3 = new Produto();
		p3.setId(1);
		p3.setNome("Paçoca");
		p3.setPreco(new BigDecimal(1000));

		lista.add(p1);
		lista.add(p2);
		lista.add(p3);

		v.setProdutos(lista);
		evento.fire(v);

		response.getWriter().append("Disparando, ver console!").flush();

	}

}
