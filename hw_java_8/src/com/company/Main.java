package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Person> someCollection = new ArrayList<>();
        Person A = new Person("Alex", 77);
        Person B = new Person("Bob", 11);
        Person C = new Person("Nataly", 33);
        someCollection.add(A);
        someCollection.add(B);
        someCollection.add(C);
        Map m = Streams.of(someCollection)
                .filter(p -> p.getAge > 20)
                .transform(p -> new Person(p.getAge() + 30))
                .toMap(p -> p.getName(), p -> p);
    }
}
