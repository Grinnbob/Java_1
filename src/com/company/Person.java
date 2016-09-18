package com.company;

/**
 * Created by grifon on 14.09.2016.
 */
public class Person {
    private final boolean man;
    private final String name;
    private Person spouse;

    public Person(boolean man, String name) {
        this.man = man;
        this.name = name;
    }

    public Person(boolean man, String name, Person spouse) {
        this.man = man;
        this.name = name;
        this.spouse = spouse;
    }

    public boolean marry(Person person) {
        if (person.man != this.man) {
            if (person.spouse != null && this.spouse != null) {
                if (this.name.equals(person.spouse.name) && person.name.equals(this.spouse.name))
                    return false;
            }
            divorce(person);
            divorce(this);
            this.spouse = person;
            person.spouse = this;
            return true;
        }
        return false;
    }

    public boolean divorce(Person person) {
        if (person.spouse != null) {
            person.spouse.spouse = null;
            person.spouse = null;
            return true;
        }
        return false;
    }
}
