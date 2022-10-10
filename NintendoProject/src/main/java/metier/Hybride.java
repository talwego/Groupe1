package metier;

import java.time.LocalDate;

public class Hybride extends Console{

	public Hybride(String nom, int prix, LocalDate sortie) {
		super(nom, prix, sortie);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Hybride [nom=" + nom + ", prix=" + prix + ", sortie=" + sortie + "]";
	}
}
