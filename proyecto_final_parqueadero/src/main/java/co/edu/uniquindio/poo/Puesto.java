package co.edu.uniquindio.poo;

import java.util.Arrays;

public class Puesto {
    private final int fila;
    private final int columna;
    private boolean estado;
    private Vehiculo[][] listaVehiculos;

    public Puesto(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
        this.listaVehiculos = new Vehiculo[fila][columna];
    }

    public int getJ() {
        return columna;
    }

    public int getI() {
        return fila;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Vehiculo[][] getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(Vehiculo[][] listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    @Override
    public String toString() {
        return "Puesto [j=" + columna + ", i=" + fila + ", estado=" + estado + ", listaVehiculos="
                + Arrays.toString(listaVehiculos) + "]";
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        boolean vehiculoAgregado = false;
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                if (listaVehiculos[i][j] == null) {
                    listaVehiculos[i][j] = vehiculo;
                    System.out.println("Se ha agregado exitosamente el vehículo " + vehiculo + " en la fila " + i
                            + ", columna " + j);
                    vehiculoAgregado = true;
                    break; // Salir del bucle interno una vez que se haya agregado el vehículo
                } else {
                    System.out.println("No hay espacio disponible para estacionar el vehículo " + vehiculo + "en fila: "
                            + i + ", columna: " + j);
                }
            }
            if (vehiculoAgregado) {
                break; // Salir del bucle externo si el vehículo se agregó exitosamente
            }
        }
    }

    public int obtenerTarifa(String placa) {
        // recorro la matriz y si en esa matriz hay un elemnto con la misma placa que
        // laque llego, optenga la tarifa de ese elemento y multiplicarla por la
        // diferencoa entre el timpo que se va a retirar y la hora en la que llego
        int tarifa = 0;
        for (int i = 0; i < listaVehiculos.length; i++) {
            for (int j = 0; j < listaVehiculos.length; j++) {
                if (listaVehiculos[i][j] != null && listaVehiculos[i][j].getPlaca().equals(placa)) {
                    System.out.println("se encomtro " + placa);
                    tarifa = listaVehiculos[i][j].obtenerTarifa();
                    break;
                }
            }
        }
        return tarifa;
    }

    public String obtenerDueño(int fila, int columna) {
        String dueño = "";
        for (int i = 0; i < listaVehiculos.length; i++) {
            for (int j = 0; j < listaVehiculos.length; j++) {
                if (listaVehiculos[i][j] != null && listaVehiculos[i][j] == listaVehiculos[fila][columna]) {
                    dueño = "El dueño del vehiculo en el puesto " + fila + columna + " es: "
                            + listaVehiculos[i][j].getPropietario();
                }
            }
        }
        return dueño;
    }

    public String obtenerVehiculo(int fila, int columna) {
        String vehiculo = "";
        for (int i = 0; i < listaVehiculos.length; i++) {
            for (int j = 0; j < listaVehiculos.length; j++) {
                if (listaVehiculos[i][j] != null && listaVehiculos[i][j] == listaVehiculos[fila][columna]) {
                    vehiculo = " El vehiculo en el puesto " + fila + columna + " es: " + listaVehiculos[i][j].getPlaca()
                            + " y su modelo: " + listaVehiculos[i][j].getModelo();
                }
            }
        }
        return vehiculo;
    }

    public String obteterDisponibilidadPuesto(int fila, int columna) {
        String disponibilidad = "";
        for (int i = 0; i < listaVehiculos.length; i++) {
            for (int j = 0; j < listaVehiculos.length; j++) {
                if (listaVehiculos[i][j] != null && listaVehiculos[i][j] == listaVehiculos[fila][columna]) {
                    disponibilidad = " El puesto "+ fila+","+columna+" esta ocupado";
                }
                else if (listaVehiculos[i][j] == null && listaVehiculos[i][j] == listaVehiculos[fila][columna]){
                    disponibilidad = " El puesto "+ fila+","+columna+" esta libre";
                }
            }
        }
        return disponibilidad;
    }

    public String registro() {
        String registro = "";
        for (int i = 0; i < listaVehiculos.length; i++) {
            for (int j = 0; j < listaVehiculos.length; j++) {
                registro = registro + obtenerDueño(i, j) +obtenerVehiculo(i, j) + obteterDisponibilidadPuesto(i, j)+"\n";
            }
        }
        return registro;
    }

    public void retirarVehiculo(String placa) {
        for (int i = 0; i < listaVehiculos.length; i++) {
            for (int j = 0; j < listaVehiculos.length; j++) {
                if (listaVehiculos[i][j] != null && listaVehiculos[i][j].getPlaca().equals(placa)) {
                    listaVehiculos[i][j] = null;
                    System.out.println("se encomtro y retiro: " + placa);
                   
                    break;
                }
            }
        }
        
    }
    }

