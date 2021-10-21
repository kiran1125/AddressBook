package com.bridgelabz;

/**This AddressBook program simply stores the contacts and their information
 * @author kiran
 * @Date : 21-10-2021
 */


public class AddressBook {
    String name,address,city,state,email;                 //Initialising some variables
    String phoneNumber,zipCode;

    public AddressBook(String a,String b , String c, String d,String e ,String f,String g ){
        /**
         * Using constructor to assign the values to the variables
         */
        this.name = a;
        this.address = b;
        this.city = c;
        this.state = d;
        this.email = e;
        this.phoneNumber = f;
        this.zipCode = g;

    }
    public static void main(String[] args) {
        System.out.println("Welcome to the Address book main program");
        AddressBook addressBook1 = new AddressBook("Sreedhar","Ninkampalli_Road","Kurnool","Andhra_Pradesh","sreedhar@gmail.com","12345","515306");
        AddressBook addressBook2 = new AddressBook("Kiran","Ninkampalli_Road","Anantapur","Andhra_Pradesh","sreedhar@gmail.com","1234567","515201");
    }
}
