package es.wasabi.finalsection;

import java.util.function.Function;

public class Lambdas {
    public static void main(String[] args) {

        Function<String, String> upperCaseNombre = nombre ->
        // nombre.toUpperCase();
        {
            if (nombre.isBlank())
                throw new IllegalArgumentException("");
            return nombre.toUpperCase();
        };

        System.out.println(upperCaseNombre.apply("caca"));
    }
}

Object foo = new Object();