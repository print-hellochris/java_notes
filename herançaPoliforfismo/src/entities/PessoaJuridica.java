

package entities;

public class PessoaJuridica extends Pessoa {
	private Integer numeroFuncionarios;
	
	

	public PessoaJuridica(Integer numeroFuncionarios) {
		super();
		this.numeroFuncionarios = numeroFuncionarios;
	}


	public PessoaJuridica(String nome, Double rendaAnual, Integer numeroFuncionarios) {
		super(nome, rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}


	/**
	 * @return the numeroFuncionarios
	 */
	public Integer getNumeroFuncionarios() {
		return numeroFuncionarios;
	}


	/**
	 * @param numeroFuncionarios the numeroFuncionarios to set
	 */
	public void setNumeroFuncionarios(Integer numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}
	
	@Override
	public Double tax() {
		Double taxTotal;
		Double taxRate;
		if (numeroFuncionarios > 10) {
			taxRate = 0.14;
		}
		else {
			taxRate = 0.16;
		}
		
		taxTotal = rendaAnual * taxRate;
		
		return taxTotal;
	}

}
