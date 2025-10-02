package org.example;

public class Zoo {
    Animal[] animals = new Animal[25];
    String name;
    String city;
    int nbrCages;

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }

    public void afficherZoo() {
        System.out.println("Zoo : " + name);
        System.out.println("Ville : " + city);
        System.out.println("Nombre de cages : " + nbrCages);
        System.out.println("Animaux présents :");
        for (Animal animal : animals) {
            if (animal != null) {
                System.out.println("- " + animal.name + " (" + animal.family + ")");
            }
        }
    }

    @Override
    public String toString() {
        return "Zoo{" + "nom='" + name +   ", ville='" + city +   ", nombre de cages=" + nbrCages + '}';
    }
}
