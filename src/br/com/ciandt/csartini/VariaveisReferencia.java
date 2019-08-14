package br.com.ciandt.csartini;

import br.com.ciandt.csartini.models.Pessoa;

public class VariaveisReferencia {

	public static void main(String[] args) {
		
		Pessoa joao = new Pessoa();
		joao.setNome("Joao");
		
		Pessoa pedro = new Pessoa();
		pedro.setNome("Pedro");
		
		System.out.println("O nome do Joao eh " + joao.getNome());
		System.out.println("O nome do Pedro eh " + pedro.getNome());
	}
}
