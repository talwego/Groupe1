package test;


import java.time.LocalDate;

import metier.Boutique;

import metier.Client;

import metier.Client;

import metier.Console;
import metier.Hybride;
import metier.Boutique;
import metier.Jeu;


public class Test {

	public static void main(String[] args) {

	
		
		Client cl1 = new Client("Pikachu","Ketchum");
		Client cl2 = new Client("Link","Cartoon");
		

		
		
		Hybride c1 = new Hybride ("Switch", 222, LocalDate.of(2022,7,7));
	
		
		Boutique b1 = new Boutique("la boutique", "5 rue des alouettes");
		
		
		Jeu j1 = new Jeu ("Le retour de la raclette", c1, b1);
		Jeu j2 = new Jeu ("Le retour de l'hiver", c1, b1);
		Jeu j3 = new Jeu ("Le retour du vin chaud", c1, b1);
		Jeu j4 = new Jeu ("Le retour de la crève", c1, b1);
		Jeu j5 = new Jeu ("Le retour des vagues", c1, b1) ;


		
		
		
		Boutique b2 = new Boutique("Escromania","30 rue de la Paix");
		
		// TODO Auto-generated method stub


	}

}
