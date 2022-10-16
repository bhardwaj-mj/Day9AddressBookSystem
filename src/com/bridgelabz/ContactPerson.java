package com.bridgelabz;

import java.util.Scanner;

public class ContactPerson {
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    String zipCode;
    String phoneNumber;
    String email;

    public ContactPerson(String firstName, String lastName, String address, String city,
                         String state, String zipCode, String phoneNumber,String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String toString() {
        return "First Name-> " +firstName +
                "\nLast Name-> " + lastName +
                "\nAddress-> " + address +
                "\nCity-> " + city +
                "\nState-> " + state +
                "\nZipcode-> " + zipCode +
                "\nPhone Number-> " + phoneNumber +
                "\nemail->"+email; //
    }

}
