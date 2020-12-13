package Republica;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Pessoas {
	String nome,
		   email,
		   genero;
	
	int idade;
	double rendimento;
	
	

	public Pessoas(String nome, String email, String genero, int idade, double rendimento) {
		
		this.nome = nome;
		this.email = email;
		this.genero = genero;
		this.idade = idade;
		this.rendimento = rendimento;	
		
	}
	
	public String txt_pessoa(String repNome){
		try {
			//File arquivo = new File(Path);
		
			FileWriter fw = new FileWriter("Republica\\" + repNome+"\\" + "Pessoas.txt",true);
			PrintWriter pw = new PrintWriter(fw);
			
			pw.println("<Nome: " + this.nome + ">; <Email: " + this.email + ">; <Gênero: " + this.genero + ">; <Idade: " + this.idade + ">; <Rendimento: R$" + this.rendimento + ">");
			pw.flush();
			pw.close();
			fw.close();
			
		} catch (IOException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
		return "cadastrado com sucesso";
	}
	
	public  void ler_pessoas(String nomeRep) throws IOException {
	
		Scanner s = null; 
		BufferedReader entrada = null; 
		republica rep = new republica(nomeRep);
		try {
			//criacao do buffer de linhas do arquivo
			entrada = new BufferedReader(new FileReader(nomeRep + ".txt"));
			System.out.println("Buffer criado!!! ");

			//Leitura, linha por linha, e quebra em diferentes dados
			String linha; 
			
			while ((linha = entrada.readLine()) != null) {
				//Quebrar a linha em partes de registro (=diferentes dados)
				s = new Scanner(linha);
				s.useDelimiter(";");
				System.out.println(s);
		
			

				String nome = s.next();
				String email = s.next();
				String genero = s.next();
				int idade = s.nextInt();
				double rendimento = s.nextDouble();
				
				Pessoas a = new Pessoas(nome, email, genero, idade, rendimento);//criei o objeto pessoa
				rep.cadastrarPessoas(a);
				
				
			}
		
			txt_pessoa(nomeRep);
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		
		
		} finally {
			if (entrada != null) {
				entrada.close();}
			}

	
	}
	

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getGenero() {
		return genero;
	}

	public int getIdade() {
		return idade;
	}

	public double getRendimento() {
		return rendimento;
	}

}
