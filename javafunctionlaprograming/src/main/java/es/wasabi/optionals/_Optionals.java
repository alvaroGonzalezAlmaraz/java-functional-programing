package es.wasabi.optionals;

import java.util.Optional;

public class _Optionals {

    public static void main(String[] args) {
        // System.out.println(
        Optional.ofNullable("caca@gmail.com")
                // .orElseGet(() -> "Valor por defecto"));
                // .orElseThrow(() -> new IllegalStateException("Excepcion")));
                .ifPresent(value -> System.out.println("Mandando email a: " + value));
    }
}
