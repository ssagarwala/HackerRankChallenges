package com.company;

public class ForLoop20 {
    //Errors in the code 1)missing semicolon after while parenthesis
    //2)
    public static void main (String [] args){
        int j=0;
        //declare and initailize primitive array
        //int a[] = {2,4};
        int [] a= new int[2];
        a[0]=2;
        a[1]=4;
        do for (int i :a)
            System.out.println( i + "");
        while (j++ <1 );
    }
}

