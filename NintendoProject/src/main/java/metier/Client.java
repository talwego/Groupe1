package metier;

public class Client {
	private String prenom;
	private String nom;
	
	public Client(String prenom, String nom) {
		super();
		this.prenom = prenom;
		this.nom = nom;
	}
	
	
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

}


