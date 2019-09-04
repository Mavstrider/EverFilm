package com.everis;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class Main {
    public static void main(String[] args) {
        // Add your run execution here
    	Pessoa p = new Pessoa("Joao","Eusebio",99);
        System.out.println(p.getNome()+p.getSobrenome()+p.getIdade());
        /*actor
         * super(nome, sobrenome, idade);
		 this.oscarNominations = new ArrayList<Integer>(oscarn);
		 this.eactor=eactor;
         */
//      actor
        ArrayList<Integer>oscarnomlist= new ArrayList<Integer>();
        oscarnomlist.add(1981);
        oscarnomlist.add(1982);
        oscarnomlist.add(1983);
        oscarnomlist.add(1984);
        Actor a = new Actor("a","b", 18,oscarnomlist,TipoActor.MAIN);
        System.out.println(a.getNome()+a.getSobrenome()+a.getIdade()+a.getOscarNominations()+a.getEactor());
/*Director
 * super(nome, sobrenome, idade);
 * 	*this.productionCompany=productionCompany;
 *   this.filmografia = new ArrayList<String>();
 */
       
        ArrayList<String>list= new ArrayList<String>();
        list.add("abc");
        list.add("bcd");
        list.add("cde");
        list.add("def");
        Director d = new Director("d","e", 68,"Univel",list);
        System.out.println(d.getNome()+d.getSobrenome()+d.getIdade()+d.getProductionCompany()+d.getFilmografia());
    }
}
