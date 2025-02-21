package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
		(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
		ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam
		para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para
		resolver este problema.
		*/
		
		Student student = new Student();
		
		student.name = sc.nextLine();
		student.nota1 = sc.nextDouble();
		student.nota2= sc.nextDouble();
		student.nota3= sc.nextDouble();
		
		System.out.println(student.name);
		System.out.printf("%.2f%n", student.nota1);
		System.out.printf("%.2f%n", student.nota2);
		System.out.printf("%.2f%n", student.nota3);
	
		System.out.println();
		
		System.out.printf("Final Grade: %.2f%n" , student.finalGrade());
		
		if (student.finalGrade()>60) {
			System.out.println("PASS");
		}else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS" , 60-student.finalGrade());
		}
		
		sc.close();

	}

}
