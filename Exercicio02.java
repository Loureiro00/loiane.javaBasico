package aula13Exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//2. Faça um Programa que peça um número e então mostre a
		//mensagem O número informado foi [número].
		
		int numero;
		Scanner ler =  new Scanner (System.in);
		System.out.println(" Digite um numero :  ");
		numero = ler.nextInt();
		
		System.out.println(" O número informado foi :  " +numero);
	
		
		ler.close();
	}

}
