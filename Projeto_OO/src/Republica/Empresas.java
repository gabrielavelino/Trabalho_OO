package Republica;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Empresas {

	String 	subCategoria,
			nomeEmpresa;
		   
	double contaValor;
	
	public Empresas(String subCategoria, String nomeEmpresa, double contaValor) {
		
		this.subCategoria = subCategoria;
		this.nomeEmpresa = nomeEmpresa;
		this.contaValor = contaValor;
		
		
	}
	
	public String txt_empresas(String repNome, int mes, int ano){
		try {
			//File arquivo = new File(Path);
		
			FileWriter fw = new FileWriter("Republica\\" + repNome+"\\" + "Empresas_" + mes + "_" + ano + ".txt",true);
			PrintWriter pw = new PrintWriter(fw);
			
			pw.println("<" + this.subCategoria + ">;<" + this.nomeEmpresa + ">;<" + this.contaValor + ">;<" + mes + "/" + ano + ">");
			pw.flush();
			pw.close();
			fw.close();
			
		} catch (IOException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
		return "cadastrado com sucesso";
	}
	

	public String lista_empresas() {
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
