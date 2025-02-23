package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Exercicio {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por
		uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda
		que a pessoa terá que pagar 6% de IOF sobre o valor em dólar. Criar uma classe CurrencyConverter
		para ser responsável pelos cálculos.*/
		
		System.out.print("What is the dollar price? ");
		double dolar = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double quant = sc.nextDouble();
		double total = CurrencyConverter.dollarToReal(dolar,quant);
		System.out.printf("Amount to be paid in reais = %.2f%n", total);
		
		
		sc.close();
	}

}
