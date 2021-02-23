package com.guruPrakash.SpringJenkinsHeroku.classes;

public class Person {
    String name;
    String address;
    int dob;

    public Person(String name, String address, int dob){
        this.name = name;
        this.address = address;
        this.dob = dob;
    }

    public String toString(){
        return "This is " + name + " living in " + address + " whose date of birth is " + dob;
    }
}
