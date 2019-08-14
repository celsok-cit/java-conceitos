package br.com.ciandt.joycelf;

import br.com.ciandt.joycelf.models.Pessoa;

public class ModificadoresDeAcesso {

	public static void main(String[] args) {

		Pessoa joao = new Pessoa();
		joao.setNome("Joao");
		joao.setIdade(25);

		System.out.println("nome = " + joao.getNome() + ", idade: " + joao.getIdade());
	}
}
