package co.edu.uniquindio.poo;

import java.io.IOException;
import java.lang.annotation.Retention;
import java.net.URL;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.clases.Parqueadero;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class DespacharVehiculoController {
    private static DespacharVehiculoController despacharVehiculoController;
    private Parqueadero parqueadero;
    DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
    public DespacharVehiculoController(){
        
    }

    public static DespacharVehiculoController getDespacharVehiculoController(){
        if(despacharVehiculoController == null){
            despacharVehiculoController = new DespacharVehiculoController();
        }
        return despacharVehiculoController;
    }
    //metodo para recibir la clase parqueadero de la calse""CrearParqueadero"
    @SuppressWarnings("exports")
    public void recibirParqueadero(Parqueadero parqueaderoActualizado) {
        this.parqueadero = parqueaderoActualizado;
        if (parqueadero != null) {
            System.out.println("Recibido parqueadero en ControlParqueadero: " + parqueadero.getNombre());
            
        } else {
            System.out.println("El objeto parqueadero es null al recibirlo");
        }
    }

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnCalcularTarifa;

    @FXML
    private Button btnRegresar;

    @FXML
    private TextField txTarifa;

    @FXML
    private TextField txtHoraSalida;

    @FXML
    private TextField txtPlaca;

    @FXML
    void calcularTarifa(ActionEvent event) {
        parqueadero = despacharVehiculoController.parqueadero;
        String placa  = txtPlaca.getText();
        String horaSalidaStr = txtHoraSalida.getText();
        LocalTime horaSaida = LocalTime.parse(horaSalidaStr, timeFormatter);
        parqueadero.horaSalida(horaSaida, placa);
        txTarifa.setText(parqueadero.calcularTarifa(placa));
        
        parqueadero.retirarVehiculo(placa);

    }

    @FXML
    void regresar( ) throws IOException {
        parqueadero=despacharVehiculoController.parqueadero;
        ControlParqueaderoController.getcontrolParqueaderoController().recibirParqueadero(parqueadero);
        System.out.println("Parqueadero enviado a ControlParqueadero");
        App.setRoot("menuParqueadero");
    }

    
}
