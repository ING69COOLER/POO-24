package co.edu.uniquindio.poo;

import java.time.LocalDateTime;

public class Parqueadero {
    private final String nombre;
    public Puesto puestos;

    public Parqueadero(String nombre) {
        this.nombre = nombre;

    }

    public String getNombre() {
        return nombre;
    }

    public Puesto getPuestos() {
        return puestos;
    }

    public void setPuestos(Puesto puestos) {
        this.puestos = puestos;
    }

    @Override
    public String toString() {
        return "Parqueadero [nombre=" + nombre + ", puestos=" + puestos + "]";
    }

    // Metodo para agregar la matriz de puestos al parqueadero
    public void agregarPuestos(Puesto puestos) {
        setPuestos(puestos);
    }

    // Metodo en el cual llama a un metodo en una clase "Puesto" para calcular la
    // tarifa de un vehiculo al cual se le envio la placa en un String
    public String calcularTarifa(String placa) {

        String mensaje = "";
        int tarifa = puestos.obtenerTarifa(placa);
        mensaje = "Su tarifa a pagar es de: " + tarifa;
        return mensaje;

    }

    // Metodo que llama a un metodo en la clase "puesto" para asi obtener el nombre
    // del propietario de un vehiculo dependiendo de la fila y columna ubicada
    public String obtenerDueñoVehiculo(int fila, int columna) {
        String dueño = "";
        dueño = puestos.obtenerDueño(fila, columna);
        return dueño;
    }

    // Metodo que llama a un metodo en la clase "puesto" para asi obtener el
    // vehiculo dependiendo de la fila y columna ubicada
    public String obtenerVehiculoPuesto(int fila, int columna) {
        String vehiculo = "";
        vehiculo = puestos.obtenerVehiculo(fila, columna);
        return vehiculo;
    }

    // Metodo que llama a otro metodo en la clase "puesto " para asi poder saber si
    // un puesto del parqqueadero esta disponible o no
    public String comprobarPuesto(int fila, int columna) {
        String validacion = "";
        validacion = puestos.obteterDisponibilidadPuesto(fila, columna);
        return validacion;
    }

    // Metodo que llama a otro metod en la clase "puesto" para poder obtener el
    // registro del parqueadero
    public String obtenerRegistro() {
        String registro = "";
        registro = puestos.registro();

        return registro;
    }

    // Metodo que llama a otro metodo en la clase "Pueto" para retiruar un vehiculo
    // del parqueadero
    public void retirarVehiculo(String placa) {
        puestos.retirarVehiculo(placa);

    }

    // Metodo que llma a otro metodo en la clase "puesto " para asi obtener el
    // reporte del dia del parqueadero
    public String obtenerReporteDia() {
        String reporte;
        reporte = puestos.getListaReporte();
        return reporte;
    }

}
