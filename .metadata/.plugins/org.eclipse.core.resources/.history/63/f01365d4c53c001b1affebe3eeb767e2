package Republica;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

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
	
	public String txt_pessoa(){
		try {
			//File arquivo = new File(Path);
			FileWriter fw = new FileWriter("C:\\Users\\Dell\\Desktop\\EclipseJava\\git\\Trabalho_OO\\Projeto_OO\\Pessoas\\Pessoas.txt",true);
			PrintWriter pw = new PrintWriter(fw);
			
			pw.println("<Nome: " + this.nome + ">; <Email: " + this.email + ">; <Rendimento: R$" + this.rendimento + ">");
			pw.flush();
			pw.close();
			fw.close();
			
		} catch (IOException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
		return "cadastrado com sucesso";
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
