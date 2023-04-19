package entities;

public class PessoaFisica extends Pessoa {
	
	private Double gastosSaude;
	
	
	public PessoaFisica() {
		super();
	}
	
	public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}
	/**
	 * @return the gastosSaude
	 */
	public Double getGastosSaude() {
		return gastosSaude;
	}


	/**
	 * @param gastosSaude the gastosSaude to set
	 */
	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}
	
	


	@Override
	public Double tax() {
		Double taxAmount;
		Double totalTax;
		if (rendaAnual < 20000.0) {
			taxAmount = 0.15;			
		}
		else {
			taxAmount = 0.25; 
		}
		totalTax = rendaAnual * taxAmount;
		
		if (gastosSaude > 0.0) {
			totalTax -= (gastosSaude/2);
		}
				
		return totalTax;
	}
}
