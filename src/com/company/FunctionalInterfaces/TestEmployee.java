package com.company.FunctionalInterfaces;

import java.util.ArrayList;
import java.util.function.Predicate;

public class TestEmployee {
    public static void main (String [] args) {
        ArrayList<Employee> al = new ArrayList<Employee>();
        al.add(new Employee("sehar", 5000, 5.7));
        al.add(new Employee("fatima", 6000, 1.2));
        al.add(new Employee("gullee", 9000, 4.2));
        al.add(new Employee("gullee22", 20000, 1.2));
        System.out.println(al);
        Predicate<Employee> emp = e1-> e1.salary<10000 && e1.experience >3.5;

        for(Employee e1: al){
            if(emp.test(e1)){
                e1.salary += 2000;
            }
        }
        System.out.println(al);
    }

}
