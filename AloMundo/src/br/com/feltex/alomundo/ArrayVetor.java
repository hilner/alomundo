package br.com.feltex.alomundo;

import java.util.ArrayList;
import java.util.List;

public class ArrayVetor {

	public static void main(String[] args) {
		ClienteFilme cf = new ClienteFilme();
			

		// Cria��o de uma Lista
		List<ClienteFilme> lista = new ArrayList<ClienteFilme>();
		lista.add(new ClienteFilme());

		
		// Cria��o de um Array
		ClienteFilme[] array = new ClienteFilme[10];
		array[0] = new ClienteFilme();
	}
}