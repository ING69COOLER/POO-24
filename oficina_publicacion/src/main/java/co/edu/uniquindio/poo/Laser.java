package co.edu.uniquindio.poo;

import java.time.LocalDate;

import javax.swing.JOptionPane;

public class Laser extends Impresora {

    public Laser(String cosdigo, String nombre, String marca, LocalDate fechaAdquisicion, Estado estado) {
        super(cosdigo, nombre, marca, fechaAdquisicion, estado);
       
    }

    @Override
    public void imprimir(Publicacion publicacion) {
        JOptionPane.showMessageDialog(null,"Imprimiendo Publicacion desde la impresora laser" + publicacion.getTexto()+ publicacion.getTipoPublicacion());
        System.out.println("Imprimiendo Publicacion desde la impresora laser" + publicacion.getTexto()+ publicacion.getTipoPublicacion());
    }

    @Override
    protected void conectarImpresora() {
       setEstado(Estado.CONECTADA);
    }
    @Override
    protected void desconectarImpresora() {
        setEstado(Estado.DESCONECTADA);
    }

    
}
