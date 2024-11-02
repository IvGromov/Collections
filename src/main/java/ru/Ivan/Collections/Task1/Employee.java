package ru.Ivan.Collections.Task1;

public class Employee {
    private String name;
    private int age;

    Employee(String name, int age){
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name;
    }
}
