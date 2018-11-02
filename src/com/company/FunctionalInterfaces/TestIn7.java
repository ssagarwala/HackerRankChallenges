package com.company.FunctionalInterfaces;

interface Interf
{
    public int squareInt(int n);
}
class Demo implements Interf{
   public int squareInt(int n){
        return n*n;
    }
}
class Test7{
    public static void main (String [] args){
        Demo d = new Demo();
        System.out.println("The Square of 4" + d.squareInt(4));
    }
}