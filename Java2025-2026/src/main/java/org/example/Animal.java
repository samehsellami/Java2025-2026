package org.example;

public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    public void afficherAnimal() {
        System.out.println("Animal :");
        System.out.println("- Famille : " + family);
        System.out.println("- Nom : " + name);
        System.out.println("- Âge : " + age + " ans");
        System.out.println("- Est un mammifère : " + (isMammal ? "Oui" : "Non"));
    }

    @Override
    public String toString() {
        return "Animal{" + "famille='" + family  + ", nom='" + name + ", âge=" + age + ", mammifère=" + (isMammal ? "oui" : "non") + '}';
    }
}
