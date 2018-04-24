package reservaciones.repository;

import org.springframework.data.repository.CrudRepository;
import reservaciones.model.Reservas;

public interface ReservasRepository extends CrudRepository<Reservas, String> {
}
