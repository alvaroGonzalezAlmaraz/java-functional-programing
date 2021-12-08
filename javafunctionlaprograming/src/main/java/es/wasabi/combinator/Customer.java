package es.wasabi.combinator;

import java.time.LocalDate;

public class Customer {

    private final String name;
    private final String email;
    private final String telefono;
    private final LocalDate fechaNacimiento;

    public Customer(String name, String email, String telefono, LocalDate fechaNacimiento) {
        this.name = name;
        this.email = email;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

}
