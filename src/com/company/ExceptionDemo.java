package com.company;

import java.util.Optional;

public class ExceptionDemo {

    public static void main (String [] args){
        String a = null;
        Optional<String> b = Optional.empty();
        try{
           // System.out.println("a is null "+ a.length());
            System.out.println(b.orElse("lllllllll").length());
        }
        catch(Exception ex){System.out.println("a is assigned null value  "+a +"\n");}
        finally {
            a="String";
            System.out.println("len of String a"+a.length());
            b=Optional.ofNullable("File1.java");
            System.out.println(b.get().length());
        }

    }

}
