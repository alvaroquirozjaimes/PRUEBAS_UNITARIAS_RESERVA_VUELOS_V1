package org.Reservations.model; // Paquete de la clase Passenger

import java.time.LocalDate; // Importa LocalDate para manejar fechas
import java.util.Objects; // Importa Objects para el manejo de objetos

public class Passenger {
    private Long id; // Identificador del pasajero
    private String firstName; // Nombre del pasajero
    private String lastName; // Apellido del pasajero
    private String documentNumber; // Número de documento del pasajero
    private String documentType; // Tipo de documento del pasajero (por ejemplo, DNI, Pasaporte)
    private LocalDate birthday; // Fecha de nacimiento del pasajero

    // Getters y Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Métodos equals y hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // Verifica si son la misma instancia
        if (o == null || getClass() != o.getClass()) return false; // Verifica si es el mismo tipo
        Passenger passenger = (Passenger) o; // Hace un casting seguro
        return Objects.equals(id, passenger.id) &&
                Objects.equals(firstName, passenger.firstName) &&
                Objects.equals(lastName, passenger.lastName) &&
                Objects.equals(documentNumber, passenger.documentNumber) &&
                Objects.equals(documentType, passenger.documentType) &&
                Objects.equals(birthday, passenger.birthday); // Compara los atributos
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, documentNumber, documentType, birthday); // Genera el código hash
    }
}
