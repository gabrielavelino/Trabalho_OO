package Republica;

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
	
	public String toString() {
		return "NOME: " + nome + "\n" +
			   "E-MAIL: " + email + "\n" +
			   "GENERO: " + genero + "\n" + 
			   "IDADE: " + idade + "\n" +
			   "RENDIMENTO: " + rendimento;
		
	}

	public String getNome() {
		return nome;
	}

	//public void setNome(String nome) {
	//	this.nome = nome;
	//}

	public String getEmail() {
		return email;
	}

	//public void setEmail(String email) {
	//	this.email = email;
	//}

	public String getGenero() {
		return genero;
	}

	//public void setGenero(String genero) {
	//	this.genero = genero;
	//}

	public int getIdade() {
		return idade;
	}

	//public void setIdade(int idade) {
	//	this.idade = idade;
	//}

	public double getRendimento() {
		return rendimento;
	}

	//public void setRendimento(float rendimento) {
	//	this.rendimento = rendimento;
	//}
	

}
