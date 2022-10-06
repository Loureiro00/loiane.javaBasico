package com.loiane.cursojava.aulaExercicios15;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		/*
		 * Faça um Programa que pergunte em que turno você estuda. Peça para digitar
		 * M-matutino ou V-Vespertino ou N- Noturno. Imprima a mensagem "Bom Dia!",
		 * "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso
		 */

		Scanner ler = new Scanner(System.in);
		System.out.println(" Digite o seu turno : ");
		String turno=ler.next();
		
		switch (turno) 
		{
		case  "m":
		case "M" : System.out.println(" Bom dia ! "); break;		
		case  "v":
		case "V" : System.out.println(" Boa tarde ! "); break;
		case  "n":
		case "N" : System.out.println(" Boa noite ! "); break;
		default : System.out.println(" Faça o que se pede");		
		}
		ler.close();		
	}

}
