package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
       Parqueadero parqueadero = new Parqueadero("mememe");
       System.out.println(parqueadero.getNombre());
       Puesto puestos = new Puesto(2, 2);
       parqueadero.agregarPuestos(puestos);
       Propietario propietario = new Propietario("Manuel", "10946468", "89645231");
       Carro carro__1 = new Carro("PTA-234", "Twingo", propietario, Tarifa.CARRO, "Renault");
      Registro registro = new Registro(carro__1);
       parqueadero.agregarRegistro(registro);

       parqueadero.agregarVehiculoPuesto("PTA-234");

       System.out.println(parqueadero.obtenerRegistro());
       System.out.println(parqueadero.obtenerRegistroVehiculos());
       //parqueadero.obtenerVehiculoMediantePuesto(1,1);
       //parqueadero.obtenerDueñoMediantePuesto(1,1);
       //parqueadero.calculaTarifa("PTA-234");
       //parqueadero.obtenerReporteDia();
       //parqueadero.obtenerReporteMes();
       //parqueadero.despacharVehiculo("PTA-234",13:00;



      
    }
}
