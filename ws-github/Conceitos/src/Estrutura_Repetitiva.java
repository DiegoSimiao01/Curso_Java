import java.util.Locale;
import java.util.Scanner;

public class Estrutura_Repetitiva {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
			/*
				int x = sc.nextInt();
				int soma = 0;
				
				while (x != 0 ) {
					soma += x;
					x = sc.nextInt();
				}
				
				System.out.println(soma);
			*/
			
			//Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
			//incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
			//impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002
			
			/*
				System.out.println("Digite sua senha:");
				
				int x = sc.nextInt();
				
				while (x != 2002) {
					System.out.println("Senha Invalida");
					System.out.println("Tente novamente:");
					x = sc.nextInt();
				}
				System.out.println("Acesso Permitido");
			*/
			
			//Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema cartesiano. 
			//cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
			//menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
			
			/*
				int x = sc.nextInt();
				int y = sc.nextInt();
				
				while (x != 0 && y != 0) {
					if (x > 0 && y > 0) {
						System.out.println("primeiro");
					}
					else if (x < 0 && y > 0) {
						System.out.println("segundo");
					}
					else if (x < 0 && y < 0) {
						System.out.println("terceiro");
					}
					else {
						System.out.println("quarto");
					}
					
				x = sc.nextInt();
				y = sc.nextInt();
				
				}
			*/
			
			//Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. 
			//Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 
			//1.Álcool 2.Gasolina 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) 
			//deve ser solicitado um novo código (até que seja válido). O programa será encerrado quando o código informado for o número 4. 
			//Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme exemplo.
			
			/*
				int alcool = 0;
				int gasolina = 0;
				int diesel = 0;
				
				int cod = sc.nextInt();
				
				while (cod != 4) {
					if (cod == 1) {
						alcool++;
					}
					else if (cod == 2) {
						gasolina++;
					}
					else if (cod == 3) {
						diesel++;
					}
					
					cod = sc.nextInt();
				}
		
				System.out.println("MUITO OBRIGADO");
				System.out.println("Alcool: " + alcool);
				System.out.println("Gasolina: " + gasolina);
				System.out.println("Diesel: " + diesel);
			 */
		
		    //  - ESTRUTURA FOR (PARA) -
		
			/* 
			   for (início ; condição ; incremento) { 
			   		comando 1 
			   		comando 2
			   }
			*/

			// CONTAGEM REGRESSIVA - 
			
			/*
			   for (int i=10; i>-1; i--) { 
			  		System.out.println("i = " + i); 
			   }
			*/
			
			//  CONTAGEM PROGRESSIVA - 
			
			/*
			   for (int i=0; i<11; i++) { 
			  		System.out.println("i = " + i); 
			   }
			*/
			
			//  FAÇA UMA TABUADA

			/*
			   int x = sc.nextInt();
			  
			   for (int i=1; i<=10 && x<=10; i++ ) { 
			  		int valor = i * x;
			  		System.out.println(i + " x " + x + " = " + valor); 
			   }
			*/
			
			// Leia um valor inteiro X (1 <= X <= 1000). 
		    // Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X, se for o caso.
			
			/*
				//IMPAR
				int x = sc.nextInt();
		
				for (int i = 1; i <= x; i++) {
					if (i % 2 != 0) {
						System.out.println(i);
					}
				}
				
				//PAR
				int x = sc.nextInt();
		
				for (int i = 1; i <= x; i++) {
					if (i % 2 != 1) {
						System.out.println(i);
					}
				}
			*/
			
			/* Fazer um programa para ler um número inteiro positivo x. O programa deve então mostrar na tela x linhas,
			   começando de 1 até x. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme exemplo. */
			
			/*
				int x = sc.nextInt();
				
				for (int i=1; i<x; i++) {
						int valor = i;
						int quadrado = i*i;
						int cubo = i*i*i;
						
						System.out.printf("Valor:%d Quadrado:%d Cubo:%d%n", valor , quadrado , cubo);				
				}
			*/
			
			/*
			  Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente em
		   	  Fahrenheit. Perguntar se o usuário deseja repetir (s/n). Caso o usuário digite "s", repetir o programa.
			
			  Fórmula:F = 9C/5 + 32 */ 
			
			/*
				char resposta;
				
				do {
					System.out.print("Digite a temperatura em celsius: ");
					
					double c = sc.nextDouble();
					double f = 9.0*c / 5.0 + 32.0;
					
					System.out.printf("Equivalente em Fahrenheit: %.2f%n ", f);
					System.out.print("Deseja repetir: (s/n)?");
					resposta = sc.next().charAt(0);
					
				} while (resposta != 'n');
			*/
		
		sc.close();
	}

}
