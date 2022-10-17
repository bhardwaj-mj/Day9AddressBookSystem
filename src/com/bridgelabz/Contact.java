package com.bridgelabz;

public class Contact {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String phoneNumber;
    private String email;

    public Contact(String firstName, String lastName, String address, String city,
                   String state, String zipCode, String phoneNumber, String email) {
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
