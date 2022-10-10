package metier;

import java.time.LocalDate;

public class Achat {
	
	private String jeux;
	private LocalDate date;
	private int prix;
	
	public Achat (String jeux, LocalDate date, int prix) {
		this.jeux = jeux;
		this.date = date;
		this.prix = prix;
}

	public String getJeux() {
		return jeux;
	}

	public void setJeux(String jeux) {
		this.jeux = jeux;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "Achat [jeux=" + jeux + ", date=" + date + ", prix=" + prix + "]";
	}
}