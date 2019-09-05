package com.everis.interfaces;

import com.everis.NoRatedFilmException;

public interface IUsuario {
	
	public Double getAverageRating() throws NoRatedFilmException;
}
