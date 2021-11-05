package com.bridgelabz;

import java.util.Scanner;

/**This AddressBook program simply stores the contacts and their information
 * @author kiran
 * @Date : 21-10-2021
 */


public class AddressBook {

    public static void addressBook() {
        MultipleAddressBook multipleAddressBook = new MultipleAddressBook();
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
                multipleAddressBook.add();
                break;
            }
            case 2: {
               multipleAddressBook.edit();
                break;
            }
            case 3: {
                multipleAddressBook.delete();
                break;
            }
            default:{
                break;
            }
        }
        }while (option != 0 );
    }
}
