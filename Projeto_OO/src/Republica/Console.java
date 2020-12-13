package Republica;
import java.util.List;
import java.io.File;
import java.io.IOException;
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
			retorno += "Republica: " + 	rep.getNomeRepublica() + "\n";
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
	
	public boolean verificar_republica_existente(String teste) {
		boolean retorno3 = false; 
		
		
		Iterator<republica> it = listarepublica.iterator();
		while (it.hasNext()) {
			republica b = it.next();
			if(b.getNomeRepublica().equalsIgnoreCase(teste))
			retorno3 = true;
			
		}
		
		return retorno3;
	}
	
	void criarEmpresa() {
	}
	
	void regraIgualitaria() {/*
		int renda, custo;
		renda = rep.rendaPessoa();
		custo = r.custototal();*/
	}
	
	void regraProporcional() {
	}

	public void lista_pastaRep() {
        // Creates an array in which we will store the names of files and directories
        String[] pathnames;

        // Creates a new File instance by converting the given pathname string
        // into an abstract pathname
        File f = new File("Republica\\");

        // Populates the array with names of files and directories
        pathnames = f.list();

        // For each pathname in the pathnames array
        for (String pathname : pathnames) {
            // Print the names of files and directories
            //System.out.println("Republica: " + pathname);
            republica r2 = new republica(pathname);
            c.cadastrarrepublica(r2);
        }
        System.out.println("\n");
	}
	
	
	static Console c = new Console();
	
	static Scanner sc = new Scanner(System.in);
	
	//-------------------------------------------- FUN�AO MAIN ---------------------------------------------------------
	
	public static void main(String[] args) throws IOException {

		listarepublica = new LinkedList<republica>();
		
		//Console c = new Console();
		
		double rend_pessoa = 0;
		double rend_despesa = 0;
		int tot_pessoa = 0;
		
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
		//aosivanosdvinasodvansvaspvasnfjspd
		//ATE AQUI
		System.out.println("----- BEM VINDO AO PROGRAMA DE CADASTRO DE REPUBLICAS ------");
		
		int selecionado = -1;
		c.lista_pastaRep();
			while(true){
				System.out.println("\n");	
				System.out.println(" ----------------------------------------");
				System.out.println("|       O QUE VOCE DESEJA FAZER?       	 |");
				System.out.println("|                                    	 |");
				System.out.println("| (1) Cadastrar uma republica.           |");
				System.out.println("| (2) Escolher uma republica.            |");
				System.out.println("| (3) Retirar republica.                 |");
				System.out.println("| (0) Para sair do progama!              |");
				System.out.println(" ----------------------------------------");
				
				try {
				selecionado =  Integer.parseInt(sc.next());;
				
				}catch(NumberFormatException e){
				
					System.out.println("Operador invalido...!\n");
					selecionado = -1;
					
					
				}

				///////////////////////////CAMPO EM BRANCO//////////////////////////////////
				
				// CADASTRAR UMA NOVA REPUBLICA
				
				if(selecionado == 1){
					System.out.println("Digite o nome da nova republica");
					String nomeRepublica1;
					while(true){
						String nomeRepublica = sc.nextLine();
						
						 boolean repeat_republica = true;
								while(repeat_republica){
									nomeRepublica = sc.nextLine();
									repeat_republica = false;
									if(nomeRepublica.equalsIgnoreCase("")){
										System.out.println("campo vazio, Digite o nome novamente\n");
										repeat_republica = true;
									}
									
								}
						 
						if(!c.verificar_republica_existente(nomeRepublica)){
							nomeRepublica1 = nomeRepublica;
							break;
						}

						System.out.println("Republica ja cadastrada. Tente outro nome");
					}
					republica r1 = new republica(nomeRepublica1);
					c.cadastrarrepublica(r1);
					
					r1.pastaRep(nomeRepublica1);
					
					System.out.println("Republica cadastrada!");
				}
				// IMPRIMINDO LISTA DE REPUBLICAS CADASTRADAS
				else if(selecionado == 2){
					
					Iterator<republica> it = listarepublica.iterator();	
					//CASO NAO TENHA NENHUMA REPUBLICA CADASTRADA
					if(it.hasNext() == false){
						System.out.println("Nenhuma republica cadastrada ainda");
					}

					else{
					System.out.println(c.toString3());
					
					System.out.println("Escolha a republica: ");
					String Nome = sc.nextLine();
					Nome = sc.nextLine();
					String repNome = Nome;
					
					//MENU CADASTROS DE PESSOAS E DESPESAS
					int selecionado1 = -1;
					if(!c.verificar_republica_existente(Nome)){
						System.out.println("Republica n�o encontrada!!");
					}
					
					
					
					//txt.ler_pessoas(repNome);
					
					while (it.hasNext()) {

						republica rep = it.next();
						
						//verificar e comparar strings
						
						if(rep.getNomeRepublica().equalsIgnoreCase(Nome)){
							
							while(true){
							
							// DENTRO DA REPUBLICA ESCOLHIDA
							
							System.out.println("------------------------------------------");
							System.out.println("|        O QUE VOCE DESEJA FAZER?        |");
							System.out.println("|                                    	 |");
							System.out.println("| (1) Cadastrar uma pessoa.              |");
							System.out.println("| (2) Ver lista de pessoas.              |");
							System.out.println("| (3) Cadastrar uma despesa.             |");
							System.out.println("| (4) Ver lista de despesas.             |");
							System.out.println("| (5) Cadastrar uma empresa.             |");
							System.out.println("| (6) Retirar Pessoas.                   |");
							System.out.println("| (7) Retirar despesas.                  |");
							System.out.println("| (8) Ver status da republica.           |");
						//	System.out.println("| (9) Cadastrar uma pessoa por txt.      |");
							System.out.println("| (0) Voltar para o menu principal!      |");
							System.out.println("------------------------------------------");
							
							try {
								selecionado1 =  Integer.parseInt(sc.next());;
								
								}catch(NumberFormatException e){
								
									System.out.println("Operador invalido...!\n");
									selecionado1 = -1;
									
									
								}
							// CADASTRO DE PESSOAS
							if(selecionado1 == 1){
								System.out.println("Digite o nome da nova pessoa");
								String Nomepessoa = sc.nextLine();
								boolean repeat_nome = true;
								while(repeat_nome){
									Nomepessoa = sc.nextLine();
									repeat_nome = false;
									if(Nomepessoa.equalsIgnoreCase("")){
										System.out.println("campo vazio, Digite o nome novamente\n");
										repeat_nome = true;
									}
									
								}
								System.out.println("Digite o email da nova pessoa");
								String Email;
								//verificar email existente
								while(true){
									Email = sc.next();
									if(!rep.verificar_pessoa_existente(Email)){
										break;
									}
									System.out.println("Email ja cadastrado. Tente outro email");
								
								}
								System.out.println("Digite o genero da nova pessoa");
								String genero = sc.next();
								System.out.println("Digite a idade da nova pessoa");
								int idade = -1;
								double rendimento = -1;
								boolean repeat_idade = true;
								while(repeat_idade){
								try {
									idade =  Integer.parseInt(sc.next());;
									repeat_idade = false;
									
									}catch(NumberFormatException e){
									
										System.out.println("Operador invalido... Digite a idade novamente\n");
										System.out.println("exemplo : 21\n");
										idade = -1;
										repeat_idade = true;
										
									}
								}
								System.out.println("Digite o rendimento da nova pessoa");
								

								boolean repeat_rendimento = true;
								while(repeat_rendimento){
								try {
									rendimento =  Double.parseDouble(sc.next());;
									
									repeat_rendimento = false;
									if(rendimento<0){
										repeat_rendimento = true;
										System.out.println("Operador invalido... Digite o rendimento novamente!");
										System.out.println("exemplo : 130.50\n");
									}
									
									}catch(NumberFormatException e){
									
										System.out.println("Operador invalido... Digite o rendimento novamente!");
										System.out.println("exemplo : 130.50\n");
										
										rendimento = -1;
										repeat_rendimento = true;
										
									}	
									}
								
								Pessoas p = new Pessoas(Nomepessoa, Email, genero, idade, rendimento);
								rep.cadastrarPessoas(p);
								
								// PERSISTENCIA PESSOAS 
								p.txt_pessoa(repNome);
								
								System.out.println("Pessoa cadastrada\n\n");
							}
							//LISTA DE PESSOAS
							else if(selecionado1 == 2){	
								if(rep.verificar_lista_vaziap() == false){
									System.out.println("Nenhuma pessoa cadastrada ainda\n");
								}
								else
								System.out.println(rep.toString());
							}
							// CADASTRO DA DESPESA
							else if(selecionado1 == 3){
								int mes, ano;
								String categoria;
								//double total;
								while(true){
								
								System.out.println("Digite o mes");
								mes = -1;
								ano = -1;
								
								boolean repeat_mes = true;
								while(repeat_mes){
									try {
										mes =  Integer.parseInt(sc.next());;
										repeat_mes = false;
										
										}catch(NumberFormatException e){
										
											System.out.println("Operador invalido... Digite o mes novamente\n");
											System.out.println("exemplo : 05\n");
											
											mes = -1;
											repeat_mes = true;
											
										}
									}

								System.out.println("Digite o ano");
								boolean repeat_ano = true;
								while(repeat_ano){
									try {
										ano =  Integer.parseInt(sc.next());;
										repeat_ano = false;
										
										}catch(NumberFormatException e){
										
											System.out.println("Operador invalido... Digite o ano novamente\n");
											System.out.println("exemplo : 2020\n");
											
											ano = -1;
											repeat_ano = true;
											
										}
									}
								
								System.out.println("Digite a categoria");
								categoria = sc.nextLine();
								
								boolean repeat_categoria = true;
								while(repeat_categoria){
								categoria = sc.nextLine();
									repeat_categoria = false;
									if(categoria.equalsIgnoreCase("")){
										System.out.println("campo vazio, Digite a categotia novamente\n");
										repeat_categoria = true;
									}
									
								}
								/* 
								System.out.println("Digite o custo total");
								total = -1;
								
								boolean repeat_total = true;
								while(repeat_total){
								try {
									total=  Double.parseDouble(sc.next());;

									repeat_total = false;
									if(total<0){
										repeat_total = true;
										System.out.println("Operador invalido... Digite o rendimento novamente!");
										System.out.println("exemplo : 130.50\n");
									}
									
									}catch(NumberFormatException e){
									
										System.out.println("Operador invalido... Digite o custo total novamente!");
										System.out.println("exemplo : 130.50\n");
										total = -1;
										repeat_total = true;
										
									}	
								}
								*/
								if(!rep.verificar_despesa_existente(categoria, mes, ano)){
									break;
								}
		
								System.out.println("Despesa ja cadastrada nesta data. cadastre novamente");
							}


								Despesas d = new Despesas(mes, ano, categoria, 0);
								rep.cadastrarDespesas(d);
								
								// PERSISTENCIA DESPESAS
								//d.txt_despesas();
								
								System.out.println("Despesa cadastrada\n\n");
								
								/*System.out.println("(1) cadastrar empresa: ");
								System.out.println("(0) Voltar menu cadastros: ");
								
								int selecionado3 = sc.nextInt();
								if(selecionado3==1){
									
								while(true){
									System.out.println("(1) Cadastrar Subcategoria: ");
									System.out.println("(2) Ver lista de Subcategorias: ");
									System.out.println("(0) SAIR MENU DESPESAS ");
									int selecionado4 = sc.nextInt();

									if(selecionado4==1){
									System.out.println("Digite o nome da Empresa: ");
									String empresa = sc.next();
									System.out.println("Digite a Subcategoria da despesa: ");
									String subcategoria = sc.next();
									System.out.println("Digite o custo do servi�o realizado: ");
									double servi�o = sc.nextDouble();
									Empresas e = new Empresas(subcategoria, empresa, servi�o);
									d.cadastrarEmpresas(e);
								
									System.out.println("Empresa cadastrada\n\n");
									}
									else if(selecionado4==2){
										d.toStringEmpresa();
									}
									else if(selecionado4==0){
										break;
									}
									else{
										System.out.println("!!Escolha outra op�ao!!");
										
									}
								}
								}*/
							}
							
							// VER DESPESAS
							else if(selecionado1 == 4){	
								if(rep.verificar_lista_vaziad() == false){
									System.out.println("Nenhuma despesa cadastrada ainda\n");
								}
								/////////////////////////////////ARRUMAR (COLOCAR EMPRESAS) //////////////////////////////
								else
								System.out.println(rep.toString2());
								/*
								System.out.println("Ver lista de empresas desta despesa?");
								System.out.println("(sim/nao)");
								String selecionado5 = sc.next();
								if(selecionado5.equalsIgnoreCase("sim")){
									
								}
								else if(selecionado5.equalsIgnoreCase("nao")){
									
								}
								else{
									System.out.println("!!Escolha outra op�ao!!");
									
								}*/
							/*	
								System.out.println("Escolha a Categoria da despesa desejada: ");
								String teste = sc.next();
								
								Iterator<republica> it3 = listarepublica.iterator();
								
								while(it3.hasNext()) {
									republica rep1 = it3.next();
									// MENU DESPESAS PARA EMPRESAS
									if(rep1.toGet4(teste).equalsIgnoreCase(teste)) {

										System.out.println("(1) Cadastrar Subcategoria: ");
										System.out.println("(2) Ver lista de Subcategorias: ");
										System.out.println("(0) SAIR MENU DESPESAS ");
										
										int selecionado2 = sc.nextInt();
									
										
										if(selecionado2 == 1) {
											System.out.println("Digite o nome da Empresa: ");
											String empresa = sc.next();
											System.out.println("Digite a Subcategoria da despesa: ");
											String subcategoria = sc.next();
											System.out.println("Digite o custo do servi�o realizado: ");
											double servi�o = sc.nextDouble();
											Empresas e = new Empresas(subcategoria, empresa, servi�o);
											//d.cadastrarEmpresas(e);
											
											System.out.println("Empresa cadastrada\n\n");
									
										}
									
										if(selecionado2 == 2) {
											
												//d.toStringEmpresa();
												
											
											
										}
									
									
									
									}
								
								}
								
							FINAL COMENTARIO  DA EMPRESA  */	
							}

							///////////////////////////CAMPO EM BRANCO//////////////////////////////////
							
							// CADASTRO DAS EMPRESAS
							else if(selecionado1==5){
								if(rep.verificar_lista_vaziad() == false){
									System.out.println("Nenhuma despesa cadastrada ainda\n");
								}
								else{
								System.out.println(rep.toString2());
							
								System.out.println("Esta empresa esta relacionada com qual categoria?");

								String categoria;
								int mes;
								int ano;
								
								while(true){	
									

									System.out.println("Digite a categoria");
									categoria = sc.nextLine();
									
									boolean repeat_categoria = true;
									while(repeat_categoria){
									categoria = sc.nextLine();
										repeat_categoria = false;
										if(categoria.equalsIgnoreCase("")){
											System.out.println("campo vazio, Digite a categotia novamente\n");
											repeat_categoria = true;
										}
										
									}
									
									System.out.println("Digite o mes");
									mes = -1;
									ano = -1;
									
									boolean repeat_mes = true;
									while(repeat_mes){
										try {
											mes =  Integer.parseInt(sc.next());;
											repeat_mes = false;
											
											}catch(NumberFormatException e){
											
												System.out.println("Operador invalido... Digite o mes novamente\n");
												System.out.println("exemplo : 05\n");
												
												mes = -1;
												repeat_mes = true;
												
											}
										}

									System.out.println("Digite o ano");
									boolean repeat_ano = true;
									while(repeat_ano){
										try {
											ano =  Integer.parseInt(sc.next());;
											repeat_ano = false;
											
											}catch(NumberFormatException e){
											
												System.out.println("Operador invalido... Digite o ano novamente\n");
												System.out.println("exemplo : 2020\n");
												
												ano = -1;
												repeat_ano = true;
												
											}
										}
									

									if(rep.verificar_despesa_existente(categoria, mes, ano)){
										break;
									}

									System.out.println("Despesa nao existente");
								}
								
								
								System.out.println("Digite o nome da empresa");
								
								String nomeempresa = sc.nextLine();
								boolean repeat_empresa = true;
								while(repeat_empresa){
								nomeempresa = sc.nextLine();
									repeat_empresa = false;
									if(nomeempresa.equalsIgnoreCase("")){
										System.out.println("campo vazio, Digite a empresa novamente\n");
										repeat_empresa = true;
									}
									
								}
								///////////////////////////CAMPO EM BRANCO//////////////////////////////////
								System.out.println("Digite o nome da subcategoria");
								
								String nomesubcategoria = null;
								boolean repeat_subcategoria = true;
								while(repeat_subcategoria){
								nomesubcategoria = sc.nextLine();
									repeat_subcategoria = false;
									if(nomesubcategoria.equalsIgnoreCase("")){
										System.out.println("campo vazio, Digite a subcategotia novamente\n");
										repeat_subcategoria = true;
									}
									
								}
								System.out.println("Digite o custo da empresa");
								
								double custo = -1;
								
								boolean repeat_custo = true;
								while(repeat_custo){
								try {
									custo = Double.parseDouble(sc.next());;

									repeat_custo = false;
									if(custo<0){
										repeat_custo = true;
										System.out.println("Operador invalido... Digite o rendimento novamente!");
										System.out.println("exemplo : 130.50\n");
									}
									
									}catch(NumberFormatException e){
									
										System.out.println("Operador invalido... Digite o custo novamente!\n");
										System.out.println("exemplo : 130.50\n");
										custo = -1;
										repeat_custo = true;
										
									}	
									}
							
								rep.relacionar_despesa_empresa(categoria, mes, ano, custo);
								Empresas e = new Empresas(nomesubcategoria, nomeempresa, custo);
								rep.cadastrarEmpresas(e);
								Despesas d = new Despesas(mes, ano, categoria, custo);
								d.txt_despesas(nomesubcategoria,repNome);
								System.out.println("Empresa cadastrada\n\n");
								}
							}
							
							
							
							//RETIRAR PESSOA
							else if(selecionado1 == 6) {
								if(rep.verificar_lista_vaziap() == false){
									System.out.println("Nenhuma pessoa cadastrada ainda\n");
								}
								else{
									System.out.println("lista de pessoas ");
									rep.lista_pessoas();
									
									System.out.println("Digite o e-mail da pessoas a ser retirada: ");
									String email_tirado = sc.next();

									if(rep.verificar_pessoa_existente(email_tirado)==false){
										System.out.println("Pessoa nao encontrada!\n");
									}
									else{
										rep.retirarPessoa(email_tirado);
										System.out.println("Pessoa retirada!\n");
									}
								}
							}
							//RETIRAR DESPESA
							else if(selecionado1 == 7) {
								if(rep.verificar_lista_vaziad() == false){
									System.out.println("Nenhuma despesa cadastrada ainda\n");
								}
								else{

									System.out.println("lista de despesas ");
									rep.lista_despesas();
									System.out.println("Digite a categoria a ser retirada: ");
									
									String categoria_retirado = sc.next();
									System.out.println("Digite o mes da despesa a ser retirada : ");
									int mes_retirado = -1;
									int ano_retirado = -1;
									
									boolean repeat_mes_retirado = true;
									while(repeat_mes_retirado){
										try {
											mes_retirado =  Integer.parseInt(sc.next());;
											repeat_mes_retirado = false;
											
											}catch(NumberFormatException e){
											
												System.out.println("Operador invalido... Digite o mes novamente\n");
												mes_retirado = -1;
												repeat_mes_retirado = true;
												
											}
										}
									System.out.println("Digite o ano da despesa a ser retirada : ");
									
									boolean repeat_ano_retirado = true;
									while(repeat_ano_retirado){
										try {
											ano_retirado =  Integer.parseInt(sc.next());;
											repeat_ano_retirado = false;
											
											}catch(NumberFormatException e){
											
												System.out.println("Operador invalido... Digite o mes novamente\n");
												ano_retirado = -1;
												repeat_ano_retirado = true;
												
											}
										}
									if(rep.verificar_despesa_existente(categoria_retirado, mes_retirado, ano_retirado)==false){
										System.out.println("Despesa nao encontrada!\n");
									}
									else{
										rep.retirarDespesa(categoria_retirado,mes_retirado,ano_retirado);
										System.out.println("Despesa retirada!\n");
									}
								}
							}
							
							// VER STATUS DA REPUBLICA ESCOLHIDA
							else if(selecionado1 == 8){	
								System.out.println("lista de pessoas: ");
								rep.lista_pessoas();
								
								System.out.println("\nlista de despesas: ");
								rep.lista_despesas();
								
								System.out.println("\nlista de empresas: ");
								rep.lista_empresas();
								
								// REGRA IGUALITARIA E PROPORCIONAL
								System.out.println(" ----------------------------------------");
								System.out.println("Divis�o das despesas: ");
								
								
								rend_pessoa = rep.soma_rendaPessoas();
								rend_despesa = rep.soma_despesaTotal();
								//System.out.println("\nSoma renda pessoas: " + rend_pessoa + "\n");
								tot_pessoa = rep.numeroDePessoas();
								
								// REGRA IGUALITARIA
								
								//double resultadoI = (rend_despesa)/tot_pessoa;
								
								if(rep.numeroDePessoas() == 0){
									System.out.println("Impossivel mostrar as regras");
									System.out.println("Nenhuma pessoa foi cadastrada\n");
								}
								else{
									//System.out.println("\nValor por Regra igualitaria: \nR$" + resultadoI);
								
								
									//REGRA PROPORCIONAL (rend_individual/rend_pessoas)*rend_despesa
									//System.out.println("\nValor por Regra proporcional: \n");
									//System.out.println(rep.renda_indi(rend_despesa, rend_pessoa));
									rep.data_despesa(tot_pessoa, rend_pessoa);
									System.out.println(" ----------------------------------------");
									}
							}
							
							// SAIR MENU CADASTROS 
							else if(selecionado1 == 0){								
								break;
							}
							else{
								System.out.println("!!Escolha outra op�ao!!\n");
							}
							
							}
						}
					
						
						
					}
				
				}
				}
				// REMOVER REPUBLICA
				else if(selecionado == 3) {

					Iterator<republica> it = listarepublica.iterator();	
					if(it.hasNext() == false){
						System.out.println("Nenhuma republica cadastrada ainda\n");
					}
					
					else{
						System.out.println("Digite o nome da republica a ser retirada: ");
						Iterator<republica> it4 = listarepublica.iterator();	
						while (it4.hasNext()) {
							republica a = it4.next();
							System.out.println("-"+a.getNomeRepublica());
						}
						String rep_tirado = sc.nextLine();
						rep_tirado = sc.nextLine();
						if(c.verificar_republica_existente(rep_tirado)==false){
							System.out.println("Republica nao encontrada!\n");
						}
						else{
							c.retirarRepublica(rep_tirado);
							System.out.println("Republica retirada!\n");
						}
					}
				}
				
				
				
				// SAIR DO PROGRAMA
				else if(selecionado == 0){
					System.out.println("!!YESS PEPE,THANK YOU !!");
					break;
					
				}
				else{
					System.out.println("!!Escolha outra op�ao!!");
				}
		}
		
	}

}
