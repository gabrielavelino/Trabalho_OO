package Republica;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class republica {
	
	String nomeRepublica;
	List<Pessoas> listaPessoas ;
	List<Despesas> listaDespesas;
	List<Empresas> listaEmpresas;
	
	public republica(String nomeRepublica){
		this.nomeRepublica = nomeRepublica;
	
		listaPessoas = new LinkedList<Pessoas>();
		listaDespesas = new LinkedList<Despesas>();
		listaEmpresas = new LinkedList<Empresas>();
				
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
	boolean cadastrarEmpresas(Empresas cadastrar) {
		   boolean resposta3 = listaEmpresas.add(cadastrar);
		   return resposta3;
			
		}

	
	public String toString() {
		String retorno = ""; 
		retorno += "REPUBLICA: " + this.nomeRepublica + "\n\n"; 
		
		Iterator<Pessoas> it = listaPessoas.iterator();
		while (it.hasNext()) {
			Pessoas a = it.next();
			retorno += "!!MORADOR!!" + "\nNOME: " + a.getNome()+ "\nE-MAIL: " + a.getEmail() + "\nGENERO: " + a.getGenero() + "\nIDADE: " + a.getIdade() + "\nRENDA: R$" + a.getRendimento() + "\n\n";
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
	
	public void toStringEmpresa() {
		System.out.println("chegou aq ");
		
		Iterator<Empresas> it = listaEmpresas.iterator();
		System.out.println("chegou aq 1");
		while (it.hasNext()) {
			System.out.println("chegou aq 2");
			Empresas e = it.next();
			System.out.println( "SUBCATEGORIA: " + e.getSubCategoria() + "\nEMPRESA: " + e.getNomeEmpresa() + "\nTOTAL: " + e.getContaValor() + "\n\n");
		}
		
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

	
	public boolean verificar_lista_vaziap() {
		
	Iterator<Pessoas> it = listaPessoas.iterator();

	
	if(it.hasNext() == false)
		return false;
	else
		return true;
	}

	public boolean verificar_lista_vaziad() {
		
		Iterator<Despesas> it = listaDespesas.iterator();

		
		if(it.hasNext() == false)
			return false;
		else
			return true;
	}
	
	public boolean verificar_despesa_existente(String teste, int t1, int t2) {
		boolean retorno3 = false; 
		
		
		Iterator<Despesas> it = listaDespesas.iterator();
		while (it.hasNext()) {
			Despesas b = it.next();
			if(b.getCategoriaDespesa().equalsIgnoreCase(teste) && b.getMes()==t1 && b.getAno()==t2)
			retorno3 = true;
			
		}
		
		return retorno3;
	}
	
	public boolean verificar_pessoa_existente(String teste) {
		boolean retorno3 = false; 
		
		
		Iterator<Pessoas> it = listaPessoas.iterator();
		while (it.hasNext()) {
			Pessoas b = it.next();
			if(b.getEmail().equalsIgnoreCase(teste))
			retorno3 = true;
			
		}
		
		return retorno3;
	}
	
	public boolean relacionar_despesa_empresa(String teste, int t1, int t2, double custo) {
		boolean retorno3 = false; 
		double aux;
		
		Iterator<Despesas> it = listaDespesas.iterator();
		while (it.hasNext()) {
			Despesas b = it.next();
			if(b.getCategoriaDespesa().equalsIgnoreCase(teste) && b.getMes()==t1 && b.getAno()==t2){
				aux = b.getTotalDespesa();
				aux += custo;
				b.totalDespesa = aux;
				retorno3 = true;
			}
		}
		
		return retorno3;
	}

	public void lista_despesas() {
		
		
		Iterator<Despesas> it = listaDespesas.iterator();
		while (it.hasNext()) {
			Despesas a = it.next();
			System.out.println("- Categoria: " + a.getCategoriaDespesa() + " // Data: " + a.getMes()+"/"+a.getAno());
		}
		
	}
public void lista_pessoas() {
		
		
		Iterator<Pessoas> it = listaPessoas.iterator();
		while (it.hasNext()) {
			Pessoas a = it.next();
			System.out.println("- Nome: " + a.getNome() + " // Email: " + a.getEmail() + " // Idade: " + a.getIdade() +" // Genero: " + a.getGenero());
		}
		
	}

public double soma_rendaPessoas() {
	double total_rendaPessoa = 0;	
	Iterator<Pessoas> it = listaPessoas.iterator();
	while (it.hasNext()) {
		Pessoas a = it.next();
		total_rendaPessoa += a.getRendimento();
	
	}
	
	return total_rendaPessoa;
}

public String renda_indi(double rend_despesa, double rend_pessoa) {
	String retorno = "";
	//double total_rendaPessoa = 0;	
	Iterator<Pessoas> it = listaPessoas.iterator();
	while (it.hasNext()) {
		Pessoas a = it.next();
		retorno += "Nome: " +  a.getNome() + " // total a pagar: R$" + (a.getRendimento()/rend_pessoa)*rend_despesa + "\n";
	
	}
	
	return retorno;
}


public double soma_despesaTotal() {
	double total_despesa = 0;	
	Iterator<Despesas> it = listaDespesas.iterator();
	while (it.hasNext()) {
		Despesas a = it.next();
		total_despesa += a.getTotalDespesa();
	
	}
	
	return total_despesa;
}

public int numeroDePessoas() {
	int total_pessoas = 0;	
	Iterator<Pessoas> it = listaPessoas.iterator();
	while (it.hasNext()) {
		Pessoas a = it.next();
		total_pessoas ++;
	
	}
	
	return total_pessoas;
}

public void lista_empresas() {
	
	
	Iterator<Empresas> it = listaEmpresas.iterator();
	while (it.hasNext()) {
		Empresas a = it.next();
		System.out.println("- Subcategoria: " + a.getSubCategoria() + " // Empresa: " +a.getNomeEmpresa()+" // Custo: "+a.getContaValor());
	}
	
}

public double rendaPessoa() {
	double retorno = 0; 
	
	Iterator<Pessoas> it = listaPessoas.iterator();
	while (it.hasNext()) {
		Pessoas a = it.next();
		retorno += a.getRendimento();
	}
	
	return retorno;
}

public double custototal() {
	double retorno = 0; 
	
	Iterator<Empresas> it = listaEmpresas.iterator();
	while (it.hasNext()) {
		Empresas a = it.next();
		retorno += a.getContaValor();
	}
	
	return retorno;
}
	/////////////////////////////////////// ARRUMAR REGRA PROPORCIONAL////////////////////////////////////////////////////////
public void data_despesa(int n_pessoas, double r_pessoas) {
	int despesa_mes[] = new int[1000];
	int despesa_ano[] = new int[1000];
	double despesa_total[] = new double[1000];
	double soma[] = new double[1000];
	int j, k, i=1;
	Iterator<Despesas> it = listaDespesas.iterator();
	while (it.hasNext()) {
		Despesas a = it.next();
		despesa_mes[i] = a.getMes();
		despesa_ano[i] = a.getAno();
		despesa_total[i] = a.getTotalDespesa();
		i++;
	}
	for(j=1;j<i;j++){
		for(k=1;k<i;k++){
			if(despesa_mes[j]==despesa_mes[k] && despesa_ano[j]==despesa_ano[k]){
				soma[j] += despesa_total[k];
				despesa_total[k]=0;
			}
		}
	}
	for(int l=1;l<i;l++){
		if(soma[l]!=0){
			System.out.println("*************" + despesa_mes[l] + "/" + despesa_ano[l] + "*************");
			System.out.println(" REGRA IGUALITARIA:");
		System.out.println("R$" + soma[l]/n_pessoas + "\n");
		System.out.println(" REGRA PROPORCIONAL:");
		System.out.println(renda_indi(soma[l], r_pessoas));
		}
	}
}




}