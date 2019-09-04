package com.everis;
import java.util.List;

public class Director extends Pessoa {

	private String ProductionCompany;
	private List<String> filmografia;
	/**
	 * 
	 */
	public Director() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param nome
	 * @param sobrenome
	 * @param idade
	 */
	public Director(String nome, String sobrenome, int idade) {
		super(nome, sobrenome, idade);
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the productionCompany
	 */
	public String getProductionCompany() {
		return ProductionCompany;
	}
	/**
	 * @param productionCompany the productionCompany to set
	 */
	public void setProductionCompany(String productionCompany) {
		ProductionCompany = productionCompany;
	}
	/**
	 * @return the filmografia
	 */
	public List<String> getFilmografia() {
		return filmografia;
	}
	/**
	 * @param filmografia the filmografia to set
	 */
	public void setFilmografia(List<String> filmografia) {
		this.filmografia = filmografia;
	}
	
	
	

}
