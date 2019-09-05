package com.everis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.everis.interfaces.IUsuario;

public class User extends Pessoa implements IUsuario {

	private Map <Filme, Integer> ratings;
	private List <Filme>watchedFilms;
	private String username;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String nome, String sobrenome, int idade,HashMap<Filme,Integer> ratings,ArrayList<Filme> watchedFilms, String username) {
		super(nome, sobrenome, idade);
		this.ratings=new HashMap<Filme, Integer>();
		this.watchedFilms = watchedFilms;
		this.username = username;
		// TODO Auto-generated constructor stub
	}






	public Map<Filme, Integer> getRatings() {
		return ratings;
	}

	public void setRatings(Map<Filme, Integer> ratings) {
		this.ratings = ratings;
	}

	public List<Filme> getWatchedFilms() {
		return watchedFilms;
	}

	public void setWatchedFilms(List<Filme> watchedFilms) {
		this.watchedFilms = watchedFilms;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Double getAverageRating() throws NoRatedFilmException {


		double averageRating = 0;
		if (ratings != null && !ratings.isEmpty()) {
			int entradas = ratings.size();
			double soma = 0;
			for (Integer value : ratings.values()) {
				soma = soma + value;
			}

			averageRating = soma / entradas;

		} else {
			throw new NoRatedFilmException("No hay ratings");

		}
		return averageRating;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [ratings=" + ratings + ", watchedFilms=" + watchedFilms + ", username=" + username + ", getNome()="
				+ getNome() + ", getSobrenome()=" + getSobrenome() + ", getIdade()=" + getIdade() + "]";
	}
	
	
}




