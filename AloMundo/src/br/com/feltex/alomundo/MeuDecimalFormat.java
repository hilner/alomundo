package br.com.feltex.alomundo;

import java.text.DecimalFormat;

public class MeuDecimalFormat {

	public static void main(String[] args) {		
		double salario = 9263.145926;
	 
		System.out.println("Sal�rio sem formata��o : " + salario);
	 
		DecimalFormat df = new DecimalFormat("###.##");// 2 Casas decimais		
		System.out.println("salario com formata��o (2 casas decimais) : " + df.format(salario));
		
		df = new DecimalFormat("###.###");// 3 Casas decimais
		System.out.println("salario com formata��o (3 casas decimais) : " + df.format(salario));
	    }

	}