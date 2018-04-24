package reservaciones.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Vuelos {

    @Id
    @Column(name = "IDVUELO")
    private String idVuelo;
    @Column(name = "origen")
    private String origen;
    @Column(name = "destino")
    private String destino;
    @Column(name = "fecha_Vuelo")
    private Date fechaVuelo;
    @Column(name = "sillasDisponibles")
    private Integer sillasDisponibles;


    public String getIdVuelo() {
        return idVuelo;
    }

    public void setIdVuelo(String idVuelo) {
        this.idVuelo = idVuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getFechaVuelo() {
        return fechaVuelo;
    }

    public void setFechaVuelo(Date fechaVuelo) {
        this.fechaVuelo = fechaVuelo;
    }

    public Integer getSillasDisponibles() {
        return sillasDisponibles;
    }

    public void setSillasDisponibles(Integer sillasDisponibles) {
        this.sillasDisponibles = sillasDisponibles;
    }
}

