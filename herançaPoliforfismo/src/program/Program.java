package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {
	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		int taxPayers;
		System.out.println("Enter the number of tax payers: ");
		taxPayers = sc.nextInt();
		List <Pessoa> contributors = new ArrayList<Pessoa>();
		
		for (int i = 0; i < taxPayers; i++) {
			char answer;
			System.out.printf("Tax payer #%d data:%n", (i+1));
			sc.nextLine();
			System.out.println("Individual or Company? (i/c)");
			answer = sc.next().charAt(0);
			sc.nextLine();
			System.out.println("Name: ");			
			String name = sc.nextLine();
			System.out.println("Anual Income: ");
			Double rendaAnual = sc.nextDouble();
			if (answer == 'i') {
				System.out.println("Health expenses: ");
				Double gastosSaude = sc.nextDouble();
				Pessoa individuo = new PessoaFisica (name, rendaAnual, gastosSaude);
				contributors.add(individuo);
			}
			else if (answer == 'c') {
				System.out.println("Number of employees: ");
				int numeroFuncionarios = sc.nextInt();
				Pessoa empresa = new PessoaJuridica (name, rendaAnual, numeroFuncionarios);
				contributors.add(empresa);
			}
			
		}
		
		System.out.println("TAXES PAID: ");
		double totalSum = 0;
		for (Pessoa contribuinte : contributors) {
			System.out.println(contribuinte.toString());
			totalSum += contribuinte.tax();
		}
		
		System.out.printf("TOTAL TAXES: $%.2f", totalSum);
		
		
		
		sc.close();
		

}
}
