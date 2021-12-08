package es.wasabi.combinator;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

import static es.wasabi.combinator.CustomerRegistrationValidator.*;
import static es.wasabi.combinator.CustomerRegistrationValidator.ValidationResult.*;

public interface CustomerRegistrationValidator
        extends Function<Customer, ValidationResult> {

    static CustomerRegistrationValidator isEmailValid() {
        return customer -> customer.getEmail().contains("@") ? SUCESS
                : EMAIL_NO_VALIDO;
    }

    static CustomerRegistrationValidator isPhoneValid() {
        return customer -> customer.getTelefono().startsWith("+0") ? SUCESS
                : TELEFONO_nO_VALIDO;
    }

    static CustomerRegistrationValidator esAdulto() {
        return customer -> Period.between(customer.getFechaNacimiento(), LocalDate.now()).getYears() > 16 ? SUCESS
                : NO_ES_ADULTO;
    }

    default CustomerRegistrationValidator and(CustomerRegistrationValidator other) {
        return customer -> {
            ValidationResult result = this.apply(customer);
            return result.equals(SUCESS) ? other.apply(customer) : result;
        };
    }

    enum ValidationResult {
        SUCESS,
        TELEFONO_nO_VALIDO,
        EMAIL_NO_VALIDO,
        NO_ES_ADULTO

    }

}
