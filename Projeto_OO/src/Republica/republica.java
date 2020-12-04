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

	/*boolean matricularAluno (Aluno matricular) {
		boolean resposta = alunos.add(matricular);
		return resposta;
	}*/
	
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
		int i = 1;
		while (it.hasNext()) {
			Pessoas a = it.next();
			retorno += "!!MORADOR!!" + "\nNOME: " + a.getNome() + "\nGENERO: " + a.getGenero() + "\nIDADE: " + a.getIdade() + "\nRENDA: R$" + a.getRendimento() + "\nE-MAIL: " + a.getEmail() + "\n\n";
		}
		
		return retorno;
	}

	public String toString2() {
		String retorno2 = ""; 
		
		
		Iterator<Despesas> it = listaDespesas.iterator();
		int i = 1;
		while (it.hasNext()) {
			Despesas b = it.next();
			retorno2 += "!!DESPESAS DA CASA!!\n" + "DATA: " + b.getMes() + '/' + b.getAno() + "\nCATEGORIA: " + b.getCategoriaDespesa() + "\nCUSTO TOTAL: R$" + b.getTotalDespesa() + "\n\n";
		}
		
		return retorno2;
	}
	
	
	

}
