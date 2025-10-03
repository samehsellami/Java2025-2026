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
        System.out.println("Animal : " + this);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "famille='" + family + '\'' +
                ", nom='" + name + '\'' +
                ", âge=" + age +
                ", mammifère=" + (isMammal ? "oui" : "non") +
                '}';
    }
}
