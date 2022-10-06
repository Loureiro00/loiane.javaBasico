package com.loiane.cursojava.aulaExercicios15;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		//4- Faça um Programa que verifique se uma letra digitada é vogal ou consoante.
		
		Scanner ler = new Scanner(System.in);
		System.out.println(" Digite a letra : ");
		String letra = ler.next();
		
		if (letra.equalsIgnoreCase("a,e,i,o,u")) 
		{
			System.out.println(" A letra "+letra+ "é uma vogal.");
		} else 
		{
			System.out.println(" A letra " +letra + " é uma consuante");
		}
					ler.close();
		
	}

}
