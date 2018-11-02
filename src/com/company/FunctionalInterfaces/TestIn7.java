package com.company.FunctionalInterfaces;

interface Interf
{
    public int squareInt(int n);
}
class Test7{
    public static void main (String [] args){
        Interf in = n->n*n;
        System.out.println("The Square of 4 --" + in.squareInt(4));
    }
}