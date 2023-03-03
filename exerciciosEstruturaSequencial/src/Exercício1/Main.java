package Exercício1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int numberOne; 
		int numberTwo;
		int totalSum;
		
		numberOne = sc.nextInt();
		numberTwo = sc.nextInt();
		totalSum = numberOne + numberTwo;
		
		System.out.printf("SOMA = %d", totalSum);
		
		sc.close();
	}

}
