package com.company;

public class Main {
    public static void main(String[] args) {
        Person A = new Person(true, "Bob");
        Person B = new Person(false, "Alena", A);
        Person C = new Person(true, "Misha", null);
        Person D = new Person(false, "Anna", C);
        System.out.println(A.marry(B));
        //System.out.println(A.spouse.name + " ---> " + B.spouse.name);
        System.out.println(C.marry(C));
        //System.out.println(C.spouse.name + " ---> " D.spouse.name);
    }
}
