package Republica;
import java.util.List;
import java.util.LinkedList;
import java.util.Scanner;

public class Console {
	
	republica[] listaRepublicas;
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
	
	
	
	
	public static void main(String[] args) {
		
		republica r = new republica("Delta");
		
		System.out.println("----- BEM VINDO ------");
		String a;
		String b;
		float c;
		// CADASTRO PESSOAS
		Pessoas a1 = new Pessoas("andre", "andrelanna@unb.br","M",20,500.0);
		r.cadastrarPessoas(a1);
		
		Pessoas a2 = new Pessoas("Italo Rasteira", "serrinha@unb.br","Female",16,1000.0);
		r.cadastrarPessoas(a2);
		
		System.out.println(r.toString());
		
		//CADASTRO DESPESA
		Despesas d = new Despesas(2020,12,"Telecomunicašao",5000.20);
		r.cadastrarDespesas(d);
		
		Despesas d2 = new Despesas(2020,12,"Residencia",2730.32);
		r.cadastrarDespesas(d2);
		
		System.out.println(r.toString2());
		
		
		
		
		
		/*a = ler.next();
		b = ler.next();
		c = ler.nextFloat();*/
		
		/*Despesas teste = new Despesas();
		teste.cadastrarEmpresa(a1, b, c);
		System.out.println(c);*/
		
		
		
		
		
		
	}

}
