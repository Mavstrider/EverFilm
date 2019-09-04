package com.everis;
import java.util.ArrayList;
import java.util.List;

public class Actor extends Pessoa {

	private List<Integer> oscarNominations;
	private TipoActor eactor; 
	public Actor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Actor(String nome, String sobrenome, int idade,List<Integer> oscarn,TipoActor eactor) {
		super(nome, sobrenome, idade);
		 this.oscarNominations = new ArrayList<Integer>(oscarn);
		 this.eactor=eactor;
		
		// TODO Auto-generated constructor stub
	}
	

	
	public void addOscarNominations(int oscarNom) {
        oscarNominations.add(oscarNom);
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
	public void setOscarNominations(ArrayList<Integer> oscarNominations) {
		this.oscarNominations =  oscarNominations;
	}
	
	/**
	 * @return the eactor
	 */
	public TipoActor getEactor() {
		return eactor;
	}

	/**
	 * @param eactor the eactor to set
	 */
	public void setEactor(TipoActor eactor) {
		this.eactor = eactor;
	}

	

}
