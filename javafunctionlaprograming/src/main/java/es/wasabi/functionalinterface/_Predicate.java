package es.wasabi.functionalinterface;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {

        System.out.println(telefonoValido("07000000000"));
        System.out.println(telefonoValido("00255553369"));

        System.out.println(telfonoValidoPredicate.test("07000000000"));
        System.out.println(telfonoValidoPredicate.test("00255553369"));

        System.out.println("concatenados");
        System.out.println(contieneNumero3.and(telfonoValidoPredicate).test("07000000300"));
    }

    static Boolean telefonoValido(String numeroDeTelefono) {
        return numeroDeTelefono.startsWith("07") && numeroDeTelefono.length() == 11;
    }

    // Predicate
    static Predicate<String> telfonoValidoPredicate = numeroDeTelefono -> numeroDeTelefono.startsWith("07")
            && numeroDeTelefono.length() == 11;

    // Los predicates se pueden concatenar
    static Predicate<String> contieneNumero3 = numeroDeTelefono -> numeroDeTelefono.contains("3");

}
