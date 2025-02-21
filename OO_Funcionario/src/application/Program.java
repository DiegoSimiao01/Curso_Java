package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*
		Fazer um programa para ler e mostrar os dados de um funcionário (nome, salário bruto e imposto).  
		Em seguida, aumentar o salário do funcionário com base em uma porcentagem dada 
		(somente o salário bruto é afetado pela porcentagem) 
		e mostrar novamente os dados do funcionário. Use a classe projetada abaixo.
		*/
		
		Employee emp = new Employee();
		
		System.out.print("Name: ");
		emp.name = sc.nextLine();
		
		System.out.print("Groos Salary: ");
		emp.grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		emp.tax = sc.nextDouble();
		
		System.out.println("Employee: " + emp);
		System.out.println();
		
		System.out.print("Which percentage to increase salary? ");
		int aumento = sc.nextInt();
		emp.increaseSalary(aumento);
		System.out.println();
		
		System.out.println("Updated data: "+ emp);
		
		sc.close();

	}

}
