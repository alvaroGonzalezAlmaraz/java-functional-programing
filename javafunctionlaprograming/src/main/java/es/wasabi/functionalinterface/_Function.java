package es.wasabi.functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {

        // Progrmacion imperativa
        int increment = increment(0);
        System.out.println(increment);

        // Function es una interface que recibe un parametro de un tipo y devuelve el
        // resultado de un tipo Function<T,R>
        Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

        Function<Integer, Integer> multiplicaPor10 = number -> number * 10;

        Integer increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);

        // Se pueden concatenar funciones
        Function<Integer, Integer> sumarUnoYMultiplicarPor10 = incrementByOneFunction.andThen(multiplicaPor10);
        System.out.println(sumarUnoYMultiplicarPor10.apply(4));

        // BiFunction es lo mismo pero con dos parámetros
        BiFunction<Integer, Integer, Integer> incrementarUnoYMultiplicarPorFuncion = (numberAIncrementarPorUno,
                numeroMultiplicarPor) -> (numberAIncrementarPorUno + 1) * numeroMultiplicarPor;
        System.out.println("Prueba bifunction " + incrementarUnoYMultiplicarPorFuncion.apply(2, 3));
    }

    static int increment(int number) {
        return number + 1;
    }

    static int incrementarUnoYMultiplicarPor(int number, int multiplicarPor) {
        return (number + 1) * multiplicarPor;
    }

}
