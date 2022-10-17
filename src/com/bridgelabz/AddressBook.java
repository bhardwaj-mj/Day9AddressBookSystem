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
        counter++;
    }

    public void editContact() {
        if (counter > 0) {
            System.out.println("Enter contact's First Name you want to edit: ");
            String searchName = inputContact.next();
            indexOfContact = 0;
            boolean isFoundContact = false;

            for (int i = 0; i < contactList.size(); i++) {
                if (contactList.get(i).getFirstName().equals(searchName)) {
                    isFoundContact = true;
                    indexOfContact = i;
                    break;
                }
            }
            if (isFoundContact == true) {

                System.out.println("Enter new first name:");
                contactList.get(indexOfContact).setFirstName(inputContact.nextLine());
                System.out.print("Enter new last Name: ");
                contactList.get(indexOfContact).setLastName(inputContact.nextLine());
                System.out.print("Enter new address: ");
                contactList.get(indexOfContact).setAddress(inputContact.nextLine());
                System.out.print("Enter new city: ");
                contactList.get(indexOfContact).setCity(inputContact.nextLine());
                System.out.print("Enter new state:");
                contactList.get(indexOfContact).setState(inputContact.nextLine());
                System.out.print("Enter new zip: ");
                contactList.get(indexOfContact).setZipCode(inputContact.nextLine());
                System.out.print("Enter phone number: ");
                contactList.get(indexOfContact).setPhoneNumber(inputContact.nextLine());
                System.out.print("Enter new email");
                contactList.get(indexOfContact).setEmail(inputContact.nextLine());
                System.out.println();
                System.out.println("Edit completed");

            } else {
                System.out.println("No contact found with this Name");
            }
        }
    }

    public String toString () {
        return "contactList= " + contactList;
    }
}
