package aula13Exercicios;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// 5. Faça um Programa que converta metros para centímetros
		
		double cm,m;
		Scanner ler = new Scanner(System.in);
		System.out.println(" Digite o valor em Metros : ");
		m=ler.nextDouble();
		//1 metro = 100cm
		cm= m*100;
		
		System.out.println(" O valor em cm é de :  "+cm);
		
ler.close();
	}

}
