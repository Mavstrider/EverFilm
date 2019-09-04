package com.everis;
import java.util.List;

public class Actor extends Pessoa {

	private List<Integer> oscarNominations;
	//private 
	public Actor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Actor(String nome, String sobrenome, int idade) {
		super(nome, sobrenome, idade);
		 this.oscarNominations = new List<Integer>();
		
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the oscarNominations
	 */
	public List<Integer> getOscarNominations() {
		return oscarNominations;
	}

	/**
	 * @param oscarNominations the oscarNominations to set
	 */
	public void setOscarNominations(List<Integer> oscarNominations) {
		this.oscarNominations = oscarNominations;
	}

	
	

}
