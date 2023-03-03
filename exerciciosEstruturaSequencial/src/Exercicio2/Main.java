package Exercicio2;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		double raio = sc.nextDouble();
		double pierre = 3.14159;
		
		double areaCirculo = Math.pow(raio, 2) * pierre;
		
		System.out.printf("Area do circulo e igual a: %.4f", areaCirculo);

		
		sc.close();
	}

}
