package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    List<Contact> contactList =new ArrayList<>();

    public void getContact(){
        Scanner inputContact=new Scanner(System.in);
        System.out.println("Enter the details of contact person");
        System.out.print("Enter first name:");
        String firstName=inputContact.nextLine();
        System.out.print("Enter last name:");
        String lastName=inputContact.nextLine();
        System.out.print("Enter address:");
        String address=inputContact.nextLine();
        System.out.print("Enter city:");
        String city=inputContact.nextLine();
        System.out.print("Enter state:");
        String state=inputContact.nextLine();
        System.out.print("Enter zipcode:");
        String zipCode=inputContact.nextLine();
        System.out.print("Enter phone number:");
        String phoneNumber=inputContact.nextLine();
        System.out.print("Enter email:");
        String email=inputContact.nextLine();
        Contact contact =new Contact(firstName,lastName,address,city,state,zipCode,phoneNumber,email);
        contactList.add(contact);
    }

    @Override
    public String toString() {
        return "contactList= " + contactList;
    }
}
