package dz.Biskra.Info.exo1;

import java.util.ArrayList;
import java.util.List;

public class Departement {
    private String specialite;
    private String adresse;
    private List<Etudiant> etudiantsInscrits;

    // Constructeur
    public Departement(String specialite, String adresse) {
        this.specialite = specialite;
        this.adresse = adresse;
        this.etudiantsInscrits = new ArrayList<>();
    }

    // Méthode toString pour afficher la liste des étudiants
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Département ").append(specialite).append(" à ").append(adresse).append("\nÉtudiants inscrits :\n");
        for (Etudiant etudiant : etudiantsInscrits) {
            sb.append(etudiant).append("\n");
        }
        return sb.toString();
    }
    // Ajouter un étudiant
    public void inscrire(Etudiant etudiant) {
        etudiantsInscrits.add(etudiant);
    }

    // Désinscrire un étudiant
    public void desinscrire(Etudiant etudiant) {
        etudiantsInscrits.remove(etudiant);
    }
}
