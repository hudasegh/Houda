package dz.Biskra.Info.exo2;

public class Note {
	
	  private Matiere matiere;
	   private double valeur;
	public Note(Matiere matiere, double valeur) {
		super();
		this.matiere = matiere;
		this.valeur = valeur;
	}
	public Matiere getMatiere() {
		return matiere;
	}
	public double getValeur() {
		return valeur;
	}
	public int getCoefficient() {
		// TODO Auto-generated method stub
		return 0;
	}


	
}
