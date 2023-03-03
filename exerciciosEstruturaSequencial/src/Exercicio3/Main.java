package Exercicio3;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int diferenca;
		
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
	
		diferenca = (A*B- C*D);
		System.out.printf("DIFERENCA = %d", diferenca);
		
		sc.close();

	}

}
