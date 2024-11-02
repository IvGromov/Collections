package ru.Ivan.Collections.Task2.PhoneBook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class PhoneBook {
     HashMap<String,List<String>> contacts = new HashMap<>();

    public void setContacts(HashMap<String, List<String>> contacts) {
        this.contacts = contacts;
    }

    public void add(String name, List<String> numbers){
        this.contacts.put(name, numbers);
    }

    public void add(String name, String... number){
        List<String> numbers = new ArrayList<>();
        Collections.addAll(numbers, number);
        this.contacts.put(name, numbers);
    }

    public void find(String name){
        if (this.contacts.containsKey(name)) System.out.println(name + "'s phone numbers: " + this.contacts.get(name));
        else System.out.println("Контакт не найден");
    }
}
