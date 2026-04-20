package ar.edu.unahur.obj2.uml.alquileres;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.uml.usuarios.Usuario;
import ar.edu.unahur.obj2.uml.vehiculos.Monopatin;

public class AlquilerTest {
    @Test
    void dadoUnAlquilerIniciado_AlFinalizarSeLiberaElVehiculo() {
        Usuario usuario = new Usuario("Toby");
        Monopatin monopatin = new Monopatin(true, "Yamaha");
        Alquiler alquiler = new Alquiler(usuario, monopatin);

        alquiler.iniciarAlquiler();
        alquiler.finalizarAlquiler();

        assert monopatin.getDisponible();
    }

    @Test
    void dadoUnAlquiler_SeConoceElVehiculoCorrectamente() {
        Usuario usuario = new Usuario("Toby");
        Monopatin monopatin = new Monopatin(true, "Yamaha");
        Alquiler alquiler = new Alquiler(usuario, monopatin);

        assert alquiler.getVehiculo().equals(monopatin);
    }

    @Test
    void dadoUnAlquiler_AlIniciarSeOcupaElVehiculo() {
        Usuario usuario = new Usuario("Toby");
        Monopatin monopatin = new Monopatin(true, "Yamaha");
        Alquiler alquiler = new Alquiler(usuario, monopatin);

        alquiler.iniciarAlquiler();

        assert !monopatin.getDisponible();
    }
}
