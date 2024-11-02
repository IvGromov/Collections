package ru.Ivan.Collections.Task1;

import java.util.ArrayList;
import java.util.List;

public class Collection1 {
    public static void main(String[] args) {
        List<Integer> list = ListMinMax(5, 11);
        System.out.println(list);
        int sum = SumOf(list);
        System.out.println(sum);
        ArrayFill(list, 8);
        System.out.println(list);
        ArrayAddAll(list,11);;
        System.out.println(list);

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Andrey", 25));
        employees.add(new Employee("Alex", 21));
        employees.add(new Employee("Anton", 36));
        employees.add(new Employee("Anny", 32));
        employees.add(new Employee("Alice", 18));
        employees.add(new Employee("Armageddon", 66));
        employees.add(new Employee("Anna", 45));
        employees.add(new Employee("Albert", 36));
        employees.add(new Employee("August", 38));
        employees.add(new Employee("Armas", 42));

        System.out.println(employees);

        List<Employee> oldEmps = empOlder(employees, 30);

        System.out.println(oldEmps);

        System.out.println(isMidAge(employees, 20));
        System.out.println(isMidAge(employees, 30));
        System.out.println(isMidAge(employees, 40));

        System.out.println(youngestEmp(employees));






    }

    public static List<Integer> ListMinMax(int min, int max){
       List<Integer> Array = new ArrayList<>();
        for (int i = min; i < max+1; i++) {
            Array.add(i);
        }
        return Array;
    }

    public static int SumOf(List<Integer> Array){
        int Sum = 0;
        for (Integer integer : Array) {
            if (integer>=5) Sum += integer;
        }
        return Sum;
    }

    public static void ArrayFill(List<Integer> Array, int n){
        Array.replaceAll(ignored -> n);
    }

    public static void ArrayAddAll(List<Integer> Array, int n){
        Array.replaceAll(integer -> integer + n);
    }

    public static List<Employee> empOlder(List<Employee> list, int age){
        List<Employee> newList = new ArrayList<>();
        for (Employee emp : list) {
            if (emp.getAge() >= age) newList.add(emp);
        }
        return newList;
    }

    public static boolean isMidAge(List<Employee> list, int age){
        int mAge = 0;
        for (Employee emp : list) {
            mAge += emp.getAge();
        }
        mAge /= list.size();
        return age<mAge;
    }

    public static Employee youngestEmp(List<Employee> list){
        Employee youngest = list.get(0);
        for (Employee emp : list) {
            if (emp.getAge() < youngest.getAge()) youngest = emp;
        }
        return youngest;
    }
}

