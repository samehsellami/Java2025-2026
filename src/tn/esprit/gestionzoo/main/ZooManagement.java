package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

import java.util.Scanner;

public class ZooManagement {

    int nbrCages;
    String zooName;

    public void afficherInfo() {
        System.out.println(zooName + " comporte " + nbrCages + " cages.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ZooManagement zooMgmt = new ZooManagement();

        System.out.print("donner le nom du zoo : ");
        zooMgmt.zooName = scanner.nextLine();
        while (zooMgmt.zooName.trim().isEmpty()) {
            System.out.println("nom ne doit pas etre vide.");
            System.out.print("donner nom du zoo : ");
            zooMgmt.zooName = scanner.nextLine();
        }

        System.out.print("donner le nombre de cages : ");
        zooMgmt.nbrCages = scanner.nextInt();
        while (zooMgmt.nbrCages <= 0) {
            System.out.println("donner: le nombre doit être positif.");
            System.out.print("donner le nombre de cages : ");
            zooMgmt.nbrCages = scanner.nextInt();
        }

        zooMgmt.afficherInfo();

        Zoo zoo1 = new Zoo("Belvédère", "tunis");
        Zoo zoo2 = new Zoo("Friguia", "hammamet");

        Animal lion = new Animal("Anas", "Lion", 6, true);
        Animal tigre = new Animal("simba", "Tigre", 4, true);
        Animal elephant = new Animal("mammifere", "Rym", 10, true);

        zoo1.addAnimal(lion);
        zoo1.addAnimal(tigre);
        zoo1.addAnimal(elephant);
        zoo1.addAnimal(lion);

        zoo1.afficherAnimaux();

        System.out.println("indice tigre : " + zoo1.searchAnimal("tigre"));
        System.out.println("indice singe : " + zoo1.searchAnimal("singe"));

        System.out.println("suppression tigre : " + zoo1.removeAnimal("tigre"));
        zoo1.afficherAnimaux();

        zoo2.addAnimal(new Animal("oiseau", "canarii", 2, false));
        Zoo plusGrandZoo = Zoo.comparerZoos(zoo1, zoo2);
        System.out.println("le zoo le plus rempli est : " + plusGrandZoo.getName());

        scanner.close();
    }
}
