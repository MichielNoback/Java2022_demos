package nl.bioinf.nomi.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsDemo {

    public static void main(String[] args) {
        CollectionsDemo demo = new CollectionsDemo();
        demo.start();
    }

    private void start() {
        List<String> firstNames1 = List.of("Rob", "Rose", "Hank", "Jade");
        List<String> firstNames = new ArrayList();
        firstNames.addAll(firstNames1);

        System.out.println("firstNames = " + firstNames);
        Collections.sort(firstNames);
        System.out.println("firstNames = " + firstNames);


        List<Person> persons = new ArrayList<>();
        persons.add(new Person(22, "Rob", "Rose"));
        persons.add(new Person(32, "Rose", "Bowers"));
        persons.add(new Person(18, "Hank", "McDougall"));
        persons.add(new Person(29, "Jade", "Newman"));
        persons.add(new Person(30, "Jacob", "Bowers"));

        System.out.println("persons = " + persons);
        Collections.sort(persons);
        System.out.println("persons = " + persons);

        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        });

        System.out.println("persons = " + persons);

    }
}
