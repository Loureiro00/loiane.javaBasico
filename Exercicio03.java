package com.loiane.cursojava.aulaExercicios17;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		/*
		 * . Faça um programa que leia e valide as seguintes informações: 
		 * a. Nome: maior que 3 caracteres;
		 * b. Idade: entre 0 e 150; d.
		 *  c. Salário: maior que zero;
		 *  Sexo: 'f' ou 'm';
		 *   e. Estado Civil: 's', 'c', 'v', 'd';
		 */
		Scanner ler = new Scanner(System.in);
		boolean infValidas = false;
		String nome,sexo,estadocivil;
		int idade;
		double salario;
		
		do 
		{
			System.out.println(" Entre com o nome : " );
			nome= ler.next();
			
			if (nome.length() >=3)
			{
				infValidas=true;
			} else {
				System.out.println(" Informação inválida, favor tentar novamente");
			}
		 }   while(!infValidas) ;
		
		
		infValidas=false;
		do 
		{
			System.out.println(" Digite sua idade : " );
			idade = ler.nextInt();
			
			if (idade >=0 && idade <=150)
			{
				infValidas=true;
			} 
			else {
				System.out.println(" Informação inválida, favor tentar novamente");
			}
		 }   while(!infValidas) ;
		
		infValidas=false;
		do 
		{
			System.out.println(" Digite seu salário : " );
			salario = ler.nextDouble();
			
			if (salario > 0 )
			{
				infValidas=true;
			} 
			else {
				System.out.println(" Informação inválida, favor tentar novamente");
			}
		 }   while(!infValidas) ;
		
		
		infValidas=false;
		do 
		{
			System.out.println(" Digite seu sexo : " );
			sexo = ler.next();
			
			if (sexo.equalsIgnoreCase("f")| sexo.equalsIgnoreCase("m") )
			{
				infValidas=true;
			} 
			else {
				System.out.println(" Informação inválida, favor tentar novamente");
			}
		 }   while(!infValidas) ;
		
		
		infValidas=false;
		do 
		{
			System.out.println(" Digite seu estado civil : " );
			estadocivil = ler.next();
			
			if (estadocivil.equalsIgnoreCase("s")|| estadocivil.equalsIgnoreCase("c") ||estadocivil.equalsIgnoreCase("v") 
			|| estadocivil.equalsIgnoreCase("d"))
			{
				infValidas=true;
			} 
			else {
				System.out.println(" Informação inválida, favor tentar novamente");
			}
		 }   while(!infValidas) ;
	
		System.out.println(" As seguintes informações foram coletadas !! : !");
		System.out.println("\n");
		System.out.println(" Nome : " +nome);
		System.out.println(" idade : " +idade);
		System.out.println(" Sexo : " +sexo);
		System.out.println(" Salário : " +salario);
		System.out.println(" estadocivil : " +estadocivil);
		ler.close();
	}

}
