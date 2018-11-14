package com.company.FunctionalInterfaces;

import java.util.function.Predicate;

public class TwoPredicatesTest {
    public static void main (String [] args){
        int []x ={0,5,10,15,20,25,30};
        Predicate<Integer> p1= i->i>10;
        Predicate<Integer> p2= i->i%2==0;
        System.out.print("Numbers greater than 10");
        m1 (p1, x);
        System.out.print("Numbers even");
        m1 (p2, x);

        System.out.print("Numbers even and greater than 10");
        m1 (p1.and(p2), x);

        m1 (p1.and(p2), x);
    }

    public static void m1 (Predicate <Integer> pre, int []x){
        for (int x1 :x){
            if(pre.test(x1)){
                System.out.println(x1);

            }
        }
    }
}
