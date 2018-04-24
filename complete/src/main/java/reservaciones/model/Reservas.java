package reservaciones.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity(name = "RESERVAS")
public class Reservas {

    @Id
    private String numeroreserva;
    private String cedula;
    private String nombre;
    private String apellido;
    private Date fechanacimiento;

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public String getNumeroreserva() {
        return numeroreserva;
    }

    public void setNumeroreserva(String numeroreserva) {
        this.numeroreserva = numeroreserva;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }
}

