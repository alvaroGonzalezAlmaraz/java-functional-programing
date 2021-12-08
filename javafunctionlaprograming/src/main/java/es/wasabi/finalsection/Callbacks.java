package es.wasabi.finalsection;

import java.util.function.Consumer;

public class Callbacks {

    public static void main(String[] args) {

        hello("juan", null, value -> {
            System.out.println("No hay nombre para " + value);
        });

    }

    static void hello(String firstName, String lastName, Consumer<String> callback) {
        System.out.println(firstName);

        if (lastName != null) {
            System.out.println(lastName);
        } else {
            callback.accept(firstName);
        }
    }

}
