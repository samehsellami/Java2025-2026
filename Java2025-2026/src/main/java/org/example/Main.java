package org.example;

public class Main {
    public static void main(String[] args) {
        Zoo zoo1 = new Zoo("Belvédère", "Tunis");
        Zoo zoo2 = new Zoo("Friguia", "Hammamet");

            Animal lion = new Animal("Anas", "Lion", 6, true);
        Animal tigre = new Animal("simba", "Tigre", 4, true);
        Animal elephant = new Animal("Mammifère", "Rym", 10, true);

        zoo1.addAnimal(lion);
        zoo1.addAnimal(tigre);
        zoo1.addAnimal(elephant);

        zoo1.addAnimal(lion);

        zoo1.afficherAnimaux();

        System.out.println("Indice du Tigre : " + zoo1.searchAnimal("Tigre"));
        System.out.println("Indice du Singe : " + zoo1.searchAnimal("Singe"));

        System.out.println("Suppression du Tigre : " + zoo1.removeAnimal("Tigre"));
        zoo1.afficherAnimaux();

        zoo2.addAnimal(new Animal("oiseau", "canarii", 2, false));
        Zoo plusGrandZoo = Zoo.comparerZoos(zoo1, zoo2);
        System.out.println("Le zoo le plus rempli est : " + plusGrandZoo);
    }
}
