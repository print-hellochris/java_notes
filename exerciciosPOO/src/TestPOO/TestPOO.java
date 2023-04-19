package TestPOO;
import java.util.Scanner;

import entities.Rectangle;
import entities.Employee;

public class TestPOO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//Rectangle rectangle = new Rectangle();
		Employee joaoSilva = new Employee();
		/*
		System.out.println("Enter Rectangle width and height: ");
		
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		System.out.printf("AREA %.2f%n", rectangle.Area());
		System.out.printf("PERIMETER %.2f%n", rectangle.Perimeter());
		System.out.printf("DIAGONAL %.2f%n", rectangle.Diagonal());
		*/
		System.out.println("Name: ");
		joaoSilva.name = sc.nextLine();
		
		System.out.println("Gross Salary: ");
		joaoSilva.grossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		joaoSilva.tax = sc.nextDouble();
		
		System.out.printf("Employee: %s, $ %.2f%n", joaoSilva.name,joaoSilva.NetSalary());
		
		System.out.println("Which percentage to increase salary?");
		double percentage;
		percentage = sc.nextDouble();
		joaoSilva.IncreaseSalary(percentage);
		
		System.out.printf("Updated data:  %s, $ %.2f%n", joaoSilva.name,joaoSilva.NetSalary());
		
		sc.close();

	}

}
