package com.bridgelabz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    List<Contact> contactList = new ArrayList<>();
    Scanner inputContact = new Scanner(System.in);
    private int indexOfContact;
    public void getContact() {
        System.out.println("Enter the details of contact =>");
        Contact contact = new Contact();
        System.out.print("Enter first name:");
        contact.setFirstName(inputContact.next());
        System.out.print("Enter last name:");
        contact.setLastName(inputContact.next());
        System.out.print("Enter address:");
        contact.setAddress(inputContact.next());
        System.out.print("Enter city:");
        contact.setCity(inputContact.next());
        System.out.print("Enter state:");
        contact.setState(inputContact.next());
        System.out.print("Enter zipcode:");
        contact.setZipCode(inputContact.next());
        System.out.print("Enter phone number:");
        contact.setPhoneNumber(inputContact.next());
        System.out.print("Enter email:");
        contact.setEmail(inputContact.next());
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
            else{
                System.out.println("Contact not found with this name ");
            }
        }
    }
    public void deleteContact(){
        System.out.print("Enter contact's First Name you want to delete:");
        String searchName=inputContact.next();
        for (Contact contact:contactList) {
            if(contact.getFirstName().equals(searchName)){
                contactList.remove(contact);
                System.out.println("Contact deleted");
                break;
            }
            else {
                System.out.println("Contact not found with this name");
            }
        }
    }
    public String toString () {
        return "contactList= " + contactList;
    }
}
