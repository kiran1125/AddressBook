package com.bridgelabz;

/**This AddressBook program simply stores the contacts and their information
 * @author kiran
 * @Date : 21-10-2021
 */


public class AddressBook {

    public static void main(String[] args) {
        ContactsManager contactsManager = new ContactsManager();
        contactsManager.add();
        contactsManager.edit();

    }
}
