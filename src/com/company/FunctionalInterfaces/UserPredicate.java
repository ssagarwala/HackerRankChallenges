package com.company.FunctionalInterfaces;

import java.util.Scanner;
import java.util.function.Predicate;

class User{
    String username;
    String pwd;
    User(String username, String pwd){
        this.username = username;
        this.pwd = pwd;
    }
}
public class
UserPredicate {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username");
        String username = sc.next();
        System.out.println("Enter pwd");
        String pwd = sc.next();
        User user = new User(username, pwd);
        Predicate<User> p = us->us.username.equals("sehar")&&
                us.pwd.equals("aalee");
        if(p.test(user))
        {
            System.out.println("valid user");
        }
        else
            System.out.println("Invalid user");

    }

}
