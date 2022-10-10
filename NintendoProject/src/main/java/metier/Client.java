package metier;

public abstract class Client {
	

	protected String prenom;
	protected String nom;
	
	
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


