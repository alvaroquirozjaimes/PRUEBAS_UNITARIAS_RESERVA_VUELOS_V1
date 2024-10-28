package org.Reservations.mapper; // Paquete donde se encuentra el mapeador

import org.Reservations.dto.ReservationDTO; // Importa el DTO para reservas
import org.Reservations.model.Reservation; // Importa la entidad de reservas
import org.springframework.core.convert.converter.Converter; // Importa la interfaz Converter de Spring
import org.mapstruct.Mapper; // Importa la anotación para definir un mapeador

@Mapper(componentModel = "spring") // Define que este mapeador es un componente Spring
public interface ReservationMapper extends Converter<Reservation, ReservationDTO> {

    @Override
    ReservationDTO convert(Reservation source); // Método para convertir Reservation a ReservationDTO

}
