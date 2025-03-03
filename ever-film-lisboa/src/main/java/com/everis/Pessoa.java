package com.everis;

public class Pessoa {
	
	private String nome;
	private String sobrenome;
	protected int idade;
	
	
	
	
	
	public Pessoa() {
		
	}


	public Pessoa(String nome, String sobrenome, int idade) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
	}





	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}





	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}





	/**
	 * @return the sobrenome
	 */
	public String getSobrenome() {
		return sobrenome;
	}





	/**
	 * @param sobrenome the sobrenome to set
	 */
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}





	/**
	 * @return the idade
	 */
	public int getIdade() {
		return idade;
	}





	/**
	 * @param idade the idade to set
	 */
	public void setIdade(int idade) {
		this.idade = idade;
	}


	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", sobrenome=" + sobrenome + ", idade=" + idade + "]";
	}
	
	

}