package com.loiane.cursojava.aulaExercicios19;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		/*    4. Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo
		 *    tamanho, sendo que cada elemento do vetor B deverá ser a raiz quadrada do
		 *    respectivo elemento de A, ou seja: B[i] = sqrt(A[i]).
		 */
		

		Scanner ler = new Scanner(System.in);
		int VetorA [] = new int [8];
		double  VetorB [] = new double [VetorA.length];
	
		for(int i =0; i<VetorA.length; i++) 
		{
			System.out.print(" Entre com o valor da posição "+i+" : ");
			VetorA[i]= ler.nextInt();
			VetorB[i]= Math.sqrt( VetorA[i]);
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
