package com.everis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
//        oscarnomlist.add
        Integer[] array = new Integer[] {1,2,3};
        Actor a = new Actor("a","b", 18,new ArrayList<Integer>(Arrays.asList(array)),TipoActor.MAIN);
    }
}
