package com.loiane.cursojava.aulaExercicios15;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		// 7. Faça um Programa que leia três números e mostre o maior e o menor deles
		
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
		
		
	
		
		if ( a<b && a<c ) 
		{
			System.out.println(" o numero " +a+ " é o menor");
		}	
	
		if ( b<a && b<c ) 
		{
			System.out.println(" o numero " +b+ " é o menor");
		}	
		if ( c<b && c<a ) 
		{
			System.out.println(" o numero " +c+ " é o maior");
		}	
		
		ler.close();

	}

}
