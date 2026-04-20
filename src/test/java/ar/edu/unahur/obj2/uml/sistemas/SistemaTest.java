package ar.edu.unahur.obj2.uml.sistemas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.uml.excepciones.VehiculoNoDisponibleException;
import ar.edu.unahur.obj2.uml.usuarios.Usuario;
import ar.edu.unahur.obj2.uml.vehiculos.Monopatin;

public class SistemaTest {
    @Test
    void dadoUnSistema_SeConocenLosAlquileresRealizados() {
        Sistema sistema = new Sistema();
        sistema.getAlquileresRealizados().clear();
        Usuario usuario = new Usuario("Toby");
        Monopatin monopatin = new Monopatin(true, "Yamaha");

        Sistema.registrarAlquiler(usuario, monopatin);

        assert sistema.getAlquileresRealizados().size() == 1;
    }

    @Test
    void dadoUnSistema_SeConocenLosVehiculosDisponibles() {
        Sistema sistema = new Sistema();
        sistema.getAlquileresRealizados().clear();
        Usuario usuario = new Usuario("Toby");
        Monopatin monopatinNoDisponible = new Monopatin(true, "Yamaha");
        Monopatin monopatinDisponible = new Monopatin(true, "Honda");

        Sistema.registrarAlquiler(usuario, monopatinNoDisponible);
        Sistema.registrarAlquiler(usuario, monopatinDisponible);
        sistema.getAlquileresRealizados().get(1).finalizarAlquiler();

        assert sistema.getVehiculosDisponibles().size() == 1;
        assert sistema.getVehiculosDisponibles().get(0).equals(monopatinDisponible);
    }

    @Test
    void dadoUnSistema_RegistrarAlquilerLanzaErrorSiElVehiculoNoEstaDisponible() {
        Sistema sistema = new Sistema();
        sistema.getAlquileresRealizados().clear();
        Usuario usuario = new Usuario("Toby");
        Monopatin monopatin = new Monopatin(false, "Yamaha");

        Assertions.assertThrows(VehiculoNoDisponibleException.class,
                () -> Sistema.registrarAlquiler(usuario, monopatin));

    }
}
