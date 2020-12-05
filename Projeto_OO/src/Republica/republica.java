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
	/*public String toGet4() {
		String retorno3 = ""; 
		
		
		Iterator<Despesas> it = listaDespesas.iterator();
		while (it.hasNext()) {
			Despesas b = it.next();
			retorno3 += b.getCategoriaDespesa();
		}
		
		return retorno3;
	}*/
	
	
	
	

}
