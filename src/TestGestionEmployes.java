public class TestGestionEmployes {
    public static void main(String[] args) {

        SocieteArrayList societe = new SocieteArrayList();


        Employe emp1 = new Employe(1, "Ben Ali", "Mohamed", "Informatique", 3);
        Employe emp2 = new Employe(2, "Trabelsi", "Fatma", "Ressources Humaines", 2);
        Employe emp3 = new Employe(3, "Sassi", "Ahmed", "Informatique", 1);
        Employe emp4 = new Employe(4, "Mansouri", "Leila", "Finance", 4);

        societe.ajouterEmploye(emp1);
        societe.ajouterEmploye(emp2);
        societe.ajouterEmploye(emp3);
        societe.ajouterEmploye(emp4);


        System.out.println("Liste initiale des employés:");
        societe.afficherEmployes();


        System.out.println("Recherche de l'employé 'Ben Ali': " + societe.rechercherEmploye("Ben Ali"));
        System.out.println("Recherche de l'employé emp1: " + societe.rechercherEmploye(emp1));


        System.out.println("\nTri par ID:");
        societe.trierEmployeParId();
        societe.afficherEmployes();


        System.out.println("\nTri par département et grade:");
        societe.trierEmployeParNomDepartementEtGrade();
        societe.afficherEmployes();
        System.out.println("\nSuppression de l'employé emp2:");
        societe.supprimerEmploye(emp2);
        societe.afficherEmployes();


        Employe empTest = new Employe(1, "Ben Ali", "Mohamed", "Informatique", 3);
        System.out.println("Test d'égalité entre emp1 et empTest: " + emp1.equals(empTest));
    }
}