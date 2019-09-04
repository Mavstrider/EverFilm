/**
 * 
 */
package com.everis;

import java.util.List;

import com.everis.interfaces.IFilme;

/**
 * @author admin
 *
 */
public class Filme implements IFilme {
	
	private String title;
	private int year;
	private int quality; 
	private Director director;
	private List<Actor>cast;
	private enum  filmType{
		Comedy, Thriller, Cartoon,Drama;
		 }
	
	
	/**
	 * @param title
	 * @param year
	 * @param quality
	 * @param director
	 * @param cast
	 */
	public Filme(String title, int year, int quality, Director director, List<Actor> cast) {
		super();
		this.title = title;
		this.year = year;
		this.quality = quality;
		this.director = director;
		this.cast = cast;
	}
	
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * @return the quality
	 */
	public int getQuality() {
		return quality;
	}

	/**
	 * @param quality the quality to set
	 */
	public void setQuality(int quality) {
		this.quality = quality;
	}

	/**
	 * @return the director
	 */
	public Director getDirector() {
		return director;
	}

	/**
	 * @param director the director to set
	 */
	public void setDirector(Director director) {
		this.director = director;
	}

	/**
	 * @return the cast
	 */
	public List<Actor> getCast() {
		return cast;
	}

	/**
	 * @param cast the cast to set
	 */
	public void setCast(List<Actor> cast) {
		this.cast = cast;
	}
	
	
	
	public String toString() {
	 return title+ ", "+year +". "+ getQualityString(); 	
	}

	public String getQualityString() {
	 
	String valorqual="";
		
		switch(quality) {
		case 0:
		case 1:
		case 2:
			valorqual="ReallyBad";
			break;
		case 3:
		case 4:
			valorqual="Bad";
			break;
		case 5:
		case 6:
			valorqual= "Normal";
			break;
		case 7:
		case 8:
			valorqual= "Good";
			break;
		case 9:
		case 10:
			valorqual= "Very Good";
			break;
		default:
			valorqual= "Value not Valid";
			break;
		}
		return valorqual;
	}

	
}
	
	

