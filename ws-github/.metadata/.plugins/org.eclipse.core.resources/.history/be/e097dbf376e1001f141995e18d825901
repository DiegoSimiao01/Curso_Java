package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*
		Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas válidas). 
		Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos possui a maior área.
		A fórmula para calcular a área de um triângulo a partir das medidas de seus lados a, b e c 
		é a seguinte (fórmula de Heron): area = Math.sqrt(p*(p-a)(p-b)(p-c)) onde p = (a+b+c)/2
		*/
		
		/* SEM ORIENTAÇÃO A OBJETO
		double xa, xb, xc, ya, yb, yc;
		
		System.out.println("Digite os valores do Triangulo X:");
		xa = sc.nextDouble();
		xb = sc.nextDouble();
		xc = sc.nextDouble();
		System.out.println("Digite os valores do Triangulo Y:");
		ya = sc.nextDouble();
		yb = sc.nextDouble();
		yc = sc.nextDouble();
		
		double p = (xa+xb+xc)/2;
		double areaX = Math.sqrt(p * (p-xa)*(p-xb)*(p-xc));
		
		p = (ya+yb+yc)/2;
		double areaY = Math.sqrt(p * (p-ya)*(p-yb)*(p-yc));
		
		System.out.printf("Area do triangulo X = %.4f%n", areaX);
		System.out.printf("Area do triangulo Y = %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Triangulo X tem a maior área");
		} else {
			System.out.println("Triangulo Y tem a maior área");
		}
		*/
		
		// COM ORIENTAÇÃO A OBJETO
		
		Triangle x,y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Digite os valores do Triangulo X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Digite os valores do Triangulo Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double p = (x.a+x.b+x.c)/2;
		double areaX = Math.sqrt(p * (p-x.a)*(p-x.b)*(p-x.c));
		
		p = (y.a+y.b+y.c)/2;
		double areaY = Math.sqrt(p * (p-y.a)*(p-y.b)*(p-y.c));
		
		System.out.printf("Area do triangulo X = %.4f%n", areaX);
		System.out.printf("Area do triangulo Y = %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Triangulo X tem a maior área");
		} else {
			System.out.println("Triangulo Y tem a maior área");
		}
		
		sc.close();

	}

}
