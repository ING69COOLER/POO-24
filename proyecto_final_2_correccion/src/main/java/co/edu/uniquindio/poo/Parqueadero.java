package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Parqueadero {
    private String nombre;
    private Registro[] registros;
    private Puesto puestos;

    public Parqueadero(String nombre) {
        this.nombre = nombre;
        this.registros = new Registro[10];

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Puesto getPuestos() {
        return puestos;
    }

    public void setPuestos(Puesto puestos) {
        this.puestos = puestos;
    }

    @Override
    public String toString() {
        return "Parqueadero [nombre=" + nombre + ", registros=" + registros + ", puestos=" + puestos + "]";
    }

    public Registro[] getRegistros() {
        return registros;
    }

    public void setRegistros(Registro[] registros) {
        this.registros = registros;
    }

    // Metodo para agregar la matriz de puestos al parqueadero
    public void agregarPuestos(Puesto puestos) {
        setPuestos(puestos);
    }

    // Metodo para agrega un registro al parqueadero
    public void agregarRegistro(Registro registro) {
        // Verificar si el registro ya existe
        for (Registro r : registros) {
            if (r != null && r.equals(registro)) {
                System.out.println("El registro ya existe");
                return;
            }
        }

        // Agregar el registro si no existe
        for (int i = 0; i < registros.length; i++) {
            if (registros[i] == null) {
                registros[i] = registro;
                break;
            }
        }
    }

    // Metodo para agregar un vehiculo a un puesto del parqueadero
    public void agregarVehiculoPuesto(String placa) {
        for (Registro registro : registros) {
            if (registro != null && registro.getVehiculo().getPlaca().equals(placa)) {
                Vehiculo vehiculo = registro.getVehiculo();
                boolean vehiculoAgregado = false;
                for (int i = 0; i < puestos.getListPuestos().length; i++) {
                    for (int j = 0; j < puestos.getListPuestos()[i].length; j++) {
                        if (puestos.getListPuestos()[i][j] == null) {
                            puestos.agregarVehiculo(vehiculo, i, j);
                            System.out.println("Se pasa a la clase puestos para agregar el vehiculo");
                            vehiculoAgregado = true;
                            break;
                        }
                    }
                    if (vehiculoAgregado) {
                        break; // Salir del bucle externo si el vehículo se agregó exitosamente
                    }
                }
                if (vehiculoAgregado) {
                    break; // Salir del bucle de registros si el vehículo se agregó exitosamente
                }
            }
        }
    }

    // Metodo para obtener el registro de los vehiculos inscritos en el parqueadero
    public String obtenerRegistro() {
        String registroActualizado = "";
        for (int i = 0; i < registros.length; i++) {
            if (registros[i] != null) {
                registroActualizado = registroActualizado + "Propietario: "
                        + registros[i].getVehiculo().getPropietario().getNombre() + " Cedula: "
                        + registros[i].getVehiculo().getPropietario().getCedula() + " Telefono: "
                        + registros[i].getVehiculo().getPropietario().getNumeroTelefonico() + " Vehiculo: "
                        + registros[i].getVehiculo().getModelo() + "\n";
            }
        }
        return registroActualizado;
    }

    // Metodo para obtener el registro de los vehiculos que estan en el parqueadero
    public String obtenerRegistroVehiculos() {
        String registroVehiculo = "";

        for (int i = 0; i < puestos.getListPuestos().length; i++) {
            for (int j = 0; j < puestos.getListPuestos()[i].length; j++) {
                if(puestos.getListPuestos()[i][j] != null){
                    registroVehiculo = registroVehiculo + "El vehiculo "+puestos.getListPuestos()[i][j].getModelo()+" en el puesto "+(i+1)+","+(j+1)+ " es de "+puestos.getListPuestos()[i][j].getPropietario().getNombre()+"\n";
                }else{
                    registroVehiculo = registroVehiculo+"El puesto "+ (i+1)+","+(j+1)+" esta libre"+"\n";
                }
            }
        }
        return registroVehiculo;

    }
}
