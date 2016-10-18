package br.univel;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Hello")
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Inject
	@TipoCachorro
	private Animal cachorro;

	@Inject
	@TipoGato
	private Animal gato;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter()
		.append("<html><head></head><body>")
		
		.append("O cahorro fala: " + cachorro.falar())
		.append("<br>")
		.append("O gato fala: " + gato.falar())
		
		.append("</body></html>")
		
		.flush();
	}

}
