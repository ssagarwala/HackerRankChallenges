package com.company.FunctionalInterfaces;

import java.util.function.Predicate;

public class TestPredicate {
    public static void main (String [] args){
        Predicate <Integer> p = n -> n>10;

        System.out.println("Is input greater than 10 --" + p.test(5));


    }
}
