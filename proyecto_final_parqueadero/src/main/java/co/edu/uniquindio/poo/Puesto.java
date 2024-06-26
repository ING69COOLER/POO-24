package co.edu.uniquindio.poo;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Puesto {
    private final int fila;
    private final int columna;
    private boolean estado;
    private Vehiculo[][] listaVehiculos;
    private String listaReporte;

    public Puesto(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
        this.listaVehiculos = new Vehiculo[fila][columna];
        this.listaReporte = "";
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

    // Metodo que agrega un vehiculo nuevo a la matriz de puestos
    public void agregarVehiculo(Vehiculo vehiculo) {
        boolean vehiculoAgregado = false;
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                if (listaVehiculos[i][j] == null) {
                    listaVehiculos[i][j] = vehiculo;
                    System.out.println("Se ha agregado exitosamente el vehículo " + vehiculo + " en la fila " + i
                            + ", columna " + j);
                    reporteDia();
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

    // Metodo para obtener la tarifa de un vehiculo en le cual le llego el numeor de
    // la placa y asi poder llamar al metodo de obtenerTarifa() de los vehiculos
    public int obtenerTarifa(String placa) {
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

    // Metodo para obtener el nombre del dueño de un vehiculo determinado por la
    // fila y la columna de la matriz de puestos y asi obtenre el nombre con el
    // "get"
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

    //// Metodo para obtener el vehiculo determinado por la fila y la columna de la
    //// matriz de puestos y asi obtenre el vehiculo con el "get"
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

    // Metodo para saber si un puesto esta disponible o no
    public String obteterDisponibilidadPuesto(int fila, int columna) {
        String disponibilidad = "";
        for (int i = 0; i < listaVehiculos.length; i++) {
            for (int j = 0; j < listaVehiculos.length; j++) {
                if (listaVehiculos[i][j] != null && listaVehiculos[i][j] == listaVehiculos[fila][columna]) {
                    disponibilidad = " El puesto " + fila + "," + columna + " esta ocupado";
                } else if (listaVehiculos[i][j] == null && listaVehiculos[i][j] == listaVehiculos[fila][columna]) {
                    disponibilidad = " El puesto " + fila + "," + columna + " esta libre";
                }
            }
        }
        return disponibilidad;
    }

    // Metodo para obtener el registro de los vehiculos que estan en le parqueadero
    public String registro() {
        String registro = "";
        for (int i = 0; i < listaVehiculos.length; i++) {
            for (int j = 0; j < listaVehiculos.length; j++) {
                registro = registro + obtenerDueño(i, j) + obtenerVehiculo(i, j) + obteterDisponibilidadPuesto(i, j)
                        + "\n";
            }
        }
        return registro;
    }

    // Metodo para retirar un vehicuo de la matriz
    public void retirarVehiculo(String placa) {
        for (int i = 0; i < listaVehiculos.length; i++) {
            for (int j = 0; j < listaVehiculos.length; j++) {
                if (listaVehiculos[i][j] != null && listaVehiculos[i][j].getPlaca().equals(placa)) {
                    listaVehiculos[i][j] = null;
                    System.out.println("se encomtro y retiro: " + placa);
                    reporteDia();
                    break;
                }
            }
        }

    }

    // Metodo para obtener el reporte del dia de los movimientos de los vehiculos
    // del parqueadero
    public void reporteDia() {
        String reporte = "Hubo movimiento a la hora:  " + LocalDateTime.now() + "\n";
        for (int i = 0; i < listaVehiculos.length; i++) {
            for (int j = 0; j < listaVehiculos.length; j++) {
                if (listaVehiculos[i][j] != null) {
                    reporte = reporte + listaVehiculos[i][j].toString() + "\n";
                } else if (listaVehiculos[i][j] == null) {
                    reporte = reporte + "Puesto vacio." + "\n";
                }
            }
        }
        listaReporte = listaReporte + reporte;
    }

    public String getListaReporte() {
        return listaReporte;
    }

    public void setListaReporte(String listaReporte) {
        this.listaReporte = listaReporte;
    }
}
