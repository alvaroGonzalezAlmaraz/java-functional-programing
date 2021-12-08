package es.wasabi.imperative;

import java.util.ArrayList;
import java.util.List;

import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(new Person("juan", Gender.MALE), new Person("Nuria", Gender.FEMALE),
                new Person("dani", Gender.MALE), new Person("pepe", Gender.MALE), new Person("alice", Gender.FEMALE));

        // Imperative programing
        System.out.println("Imperative programming");
        List<Person> females = new ArrayList<>();

        for (Person person : people) {
            if (Gender.FEMALE.equals(person.gender)) {
                females.add(person);
            }
        }

        for (Person female : females) {
            System.out.println(female);
        }

        // Declarative programing
        System.out.println("Declarative programming");
        people.stream().filter(person -> Gender.FEMALE.equals(person.gender))// .collect(Collectors.toList())
                .forEach(System.out::println);

    }

    static class Person {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person [gender=" + gender + ", name=" + name + "]";
        }

    }

    enum Gender {
        MALE, FEMALE
    }

}
