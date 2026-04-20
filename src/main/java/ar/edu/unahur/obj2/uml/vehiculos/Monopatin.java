package ar.edu.unahur.obj2.uml.vehiculos;

public class Monopatin extends Vehiculo{
    private  String marca;

    public Monopatin(Boolean disponible, String marca) {
        super(disponible);
        this.marca = marca;
    }

    public String getMarca(){
        return marca;
    }


}
