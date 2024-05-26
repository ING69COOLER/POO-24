/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalTime;

public class ParqueaderoTest {

    private Parqueadero parqueadero;
    private Puesto puesto;
    private Propietario propietario;
    private Carro carro;
    private Registro registro;

    @BeforeEach
    public void setUp() {
        parqueadero = new Parqueadero("mememe");
        puesto = new Puesto(2, 2);
        propietario = new Propietario("Manuel", "10946468", "89645231");
        carro = new Carro("PTA-234", "Twingo", propietario, Tarifa.CARRO);
        registro = new Registro(carro);
    }

    @Test
    public void testGetNombre() {
        assertEquals("mememe", parqueadero.getNombre());
    }

    @Test
    public void testObtenerRegistro() {
        parqueadero.agregarRegistro(registro);
        assertNotNull(parqueadero.obtenerRegistro());
    }

    @Test
    public void testObtenerVehiculoMediantePuesto() {
        parqueadero.agregarPuestos(puesto);
        parqueadero.agregarRegistro(registro);
        parqueadero.agregarVehiculoPuesto("PTA-234", LocalTime.of(9, 00));
        assertNotNull(parqueadero.obtenerVehiculoMediantePuesto(1, 1));
    }

    @Test
    public void testObtenerDueñoMediantePuesto() {
        parqueadero.agregarPuestos(puesto);
        parqueadero.agregarRegistro(registro);
        parqueadero.agregarVehiculoPuesto("PTA-234", LocalTime.of(9, 00));
        assertNotNull(parqueadero.obtenerDueñoMediantePuesto(1, 1));
    }

    @Test
    public void testDespacharVehiculo() {
        parqueadero.agregarPuestos(puesto);
        parqueadero.agregarRegistro(registro);
        parqueadero.agregarVehiculoPuesto("PTA-234", LocalTime.of(9, 00));
        assertNotNull(parqueadero.despacharVehiculo("PTA-234", LocalTime.of(13, 00)));
    }

    @Test
    public void testObtenerReporteDia() {
        parqueadero.agregarPuestos(puesto);
        parqueadero.agregarRegistro(registro);
        parqueadero.agregarVehiculoPuesto("PTA-234", LocalTime.of(9, 00));
        parqueadero.despacharVehiculo("PTA-234", LocalTime.of(13, 00));
        assertNotNull(parqueadero.obtenerReporteDia());
    }

    @Test
    public void testObtenerReporteMes() {
        parqueadero.agregarPuestos(puesto);
        parqueadero.agregarRegistro(registro);
        parqueadero.agregarVehiculoPuesto("PTA-234", LocalTime.of(9, 00));
        parqueadero.despacharVehiculo("PTA-234", LocalTime.of(13, 00));
        assertNotNull(parqueadero.obtenerReporteMes());
    }
}







