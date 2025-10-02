package org.example;

public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal("Anas", "Lion", 6, true);
        Zoo myZoo = new Zoo("belevdere", "tunis", 16);

        myZoo.animals[0] = lion;

        System.out.println(myZoo);
        System.out.println(lion);
    }
}
