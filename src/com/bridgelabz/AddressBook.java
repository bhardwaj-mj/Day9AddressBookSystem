package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    List<Contact> contactList = new ArrayList<>();
    Scanner inputContact = new Scanner(System.in);
    int counter;
    private int indexOfContact;

    public void getContact() {
        System.out.println("Enter the details of contact =>");
        Contact contact = new Contact();
        System.out.print("Enter first name:");
        contact.setFirstName(inputContact.nextLine());
        System.out.print("Enter last name:");
        contact.setLastName(inputContact.nextLine());
        System.out.print("Enter address:");
        contact.setAddress(inputContact.nextLine());
        System.out.print("Enter city:");
        contact.setCity(inputContact.nextLine());
        System.out.print("Enter state:");
        contact.setState(inputContact.nextLine());
        System.out.print("Enter zipcode:");
        contact.setZipCode(inputContact.nextLine());
        System.out.print("Enter phone number:");
        contact.setPhoneNumber(inputContact.nextLine());
        System.out.print("Enter email:");
        contact.setEmail(inputContact.nextLine());
        contactList.add(contact);
        System.out.println();
        System.out.println("Contact added");
    }

    public void editContact() {
        System.out.println("Enter contact's First Name you want to edit: ");
        String searchName = inputContact.next();
        for (Contact contact:contactList) {
            if (contact.getFirstName().equals(searchName)) {
                System.out.print("Enter updated name:");
                contact.setFirstName(inputContact.next());
                System.out.print("Enter new last Name: ");
                contact.setLastName(inputContact.next());
                System.out.print("Enter new address: ");
                contact.setAddress(inputContact.next());
                System.out.print("Enter new city: ");
                contact.setCity(inputContact.next());
                System.out.print("Enter new state:");
                contact.setState(inputContact.next());
                System.out.print("Enter new zip: ");
                contact.setZipCode(inputContact.next());
                System.out.print("Enter phone number: ");
                contact.setPhoneNumber(inputContact.next());
                System.out.print("Enter new email");
                contact.setEmail(inputContact.next());
                System.out.println();
                System.out.println("Edit completed");
                }
            }
    }

    public String toString () {
        return "contactList= " + contactList;
    }
}
