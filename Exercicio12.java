package com.loiane.cursojava.aulaExercicios15;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		/*
		 * 12.Faça um programa para o cálculo de uma folha de pagamento, sabendo que os
		 * descontos são do Imposto de Renda, que depende do salário bruto (conforme
		 * tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do
		 * Salário Bruto, mas não é descontado (é a empresa que deposita). O Salário
		 * Líquido corresponde ao Salário Bruto menos os descontos. O programa deverá
		 * pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no
		 * mês. o Desconto do IR: o Salário Bruto até 900 (inclusive) - isento o Salário
		 * Bruto até 1500 (inclusive) - desconto de 5% o Salário Bruto até 2500
		 * (inclusive) - desconto de 10% o Salário Bruto acima de 2500 - desconto de 20%
		 * Imprima na tela as informações, dispostas conforme o exemplo abaixo. No
		 * exemplo o valor da hora é 5 e a quantidade de hora é 220.
		 */
	
		Scanner ler = new Scanner(System.in);
		System.out.println(" Entre com o valor/hora : ");
		double valorHora = ler.nextDouble();
		
		System.out.println(" Entre comas horas trabalhadas no mes :  ");
		double horasMes = ler.nextDouble();
		
		double salarioBruto = valorHora*horasMes;
		int percentualIR=0;
		
		
		if (salarioBruto <=900) 
		{ 
			percentualIR = 0;
		}
		else if (salarioBruto >900 && salarioBruto <=1500) 
		{ 
			percentualIR = 5;
		}
		else if (salarioBruto >1500 && salarioBruto <=2500) 
		{ 
			percentualIR = 10;
		}
		else if (salarioBruto >2500) 
		{ 
			percentualIR = 20;
		}
		 
		double ir =   (salarioBruto/100) * percentualIR;
		double inss = (salarioBruto/100) * 10;
		double fgts = (salarioBruto/100) * 11;
		double totalDeDescontos = inss+ir;
		double salarioLiquido = salarioBruto-totalDeDescontos;
		
		
		System.out.println( "Salario bruto : (" +valorHora+ " * " +horasMes +") : " + " R$: " +salarioBruto);
		System.out.println("(-) IR  ("+ percentualIR + " %) : " + "R$ :" +ir);
		System.out.println("(-)INSS (10%): "+ " R$ : " + inss);
		System.out.println(" FGTS   (11%): "+ " R$ : " + fgts);
		System.out.println(" Total de descontos :" +" R$ : " +totalDeDescontos );
		System.out.println("Salário Liquido : " +"R$: "+salarioLiquido);
		ler.close();
	
	
	
	
	
	
	
	
	}
	
	

}
