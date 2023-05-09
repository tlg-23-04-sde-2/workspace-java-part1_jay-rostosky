package com.panion;

import java.time.LocalDate;

class PersonClient {

    public static void main(String[] args) {
        Person p1 = new Person("Jay", LocalDate.of(1966, 12, 5));
        System.out.println(p1);  // toString() automatically called

        // print "<name> is <age> years old"
        System.out.printf("%s is %s years old\n", p1.getName(), p1.getAge());
        System.out.println("done");
    }
}