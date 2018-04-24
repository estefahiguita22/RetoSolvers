package reservaciones.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reservaciones.model.Reservas;
import reservaciones.repository.ReservasRepository;
import reservaciones.repository.VuelosRepository;
import reservaciones.model.Vuelos;

@RestController

public class ReservacionesController {

    @Autowired
    private VuelosRepository vuelosRepository;

    @Autowired
    private ReservasRepository reservasRepository;

    @PostMapping(path = "/addReserva")
    public void addReserva(@RequestBody Reservas requestReservas) {
        reservasRepository.save(requestReservas);
    }

    @GetMapping(path = "/getAllVuelos")
    public @ResponseBody
    Iterable<Vuelos> getAllVuelos() {
        return vuelosRepository.findAll();
    }
}
