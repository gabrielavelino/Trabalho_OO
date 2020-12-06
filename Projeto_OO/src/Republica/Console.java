package Republica;
import java.util.List;
import java.util.InputMismatchException;
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
	
	boolean retirarRepublica(String nomeRepublica) {
		
		boolean resposta = false;
		
		//iterator = referencia para "varrer" a lista 
		Iterator<republica> it = listarepublica.iterator();
		//Enquanto tiver uma proxima pessoa a ser "varrida"
		while (it.hasNext()) {
			//pega o proxumo elemento
			republica temp = it.next();
			//verifica se é o elemento desejado
			if (temp.getNomeRepublica().equalsIgnoreCase(nomeRepublica))
				//se for, removo o elemento da lista.
				resposta = listarepublica.remove(temp);
		}
		
		return resposta;
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
		Despesas d = new Despesas(2020,12,"Telecomunica�ao",5000.20);
		r.cadastrarDespesas(d);
		
		Despesas d2 = new Despesas(2020,12,"Residencia",2730.32);
		r.cadastrarDespesas(d2);
		
		System.out.println(r.toString2());
		
		Empresas e = new Empresas("internet", "NET", 50.50);
		d.cadastrarEmpresas(e);
		
		System.out.println(d.toString());
		*/
		
		boolean repeat = true;
		while(repeat) {
		try {
			while(true){
				System.out.println("----- BEM VINDO AO PROGRAMA DE CADASTRO DE REPUBLICAS ------");
				System.out.println("\n");	
				System.out.println("O que voce deseja fazer?\n");
				System.out.println("(1) cadastrar uma republica.");
				System.out.println("(2) ver lista de republicas.");
				System.out.println("(3) Retirar republica.");
				System.out.println("(0) para sair do progama!");
				
				int selecionado = sc.nextInt();
				// CADASTRAR UMA NOVA REPUBLICA
				if(selecionado == 1){
					Iterator<republica> it = listarepublica.iterator();
					System.out.println("Digite o nome da nova republica");
					String nomeRepublica = sc.next();
					republica r1 = new republica(nomeRepublica);
					c.cadastrarrepublica(r1);
					System.out.println("Republica cadastrada!");
				}
				// IMPRIMINDO LISTA DE REPUBLICAS CADASTRADAS
				if(selecionado == 2){
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
							// DENTRO DA REPUBLICA ESCOLHIDA
							System.out.println("O que voce deseja fazer?");
							System.out.println("(1) cadastrar uma pessoa.");
							System.out.println("(2) ver lista de pessoas.");
							System.out.println("(3) cadastrar uma despesa.");
							System.out.println("(4) ver lista de despesas.");
							System.out.println("(5) Retirar Pessoas. ");
							System.out.println("(6) Retirar despesas.");
							System.out.println("(0) voltar para o menu principal!");
							
							int selecionado1 = sc.nextInt();
							// CADASTRO DE PESSOAS
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
								double rendimento = sc.nextDouble();
								Pessoas p = new Pessoas(Nomepessoa, Email, genero, idade, rendimento);
								rep.cadastrarPessoas(p);
								System.out.println("Pessoa cadastrada\n\n");
							}
							
							if(selecionado1 == 2){
								System.out.println(rep.toString());
							}
							// CADASTRO DA DESPESA
							if(selecionado1 == 3){
								System.out.println("Digite o mes e o ano");
								int mes = sc.nextInt();
								int ano = sc.nextInt();
								System.out.println("Digite a categoria");
								String categoria = sc.next();
								System.out.println("Digite o custo total");
								double total = sc.nextDouble();
								Despesas d = new Despesas(mes, ano, categoria, total);
								rep.cadastrarDespesas(d);
								System.out.println("Despesa cadastrada\n\n");
							}
							
							// ENTRA NO MENU DAS EMPRESAS / VER DESPESAS
							 if(selecionado1 == 4){

								
								System.out.println(rep.toString2());
							/*	System.out.println("Escolha a Categoria da despesa desejada: ");
								String teste = sc.next();
								
								Iterator<republica> it3 = listarepublica.iterator();
								
								while(it3.hasNext()) {
									republica rep1 = it3.next();
									// MENU DESPESAS PARA EMPRESAS
									if(rep1.toGet4(teste).equalsIgnoreCase(teste)) {
										
										System.out.println("(1) Ver lista de Subcategorias: ");
										System.out.println("(2) Cadastrar Subcategoria: ");
										System.out.println("(0) SAIR MENU DESPESAS ");
										
										int selecionado2 = sc.nextInt();
										
										Despesas d2 = new Despesas(2, 3, "subcategoria",3.9);
										
										if(selecionado2 == 2) {
											System.out.println("Digite o nome da Empresa: ");
											String empresa = sc.next();
											System.out.println("Digite a Subcategoria da despesa: ");
											String subcategoria = sc.next();
											System.out.println("Digite o custo do servi�o realizado: ");
											double servi�o = sc.nextDouble();
											Empresas e = new Empresas(subcategoria, empresa, servi�o);
											
											d2.cadastrarEmpresas(e);
											System.out.println("Empresa cadastrada\n\n");
									
										}
									
										if(selecionado2 == 1) {
											
												System.out.println(d2.toStringEmpresa());
												
											
											
										}
									
									
									
									}
								
								}
								
							*/	
							}
							
							if(selecionado1 == 5) {
								System.out.println("Digite o e-mail da pessoas a ser retirada: ");
								String email_tirado = sc.next();
								rep.retirarPessoa(email_tirado);
								System.out.println("Pessoa retirada!");
								
							}
							
							if(selecionado1 == 6) {
								System.out.println("Digite a categoria a ser retirada: ");
								String categoria_retirado = sc.next();
								System.out.println("Digite a data da despesa (mes e ano) : ");
								int mes_retirado = sc.nextInt();
								int ano_retirado = sc.nextInt();
								rep.retirarDespesa(categoria_retirado,mes_retirado,ano_retirado);
								System.out.println("Despesa retirada!");
								
							}
							
							
							
							// SAIR MENU CADASTROS 
							if(selecionado1 == 0){
								break;
							}
							
							}
						}
					}
				
				}
				
				if(selecionado == 3) {
					System.out.println("Digite o nome da republica a ser retirada: ");
					String rep_tirado = sc.next();
					c.retirarRepublica(rep_tirado);
					System.out.println("Republica retirada!");
					
				}
				
				
				
				// SAIR DO PROGRAMA
				if(selecionado == 0){
					System.out.println("!!VOLTE SEMPRE!!");
					break;
					
				}
				
				}
			repeat = false;
			
		}catch(NumberFormatException e){
		
			System.out.println("Operador invalido... tente novamente!");
			repeat = true;
			
			
		}
		
		
		}
		
	}

}
