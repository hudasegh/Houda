package dz.Biskra.Info.exo2;

import java.time.LocalDate;
import java.util.List;

public class EtudiantTelescopique {
	 private String nom;
	    private String prenom;
	    private LocalDate dateNaissance;
	    private String adresseMail;
	    private String adressePostale;
		private List<Note>notes;
	    private  double totaleCoefetion;
	    private  double doubleTotale;
	    private double totale;
	    
	    public EtudiantTelescopique(String nom, String prenom, LocalDate dateNaissance) {
			super();
			this.nom = nom;
			this.prenom = prenom;
			this.dateNaissance = dateNaissance;
		}

		public EtudiantTelescopique(String nom, String prenom) {
			super();
			this.nom = nom;
			this.prenom = prenom;
		}

		public EtudiantTelescopique(String nom, String prenom, String adresseMail) {
			super();
			this.nom = nom;
			this.prenom = prenom;
			this.adresseMail = adresseMail;
		}

		public String getNom() {
			return nom;
		}

		public String getPrenom() {
			return prenom;
		}

		public LocalDate getDateNaissance() {
			return dateNaissance;
		}

		public String getAdresseMail() {
			return adresseMail;
		}
		
}
