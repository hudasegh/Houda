package dz.Biskra.Info.exo1;

import java.time.LocalDate;
import java.time.Month;

import dz.Biskra.Info.exo2.EtudiantTelescopique;

public class GestionEtudiants {
    public static void main(String[] args) {
        Etudiant lolo = new Etudiant("Lolo", "Dupont", LocalDate.of(2000, Month.JANUARY, 15), "lolo@example.com", "123 Rue des Fleurs");
        System.out.println(lolo); // Affiche les informations de l'étudiant

        Etudiant toto = new Etudiant("Lolo", "Dupont", LocalDate.of(2000, Month.JANUARY, 15), "lolo@example.com", "123 Rue des Fleurs");
        System.out.println("lolo == toto : " + (lolo == toto)); // Faux car deux objets différents

        toto = lolo;
        toto.setNom("Toto");
        System.out.println("Après modification, lolo : " + lolo); // La modification de toto affecte lolo
        
        EtudiantTelescopique etudiant1=new EtudiantTelescopique("A", "B");
        EtudiantTelescopique etudiant2=new EtudiantTelescopique("E", "G","2003");
        EtudiantTelescopique etudiant3=new EtudiantTelescopique("E", "G","seghirouhuda@gmail.com");
        
        System.out.println("Etudiant1:"+ etudiant1.getNom() +","+etudiant1.getPrenom());
        System.out.println("Etudiant2:"+ etudiant2.getNom() +","+etudiant2.getPrenom()+","+etudiant2.getDateNaissance());
        System.out.println("Etudiant3:"+ etudiant3.getNom() +","+etudiant3.getPrenom()+","+etudiant3.getAdresseMail());



        

    }
}
