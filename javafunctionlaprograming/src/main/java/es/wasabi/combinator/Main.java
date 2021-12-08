package es.wasabi.combinator;

import java.time.LocalDate;

import es.wasabi.combinator.CustomerRegistrationValidator.ValidationResult;

import static es.wasabi.combinator.CustomerRegistrationValidator.*;

public class Main {

    public static void main(String[] args) {
        Customer cliente = new Customer(
                "Alice",
                "alice@gmail.com",
                "+000000",
                LocalDate.of(2000, 1, 1));

        // System.out.println(new CustomerValidationService().isValid(cliente));

        // Combination pattern
        ValidationResult result = isEmailValid().and(CustomerRegistrationValidator.isPhoneValid()).apply(cliente);

        System.out.println(result);

        if (result != ValidationResult.SUCESS) {
            throw new IllegalStateException(result.name());
        }

    }

}
