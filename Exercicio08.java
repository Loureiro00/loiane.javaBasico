package com.loiane.cursojava.aulaExercicios15;

import java.util.Scanner;

;

public class Exercicio08 {

	public static void main(String[] args) {
		// 8. Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, sabendo que a decisão é sempre
		//pelo mais barato
		Scanner ler=new Scanner(System.in);
		
		System.out.println(" Digite os preços dos produtos escolhidos  :  " );
		double preço1=ler.nextDouble(); double preço2=ler.nextDouble(); double preço3=ler.nextDouble();
		
		   if (preço1<preço2 && preço1<preço3) 
		{
			System.out.println(" Compre o produto 1, pois tem o menor preço que é de R$: "+preço1);
			
		}
		   else  if (preço2<preço1 && preço2<preço3) 
		{
			System.out.println(" Compre o produto 2, pois tem o menor preço que é de R$: "+preço2);
			
		} 
		   else if (preço3<preço2 && preço3<preço1) 
		{
			System.out.println(" Compre o produto 1, pois tem o menor preço que é de R$: "+preço3);
			
		}
		   ler.close();

		

	}

}
