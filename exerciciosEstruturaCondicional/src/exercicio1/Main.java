package exercicio1;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos minutos o cliente ficou no telefone?");
		int minutoTotal = sc.nextInt();
		double valorTotal = 50.00;
		if (minutoTotal <= 100) {
			System.out.printf("Valor a pagar: R$ %.2f",valorTotal);
			}
		else if (minutoTotal > 100) {
			//int diferenca = minutoTotal - 100;			
			valorTotal += ((minutoTotal - 100)*2.00);
			System.out.printf("Valor a pagar: R$ %.2f", valorTotal);
		}
		sc.close();
	}

}
