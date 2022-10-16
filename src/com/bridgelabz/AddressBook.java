package com.bridgelabz;

import java.util.Scanner;

public class AddressBook {
    public static ContactPerson getContact(){
        Scanner inputContact=new Scanner(System.in);
        System.out.println("Enter the details of contact person");
        System.out.println("Enter first name:");
        String firstName=inputContact.nextLine();
        System.out.println("Enter last name:");
        String lastName=inputContact.nextLine();
        System.out.println("Enter address:");
        String address=inputContact.nextLine();
        System.out.println("Enter city:");
        String city=inputContact.nextLine();
        System.out.println("Enter state:");
        String state=inputContact.nextLine();
        System.out.println("Enter zipcode:");
        String zipCode=inputContact.nextLine();
        System.out.println("Enter phone number:");
        String phoneNumber=inputContact.nextLine();
        System.out.println("Enter email:");
        String email=inputContact.nextLine();
        return new ContactPerson(firstName,lastName,address,city,state,zipCode,phoneNumber,email);
    }
}
