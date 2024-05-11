package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class CentroImpresion {
 private String nombre;
 private Collection<Publicacion> listaPublicaciones;
 private Impresora impresoraConectada;
 

public CentroImpresion(String nombre) {
    this.nombre = nombre;
    this.listaPublicaciones = new LinkedList<Publicacion>();
}
public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}



public Collection<Publicacion> getListaPublicaciones() {
    return listaPublicaciones;
}
public void setListaPublicaciones(Collection<Publicacion> listaPublicaciones) {
    this.listaPublicaciones = listaPublicaciones;
}
@Override
public String toString() {
    return "CentroImpresion [nombre=" + nombre + ", listaPublicaciones=" + listaPublicaciones + ", listaImpresoras="
            + impresoraConectada + "]";
}
public Impresora getImpresoraConectada() {
    return impresoraConectada;
}
public void setImpresoraConectada(Impresora impresoraConectada) {
    this.impresoraConectada = impresoraConectada;
}

public void conectarImpresora (Impresora impresora){
    setImpresoraConectada(impresora);
    impresora.conectarImpresora();
}

public void desconectarImpresora(){
    getImpresoraConectada().desconectarImpresora();
    setImpresoraConectada(null);
}
public void agregarPublicacion(Publicacion publicacion) {
  listaPublicaciones.add(publicacion);
}
 
}
