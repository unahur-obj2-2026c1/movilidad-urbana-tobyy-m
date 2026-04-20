package ar.edu.unahur.obj2.uml.alquileres;
import java.time.LocalDate;


import ar.edu.unahur.obj2.uml.usuarios.Usuario;
import ar.edu.unahur.obj2.uml.vehiculos.*;

public class Alquiler {
    private Vehiculo vehiculo;
    private Usuario usuario;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    

    public Alquiler(Usuario usuario, Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
        this.usuario = usuario;
    }

    public void iniciarAlquiler(){
        this.fechaInicio = LocalDate.now();
        this.vehiculo.alquilar();

    }

    public void finalizarAlquiler(){
        this.fechaFin = LocalDate.now();
        this.vehiculo.devolver();
    }


    public Vehiculo getVehiculo(){
        return vehiculo;
    }
}
