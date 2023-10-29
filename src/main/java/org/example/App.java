package org.example;

import java.util.Map;

public class App {

    private static final String ANNONIMUS_FULL_NAME = "Annonimus Annonimus Annonimus";

    private static final String IDENTIFIABLE_FULL_NAME = "Identifiable Identifiable Known";

    public static void main(String[] args) {
        ContactBook contactBook = new ContactBook();

        contactBook.addContact(ANNONIMUS_FULL_NAME, new RelativeAddress("Space", "Milky Way"));
        contactBook.addContact(IDENTIFIABLE_FULL_NAME, new PreciseAddress("0", "0"));
        contactBook.stream().forEach(App::printNameAndAddress);

        PreciseAddress address = new PreciseAddress("-0", "-0");
        contactBook.addContact(ANNONIMUS_FULL_NAME, address);
        printAonnonimusAddress(contactBook);
        address.setLatitude("+0");
        address.setLongitude("+0");
        printAonnonimusAddress(contactBook);
    }

    private static void printAonnonimusAddress(ContactBook contactBook) {
        System.out.println("\n" + contactBook.getPersonAddress(ANNONIMUS_FULL_NAME).getTextualRepresentation());
    }

    private static void printNameAndAddress(Map.Entry<String, Address> nameToAddress) {
        System.out.println(nameToAddress.getKey() + " lives at " + nameToAddress.getValue().getTextualRepresentation());
    }

}
