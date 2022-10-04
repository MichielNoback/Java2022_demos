package nl.bioinf.nomi.entities;

import java.util.Objects;

public class Person implements Walkable{
    private String name;
    private int age;

    @Override
    public void walk() {
        System.out.println("A human walking");
    }

    public static record Address (String street, int number) {
        public String printableAddress() {
            return this.street() + " " + this.number();
         }
    }
}
