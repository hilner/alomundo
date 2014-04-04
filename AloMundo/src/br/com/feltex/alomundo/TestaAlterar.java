package br.com.feltex.alomundo;

import java.util.Calendar;

public class TestaAlterar {

	public static void main(String[] args) {
		Contato contato = new Contato();

		contato.setNome("******");

		contato.setEmail("*****");

		contato.setEndereco("*****");

		contato.setDataNascimento(Calendar.getInstance());

		ContatoDAO dao = new ContatoDAO();

		dao.altera(contato);

		System.out.println("Alterado!");

	}

}
