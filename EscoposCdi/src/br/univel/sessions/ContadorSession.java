package br.univel.sessions;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;

@SessionScoped
public class ContadorSession implements Serializable {

	private static final long serialVersionUID = -4563297720068516544L;

	private int count;

	public int getNumero() {
		return ++count;
	}
}
