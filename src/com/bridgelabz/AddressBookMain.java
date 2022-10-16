package com.bridgelabz;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book program");
        ContactPerson person1=AddressBook.getContact();
        System.out.println(person1);
    }
}
