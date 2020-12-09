package Republica;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Despesas {
	
	int ano;
	int mes;
	String categoriaDespesas;
	double totalDespesa;
	
	
	
	public Despesas(int mes, int ano, String categoriaDespesas,double totalDespesa) {
		this.ano = ano;
		this.mes = mes;
		this.categoriaDespesas = categoriaDespesas;
		this.totalDespesa = totalDespesa;
		
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


}
