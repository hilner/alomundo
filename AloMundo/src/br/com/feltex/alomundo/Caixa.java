package br.com.feltex.alomundo;

import javax.swing.JOptionPane;

public class Caixa {

	public static void main(String[] args) {

		// Coleta o nome da Pessoa
		String nome = JOptionPane.showInputDialog(null, "Informe seu nome", "",
				JOptionPane.PLAIN_MESSAGE);
		if (nome == null) {
			System.exit(0);
		}

		// A quantidade de horas que a pessoa trabalhou no mês
		String horas = JOptionPane.showInputDialog(null,
				"Informe quantas horas trabalhada por dia", "",
				JOptionPane.PLAIN_MESSAGE);
		if (horas == null) {
			System.exit(0);
		}

		// Aqui coleta quantos dias a pessoa trabalhou no mês
		String dias = JOptionPane.showInputDialog(null,
				"Informe quantos dias trabalhado no mes", "",
				JOptionPane.PLAIN_MESSAGE);
		if (dias == null) {
			System.exit(0);
		}

		// Aqui a pessoa coloca quantos ela ganho por hora
		String ganho = JOptionPane.showInputDialog(null,
				"Informe quantos voce ganha por hora de trabalho", "",
				JOptionPane.PLAIN_MESSAGE);
		if (ganho == null) {
			System.exit(0);
		}

		// Aqui converte a String em double e realiza o calculo
		double horasPorDia = Double.parseDouble(horas);
		double diasTrabalhado = Double.parseDouble(dias);
		double ganhoPorHora = Double.parseDouble(ganho);
		double salarioBruto = (horasPorDia * diasTrabalhado) * ganhoPorHora;

		// Aqui imprimi na tela o resultado

		JOptionPane.showMessageDialog(null, nome + "\n"
				+ " Horas trabalhada por dia = " + horasPorDia + "\n"
				+ " Quantidade de dias que voce trabalhou = " + diasTrabalhado
				+ "\n" + " Ganho por hora = " + ganhoPorHora + "\n"
				+ " Ganho Bruto = " + salarioBruto + "\n");

	}
}