package org.Reservations.mapper; // Paquete donde se encuentra el mapeador

import org.Reservations.dto.ReservationDTO; // Importa el DTO para reservas
import org.Reservations.model.Reservation; // Importa la entidad de reservas
import org.mapstruct.Mapper; // Importa la anotación para definir un mapeador
import org.springframework.core.convert.converter.Converter; // Importa la interfaz Converter de Spring

import java.util.List; // Importa la clase List

@Mapper(componentModel = "spring") // Define que este mapeador es un componente Spring
public interface ReservationsMapper extends Converter<List<Reservation>, List<ReservationDTO>> {

    @Override
    List<ReservationDTO> convert(List<Reservation> source); // Método para convertir una lista de Reservation a una lista de ReservationDTO

}
