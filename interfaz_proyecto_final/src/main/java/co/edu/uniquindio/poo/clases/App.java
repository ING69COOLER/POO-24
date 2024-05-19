package co.edu.uniquindio.poo.clases;

import java.time.LocalTime;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Puesto puesto = new Puesto(2, 2);
        Parqueadero bengala = new Parqueadero("Bengala");
        Carro carro_1 = new Carro("PTA-200", "2025", "Manuel", LocalTime.of(9, 0), 3000);
        MotoClasica moto_1 = new MotoClasica("PTA-23E", "2024", "Ruben", LocalTime.of(9, 0), 100, 1000);
        MotoHibrida moto_2 = new MotoHibrida("ERT-25E", "2020", "Laura", LocalTime.of(9, 0), 200, 1000);
        Carro carro_2 = new Carro("MNA-455", "Twingo", "Laura", LocalTime.of(9, 0, 0), 8000);

        bengala.agregarPuestos(puesto);
        System.out.println(bengala.obtenerRegistro());
        bengala.agregarVehiculo(carro_2);
        bengala.agregarVehiculo(carro_1);

        bengala.agregarVehiculo(moto_1);
        bengala.agregarVehiculo(moto_2);

        bengala.horaSalida(LocalTime.of(11, 50), "MNA-455");
        bengala.horaSalida(LocalTime.of(11, 30), "PTA-200");
        System.out.println(bengala.calcularTarifa("PTA-200"));
        bengala.horaSalida(LocalTime.of(11, 30),"PTA-23E");
        // bengala.horaSalida(LocalTime.of(11, 30),"ERT-25E");

         System.out.println(bengala.calcularTarifa("PTA-23E"));
        System.out.println(bengala.calcularTarifa("MNA-455"));
        bengala.retirarVehiculo("PTA-200");
        bengala.retirarVehiculo("MNA_455");
        bengala.retirarVehiculo("PTA-23E");
        // System.out.println( bengala.obtenerDueñoVehiculo(0,0));
        // System.out.println( bengala.obtenerVehiculoPuesto(0,0));
        // System.out.println(bengala.comprobarPuesto(0,0));
        System.out.println(bengala.obtenerRegistro());

        System.out.println(bengala.obtenerReporteDia());
    }
}
