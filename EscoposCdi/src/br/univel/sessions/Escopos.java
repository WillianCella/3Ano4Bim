package br.univel.sessions;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Escopos")
public class Escopos extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Inject
	private ContadorApp contApp;

	@Inject
	private ContadorRequest contReq;

	@Inject
	private ContadorSession contSes;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter()

				.append("<html><head></head><body>")

				.append("<table<tbody>")

				.append("<tr><th>" + "Aplicação" + "</th><td>" + contApp.getNumero() + "</td></tr><br>")
				.append("<tr><th>" + "Sessão" + "</th><td>" + contSes.getNumero() + "</td></tr><br>")
				.append("<tr><th>" + "Requisição" + "</th><td>" + contReq.getNumero() + "</td></tr>")

				.append("</tbody></table>").append("</body></html>")

				.flush();
	}

}
