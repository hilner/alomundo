package br.com.feltex.alomundo;

import java.util.Scanner;

public class Input {

	private double saldo;

	private Scanner sc;

	public static void main(String[] args) {
		new Input().iniciar();

	}

	public void iniciar() {
		sc = new Scanner(System.in);
		cadastrarSaldo();
	}
	

	public Double cadastrarSaldo() {
		// Variável de controle do Loop
		boolean continuar = true;
		
		// Loop que só será interropido quando tiver um valor vádlido
		while (continuar) {
			System.out.println("Digite o saldo do cliente: ");
			// Adicionado um tratamento de exceção
			try {				
				this.saldo = Double.parseDouble(sc.next());

				if (saldo >= 0.0) {
				//Como o valor é satisfatório o loop não será executado mais.	
					continuar = false;
				}

			} catch (Exception e) {
				//Este bloco é executado quando o valor digitado é inválido
				// Neste momento limpamos os dados do Scanner
				sc.reset();
				// É exibida uma mensagem informando que o valor é inválido
				System.out.println("Valor invádlido!" + e.getMessage());
			}
		}
		return saldo;
	}

}
