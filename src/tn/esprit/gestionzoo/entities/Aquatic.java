package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.entities.Food;


public class Aquatic extends Animal implements Carnivore<Food> {
    String habitat;
    public Aquatic() {}

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;}

    public String getHabitat() {
        return habitat;}
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println(getName() + " yekel f meat");
        } else {
            System.out.println(getName() + " yekelch food");
        }
    }
}

