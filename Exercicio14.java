package com.loiane.cursojava.aulaExercicios15;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		/* Faça um programa que lê as duas notas parciais obtidas por um aluno
		 numa disciplina ao longo de um semestre, e calcule a sua média. A
		atribuição de conceitos obedece à tabela abaixo:
		o Média de Aproveitamento Conceito
		o Entre 9.0 e 10.0 A
		o Entre 7.5 e 9.0 B
		o Entre 6.0 e 7.5 C
		o Entre 4.0 e 6.0 D
		o Entre 4.0 e zero E
        */
		Scanner ler = new Scanner(System.in);
		System.out.println(" Insira sua primeira nota : ");
		double n1= ler.nextDouble(); 
		System.out.println(" Insira sua segunda nota : ");
		double n2= ler.nextDouble();
		double media= (n1+n2)/2;
		String conceito;
		
		
		 if ( media >9 && media <=10) 
		{
			conceito= "A";
			System.out.println("Parabens, com suas notas : " +n1+ " , "  +n2+" voce obteve a media : " +media+ ", "+" com o conceito : " +conceito+ " , " + " e foi APROVADO!! "  );
		} 
		 
		  else if ( media >7.5 && media <=9.0 ) 
		{
			conceito = "B";
			System.out.println( "Parabens, com suas notas : " +n1+ " , "  +n2+" voce obteve a media : " +media+ ", "+" com o conceito : " +conceito+ " , " + " e foi APROVADO!! " );
		} 
		
		  else if (media >6 && media <=7.5)
		{
			  
			 conceito = "C"; 
			System.out.println( "Parabens, com suas notas : " +n1+ " , "  +n2+" voce obteve a media : " +media+ ", "+" com o conceito : " +conceito+ " , " + " e foi APROVADO!! ");
		} 
		 
		  else if ( media >4 && media <=6 ) 
		{
			  conceito="D";
			  System.out.println("Parabens, com suas notas : " +n1+ " , "  +n2+" voce obteve a media : " +media+ ", "+" com o conceito : " +conceito+ " , " + " e foi REPROVADO!! " );
		} 
	    	else if ( media >0 && media<=4 ) 
		{
	    		conceito="E";
	    		System.out.println( "Parabens, com suas notas : " +n1+ " , "  +n2+" voce obteve a media : " +media+ ", "+" com o conceito : " +conceito+ " , " + " e foi REPROVADO!! ");
		} 
		
		
	
	ler.close();
	
	
	
	}

}
