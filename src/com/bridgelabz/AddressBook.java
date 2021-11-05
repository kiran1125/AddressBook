package com.bridgelabz;

import java.util.Scanner;

/**This AddressBook program simply stores the contacts and their information
 * @author kiran
 * @Date : 21-10-2021
 */


public class AddressBook {

    public static void main(String[] args) {
        ContactsManager contactsManager = new ContactsManager();
        System.out.println("Welcome to Address Book");
        System.out.println("\n Choose an option from below");
        int option = -1;
        do {                                                       //displaying options
        System.out.println("\n To Add a Contact : press- 1");
        System.out.println("To Edit a contact : press- 2 ");
        System.out.println("To Delete a Contact : Press- 3");
        System.out.println("Exit : Press 0");
        Scanner scanner = new Scanner(System.in);
        option = scanner.nextInt();            //Asking user to select an option and storing it in option
        switch (option){
            case 1: {
                contactsManager.add();
                break;
            }
            case 2: {
                contactsManager.edit();
                break;
            }
            case 3: {
                contactsManager.delete();
                break;
            }
            default:{
                System.out.println("Entered number doesn't have anything");
                break;
            }
        }
        }while (option != 0 );
    }
}
