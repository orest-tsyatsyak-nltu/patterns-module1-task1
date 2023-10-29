package org.example;

import java.util.Map;

public class App {

    public static void main(String[] args) {
        ContactBook contactBook = new ContactBook();
        contactBook.addContact("Annonimus Annonimus Annonimus", new RelativeAddress("Space", "Milky Way"));
        contactBook.addContact("Identifiable Identifiable Known", new PreciseAddress("0", "0"));
        contactBook.stream().forEach(App::printNameAndAddress);
        contactBook.changeAddressForPerson("Annonimus Annonimus Annonimus", new PreciseAddress("-0", "-0"));
        System.out.println();
        System.out.println(contactBook.getPersonAddress("Annonimus Annonimus Annonimus").getTextualRepresentation());

    }

    private static void printNameAndAddress(Map.Entry<String, Address> nameToAddress) {
        System.out.println(nameToAddress.getKey() + " lives at " + nameToAddress.getValue().getTextualRepresentation());
    }

}
