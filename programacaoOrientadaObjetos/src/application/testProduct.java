package application;
import entities.Product;
import java.util.Scanner;

public class testProduct {

	public static void main(String[] args) {
		Product product = new Product();
		Scanner sc = new Scanner(System.in);
		
		product.name = sc.nextLine();
		product.price = sc.nextDouble();
		product.quantity = sc.nextInt();
		
		System.out.println(product);
		
		sc.close();
		
	}

}
