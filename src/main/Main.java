package main;

public class Main {
    public static void main(String[] args) {

        SocieteArrayList societe = new SocieteArrayList();

        Employe e1 = new Employe(125,"rym","ben hmida","IT",5);
        Employe e2 = new Employe(2,"layla","fouleniya","HR",2);
        Employe e3 = new Employe(3,"Aziz","fouleni","IT",1);

        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);

        System.out.println("---------------Affichage des emps------------------");
        societe.displayEmploye();

        System.out.println("---------------recherche des emps------------------");
        societe.rechercherEmploye("rym");
        societe.rechercherEmploye(e2);

        System.out.println("---------------tri des emps------------------");
        societe.trierEmployeParId();
        System.out.println("---------------tri des emps par nom dep---------------");
        societe.trierEmployeParNomDépartementEtGrade();

        System.out.println("---------------suppression emp---------------");
        societe.supprimerEmploye(e2);
        societe.displayEmploye();

        //Department part

        DepartementHashSet  departements = new DepartementHashSet();

        Departement dep1=new Departement(1,"Web",15);
        Departement dep2=new Departement(2,"Finance",20);
        Departement dep3=new Departement(3,"IT",30);

        departements.ajouterDepartement(dep1);
        departements.ajouterDepartement(dep2);
        departements.ajouterDepartement(dep3);

        System.out.println("--------------Affichage des departements--------------");
        departements.displayDepartement();

        System.out.println("---------------Recherche des departements--------------");
        departements.rechercherDepartement("Web");
        departements.rechercherDepartement(dep3);

        System.out.println("---------------Tri des departements--------------");
        System.out.println(departements.trierDepartementById());

        System.out.println("---------------Supprimer departement-----------------");
        departements.supprimerDepartement(dep1);
        departements.displayDepartement();

}
}
