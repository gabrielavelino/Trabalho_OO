package Republica;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Despesas {
	
	int ano;
	int mes;
	String categoriaDespesas;
	double totalDespesa;
	List<Empresas> listaEmpresas;
	
	
	
	public Despesas(int mes, int ano, String categoriaDespesas, double totalDespesa) {
		this.ano = ano;
		this.mes = mes;
		this.categoriaDespesas = categoriaDespesas;
		this.totalDespesa = totalDespesa;

		listaEmpresas = new LinkedList<Empresas>();
		
	}
	
	boolean cadastrarEmpresas(Empresas cadastrar) {
		   boolean resposta3 = listaEmpresas.add(cadastrar);
		   return resposta3;
			
		}
	
	public String toStringEmpresa() {
		String retorno = ""; 
		retorno += "TIPO DE DESPESA: " + this.categoriaDespesas + "\n\n"; 
		
		Iterator<Empresas> it = listaEmpresas.iterator();
		while (it.hasNext()) {
			Empresas e = it.next();
			retorno += "SUBCATEGORIA: " + e.getSubCategoria() + "\nEMPRESA: " + e.getNomeEmpresa() + "\nTOTAL: " + e.getContaValor() + "\n\n";
		}
		
		return retorno;
	}


	public int getAno() {
		return ano;
	}



	public int getMes() {
		return mes;
	}

	public String getCategoriaDespesa() {
		return categoriaDespesas;
	}

	public double getTotalDespesa() {
		return totalDespesa;
	}

/*
	void cadastrarEmpresa(String a, String b, double c) {
		
		listaEmpresas = new Empresas[200];
		
		//Empresas qualquer = new Empresas(a,b,c);
		//listaEmpresas[i] = qualquer;
	
	}
	
	
	void despesas() {		
	}*/
	
	


}
