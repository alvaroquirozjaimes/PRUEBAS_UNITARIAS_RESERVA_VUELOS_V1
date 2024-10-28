package org.Reservations.mapper; // Paquete donde se encuentra el mapeador

import org.Reservations.dto.ReservationDTO; // Importa el DTO para reservas
import org.Reservations.model.Reservation; // Importa la entidad de reservas
import org.mapstruct.Mapper; // Importa la anotación para definir un mapeador
import org.springframework.core.convert.converter.Converter; // Importa la interfaz Converter de Spring

@Mapper(componentModel = "spring") // Define que este mapeador es un componente Spring
public interface ReservationDTOMapper extends Converter<ReservationDTO, Reservation> {

    @Override
    Reservation convert(ReservationDTO source); // Método para convertir ReservationDTO a Reservation

}
