package com.company.FunctionalInterfaces;


class Employee{
    String ename;
    double salary;
    double experience;
    Employee(String ename,double salary, double experience){
        this.ename = ename;
        this.salary = salary;
        this.experience= experience;
    }
    public String toString(){
        return ename +":" + salary + ":"+ experience;
    }

}


