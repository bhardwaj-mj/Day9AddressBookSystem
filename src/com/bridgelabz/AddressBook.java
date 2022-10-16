package com.bridgelabz;

public class AddressBook {
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    int zipCode;
    String phoneNumber;
    String email;

    public AddressBook(String firstName, String lastName, String address, String city, String state, int zipCode, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    @Override
    public String toString() {
        return "First Name-> " +firstName + "\nLast Name-> " + lastName + "\nAddress-> " + address + "\nCity-> " + city + "\nState-> " + state + "\nZipcode-> " + zipCode + "\nPhone Number-> " + phoneNumber + "\nemail-> " + email;
    }

    public static void main(String[] args) {
        AddressBook person1=new AddressBook("Manoj","kumar","Rajiv Colony","Safidon","Haryana",126112,"9992555643","bhardwajmanoj555@gmail.com");
        System.out.println(person1);
    }

}
