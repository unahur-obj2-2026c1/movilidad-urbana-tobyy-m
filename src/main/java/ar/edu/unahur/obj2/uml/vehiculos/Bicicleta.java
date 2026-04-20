package ar.edu.unahur.obj2.uml.vehiculos;

public class Bicicleta extends Vehiculo{
    private final Integer rodado;

    public Bicicleta(Boolean disponible, Integer rodado) {
        super(disponible);
        this.rodado = rodado;
    }

    public Integer getRodado() {
        return rodado;
    }

}
