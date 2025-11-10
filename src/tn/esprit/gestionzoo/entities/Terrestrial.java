package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.entities.Food;


public class Terrestrial extends Animal implements Omnivore<Food> {
    int nbrLegs;
    public Terrestrial() {}
    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;}

    public int getNbrLegs() {
        return nbrLegs;}

    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;}
    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println(getName() + " is eating meat.");} else {
            System.out.println(getName() + " cannot eat meat.");}}

    @Override
    public void eatPlant(Food plant) {
        if (plant == Food.PLANT || plant == Food.BOTH) {
            System.out.println(getName() + " is eating plants.");
        } else {
            System.out.println(getName() + " cannot eat plants.");}}

    @Override
    public void eatPlantAndMeet(Food food) {
        if (food == Food.BOTH) {
            System.out.println(getName() + " YEKEL plants and meat");
        } else if (food == Food.MEAT) {
            eatMeat(food);
        } else if (food == Food.PLANT) {
            eatPlant(food);
        } else {
            System.out.println(getName() + " cmayekelch this food.");}}
}


