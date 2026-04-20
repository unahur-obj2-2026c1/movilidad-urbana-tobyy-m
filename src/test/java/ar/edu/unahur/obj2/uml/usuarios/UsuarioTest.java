package ar.edu.unahur.obj2.uml.usuarios;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.uml.vehiculos.*;

public class UsuarioTest {
    @Test
    void dadoUnUsuario_SeConoceElNombreCorrectamente() {
            Usuario usuario = new Usuario("Toby");
            assert usuario.getNombre().equals("Toby");

    }

    @Test
    void dadoUnUsuario_AlquilaCorrectamenteUnMonopatin() {
        Usuario usuario = new Usuario("Toby");
        Monopatin monopatin = new Monopatin(true, "Yamaha");
        usuario.alquilar(monopatin);
        assert !monopatin.getDisponible();
    }
}
