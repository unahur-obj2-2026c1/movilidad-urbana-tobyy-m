package ar.edu.unahur.obj2.uml.usuarios;

import ar.edu.unahur.obj2.uml.sistemas.Sistema;
import ar.edu.unahur.obj2.uml.vehiculos.Vehiculo;

public class Usuario {
    private final String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void alquilar(Vehiculo vehiculo) {
        Sistema.registrarAlquiler(this, vehiculo);
    }
    
}
