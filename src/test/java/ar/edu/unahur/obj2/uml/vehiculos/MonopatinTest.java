package ar.edu.unahur.obj2.uml.vehiculos;

import org.junit.jupiter.api.Test;

public class MonopatinTest {
    @Test
    void dadoUnMonopatin_SeConoceLaMarcaCorrectamente() {
        Monopatin monopatin = new Monopatin(true, "Yamaha");
        assert monopatin.getMarca().equals("Yamaha");
    }
}
