package com.company;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class FuncInterfaces {
    public static void main (String [] args){

        Supplier<String> i = ()-> "Car";
        Consumer<String> c = x -> System.out.println(x.toLowerCase());
        Consumer<String> d = x -> System.out.println(x.toUpperCase());
        c.accept(i.get());
        d.accept(i.get());
        c.andThen(d).accept(i.get());
        System.out.println("-----------");

        Supplier<Integer>  in = ()-> 5;
        Consumer<Integer> inc = x-> System.out.println(x);
        Consumer<Integer> inc2 = x ->System.out.println(x);
        inc.andThen(inc2).accept(in.get());
    }


}
