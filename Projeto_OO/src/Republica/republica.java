package Republica;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class republica {
	
	String nomeRepublica;
	List<Pessoas> listaPessoas ;
	List<Despesas> listaDespesas;
	
	public republica(String nomeRepublica){
		this.nomeRepublica = nomeRepublica;
	
		listaPessoas = new LinkedList<Pessoas>();
		listaDespesas = new LinkedList<Despesas>();
				
	}
	
	public String getNomeRepublica() {
		return nomeRepublica;
	}


	boolean cadastrarPessoas(Pessoas cadastrar) {
	   boolean resposta = listaPessoas.add(cadastrar);
	   return resposta;
		
	}
	
	boolean cadastrarDespesas(Despesas cadastrar) {
		boolean resposta2 = listaDespesas.add(cadastrar);
		return resposta2;
		
	}

	
	public String toString() {
		String retorno = ""; 
		retorno += "REPUBLICA: " + this.nomeRepublica + "\n\n"; 
		
		Iterator<Pessoas> it = listaPessoas.iterator();
		while (it.hasNext()) {
			Pessoas a = it.next();
			retorno += "!!MORADOR!!" + "\nNOME: " + a.getNome() + "\nGENERO: " + a.getGenero() + "\nIDADE: " + a.getIdade() + "\nRENDA: R$" + a.getRendimento() + "\nE-MAIL: " + a.getEmail() + "\n\n";
		}
		
		return retorno;
	}

	public String toString2() {
		String retorno2 = ""; 
		
		
		Iterator<Despesas> it = listaDespesas.iterator();
		while (it.hasNext()) {
			Despesas b = it.next();
			retorno2 += "!!DESPESAS DA CASA!!\n" + "DATA: " + b.getMes() + '/' + b.getAno() + "\nCATEGORIA: " + b.getCategoriaDespesa() + "\nCUSTO TOTAL: R$" + b.getTotalDespesa() + "\n\n";
		}
		
		return retorno2;
	}
	
	public String toGet4(String teste) {
		String retorno3 = ""; 
		
		
		Iterator<Despesas> it = listaDespesas.iterator();
		while (it.hasNext()) {
			Despesas b = it.next();
			if(b.getCategoriaDespesa().equalsIgnoreCase(teste))
			retorno3 = b.getCategoriaDespesa();
			
		}
		
		return retorno3;
	}
	
	
	boolean retirarPessoa(String email) {
		
		boolean resposta = false;
		
		//iterator = referencia para "varrer" a lista 
		Iterator<Pessoas> it = listaPessoas.iterator();
		//Enquanto tiver uma proxima pessoa a ser "varrida"
		while (it.hasNext()) {
			//pega o proxumo elemento
			Pessoas temp = it.next();
			//verifica se é o elemento desejado
			if (temp.getEmail().equalsIgnoreCase(email))
				//se for, removo o elemento da lista.
				resposta = listaPessoas.remove(temp);
		}
		
		return resposta;
	}
	
	boolean retirarDespesa(String categoriaDespesas, int mes, int ano) {
		
		boolean resposta = false;
		
		//iterator = referencia para "varrer" a lista 
		Iterator<Despesas> it = listaDespesas.iterator();
		//Enquanto tiver uma proxima pessoa a ser "varrida"
		while (it.hasNext()) {
			//pega o proxumo elemento
			Despesas temp = it.next();
			//verifica se é o elemento desejado
			if (temp.getCategoriaDespesa().equalsIgnoreCase(categoriaDespesas) && temp.getMes() == mes && temp.getAno() == ano)
				//se for, removo o elemento da lista.
				resposta = listaDespesas.remove(temp);
		}
		
		return resposta;
	}
	
	
	

}
