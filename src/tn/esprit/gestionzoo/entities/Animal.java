package tn.esprit.gestionzoo.entities;

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

    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setFamily(String family) {this.family = family;}

    public void setName(String name) {
        this.name = name;
    }

    public void afficherAnimal() {System.out.println("aimal : " + this);
    }

    @Override
    public String toString() {
        return "Animal{" + "famille='" + family  + ", nom='" + name  + ", âge=" + age + ", mammifère=" + (isMammal ? "oui" : "non") + '}';
    }
}


