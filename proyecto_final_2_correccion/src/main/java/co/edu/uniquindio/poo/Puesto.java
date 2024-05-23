package co.edu.uniquindio.poo;

public class Puesto {
    private final int fila;
    private final int columna;
    private Vehiculo[][] listaPuestos;
    private String listaReporte;

    public Puesto(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
        this.listaPuestos = new Vehiculo[fila][columna];
        this.listaReporte = "";
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    public Vehiculo[][] getListPuestos() {
        return listaPuestos;
    }

    public void setListPuestos(Vehiculo[][] listaVehiculos) {
        this.listaPuestos = listaVehiculos;
    }

    public String getListaReporte() {
        return listaReporte;
    }

    public void setListaReporte(String listaReporte) {
        this.listaReporte = listaReporte;
    }

    // Metodo que agrega un vehiculo nuevo a la matriz de puestos
    public void agregarVehiculo(Vehiculo vehiculo, int fila, int columna) {
        boolean vehiculoAgregado = false;
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                if (listaPuestos[i][j].equals(listaPuestos[fila][columna])) {
                    listaPuestos[i][j] = vehiculo;
                    vehiculoAgregado = true;
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
}