package br.com.ciandt.enovais;

import br.com.ciandt.enovais.models.Pessoa;

public class ModificadoresDeAcesso {

	public static void main(String[] args) {
		
		// Crie a variável joao usando a classe Pessoa
		Pessoa joao = new Pessoa();
		
		joao.setNome("João");
		joao.setIdade(25);
		
		System.out.println(joao.getNome());
		System.out.println(joao.getIdade());

	}
}
