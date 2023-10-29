package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class ContactBook {

    private Map<String, Address> personNameToItsAddress;

    public ContactBook() {
        this.personNameToItsAddress = new HashMap<>();
    }

    public ContactBook(Map<String, Address> mapImplementation) {
        this.personNameToItsAddress = mapImplementation;
    }

    // Delegation !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    public void addContact(String personFullName, Address address) {
        personNameToItsAddress.put(personFullName, address);
    }

    // Delegation !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    public Address getPersonAddress(String personFullName) {
        return personNameToItsAddress.get(personFullName);
    }

    // Delegation !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    public void changeAddressForPerson(String personFullName, Address newAddress) {
        personNameToItsAddress.put(personFullName, newAddress);
    }

    // Delegation !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    public Stream<Map.Entry<String, Address>> stream() {
        return personNameToItsAddress.entrySet().stream();
    }

}
