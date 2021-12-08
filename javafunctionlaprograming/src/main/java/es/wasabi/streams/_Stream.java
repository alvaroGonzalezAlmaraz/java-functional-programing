package es.wasabi.streams;

import java.util.List;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class _Stream {

    public static void main(String[] args) {

        List<Person> people = List.of(new Person("juan", Gender.MALE), new Person("Nuria", Gender.FEMALE),
                new Person("dani", Gender.MALE), new Person("pepe", Gender.MALE), new Person("alice", Gender.FEMALE));

        people.stream().map(person -> person.gender)
                .collect(Collectors.toSet())
                .forEach(System.out::println);// Es lo mismo euq esto (gender -> System.out.println(gender));

        people.stream().map(person -> person.name)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        people.stream().map(person -> person.name)
                .mapToInt(name -> name.length())
                .forEach(System.out::println);

        // o lo que es lo mismo usando functions
        Function<Person, String> personStringFunction = person -> person.name;
        ToIntFunction<String> length = String::length;
        IntConsumer println = x -> System.out.println(x);

        people.stream().map(personStringFunction).mapToInt(length).forEach(println);

        // Otro ejemplo de streams, sacar las chicas
        // Sacando la función Predicate<Person> personPredicate = person ->
        // Gender.FEMALE.equals(person.gender);
        boolean soloMujeres = people.stream().allMatch(person -> Gender.FEMALE.equals(person.gender));
        System.out.println(soloMujeres);

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
