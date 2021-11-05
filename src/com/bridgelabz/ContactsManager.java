package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactsManager {
    ArrayList<Contact> list = new ArrayList<>();        //creating to arrayList to store the contacts
    /**
     * Taking the contact info from the user and storing it to the Arraylist
     * @return - void
     */
    public void add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = sc.next();
        System.out.println("Enter the address");
        String address = sc.next();
        System.out.println("Enter the city");
        String city = sc.next();
        System.out.println("Enter the state");
        String state = sc.next();
        System.out.println("Enter the emailId");
        String email = sc.next();
        System.out.println("Enter the Phone number");
        long phoneNumber = sc.nextLong();
        System.out.println("Enter the zipcode");
        long zipCode = sc.nextLong();
        Contact contact = new Contact(name, address, city, state, email, phoneNumber, zipCode);
        list.add(contact);
    }

    /**
     * To Edit a contact by searching through the name
     */
    public void edit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Name of contact to Edit");
        String name1 = scanner.next();
        for (int i = 0; i < list.size(); i++) {
            if ((list.get(i).name).equals(name1)) {
                System.out.println("\n1 : Change the name");
                System.out.println("2 : Change the address");
                System.out.println("3 : Change the city");
                System.out.println("4 : Change the state");
                System.out.println("5 : Change the emailId");
                System.out.println("6 : Change the Phone number");
                System.out.println("7 : Change the zipcode");
                System.out.println("0 : Exit");
                int selection = scanner.nextInt();
                switch (selection) {
                    case 1: {
                        System.out.println("Enter new Name");
                        list.get(i).name = scanner.next();       //changes the name to user defined name
                        break;
                    }
                    case 2: {
                        System.out.println("Enter new address");
                        list.get(i).address = scanner.next();           //changes the address by user defined address
                        break;
                    }
                    case 4: {
                        System.out.println("Enter the new state");
                        list.get(i).state = scanner.next();         //Changes the state
                        break;
                    }
                    case 5: {
                        System.out.println("Enter the new email");
                        list.get(i).email = scanner.next();        //Changes the email
                        break;
                    }
                    case 6: {
                        System.out.println("Enter the new phoneNumber");
                        list.get(i).phoneNumber = scanner.nextLong();     //changes the phone number
                        break;
                    }
                    case 7: {
                        System.out.println("Enter the new Zipcode");
                        list.get(i).zipCode = scanner.nextLong();         //changes the zipCode
                        break;
                    }
                    default:
                        break;
                }
                System.out.println("After Editing the contact");
                //  To print the contact after Editing
                System.out.println(list.get(i).name + " " +list.get(i).state + " " + list.get(i).address + " " +list.get(i).city + " " + list.get(i).email + " " +list.get(i).phoneNumber + " " + list.get(i).zipCode);
            }
        }

    }

    /**
     * To delete a contact by using the name
     */
    public void delete() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the contact to delete");
        String name1 = scanner.next();
        for (int i = 0; i < list.size(); i++) {
            if ((list.get(i).name).equals(name1)) {                  //searching by name in the list
                list.remove(i);
            }
        }
    }
}

