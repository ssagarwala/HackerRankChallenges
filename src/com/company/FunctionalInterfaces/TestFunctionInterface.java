package com.company.FunctionalInterfaces;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class TestFunctionInterface  {
        public static void main (String [] args) {
            ArrayList<Employee> al = new ArrayList<Employee>();
            al.add(new Employee("sehar", 5000, 5.7));
            al.add(new Employee("fatima", 6000, 1.2));
            al.add(new Employee("gullee", 9000, 4.2));
            al.add(new Employee("gullee22", 20000, 1.2));
            System.out.println(al);
            Predicate<Employee> emp = e1-> e1.salary<10000 && e1.experience >3.5;

            Function<Employee,Employee> func = e-> {if(emp.test(e)) {
                                                        e.salary += 3000;
                                                        }
                                                        return e;
                                                    };
            for(Employee employee: al)
            {
                func.apply(employee);
            };
        }

}