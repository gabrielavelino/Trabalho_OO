package Republica;
import java.util.List;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Console {
	
	static List<republica> listarepublica ;
	
	boolean cadastrarrepublica(republica cadastrar) {
		   boolean resposta = listarepublica.add(cadastrar);
		   return resposta;
			
		}
	
	public String toString3() {
		String retorno = ""; 
		
		Iterator<republica> it = listarepublica.iterator();
		while (it.hasNext()) {
			republica rep = it.next();
			retorno += "REPUBLICA: " + 	rep.getNomeRepublica() + "\n";
		}
		
		return retorno;
	}
	
	static Scanner ler = new Scanner(System.in);
	
	
	
	void criarRepublica() {
	}
	
	void criarDespesa() {
	}
	
	void criarPessoa() {
	}
	
	void criarEmpresa() {
	}
	
	void regraIgualitaria() {
	}
	
	void regraProporcional() {
	}

	static Scanner sc = new Scanner(System.in);
	
	
	
	public static void main(String[] args) {

		listarepublica = new LinkedList<republica>();
		
		Console c = new Console();
		
		/*
		republica r = new republica("Delta");
		c.cadastrarrepublica(r);
		
		System.out.println("----- BEM VINDO ------");
		// CADASTRO PESSOAS
		Pessoas a1 = new Pessoas("andre", "andrelanna@unb.br","M",20,500.0);
		r.cadastrarPessoas(a1);
		
		Pessoas a2 = new Pessoas("Avelino Rasteira", "serrinha@unb.br","Female",16,1000.0);
		r.cadastrarPessoas(a2);
		
		System.out.println(r.toString());
		
		//CADASTRO DESPESA
		Despesas d = new Despesas(2020,12,"Telecomunicašao",5000.20);
		r.cadastrarDespesas(d);
		
		Despesas d2 = new Despesas(2020,12,"Residencia",2730.32);
		r.cadastrarDespesas(d2);
		
		System.out.println(r.toString2());
		
		Empresas e = new Empresas("internet", "NET", 50.50);
		d.cadastrarEmpresas(e);
		
		System.out.println(d.toString());
		*/
		
		
		
		System.out.println("----- BEM VINDO ------");
		
		while(true){
		
		System.out.println("\n");	
		System.out.println("O que voce deseja fazer?");
		System.out.println("0 cadastrar uma republica");
		System.out.println("1 ver lista de republicas");
		System.out.println("2 para sair do progama");
		
		int selecionado = sc.nextInt();
		
		if(selecionado == 0){
			Iterator<republica> it = listarepublica.iterator();
			System.out.println("Digite o nome da nova republica");
			String nomeRepublica = sc.next();
			republica r1 = new republica(nomeRepublica);
			c.cadastrarrepublica(r1);
			System.out.println("Republica cadastrada\n\n");
		}
		
		if(selecionado == 1){
			Iterator<republica> it = listarepublica.iterator();	
			if(it.hasNext() == false){
				System.out.println("Nenhuma republica cadastrada");
			}
			
			System.out.println(c.toString3());
			System.out.println("Escolha a republica");
			String Nome = sc.next();
			
			
			while (it.hasNext()) {

				republica rep = it.next();
				
				//verificar e comparar strings
				
				if(rep.getNomeRepublica().equalsIgnoreCase(Nome)){
					
					while(true){
					
					System.out.println("O que voce deseja fazer?");
					System.out.println("1 cadastrar uma pessoa");
					System.out.println("2 ver lista de pessoas");
					System.out.println("3 cadastrar uma despesa");
					System.out.println("4 ver lista de despesas");
					System.out.println("0 volta para o menu");
					
					int selecionado1 = sc.nextInt();
					
					if(selecionado1 == 1){
						System.out.println("Digite o nome da nova pessoa");
						String Nomepessoa = sc.next();
						System.out.println("Digite o email da nova pessoa");
						String Email = sc.next();
						System.out.println("Digite o genero da nova pessoa");
						String genero = sc.next();
						System.out.println("Digite a idade da nova pessoa");
						int idade = sc.nextInt();
						System.out.println("Digite o rendimento da nova pessoa");
						double rendimento = sc.nextInt();
						Pessoas p = new Pessoas(Nomepessoa, Email, genero, idade, rendimento);
						rep.cadastrarPessoas(p);
						System.out.println("Pessoa cadastrada\n\n");
					}
					
					if(selecionado1 == 2){
						System.out.println(rep.toString());
					}
					
					if(selecionado1 == 3){
						System.out.println("Digite o mes e o ano");
						int mes = sc.nextInt();
						int ano = sc.nextInt();
						System.out.println("Digite a categoria");
						String categoria = sc.next();
						System.out.println("Digite o custo total");
						int total = sc.nextInt();
						Despesas d = new Despesas(mes, ano, categoria, total);
						rep.cadastrarDespesas(d);
						System.out.println("Despesa cadastrada\n\n");
					}
					
					if(selecionado1 == 4){

						//Iterator<republica> it3 = listarepublica.iterator();
						System.out.println(rep.toString2());
						
						/*System.out.println("Escolha a despesa");
						String Nome1 = sc.next();
						while (it3.hasNext()) {

							republica rep2 = it.next();
							
							System.out.println("entrou");
							//verificar e comparar strings
							
							if(rep2.toGet4().equalsIgnoreCase(Nome1)){
								System.out.println("deu certo");
								}
							}*/
					}
					
					if(selecionado1 == 0){
						break;
					}
					
					}
				}
			}
		
		}
		
		if(selecionado == 2){
			System.out.println("voce saiu do progama");
			break;
			
		}
		
		}
	}

}
