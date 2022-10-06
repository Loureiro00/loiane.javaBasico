package com.loiane.cursojava.aulaExercicios17;



public class Exercicios04 {

	public static void main(String[] args) {
		/*
		 * Supondo que a população de um país A seja da ordem de 80000
           habitantes com uma taxa anual de crescimento de 3% e que a
           população de B seja 200000 habitantes com uma taxa de crescimento
           de 1.5%. Faça um programa que calcule e escreva o número de anos
           necessários para que a população do país A ultrapasse ou iguale a
           população do país B, mantidas as taxas de crescimento.
		 */
		
		 int populaçãoA = 80000;
		  int populaçãoB = 200000;
		 int cont=0;
		 	
		
		while (populaçãoA < populaçãoB )
		{
			populaçãoA += (populaçãoA/100)*3;
			populaçãoB += (populaçãoB/100)*1.5;
			
			cont++;
			 
		 }
		System.out.println(" População A : "+populaçãoA);
		System.out.println(" População B : "+populaçãoB);
		System.out.println(" COntidade de anos : "+cont+" Anos");

	}

}
