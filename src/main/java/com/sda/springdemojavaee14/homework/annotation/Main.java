package com.sda.springdemojavaee14.homework.annotation;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        PersonWithAllSourceCode me = new PersonWithAllSourceCode();
        me.setName("julian");
        me.setSurname("r.");
        me.setAge(33);

        System.out.println("me: " + me.toString());

        PersonWithAllSourceCode anotherMe = new PersonWithAllSourceCode("julian", "r.", 33);
        System.out.println("another me: " + anotherMe);

        System.out.println("Are those two references referring to the same object?: " + (me == anotherMe));
        System.out.println("is this the same person? -" + me.equals(anotherMe));

        System.out.println("are equals: " + me.equals("haha"));

        Person meAgain = new Person("julian", "r.", 3);
        // builder is better than all args constructor - because you can see more:)
        Person meAgainWithBuilder = Person.builder()
                .age(33)
                .surname("r.")
                .name("julian")
                .build();

        //set doesn't store duplicates
        Set<PersonWithAllSourceCode> uniquePersons = new HashSet<>();
        uniquePersons.add(me);
        uniquePersons.add(anotherMe);

    }
}
