package br.com.ciandt.login;

import br.com.ciandt.login.models.Pessoa;

public class VariaveisReferencia {

	public static void main(String[] args) {
		
		Pessoa joao = new Pessoa();
		joao.setNome("Jo�o");
		joao.setIdade("25");
		
		Pessoa pedro = new Pessoa();
		pedro.setNome("Pedro");
		pedro.setIdade("26");
		
		System.out.println("O nome do Jo�o � " + joao.getNome() + "e ele tem " + joao.getIdade());
		System.out.println("O nome do Pedro � " + pedro.getNome() + "e ele tem " + pedro.getIdade());
	}
}