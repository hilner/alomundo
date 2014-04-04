package br.com.feltex.alomundo;

import java.util.ArrayList;

public class ManipulaArrayList {

	public static void main(String[] args) {
		ArrayList produtos = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			produtos.add("==" + i);
		}

		new ManipulaArrayList().ConexaoBD(produtos);
	}

	private ArrayList produtosComprados = new ArrayList<>();

	public void ConexaoBD(ArrayList produtos) {
		System.out.println(produtos.size()); // aqui aparece o arraylist preenchido
		
		this.produtosComprados.addAll(produtos);		
		System.out.println(produtos.size()); // mas aqui ele aparece zerado
	}

}
