package es.wasabi.functionalinterface;

import java.util.List;
import java.util.function.Supplier;

public class _Suplier {
    public static void main(String[] args) {

        System.out.println(getDBConectionUrl());

        System.out.println(getDBConnectionUrlSupplier.get());

        System.out.println(getDBConnectionUrlsSupplier.get());
    }

    static String getDBConectionUrl() {
        return "jdbc://localhost:5432/users";
    }

    // Suplier devuelve un valor (string, lista or whatever)
    static Supplier<String> getDBConnectionUrlSupplier = () -> "jdbc://localhost:5432/users";

    static Supplier<List<String>> getDBConnectionUrlsSupplier = () -> List.of("1", "2");
}
