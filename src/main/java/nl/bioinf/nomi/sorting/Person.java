package nl.bioinf.nomi.sorting;

import java.util.Objects;

public class Person implements Comparable<Person>{
    private int age;
    private String firstName;
    private String lastName;

    public Person(int age, String firstName, String lastName) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, firstName, lastName);
    }

//    @Override
//    public int compareTo(Person o) {
////        return Integer.compare(this.age, o.age);
//        if (this.age < o.getAge()) return -1;
//        else if (this.age > o.getAge()) return 1;
//        else return 0;
//    }

    @Override
    public int compareTo(Person o) {
        int lastNameComp = this.lastName.compareTo(o.lastName);
        System.out.print("lastName = " + this.lastName + " + " + o.lastName);
        System.out.println(" lastNameComp = " + lastNameComp);

        if (lastNameComp == 0) return this.firstName.compareTo(o.firstName);
        return lastNameComp;
    }

}
