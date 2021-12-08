package es.wasabi.functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

//Representa una operación que acepta un parametro pero no devuuelve ningun resultado

public class _Consumer {

    public static void main(String[] args) {

        fecicitarCliente(new Customer("Maria", "666 666 666"));

        fecicitarClienteConsumer.accept(new Customer("Maria", "666 666 666"));

        Customer pepe = new Customer("pepe", "666 666 666");

        fecicitarClienteConsumerB2.accept(pepe, false);

    }

    // Imperarivo
    static void fecicitarCliente(Customer customer) {
        System.out.println("Enhorabuena " + customer.customerName + " te has registrado con el número de telefono "
                + customer.customerTelefono);
    }

    // Funcional
    static Consumer<Customer> fecicitarClienteConsumer = customer -> System.out
            .println("Enhorabuena " + customer.customerName + " te has registrado con el número de telefono "
                    + customer.customerTelefono);

    static BiConsumer<Customer, Boolean> fecicitarClienteConsumerB2 = (customer, showPhoineNumber) -> System.out
            .println("Enhorabuena " + customer.customerName + " te has registrado con el número de telefono "
                    + (showPhoineNumber ? customer.customerTelefono : "No has intoducio el numero"));

    static class Customer {
        private final String customerName;
        private final String customerTelefono;

        public Customer(String customerName, String customerTelefono) {
            this.customerName = customerName;
            this.customerTelefono = customerTelefono;
        }

    }
}
