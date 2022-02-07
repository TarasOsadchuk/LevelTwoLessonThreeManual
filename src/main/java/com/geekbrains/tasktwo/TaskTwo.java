package com.geekbrains.tasktwo;

public class TaskTwo {

    /**
     * Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
     * В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get()
     * искать номер телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов
     * (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.
     */

    public static void main(String[] args) {

        System.out.println("Create a directory:");
        PhoneBook phonebook = new PhoneBook();
        System.out.println("     ***\n");

        System.out.println("We fill the directory:");
        phonebook.add("Osadchuk", "223344");
        phonebook.add("Osadchuk", "22334455");
        phonebook.add("King", "2233445566");
        phonebook.add("Potato", "223344556677");
        System.out.println("     ***\n");

        System.out.println("Getting numbers:");
        System.out.println("Osadchuk");
        System.out.println(phonebook.get("Osadchuk"));
        System.out.println("King");
        System.out.println(phonebook.get("King"));
        System.out.println("Potato");
        System.out.println(phonebook.get("Potato"));
        System.out.println("     ***\n");

        System.out.println("No entry case:");
        System.out.println("Shevchenko");
        System.out.println(phonebook.get("Shevchenko"));
        System.out.println("     ***\n");

        System.out.println("Trying to write down an existing number:");
        phonebook.add("Osadchuk", "11223344");
        System.out.println("Osadchuk");
        System.out.println(phonebook.get("Osadchuk"));
    }
}

