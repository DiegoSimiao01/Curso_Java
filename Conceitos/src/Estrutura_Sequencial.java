import java.util.Locale;
import java.util.Scanner;

public class Estrutura_Sequencial {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
				// EXERCICIO- Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
				// mensagem explicativa, conforme exemplos.
				
				/*
					 int x = sc.nextInt();
					 int y = sc.nextInt();
					 double soma = x + y;
					
					 System.out.println("Soma = " + soma);
				*/
		
				// EXERCICIO- Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
				// casas decimais conforme exemplos.
				// Fórmula da área: area = π . raio 2
				// Considere o valor de π = 3.14159
				
				/*	
					double pi = 314159;
					double raio = sc.nextDouble();
					double area = pi * (raio*raio);
					
					System.out.printf("Area = %.4f%n", area);
				*/
				
				// EXERCICIO- Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
				// de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
				
				/*
					int A = sc.nextInt();
					int B = sc.nextInt();
					int C = sc.nextInt();
					int D = sc.nextInt();
					int diferenca = ((A*B) - (C*D));
					
					System.out.println("diferença = " + diferenca);
				*/
				
				// EXERCICIO- Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
			 	// hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
			 	// decimais.
				
				/*
					double number = sc.nextDouble();
					double horasTrabalhadas = sc.nextDouble();
					double valorHoras = sc.nextDouble();
					double salario = valorHoras * horasTrabalhadas;
					
					System.out.printf("NUMBER = %.2f%n" , number);
					System.out.printf("SALARIO = R$%.2f%n" , salario);
				*/
				
				// EXERCICIO- Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o		 
				// código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
				
				/*
					double codItem1 = sc.nextDouble();
					double qtdItem1 = sc.nextDouble();
					double valor1 = sc.nextDouble();
					double total1 = qtdItem1 * valor1;
					
					double codItem2 = sc.nextDouble();
					double qtdItem2 = sc.nextDouble();
					double valor2 = sc.nextDouble();
					double total2 = qtdItem2 * valor2;
					
					double valorTotal = total1 + total2;
					
					System.out.printf("Valor Total = R$ %.2f%n", valorTotal);
				*/
					
				/*
				   EXERCICIO- Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
				   mostre:
				   a) a área do triângulo retângulo que tem A por base e C por altura.
				   b) a área do círculo de raio C. (pi = 3.14159)
		 	 	   c) a área do trapézio que tem A e B por bases e C por altura.
			 	   d) a área do quadrado que tem lado B.
				   e) a área do retângulo que tem lados A e B.
				*/
				
			    
					double A = sc.nextDouble();
					double B = sc.nextDouble();
					double C = sc.nextDouble();
					double pi = 3.14159;
						
					double trianguloRetangulo = (A*C) / 2;
					double circuloRaio = pi * (C*C);
					double quadrado = B * B;
					double trapezio = (A+B) * C/2;
					double retangulo = A * B;
					
					System.out.printf("TRIANGULO = %.3f%n", trianguloRetangulo);
					System.out.printf("CIRCULO = %.3f%n", circuloRaio);
					System.out.printf("QUADRADO = %.3f%n", quadrado);
					System.out.printf("TRAPEZIO = %.3f%n", trapezio);
					System.out.printf("RETANGULO = %.3f%n", retangulo);
				
					
		
		sc.close();
				
		
	}

}
