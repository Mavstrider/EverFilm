/**
 * 
 */
package com.everis;

import java.util.ArrayList;
import java.util.List;

import com.everis.interfaces.IBillBoard;

/**
 * @author Eusebio
 *
 */
public class BillBoard implements IBillBoard {

	

	public List<Filme> filmBillBoard;//inicializa;
	

	/**
	 * 
	 */
	public BillBoard() {
		super();
		filmBillBoard= new ArrayList<Filme>();
	}

	/**
	 * @param filmBillBoard
	 */
	public BillBoard(List<Filme> filmBillBoard) {
		super();
		this.filmBillBoard = filmBillBoard;
	}

	/**
	 * @return the filmBillBoard
	 */
	public List<Filme> getFilmBillBoard() {
		return filmBillBoard;
	}
	
	public String toString() {
		return null;
		
	}


	public Filme getBestFilm() {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean addFilm(Filme film) {
		// TODO Auto-generated method stub
		return false;
	}

	public Filme removeOldFilm() {
		// TODO Auto-generated method stub
		return null;//Filme;
	}
	
	
}
