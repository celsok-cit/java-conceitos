package br.com.ciandt.login;

import br.com.ciandt.login.models.Pessoa;

public class ModificadoresDeAcesso {

	public static void main(String[] args) {
		
		//Crie a variável joao usando a classe Pessoa
		
		Pessoa joao = new Pessoa(); 
		joao.setNome("joão");
		joao.setIdade("26");
	
		
		Pessoa pedro = new Pessoa(); 
		pedro.setNome("pedro");
		pedro.setIdade("26");
	}
}
