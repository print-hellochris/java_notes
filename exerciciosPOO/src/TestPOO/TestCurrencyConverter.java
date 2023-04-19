package TestPOO;
import java.util.Scanner;
import java.util.Locale;
import entities.CurrencyConverter;
public class TestCurrencyConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		CurrencyConverter cc = new CurrencyConverter();
		System.out.println("What is the dollar price?");
		cc.dollarQuotation = sc.nextDouble();
		System.out.println("How Many dollars will be bought?");
		cc.amountBought = sc.nextDouble();
		System.out.printf("Amount to be paid in Brazilian reales: %.2f", cc.ConvertToReales());
		
		
		sc.close();

	}

}
