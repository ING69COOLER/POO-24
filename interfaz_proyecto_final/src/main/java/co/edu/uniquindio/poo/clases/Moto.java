package co.edu.uniquindio.poo.clases;


import java.time.LocalTime;

public abstract class Moto extends Vehiculo {
    private int velocidad;

   

    public Moto(String placa, String modelo, String propietario, LocalTime horaEntrada, int velocidad) {
        super(placa, modelo, propietario, horaEntrada);
        this.velocidad = velocidad;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Moto [velocidad=" + velocidad + "]";
    }
    
}
