package co.edu.uniquindio.poo;

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
    public void agregarPuestos(Puesto puestos) {
        setPuestos(puestos);
    }
    public int calcularTarifa(String placa) {
      //recorro la matriz y si  en esa matriz hay un elemnto con la misma placa que laque llego, optenga la tarifa de ese elemento y multiplicarla por la diferencoa entre el timpo que se va a retirar y la hora en la que llego 
      int tarifa = 0;  
      tarifa = puestos.obtenerTarifa(placa);
      return tarifa;
    
}
    public String obtenerDueñoVehiculo(int fila, int columna) {
       String dueño = "";
       dueño = puestos.obtenerDueño(fila,columna);
        return dueño;
    }
    public String obtenerVehiculoPuesto(int fila, int columna) {
        String vehiculo = "";
        vehiculo = puestos.obtenerVehiculo(fila,columna);
         return vehiculo;
    }
    public String comprobarPuesto(int fila, int columna) {
        String validacion = "";
        validacion = puestos.obteterDisponibilidadPuesto(fila,columna);
        return validacion;
    }
    public String obtenerRegistro() {
        String registro = "";
        registro = puestos.registro();
        
        return registro;
    }
    public void retirarVehiculo(String placa) {
       puestos.retirarVehiculo(placa);

       
    }
 
}
