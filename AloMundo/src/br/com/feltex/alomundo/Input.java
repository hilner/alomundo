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
		// Vari�vel de controle do Loop
		boolean continuar = true;
		
		// Loop que s� ser� interropido quando tiver um valor v�dlido
		while (continuar) {
			System.out.println("Digite o saldo do cliente: ");
			// Adicionado um tratamento de exce��o
			try {				
				this.saldo = Double.parseDouble(sc.next());

				if (saldo >= 0.0) {
				//Como o valor � satisfat�rio o loop n�o ser� executado mais.	
					continuar = false;
				}

			} catch (Exception e) {
				//Este bloco � executado quando o valor digitado � inv�lido
				// Neste momento limpamos os dados do Scanner
				sc.reset();
				// � exibida uma mensagem informando que o valor � inv�lido
				System.out.println("Valor inv�dlido!" + e.getMessage());
			}
		}
		return saldo;
	}

}
