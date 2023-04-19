package entities;

public class CurrencyConverter {
	public double dollarQuotation;
	public double amountBought;
	
	public final double iof = 0.06;
	
	public double ConvertToReales() {
		double amountFinal;
		amountFinal = dollarQuotation * amountBought;
		
		amountFinal = amountFinal + (amountFinal *= iof);
		return amountFinal;
	}

}
