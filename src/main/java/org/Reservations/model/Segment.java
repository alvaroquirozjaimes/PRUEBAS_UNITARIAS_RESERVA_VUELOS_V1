package org.Reservations.model; // Especifica el paquete al que pertenece la clase.

import java.util.Objects; // Importa la clase Objects para facilitar operaciones de comparación y hash.

public class Segment { // Define la clase Segment, que representa un segmento de viaje.

    private Long id; // Identificador único del segmento.
    private String origin; // Ciudad de origen del segmento.
    private String destination; // Ciudad de destino del segmento.
    private String departure; // Fecha y hora de salida del segmento.
    private String arrival; // Fecha y hora de llegada del segmento.
    private String carrier; // Compañía aérea o transportista del segmento.

    // Método getter para obtener el origen.
    public String getOrigin() {
        return origin;
    }

    // Método setter para establecer el origen.
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    // Método getter para obtener el destino.
    public String getDestination() {
        return destination;
    }

    // Método setter para establecer el destino.
    public void setDestination(String destination) {
        this.destination = destination;
    }

    // Método getter para obtener la fecha y hora de salida.
    public String getDeparture() {
        return departure;
    }

    // Método setter para establecer la fecha y hora de salida.
    public void setDeparture(String departure) {
        this.departure = departure;
    }

    // Método getter para obtener la fecha y hora de llegada.
    public String getArrival() {
        return arrival;
    }

    // Método setter para establecer la fecha y hora de llegada.
    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    // Método getter para obtener el transportista.
    public String getCarrier() {
        return carrier;
    }

    // Método setter para establecer el transportista.
    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    // Método getter para obtener el ID del segmento.
    public Long getId() {
        return id;
    }

    // Método setter para establecer el ID del segmento.
    public void setId(Long id) {
        this.id = id;
    }

    // Método para comparar dos objetos Segment y determinar si son iguales.
    @Override
    public boolean equals(Object o) {
        if (this == o) // Verifica si ambos objetos son la misma instancia.
            return true;
        if (o == null || getClass() != o.getClass()) // Verifica si el objeto es nulo o de un tipo diferente.
            return false;
        Segment segment = (Segment) o; // Realiza un casting del objeto a Segment.
        // Compara los atributos relevantes para determinar igualdad.
        return Objects.equals(id, segment.id) &&
                Objects.equals(origin, segment.origin) &&
                Objects.equals(destination, segment.destination) &&
                Objects.equals(departure, segment.departure) &&
                Objects.equals(arrival, segment.arrival) && // Aquí hay un error tipográfico, debería ser 'arrival'.
                Objects.equals(carrier, segment.carrier);
    }

    // Método para generar un código hash del objeto Segment.
    @Override
    public int hashCode() {
        // Calcula un código hash basado en los atributos del segmento.
        return Objects.hash(id, origin, destination, departure, arrival, carrier);
    }
}
