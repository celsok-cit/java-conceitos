package br.com.ciandt.csartini;

import br.com.ciandt.csartini.models.Pessoa;

public class ModificadoresDeAcesso {

	public static void main(String[] args) {
		
		Pessoa joao = new Pessoa();
		
		joao.setNome("João");
		joao.setIdade(25);
		
		System.out.println("O nome do Joao eh " + joao.getNome() + " e a idade do Joao eh " + joao.getIdade() );
		
	}
}
