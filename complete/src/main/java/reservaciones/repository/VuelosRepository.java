package reservaciones.repository;

import org.springframework.data.repository.CrudRepository;
import reservaciones.model.Vuelos;

public interface VuelosRepository extends CrudRepository<Vuelos, String> {
}
