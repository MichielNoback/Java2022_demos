package nl.bioinf.nomi.entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    void testAddress() {
        Person.Address address = new Person.Address("Zernikeplein", 4);
        System.out.println(address);
        System.out.println("address.printableAddress() = " + address.printableAddress());
    }
}