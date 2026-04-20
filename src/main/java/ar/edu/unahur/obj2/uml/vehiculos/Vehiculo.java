package ar.edu.unahur.obj2.uml.vehiculos;

public abstract class Vehiculo {
    private Boolean disponible = true;

    public Boolean getDisponible() {
        return disponible;
    }
    
    public Vehiculo(Boolean disponible) {
        this.disponible = disponible;
    }

    public void alquilar(){
        this.disponible = false;
    }

    public void devolver(){
        this.disponible = true;
    }

}
