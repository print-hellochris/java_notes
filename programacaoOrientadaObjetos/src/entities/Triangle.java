package entities;

public class Triangle {
	public double a;
	public double b;
	public double c;
	
	public double p = (a+b+c) / 2.0;
	// \|/Aqui abaixo é um método.
	public double area()  {
		double p = (a+b+c) / 2.0;
		return Math.sqrt(p*(p-a)* (p-b) * (p-c));
	}
	
	
	

}
