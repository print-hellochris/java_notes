package exercicioSwitchCase;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String dia;
		int x = sc.nextInt();
		
		switch(x) {
			case 1:
				dia = "domingo";
				break;
			case 2:
				dia = "segunda";
				break;
			case 3:
				dia = "terca";
				break;
			case 4:
				dia = "quarta-feira";
				break;
			case 5:
				dia = "quinta-feira";
				break;
			case 6:
				dia ="sexta-feira";
				break;
			case 7:
				dia = "sabado";
				break;
			default:
				dia = "valor invalido";
				break;
	}
		System.out.println("Dia da semana: "+dia);
		sc.close();
	}
}
