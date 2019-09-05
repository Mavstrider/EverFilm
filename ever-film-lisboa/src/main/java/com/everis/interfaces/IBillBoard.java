/**
 * 
 */
package com.everis.interfaces;

import com.everis.Filme;

/**
 * @author Eusebio
 *
 */
public interface IBillBoard {
	public String toString();
	public Filme getBestFilm();
	public Boolean addFilm(Filme film);
	public Filme removeOldFilm();
	
}
