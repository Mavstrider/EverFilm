package com.everis;
import java.util.ArrayList;
import java.util.List;

public class Director extends Pessoa {

	private String productionCompany;
	private List<String> filmografia;
	/**
	 * 
	 */
	public Director() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Director(String nome, String sobrenome, int idade, String productionCompany,ArrayList<String> filmografia) {
		super(nome, sobrenome, idade);
		this.productionCompany=productionCompany;
		 this.filmografia = new ArrayList<String>();
		// TODO Auto-generated constructor stub
	}
	
	public void addfilmografia(String filmogr ) {
        filmografia.add(filmogr);
    }
	/**
	 * @return the productionCompany
	 */
	public String getProductionCompany() {
		return productionCompany;
	}
	/**
	 * @param productionCompany the productionCompany to set
	 */
	public void setProductionCompany(String productionComp) {
		productionCompany = productionComp;
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
