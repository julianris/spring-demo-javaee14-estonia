package com.sda.springdemojavaee14.homework.annotation;

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

    }
}
