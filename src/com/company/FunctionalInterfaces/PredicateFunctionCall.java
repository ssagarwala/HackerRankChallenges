package com.company.FunctionalInterfaces;

import java.util.function.Predicate;

public class PredicateFunctionCall {
    public static void main (String [] args) {
            int x[] = {0, 5, 10, 15, 20, 25, 30};

            Predicate<Integer> p1 = x1 -> x1 > 10;
            Predicate<Integer> p2 = x1 -> x1 % 2 == 0;

            System.out.println("numbers greater than 10");
            function1(p1,x);
            System.out.println("numbers even");
            function1(p2,x);
            System.out.println("numbers greater than 10 and even");
            function1(p1.and(p2), x);
            System.out.println("numbers greater than 10 or  even");
            function1(p1.or(p2), x);
            System.out.println("numbers not greater than 10 ");
            function1(p1.negate(), x);




    }

    public static void function1 (Predicate<Integer> p , int[] x){
        for (int num: x){
            if(p.test(num))
                System.out.println(num);
        }
    }
}
