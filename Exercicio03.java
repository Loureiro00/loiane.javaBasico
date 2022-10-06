package aula13Exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// 3. Faça um Programa que peça dois números e imprima a soma
	

	
	Scanner ler = new Scanner(System.in);
	int n1,n2,soma;
	System.out.printf(" Digite os numeros que deseja somar :  ");
	n1 = ler.nextInt(); n2= ler.nextInt();
	soma= n1 + n2;
	
	System.out.println(" A soma dos dois numero é de : "+soma);
	
	ler.close();
	

	}

}
