package com.loiane.cursojava.aulaExercicios15;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		// 6. Faça um Programa que leia três números e mostre o maior deles.
		Scanner ler = new Scanner(System.in);
		System.out.println(" Digite 3 numeros : ");
		double a= ler.nextDouble(); double b= ler.nextDouble();double c= ler.nextDouble();
		
		if ( a>b && a>c ) 
		{
			System.out.println(" o numero " +a+ " é o maior");
		}	
	
		if ( b>a && b>c ) 
		{
			System.out.println(" o numero " +b+ " é o maior");
		}	
		if ( c>b && c>a ) 
		{
			System.out.println(" o numero " +c+ " é o maior");
		}	
		
		ler.close();
	}

}
