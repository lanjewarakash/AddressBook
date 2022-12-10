package com.blz;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        System.out.println("Enter Number of Address Book to Add");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i=1;i<=num;i++){
            AddressBook addressBook = new AddressBook();
            addressBook.mainMenu();
        }
    }
}

