package com.bridgelabz;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MultipleAddressBook {
    Map<String,ContactsManager> multiAddBook = new HashMap<>();
    public void add(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Address book name");
        String bookName = sc.next();
        if (multiAddBook.containsKey(bookName)){
            ContactsManager contactsManager = multiAddBook.get(bookName);
            contactsManager.add();
            multiAddBook.put(bookName,contactsManager);
        }
        else{
            ContactsManager contactsManager = new ContactsManager();
            contactsManager.add();
            multiAddBook.put(bookName,contactsManager);
        }

    }
    public void edit(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Address book name");
        String bookName = sc.next();
        if (multiAddBook.containsKey(bookName)){
            ContactsManager contactsManager = multiAddBook.get(bookName);
            contactsManager.edit();
            multiAddBook.put(bookName,contactsManager);
        }
        else{
            ContactsManager contactsManager = new ContactsManager();
            contactsManager.edit();
            multiAddBook.put(bookName,contactsManager);
        }

    }
    public void delete(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Address book name");
        String bookName = sc.next();
        if (multiAddBook.containsKey(bookName)){
            ContactsManager contactsManager = multiAddBook.get(bookName);
            contactsManager.delete();
            multiAddBook.put(bookName,contactsManager);
        }
        else{
            ContactsManager contactsManager = new ContactsManager();
            contactsManager.delete();
            multiAddBook.put(bookName,contactsManager);
        }

    }
}
