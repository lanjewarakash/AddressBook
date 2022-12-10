package com.blz;

import java.util.Scanner;

public class AddressBook {
    Contact contact = new Contact();
    Scanner scanner = new Scanner(System.in);

    public void mainMenu(){

        boolean b = true;
        while (b) {
            System.out.println(" Press 1 to Add Contact \n Press 2 to Edit Contact(Add Contact First)");
            System.out.println(" Press 3 to Delete Contact(Add Contact First) \n Press 4 to Add Multiple Contact \n Press 5 to Exit");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    addContact();
                    break;
                case 2:
                    editContact();
                    break;
                case 3:
                    deleteContact();
                    break;
                case 4:
                    addMultipleContact();
                case 5:
                    b = false;
                    System.out.println("Thanks for Using Address book");
                    break;
                default:
                    System.out.println("Invalid Option....!!..Enter Again..");
                    break;
            }
        }
    }
    public void addContact(){
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
    public void editContact() {
        System.out.println("Enter the first name of person to edit contact");
        String editName = scanner.nextLine();
        if (editName.equals(contact.getFirstName())){
            addContact();
        }else {
            System.out.println("Invalid Name...!!...Please Enter Valid First Name");
            editContact();
        }
    }
    public void deleteContact() {
        System.out.println("Enter the first name of person to delete contact");
        String editName = scanner.nextLine();
        if (editName.equals(contact.getFirstName())){
            System.out.println("Deleted " + contact.getFirstName() + " Contact Successfully");
            contact = null;
        }
    }
    public void addMultipleContact(){
        System.out.println("Enter Number of Contact to Add");
        int num = scanner.nextInt();
        for (int i=1;i<=num;i++) {
            addContact();
        }
    }
}