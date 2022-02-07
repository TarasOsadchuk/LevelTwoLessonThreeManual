package com.geekbrains.tasktwo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneBook {

    private final HashMap<String, List<String>> phoneBook;

    public PhoneBook(){
        this.phoneBook = new HashMap<>();
    }

    public void add(String surname, String number){
        if(phoneBook.containsKey(surname)){
            List<String> numbers = phoneBook.get(surname);
            if(!numbers.contains(number)){
                numbers.add(number);
                System.out.printf("Number %s added for surname %s%n", number, surname);
            } else {
                System.out.printf("Number %s already exists for last name %s%n", number, surname);
            }
        } else {
            phoneBook.put(surname, new ArrayList<>(List.of(number)));
            System.out.printf("Number %s added for surname %s%n", number, surname);
        }
    }

    public List<String> get(String surname){
        if(phoneBook.containsKey(surname)){
            return phoneBook.get(surname);
        } else {
            System.out.printf("There is no entry in the directory for the last name %s%n", surname);
            return new ArrayList<>();
        }
    }
}