package Scanner_dataInput;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//char x;
		String x;
		int y;
		double z;
		
		x = sc.next();
		//x = sc.next().charAt(0);
		y = sc.nextInt();
		z = sc.nextDouble();
		
		
		//System.out.println(x);
		System.out.println("Seu nome e: " + x);
		System.out.println("Sua idade:  "+y);
		System.out.println("Sua altura:  "+z);
		
		sc.close();

	}

}
