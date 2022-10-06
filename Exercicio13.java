package com.loiane.cursojava.aulaExercicios15;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		/*  13.Faça um Programa que leia um número e exiba o dia correspondente
            da semana. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve
       */
		Scanner ler = new Scanner(System.in);
		System.out.println(" Digite  o dia da semana 1-7 : ");
		int diaDaSemana = ler.nextInt();
		
		switch (diaDaSemana) 
		{
		case 1 : System.out.println(" Domingo ");   break;
 		case 2 : System.out.println(" Segunda-Feira ");break;
		case 3 : System.out.println(" Terça-Feira   "); break;
		case 4 : System.out.println(" Quarta-Feira  "); break;
		case 5 : System.out.println(" Quinta-Feira  "); break;
		case 6 : System.out.println(" Sextta-Feria   ");break;
		case 7 : System.out.println(" Sabado"); break;
		default: System.out.println(" Digite o certo fela da puta.");
		}
		 
		ler.close();
	}

}
