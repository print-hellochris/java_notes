package Exercicio4;
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int number = sc.nextInt();
		int hoursWorked = sc.nextInt();
		double hourRate = sc.nextDouble();
		double salary = (double) hoursWorked * hourRate;
		
		
		System.out.printf("NUMBER = %d%n", number);
		System.out.printf("SALARY = U$ %.2f", salary);
		
		sc.close();

	}

}
