package com.company;

class Parent{
    protected static int counter =0;

    public Parent(){
        System.out.println("parent constructor called form child no arg cons");
    }
    public Parent (int x){
        System.out.println("When child extends parent, " +
                "then parent must provide no args default " +
                "constructor. The child calls the parent no arg constructor first. ");
        counter++;
        System.out.println("in parent construtor  " +counter);
    }

    static int getCount(){

        return counter;
    }
}
public class Child extends Parent{

    public Child(){
        //super(5);
        counter++;
        System.out.println("in child construtor " +counter);
    }

    public static void main (String [] args){
        System.out.println("count = "+ getCount());
        Child obj = new Child();
        System.out.println("count = "+ getCount());



    }
}
