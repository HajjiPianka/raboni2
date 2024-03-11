package org.example;

import java.util.function.Function;

public class NameTestNew {
    public static void main(String[] args) {
        System.out.println("\n==== NameTestNew ===");
        List<pl.edu.pbs.laborki.lab3.Person> list1 = pl.edu.pbs.laborki.lab3.Person.createShortList();
        //Print Custom First Name and e-mail
        System.out.println("===Custom List===");
        for (pl.edu.pbs.laborki.lab3.Person person : list1) {
            System.out.println(
                    person.printCustom(p -> "Name: " + p.getGivenName() + " EMail " + p.getEmail())
            );
        }
        //define Western and Eastern Lambdas 
        Function<pl.edu.laborki.lab3.Person, String> westernStyle = p -> {
            return "\nName: " + p.getGivenName() + "" + p.getSurName() + "\n" +
                    "Age:" + p.getAge() + " " + "Gender: " + p.getGender() + "\n" +
                    "EMail: " + p.getEmail() + "\n" +
                    "Phhone: " + p.getPhone() + "\n" +
                    "Address: " + p.getAddress();
        };

        Function<pl.edu.pbs.laborki.lab3.Person, String> easternStyle = p -> "\nName: " + p.getSurName() + " " +
                p.getGivenName() + "\n" + "Age: " + p.getAge() + " " +
                "Gender: " + p.getGender() + "\n" +
                "EMail: " + p.getEmail() + "\n" +
                "Phone: " + p.getPhone() + "\n" +
                "Address: " + p.getAddress();

        //Print Western List 
        System.out.println("\n===Western List===");
        for (pl.edu.pbs.laborki.lab3.Person person : list1) {
            System.out.println(
                    person.printCustom(westernStyle)
            );
        }

        //Print Easten List
        System.out.println("\n===Eastern List===");
        for (Person person : list1) {
            System.out.println(
                    person.printCustom(westernStyle)
            );
        }
    }
}
