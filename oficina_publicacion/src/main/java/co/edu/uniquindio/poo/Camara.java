package co.edu.uniquindio.poo;

import java.time.LocalDate;

import javax.swing.JOptionPane;

public class Camara extends EquipoElectronico implements Imprimible {
    private int resolucion;

    public Camara(String cosdigo, String nombre, String marca, LocalDate fechaAdquisicion, int resolucion) {
        super(cosdigo, nombre, marca, fechaAdquisicion);
        this.resolucion = resolucion;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    @Override
    public void imprimir(Publicacion publicacion) {
        JOptionPane.showMessageDialog(null,"Imprimiendo foto" + publicacion.getTitulo() + publicacion.getTexto());
        System.out.println("Imprimiendo foto" + publicacion.getTitulo() + publicacion.getTexto());
    }
    
    
}
