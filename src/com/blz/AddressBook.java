package com.blz;

import java.util.Scanner;

public class AddressBook {
    Contact contact = new Contact();
    Scanner scanner = new Scanner(System.in);

    void addContact() {
        System.out.println("First Name:- ");
        String firstName = scanner.next();
        contact.setFirstName(firstName);
        System.out.println("Last Name:- ");
        String lastName = scanner.next();
        contact.setLastName(lastName);
        System.out.println("City:- ");
        String city = scanner.next();
        contact.setCity(city);
        System.out.println("State:- ");
        String state = scanner.next();
        contact.setState(state);
        System.out.println("Email ID:- ");
        String eMail = scanner.next();
        contact.setEmail(eMail);
        System.out.println("ZIP Code:- ");
        int zip = scanner.nextInt();
        contact.setZip(zip);
        System.out.println("PhoneNo:- ");
        long phoneNo = scanner.nextLong();
        contact.setPhoneNo(phoneNo);

        System.out.println("Your Contact saved as:-");
        System.out.println(contact);
    }

}
