package ar.edu.unahur.obj2.uml.vehiculos;

import org.junit.jupiter.api.Test;

public class BicicletaTest {
    @Test
    void dadaUnaBicicleta_SeConoceElRodadoCorrectamente() {
        Bicicleta bicicleta = new Bicicleta(true, 29);
        assert bicicleta.getRodado().equals(29);
    }
}
