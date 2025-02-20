import java.util.Locale;
import java.util.Scanner;

public class Estrutura_Condicional {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		        // EXERCICIO- Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
		
				/*
					int X = sc.nextInt();
						
					if (X < 0 ) {
						System.out.println("NEGATIVO!");
					} else {
						System.out.println("POSITIVO!");
					}
				*/
					
				// EXERCICIO- Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.	
				
				/*	
					int X = sc.nextInt();
						
					if (X % 2 == 0 ) {
						System.out.println("PAR!");
					} else {
						System.out.println("IMPAR!");
					}
				*/
				
				// EXERCICIO- Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
				// Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
				// ordem crescente ou decrescente.
				
				/*
					int A = sc.nextInt();
					int B = sc.nextInt();
						
					if ((A % B == 0 || B % A == 0)) {
						System.out.println("São Multiplos!");
					} else {
						System.out.println("Não são Multiplos!");
					}
				*/
				
				/*
				EXERCICIO- Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
				seguir, calcule e mostre o valor da conta a pagar.
				
				
				Codigo   	Item				Preço
					1		cachorro-quente		R$ 4.00
					2		x-salada			R$ 4.50
					3		x-bacon				R$ 5.00
					4		torrada simples		R$ 2.00
					5		refrigerante		R$ 1.50
				*/
				
				/*
					int cod = sc.nextInt();
					int qtd = sc.nextInt();
					double preco;
					
					if (cod == 1) {
						preco = 4.00 * qtd;
						System.out.printf("Cachorro-quente - Valor: R$ %.2f%n", preco);
					}
					if (cod == 2) {
						preco = 4.50 * qtd;
						System.out.printf("X-salada - Valor: R$ %.2f%n", preco);
					}
					if (cod == 3) {
						preco = 5.00 * qtd;
						System.out.printf("X-bacon - Valor: R$ %.2f%n", preco);
					}
					if (cod == 4) {
						preco = 2.00 * qtd;
						System.out.printf("Torrada-simples - Valor: R$ %.2f%n", preco);
					}
					if (cod == 5) {
						preco = 1.50 * qtd;
						System.out.printf("Refrigerante - Valor: R$ %.2f%n", preco);
					}
					
				*/
					
				// EXERCICIO- Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
				// seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
				// nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.	
				
				/*
					double valor = sc.nextDouble();
					
					if (valor >= 0 && valor <= 25) {
						System.out.println("INTERVALO [0,25]");
					}
					if (valor > 25 && valor <= 50) {
						System.out.println("INTERVALO [25,50]");
					}
					if (valor > 50 && valor <= 75) {
						System.out.println("INTERVALO [50,75]");
					}
					if (valor > 75 && valor <= 100) {
						System.out.println("INTERVALO [75,100]");
					} 
					if (valor < 0 || valor > 100) {
						System.out.println("FORA DO INTERVALO!");
					}		
				*/
				
				/*
				EXERCICIO- Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
				mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
				
					de 0 a 2.000               isento
					de 2000.01 a 3.000             8%
					de 3000.01 a 4.500            18%
					acima de 4.500                28%
				*/
				
				/*
					double salario = sc.nextDouble();
					double imposto;
					
					if (salario <= 2000) {
						System.out.println("ISENTO");
					} else if (salario > 2000 && salario <= 3000) {
						imposto = salario * 0.08;
						System.out.printf("IMPOSTO = R$ %.2f%n", imposto);
					}else if (salario > 3000 && salario <= 4500) {
						imposto = salario * 0.18;
						System.out.printf("IMPOSTO = R$ %.2f%n", imposto);
					}else	{
						imposto = salario * 0.28;
						System.out.printf("IMPOSTO = R$ %.2f%n", imposto);
					}
					
				*/
					
				// EXERCICIO- Uma operador de telefonia cobra R$ 50,00 por um plano básico que dá direito a 100 minutos de telefone. 
				// Cada minuto que exceder a franquia de 100 minutos custa R$ 2,00. 
				// Fazer um programa para ler a quantidade de minutos que uma pessoa consumiu, daí mostrar o valor a ser pago.	
				
				/*
					double minutos = sc.nextDouble();
					double conta = 50;
					
					if (minutos > 100) {
						conta += (minutos - 100) * 2.0;				
					}
					System.out.printf("Valor a ser pago = R$ %.2f%n", conta);
				
				*/
		
				/* - MODELO DE SWITCH CASE - 
				 
					int x = sc.nextInt();	
					String dia;
					
					switch (x) {
					case 1:
						dia = "Domingo";
						break;
					case 2:
						dia = "Segunda-feira";
						break;
					case 3:
						dia = "Terça-feira";
						break;
					case 4:
						dia = "Quarta-feira";
						break;
					case 5:
						dia = "Sexta-feira";
						break;
					case 6:
						dia = "Sábado";
						break;	
					default:
						dia = "Inválido";
						break;
					}
					
					System.out.println(dia);		
			*/
			
			/*
			  - EXPRESSÃO CONDICIONAL TERNÁRIA -
			Sintaxe:
			( condição ) ? valor_se_verdadeiro : valor_se_falso
			
			  - EXEMPLO NORMAL - 	
					double preco = 34.5;
					double desconto;
					
					if (preco < 20.0) {
						desconto = preco * 0.1;
					}
					else {					
						desconto = preco * 0.05;
					}
			*/	
			//- EXEMPLO COM EXPRESSÃO CONDICIONAL TERNÁRIA - 	
			
					double preco = 34.5;
					double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
					
					System.out.println(desconto);
		    
		
		sc.close();

	}

}
