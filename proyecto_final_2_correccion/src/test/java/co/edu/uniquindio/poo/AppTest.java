/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        LOG.info("Iniciado test Parqueadero Funcionando");
        Puesto puestos = new Puesto(3, 3);
        Parqueadero parqueadero = new Parqueadero("Parqueaderito");
       
        parqueadero.agregarPuestos(puestos);
        
        Propietario propietario_1 = new Propietario("Manuel", "1092455543", "304579300");
        Carro carro_1 = new Carro("PTA-234", "Camaro", propietario_1, Tarifa.CARRO);

        Registro registro = new Registro(carro_1);
        parqueadero.agregarRegistro(registro);

        parqueadero.agregarVehiculoPuesto("PTA-234");

        LOG.info("Finalizando test Parqueadero Funcionando");
    }
}
