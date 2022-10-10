package test;

import metier.Client;
import metier.Console;
import metier.Hybride;
import metier.Boutique;
import metier.Jeu;


public class Test {

	public static void main(String[] args) {

	
		
		Client cl1 = new Client("Pikachu","Ketchum");
		Client cl2 = new Client("Link","Cartoon");
		

		
		
		Hybride c1 = new Hybride ("Switch");
		Hybride c2 = new Hybride ("Ps2");
		Hybride c3 = new Hybride ("Ps1");
		Hybride c4 = new Hybride ("Ps3");
		Hybride c5 = new Hybride ("Ps4");
		
		Boutique b1 = new Boutique("la boutique", "5 rue des alouettes");
		
		
		Jeu j1 = new Jeu ("Le retour de la raclette", c1, b1);
		Jeu j2 = new Jeu ("Le retour de l'hivert", c1, b1);
		Jeu j3 = new Jeu ("Le retour du vin chaud", c1, b1);
		Jeu j4 = new Jeu ("Le retour de la crève", c1, b1);
		Jeu j5 = new Jeu ("Le retour des vagues", c1, b1) ;


		
		
		
		// TODO Auto-generated method stub

>>>>>>> main
	}

}
