package ru.Ivan.Collections.Task2;

import ru.Ivan.Collections.Task2.PhoneBook.PhoneBook;

public class Collections2 {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Alice", "123-456-7890");
        phoneBook.add("Anny", "234-567-8901");
        phoneBook.add("Bob", "345-678-9012","345-678-9013","345-678-9014");

        phoneBook.find("Bob");
        phoneBook.find("Alice");
        phoneBook.find("Anny");
        phoneBook.find("Armageddon");
    }
}
