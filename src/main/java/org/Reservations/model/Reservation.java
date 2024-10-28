package org.Reservations.model; // Paquete de la clase Reservation

import java.util.List; // Importa la clase List
import java.util.Objects; // Importa Objects para el manejo de objetos

public class Reservation {
    private Long id; // Identificador único de la reserva
    private List<Passenger> passengers; // Lista de pasajeros asociados a la reserva
    private Itinerary itinerary; // Itinerario de la reserva

    // Getters y Setters
    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    public Itinerary getItinerary() {
        return itinerary;
    }

    public void setItinerary(Itinerary itinerary) {
        this.itinerary = itinerary;
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
        Reservation that = (Reservation) o; // Hace un casting seguro
        return Objects.equals(id, that.id) &&
                Objects.equals(passengers, that.passengers) &&
                Objects.equals(itinerary, that.itinerary); // Compara los atributos
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, passengers, itinerary); // Genera el código hash
    }
}
