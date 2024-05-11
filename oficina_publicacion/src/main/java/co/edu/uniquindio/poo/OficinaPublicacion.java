package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.Arrays;

public class OficinaPublicacion {
    private String nombre;
    private EquipoElectronico[] listaEquipos;
    private CentroImpresion centroImpresion;
    private ArrayList<Publicacion> solicitudes;

    public OficinaPublicacion(String nombre,CentroImpresion centroImpresion) {
        this.nombre = nombre;
        this.listaEquipos = new EquipoElectronico[5];
        this.centroImpresion = centroImpresion;
        this.solicitudes = new ArrayList<Publicacion>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public EquipoElectronico[] getListaEquipos() {
        return listaEquipos;
    }

    public void setListaEquipos(EquipoElectronico[] listaEquipos) {
        this.listaEquipos = listaEquipos;
    }

    public CentroImpresion getCentroImpresion() {
        return centroImpresion;
    }

    public void setCentroImpresion(CentroImpresion centroImpresion) {
        this.centroImpresion = centroImpresion;
    }

    public ArrayList<Publicacion> getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(ArrayList<Publicacion> solicitudes) {
        this.solicitudes = solicitudes;
    }

    @Override
    public String toString() {
        return "OficinaPublicacion [nombre=" + nombre + ", listaEquipos=" + Arrays.toString(listaEquipos)
                + ", centroImpresion=" + centroImpresion + ", solicitudes=" + solicitudes + "]";
    }

    public void imprimirPublicacion(Publicacion publicacion) {

    }

    public void agregarDispositivo(EquipoElectronico equipo) {

       
                for (int i = 0; i < listaEquipos.length; i++) {
                    if (listaEquipos[i] == null) {
                       
                            listaEquipos[i] = equipo;
                            System.out.println("se agrego exitosamente" + equipo);
                            break;
                        
                    }

                }

            
        
    }

    public void agregarPublicacion(Publicacion publicacion) {
       solicitudes.add(publicacion);
    }

    
}
