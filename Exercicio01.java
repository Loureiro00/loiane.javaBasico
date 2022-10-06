package com.loiane.cursojava.aulaExercicios17;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		 /* Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem
		 * caso o valor seja inválido e continue pedindo até que o usuário informe um
		 * valor válido
		 */

		Scanner ler = new Scanner(System.in);
		boolean notaValida = false;
		do {
		System.out.println(" Digite um nota : ");
		double nota = ler.nextDouble();
		 if ( nota >=0 && nota <=10) 
		{
			notaValida= true;
			System.out.println("voce digitou : "+nota);
		}
		  else 
		{ 
			  System.out.println(" nota inválida, digite novamente ");
		}	
			
		}while(!notaValida);

	ler.close();
	}
	

}
