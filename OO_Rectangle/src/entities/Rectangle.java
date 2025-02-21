package entities;

public class Rectangle {
	public int a;
	public int l;
	
	public double area() {
		double area = a*l;
		return area;
	}
	public double perimetro() {
		double perimetro = 2*(a+l);
		return perimetro;
	}
	public double diagonal() {
		double diagonal = Math.sqrt(a*a+l*l);
		return diagonal;
	}
	
}
