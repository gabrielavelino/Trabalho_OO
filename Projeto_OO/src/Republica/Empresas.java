package Republica;

public class Empresas {

	String 	subCategoria,
			nomeEmpresa;
		   
	double contaValor;
	
	public Empresas(String subCategoria, String nomeEmpresa, double contaValor) {
		
		this.subCategoria = subCategoria;
		this.nomeEmpresa = nomeEmpresa;
		this.contaValor = contaValor;
		
		
	}

	public String toString() {
		return "EMPRESA: " + nomeEmpresa + "\n" +
			   "CATEGORIA: " + subCategoria + "\n" +
				"VALOR: " + contaValor;
		
	}
	
	public String getSubCategoria() {
		return subCategoria;
	}


	public String getNomeEmpresa() {
		return nomeEmpresa;
	}



	public double getContaValor() {
		return contaValor;
	}

	
	
}
