package es.wasabi.combinator;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidationService {

    private boolean isEmailValid(String email) {
        return email.contains("@");
    }

    private boolean isPhoneValid(String telefono) {
        return telefono.startsWith("+0");
    }

    private boolean esAdulto(LocalDate fechaNacimiento) {
        return Period.between(fechaNacimiento, LocalDate.now()).getYears() > 16;
    }

    public boolean isValid(Customer cliente) {
        return isEmailValid(cliente.getEmail())
                && isPhoneValid(cliente.getTelefono())
                && esAdulto(cliente.getFechaNacimiento());
    }

}
