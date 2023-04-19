package application;
import java.util.Scanner;
import entities.Triangle;
public class Program {

	public static void main(String[] args) {
		
		
		Triangle x,y;
		x = new Triangle();
		y = new Triangle();
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the measures of the triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measures of the triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
			
		System.out.printf("Triangle X area: %.4f%n", x.area());
		System.out.printf("Triangle X area: %.4f%n", y.area());
		
		
		if (x.area() > y.area()) {
			System.out.println("A maior área é a do triângulo X");
			
		}
		
		else {
			System.out.println("A maior area e a do triangulo Y");
		}
		sc.close();


	}
	

}
