package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Circulo;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		/*
		   EXERCICIO- Fazer um programa que calcule e mostre:
		   - a área do círculo de raio C. 
		   - (pi = 3.14159) 
		   - pi * (C*C);
		*/
		
			Circulo x,y,z,w;
			x = new Circulo();
			y = new Circulo();
			z = new Circulo();
			w = new Circulo();
			
			System.out.println("Digite o valor do raio dos Circulos");
			
			x.c = sc.nextDouble();
			y.c = sc.nextDouble();
			z.c = sc.nextDouble();
			w.c = sc.nextDouble();
			double areaX = x.area();
			double areaY = y.area();
			double areaZ = z.area();
			double areaW = w.area();
			
			System.out.printf("Area do Circulo 1: %.4f%n" , areaX);
			System.out.printf("Area do Circulo 2: %.4f%n" , areaY);
			System.out.printf("Area do Circulo 3: %.4f%n" , areaZ);
			System.out.printf("Area do Circulo 4: %.4f%n" , areaW);
		
		sc.close();
	}

}
