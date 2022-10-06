package com.loiane.cursojava.aulaExercicios17;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		/*Faça um programa que leia um nome de usuário e a sua senha e não
		aceite a senha igual ao nome do usuário, mostrando uma mensagem
		de erro e voltando a pedir as informações
        */
		Scanner ler = new Scanner(System.in);
		boolean infValidas=false;
		
		do {
		System.out.println(" digite seu usuario : ");
		String usuario = ler.next();
		System.out.println(" digite sua senha   : ");
		String senha = ler.next();
			
		  if (usuario.equalsIgnoreCase(senha)) 
		{
			//infValidas = false;
			System.out.println(" escolha outra senha diferente do nome de usuário : ");
		}	 
		  else 
		{
			 infValidas = true; 
			System.out.println(" Senha e usuario válidos");
		}
		  
		} while (!infValidas);
	
	ler.close();
	}

}
