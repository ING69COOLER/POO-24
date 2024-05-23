package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Parqueadero {
    private String nombre;
    private Collection<Registro> registros;
    private Puesto puestos;

    public Parqueadero(String nombre) {
        this.nombre = nombre;
        this.registros = new LinkedList<Registro>();

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

    public Collection<Registro> getRegistros() {
        return registros;
    }

    public void setRegistros(Collection<Registro> registros) {
        this.registros = registros;
    }

    // Metodo para agregar la matriz de puestos al parqueadero
    public void agregarPuestos(Puesto puestos) {
        setPuestos(puestos);
    }

    // Metodo para agrega un registro al parqueadero
    public void agregarRegistro(Registro registro) {
        for (Registro verificaRegistro : registros) {
            if (!verificaRegistro.getVehiculo().getPropietario().equals(registro.getVehiculo().getPropietario())) {
                registros.add(registro);
            } else {
                JOptionPane.showMessageDialog(null, "El registro ya existe", nombre, 0);
            }
        }
    }

    public void agregarVehiculoPuesto(String placa) {
       
       
        for (Registro registro : registros) {
            if (registro.getVehiculo().getPlaca().equals(placa)) {
                
                for (int i = 0; i < puestos.getListPuestos().length; i++) {
                    for (int j = 0; j <puestos.getListPuestos()[i].length; j++) {
                        if(puestos.getListPuestos()[i][j] == null){
                            puestos.agregarVehiculo(registro.getVehiculo(),i,j);
                            break;
                        }
                    }
                }
            }
        }
    }

}
