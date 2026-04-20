package ar.edu.unahur.obj2.uml.sistemas;
import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.uml.alquileres.Alquiler;
import ar.edu.unahur.obj2.uml.excepciones.VehiculoNoDisponibleException;
import ar.edu.unahur.obj2.uml.usuarios.Usuario;
import ar.edu.unahur.obj2.uml.vehiculos.Vehiculo;

public class Sistema {
    private static List<Alquiler> alquileresRealizados = new ArrayList<>();

    public List<Alquiler> getAlquileresRealizados() {
        return alquileresRealizados;
    }  
      
    public static void registrarAlquiler(Usuario usuario, Vehiculo vehiculo){
        if(vehiculo.getDisponible()){
            Alquiler alquiler = new Alquiler(usuario, vehiculo);
            alquileresRealizados.add(alquiler);
            alquiler.iniciarAlquiler();
        }else{
            throw new VehiculoNoDisponibleException("El vehículo no está disponible para alquilar.");
        }
    }

    public List<Vehiculo> getVehiculosDisponibles(){
        List<Vehiculo> vehiculos = new ArrayList<>();
        alquileresRealizados.forEach(a -> vehiculos.add(a.getVehiculo()));
        return vehiculos.stream().filter(v -> v.getDisponible()).toList();
    }

}
