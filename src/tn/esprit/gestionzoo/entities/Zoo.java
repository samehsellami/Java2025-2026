package tn.esprit.gestionzoo.entities;

public class Zoo {
    public static final int MAX_CAGES = 3; // tbadlet 3
    private Animal[] animals = new Animal[MAX_CAGES];
    private String name;
    private String city;
    private int nbrAnimals;

    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.nbrAnimals = 0;
    }
    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    public boolean isZooFull() {
        return nbrAnimals >= MAX_CAGES;
    }

    //public void addAnimal(Animal animal) {
        //try {if (animal == null) {
                //throw new Exception("animal ne peut pas etre nul ");}
            //if (nbrAnimals >= MAX_CAGES) {
                //throw new Exception("zoo plein ");}
            //animals[nbrAnimals] = animal;
            //nbrAnimals++;
            //System.out.println(animal.name + " ajoute avec succees");} catch (Exception e) {
            //System.out.println("erreur : " + e.getMessage());}}

    //public void addAnimal(Animal animal) throws ZooFullException {
        //if (nbrAnimals >= MAX_CAGES) {throw new ZooFullException("zoo plein " + animal.name);}
        //animals[nbrAnimals] = animal;
    //nbrAnimals++;
        //System.out.println(animal.name + "ajoute avec succees");}

    public void addAnimal(Animal animal) throws ZooFullException, InvalidAgeException {
        if (animal.age < 0) {
            throw new InvalidAgeException("age invalide" + animal.name + " !");}
        if (nbrAnimals >= MAX_CAGES) {
            throw new ZooFullException("zoo plein " + animal.name);}
        animals[nbrAnimals] = animal;
        nbrAnimals++;
        System.out.println(animal.name + " ajoute avec succees !");}

    public void afficherAnimaux() {
        System.out.println("animaux dans le zoo " + name + " (" + city + ") :");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println("- " + animals[i].name + " (" + animals[i].family + ")");
        }
    }

    public int searchAnimal(String nom) {
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i].name.equalsIgnoreCase(nom)) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(String nom) {
        int index = searchAnimal(nom);
        if (index == -1) {
            return false;
        }
        for (int i = index; i < nbrAnimals - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[nbrAnimals - 1] = null;
        nbrAnimals--;
        return true;
    }

    public boolean isFull() {
        return nbrAnimals >= MAX_CAGES;
    }

    public static Zoo comparerZoos(Zoo z1, Zoo z2) {
        return (z1.nbrAnimals >= z2.nbrAnimals) ? z1 : z2;
    }

    @Override
    public String toString() {
        return "Zoo{" + "nom='" + name  + ", ville='" + city  + ", nombre d'animaux=" + nbrAnimals + ", capacité=" + MAX_CAGES + '}';
    }
}
