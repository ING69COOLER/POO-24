package co.edu.uniquindio.poo;

import java.time.LocalDate;

public abstract class EquipoElectronico {
    private String codigo;
    private String nombre;
    private String marca;
    private LocalDate fechaAdquisicion;
    public EquipoElectronico(String cosdigo, String nombre, String marca, LocalDate fechaAdquisicion) {
        this.codigo = cosdigo;
        this.nombre = nombre;
        this.marca = marca;
        this.fechaAdquisicion = fechaAdquisicion;
    }
    public String getCosdigo() {
        return codigo;
    }
    public void setCosdigo(String cosdigo) {
        this.codigo = cosdigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public LocalDate getFechaAdquisicion() {
        return fechaAdquisicion;
    }
    public void setFechaAdquisicion(LocalDate fechaAdquisicion) {
        this.fechaAdquisicion = fechaAdquisicion;
    }
    @Override
    public String toString() {
        return "EquipoElectronico [cosdigo=" + codigo + ", nombre=" + nombre + ", marca=" + marca
                + ", fechaAdquisicion=" + fechaAdquisicion + "]";
    }
    
}
