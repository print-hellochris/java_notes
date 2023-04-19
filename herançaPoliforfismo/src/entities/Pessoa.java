package entities;

public abstract class Pessoa {
	private String nome;
	protected Double rendaAnual;
	
	
	public Pessoa () {
		
	}
	
	public Pessoa(String nome, Double rendaAnual) {
		super();
		this.nome = nome;
		this.rendaAnual = rendaAnual;
	}

	


	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the rendaAnual
	 */
	public Double getRendaAnual() {
		return rendaAnual;
	}

	/**
	 * @param rendaAnual the rendaAnual to set
	 */
	public void setRendaAnual(Double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}

	public abstract Double tax();
	
	public  String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getNome());
		sb.append(": $");
		sb.append(String.format("%.2f",tax()));
		
		return sb.toString();
	}
	
	
	

}
