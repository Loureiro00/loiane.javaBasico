package com.loiane.cursojava.aulaExercicios19;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		/*Criar um vetor A com 8 elementos inteiros. Construir um vetor B de mesmo tipo
		 * e tamanho e com os elementos do vetor A multiplicados por 2, ou seja: B[i] =
		 * A[i] * 2.
		 * 
		 */
		Scanner ler = new Scanner(System.in);
		int VetorA [] = new int [8];
		int VetorB [] = new int [VetorA.length];
	
		for(int i =0; i<VetorA.length; i++) 
		{
			System.out.print(" Entre com o valor da posição "+i+" : ");
			VetorA[i]= ler.nextInt();
			VetorB[i]= VetorA[i]*2;
		}
		
		System.out.println(" Vetor A = ");
		for(int i =0; i<VetorA.length; i++) {
			System.out.println(" \t "+VetorA[i]+" " );
		}
	
		System.out.println(" ");
		
		System.out.println(" Vetor B = ");
		for(int i =0; i<VetorB.length; i++) {
			System.out.println(" \t "+VetorB[i]+" " );
		}
		
		
		System.out.print(" ");
		
		ler.close();	

	}

}
