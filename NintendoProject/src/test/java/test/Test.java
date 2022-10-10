package test;

<<<<<<< Updated upstream
<<<<<<< HEAD
import metier.Client;
=======
import metier.Console;
>>>>>>> main
=======
import metier.Boutique;
import metier.Console;
import metier.Jeu;
>>>>>>> Stashed changes

public class Test {

	public static void main(String[] args) {
<<<<<<< HEAD
	
		
		Client c1 = new Client("Pikachu","Ketchum");
		Client c2 = new Client("Link","Cartoon");
		
		
		
=======
		
		
		Console c1 = new Console ("Switch");
		Console c2 = new Console ("Ps2");
		Console c3 = new Console ("Ps1");
		Console c4 = new Console ("Ps3");
		Console c5 = new Console ("Ps4");
		
		Boutique b1 = new Boutique("la boutique", "5 rue des alouettes");
		
		
		Jeu j1 = new Jeu ("Le retour de la raclette", c1, b1);
		Jeu j2 = new Jeu ("Le retour de l'hivert", c1, b1);
		Jeu j3 = new Jeu ("Le retour du vin chaud", c1, b1);
		Jeu j4 = new Jeu ("Le retour de la crève", c1, b1);
		Jeu j5 = new Jeu ("Le retour des vagues", c1, b1);


		
		
		
		// TODO Auto-generated method stub

>>>>>>> main
	}

}
