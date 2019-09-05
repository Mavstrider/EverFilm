package com.everis;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class Main {
	public static void main(String[] args) {
		// Add your run execution here
		Pessoa p = new Pessoa("Joao", "Eusebio", 99);
		System.out.println(p.getNome() + p.getSobrenome() + p.getIdade());
		/*
		 * actor super(nome, sobrenome, idade); this.oscarNominations = new
		 * ArrayList<Integer>(oscarn); this.eactor=eactor;
		 */
//      actor
		ArrayList<Integer> oscarnomlist = new ArrayList<Integer>();
		oscarnomlist.add(1981);
		oscarnomlist.add(1982);
		oscarnomlist.add(1983);
		oscarnomlist.add(1984);
		
		ArrayList<Integer> oscarnomlist1 = new ArrayList<Integer>();
		oscarnomlist1.add(1991);
		oscarnomlist1.add(1992);
		oscarnomlist1.add(1933);
		
		
		ArrayList<Integer> oscarnomlist2 = new ArrayList<Integer>();
		oscarnomlist2.add(1984);
		oscarnomlist2.add(1985);
		
		
		ArrayList<Integer> oscarnomlist3 = new ArrayList<Integer>();
		oscarnomlist3.add(1981);
		oscarnomlist3.add(1985);
		oscarnomlist3.add(1987);
		oscarnomlist3.add(1990);
		oscarnomlist3.add(1991);
		oscarnomlist3.add(1992);
		
		ArrayList<Integer> oscarnomlist4 = new ArrayList<Integer>();
		oscarnomlist4.add(2007);
	
		Actor a = new Actor("a", "b", 18,oscarnomlist, TipoActor.MAIN);
		Actor a1 = new Actor("b", "c", 19, oscarnomlist1, TipoActor.STUNTMAN);
		Actor a2 = new Actor("d", "e", 20, oscarnomlist2, TipoActor.SUPPORTING);
		Actor a3 = new Actor("e", "f", 21, oscarnomlist3, TipoActor.SUPPORTING);
		Actor aa = new Actor("g", "h", 22, oscarnomlist4, TipoActor.STUNTMAN);
		
		//Actor.forEach(item->System.out.println(item));
		System.out.println(a.getNome() + a.getSobrenome() + a.getIdade() + a.getOscarNominations() + a.getEactor());
		System.out.println("----"+a);
		System.out.println("----"+a1);
		System.out.println("----"+a2);
		System.out.println("----"+a3);
		System.out.println("----"+aa);
		
		/*
		 * Director super(nome, sobrenome, idade);
		 * *this.productionCompany=productionCompany; this.filmografia = new
		 * ArrayList<String>();
		 */

		ArrayList<String> list = new ArrayList<String>();
		list.add("abc");
		list.add("bcd");
		list.add("cde");
		list.add("def");
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("a");
		list1.add("b");
		list1.add("c");
		list1.add("f");
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("g");
		list2.add("h");
		list2.add("i");
		list2.add("j");
		
		Director d = new Director("d", "e", 68, "Univel", list);
		Director ef = new Director("ef", "gh", 68, "Paramount", list1);
		Director gh = new Director("ij", "kl", 68, "Univel", list2);
		
		System.out.println(d.getNome() + d.getSobrenome() + d.getIdade() + d.getProductionCompany()
		+ d.getFilmografia().toString());
		System.out.println("----"+d);
		System.out.println("----"+ef);
		System.out.println("----"+ef);
		
		
		
		/*
		 * Director
		 */
		ArrayList<Actor> cast = new ArrayList<Actor>();
		cast.add(a);
		cast.add(a1);
		Filme film = new Filme("Juio", 1992, 10, d, cast);
		film.setFilmType(FilmType.COMEDY);
		System.out.println(film);
		
		
		ArrayList<Filme> films = new ArrayList<Filme>();
	//	list.add(new Filme("nnn",1993,12,d,cast),);
	}
}
