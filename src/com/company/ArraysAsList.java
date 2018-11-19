package com.company;

import java.util.Arrays;
import java.util.List;

public class ArraysAsList {

     public static void main(String[] args) {
         List<String> list = Arrays.asList("cat","over", "good");

         //working
         // prints cat
         list.stream().reduce((x1,x2)->x1.length() == 3 ? x1:x2)
                                         .ifPresent(System.out::println);
         // prints good list.stream().reduce((x1,x2)->x1.length() >
         // x2.length()? x1: x2).ifPresent(System.out::println);



     }

}
