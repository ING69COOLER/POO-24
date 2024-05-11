package co.edu.uniquindio.poo;

import java.time.LocalDate;

public abstract class Impresora extends EquipoElectronico implements Imprimible{

    private Estado estado;

    public Impresora(String cosdigo, String nombre, String marca, LocalDate fechaAdquisicion,Estado estado) {
        super(cosdigo, nombre, marca, fechaAdquisicion);
        this.estado = estado;
       
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    protected abstract void conectarImpresora();

    protected abstract void desconectarImpresora();
    
}
