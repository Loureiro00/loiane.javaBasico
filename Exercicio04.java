package aula13Exercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		//4. Faça um Programa que peça as 4 notas bimestrais e mostre a média.
		int n1,n2,n3,n4,media;
		Scanner ler = new Scanner(System.in);
		System.out.print(" Digite suas quatro notas : ");
		n1 = ler.nextInt(); n2 = ler.nextInt(); n3 = ler.nextInt(); n4 = ler.nextInt();
		media = (n1+n2+n3+n4)/4;
		System.out.println(" Sua media é de "+media);
		
		ler.close();
	}

}
