package co.edu.uniquindio.poo.clases;

public class Carro extends Vehiculo{
    private String marca;
    public Carro(String placa, String modelo, Propietario propietario, Tarifa tarifa, String marca) {
        super(placa, modelo, propietario, tarifa);
        this.marca = marca;
    }


    @Override
    public String toString() {
        return "Carro []";
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    
}
