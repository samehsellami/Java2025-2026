package entities;

iimport AffectationHashMap;
import Departement;
import entities.DepartementHashSet;
import entities.Employe;
import entities.SocieteArrayList;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        SocieteArrayList societe = new SocieteArrayList();

        Employe e1 = new Employe(125, "rym", "ben hmida", "IT", 5);
        Employe e2 = new Employe(2, "layla", "fouleniya", "HR", 2);
        Employe e3 = new Employe(3, "Aziz", "fouleni", "IT", 1);

        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);

        System.out.println("--------------- Affichage des employés ------------------");
        societe.displayEmploye();

        System.out.println("--------------- Recherche employés ------------------");
        societe.rechercherEmploye("rym");
        societe.rechercherEmploye(e2);

        System.out.println("--------------- Tri par ID ------------------");
        societe.trierEmployeParId();

        System.out.println("--------------- Tri par nom, département, grade ------------------");
        societe.trierEmployeParNomDépartementEtGrade();

        System.out.println("--------------- Suppression employé ------------------");
        societe.supprimerEmploye(e2);
        societe.displayEmploye();


        DepartementHashSet departements = new DepartementHashSet();

        Departement dep1 = new Departement(1, "Web", 15);
        Departement dep2 = new Departement(2, "HR", 20);
        Departement dep3 = new Departement(3, "IT", 30);

        departements.ajouterDepartement(dep1);
        departements.ajouterDepartement(dep2);
        departements.ajouterDepartement(dep3);

        System.out.println("-------------- Affichage des départements --------------");
        departements.displayDepartement();

        System.out.println("--------------- Recherche des départements --------------");
        departements.rechercherDepartement("Web");
        departements.rechercherDepartement(dep3);

        System.out.println("--------------- Tri des départements --------------");
        System.out.println(departements.trierDepartementById());

        System.out.println("--------------- Suppression département -----------------");
        departements.supprimerDepartement(dep1);
        departements.displayDepartement();


        AffectationHashMap map = new AffectationHashMap();

        map.ajouterAffectation(e1, dep3);
        map.ajouterAffectation(e2, dep2);
        map.ajouterAffectation(e3, dep3);

        System.out.println("\n--- Employés affectés ---");
        map.afficherEmployes();

        System.out.println("\n--- Recherche département IT ---");
        boolean exists = map.rechercherDepartement(dep3);
        System.out.println("Existe ? " + exists);

        System.out.println("\n--- Map triée par ID d'employé ---");
        TreeMap<Employe, Departement> mapTriee = map.trierMap();
        for (Map.Entry<Employe, Departement> entry : mapTriee.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
 }
}
