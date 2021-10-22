package com.bridgelabz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ContactsManager {
    ArrayList<Contact> list = new ArrayList<Contact>();
    public void add(){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String address = sc.next();
        String city = sc.next();
        String state = sc.next();
        String email = sc.next();
        long phoneNumber = sc.nextLong();
        long zipCode = sc.nextLong();
        Contact contact = new Contact(name,address,city,state,email,phoneNumber,zipCode);
        list.add(contact);
    }

}
