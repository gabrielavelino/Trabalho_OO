package Republica;

import java.util.Iterator;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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

	public String txt_despesas(String subcat){
		try {
			
			FileWriter fw = new FileWriter("C:\\Users\\Dell\\Desktop\\EclipseJava\\git\\Trabalho_OO\\Projeto_OO\\Despesas\\Despesas_"+ this.mes + "_" + this.ano +".txt",true);
			PrintWriter pw = new PrintWriter(fw);
			
	
			
			pw.println("<Categoria: " + this.categoriaDespesas + "> ; " + "<Subcategoria: " + subcat + "> ; " + "<Valor: R$" + this.totalDespesa + ">");
			pw.flush();
			pw.close();
			fw.close();
			
		} catch (IOException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
		return "cadastrado com sucesso";
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
