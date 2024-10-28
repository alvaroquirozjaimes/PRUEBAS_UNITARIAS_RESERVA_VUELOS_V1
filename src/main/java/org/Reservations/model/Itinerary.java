package org.Reservations.model; // Paquete de la clase Itinerary

import java.util.List; // Importa la clase List
import java.util.Objects; // Importa la clase Objects para el manejo de objetos

public class Itinerary {
    private Long id; // Identificador del itinerario
    private List<Segment> segment; // Lista de segmentos que componen el itinerario
    private Price price; // Precio del itinerario

    // Getters y Setters
    public List<Segment> getSegment() {
        return segment;
    }

    public void setSegment(List<Segment> segment) {
        this.segment = segment;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
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
        Itinerary itinerary = (Itinerary) o; // Hace un casting seguro
        return Objects.equals(id, itinerary.id) &&
                Objects.equals(segment, itinerary.segment) &&
                Objects.equals(price, itinerary.price); // Compara los atributos
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, segment, price); // Genera el código hash
    }
}
