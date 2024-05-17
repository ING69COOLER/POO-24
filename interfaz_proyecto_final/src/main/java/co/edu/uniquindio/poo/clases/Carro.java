package co.edu.uniquindio.poo.clases;


import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Carro extends Vehiculo {
    private int tarifa;

    

    public Carro(String placa, String modelo, String propietario, LocalTime horaEntrada, int tarifa) {
        super(placa, modelo, propietario, horaEntrada);
        this.tarifa = tarifa;
    }

    public int getTarifa() {
        return tarifa;
    }

    public void setTarifa(int tarifa) {
        this.tarifa = tarifa;
    }

    @Override
    public String toString() {
        return "Carro [tarifa=" + tarifa + ", getTarifa()=" + getTarifa() + ", getPlaca()=" + getPlaca()
                + ", getModelo()=" + getModelo() + ", getPropietario()=" + getPropietario() + ", getHoraEntrada()="
                + getHoraEntrada() + "]";
    }

    @Override
    //Metodo que calcula la tarifa del carro y regresa su valor en un entero "int"
    protected int obtenerTarifa( ) {
        int valor = 0;
        if (getHoraSalida() != null) {
            long restaTiempo = ChronoUnit.HOURS.between(getHoraEntrada(),getHoraSalida());
            int tiempoTotal = (int) restaTiempo;
            valor = tarifa*(tiempoTotal);
            
        }
        else if (getHoraSalida() == null){
            System.out.println("Aun no se le da hora de salida al vehiculo con placas: "+ getPlaca());
        }
       
        return valor;
    }

    

    
    
}
