package entities;

public class Product {
	
	private String name;
	private  double price;
	private int quantity;
	
	
	
	public Product() {
		//super(); ---> Tem a mesma função do super() em Python.
	}

	public Product (String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	public double TotalValueInStock() {
		return quantity*price;
	}
	public void AddProducts(int quantity) {
		this.quantity +=quantity;
	}
	public void RemoveProducts (int quantity) {
		this.quantity -=quantity;
	}

	public String toString() {
		
		return name 
				+ ", $ "
				+ String.format("%.2f",price)
				+ ", "
				+ quantity
				+ " units, Total: $ "
				+ String.format("%.2f", TotalValueInStock());
					
	}
}
