package dz.Biskra.Info.exo1;

import java.time.LocalDate;
import java.util.List;

import dz.Biskra.Info.exo2.Matiere;
import dz.Biskra.Info.exo2.Note;

public class Etudiant {
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;
    private String adresseMail;
    private String adressePostale;
    private List<Note>notes;
    private  double totaleCoefetion;
    private  double doubleTotale;
    private double totale;
 /*   public Etudiant(String nom) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.adresseMail = adresseMail;
        this.adressePostale = adressePostale;
    }
*/
    public Etudiant(String nom, String prenom, LocalDate dateNaissance, String adresseMail, String adressePostale) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.adresseMail = adresseMail;
		this.adressePostale = adressePostale;
	}

	@Override
    public String toString() {
        return "Etudiant{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dateNaissance=" + dateNaissance +
                ", adresseMail='" + adresseMail + '\'' +
                ", adressePostale='" + adressePostale + '\'' +
                '}';
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public void noter(Matiere matiere,double valeur) {
    	this.notes.add(new Note(matiere,valeur));
    	
    	
    }
    public double calculermoyenne() {
    	doubleTotale=0;
    	totaleCoefetion=0;
    	for(Note note:notes) {
    		totale+= note.getValeur()* note.getCoefficient();
    	}
		return 0;
    	
    }

	public List<Note> getNotes() {
		return notes;
	}
}
