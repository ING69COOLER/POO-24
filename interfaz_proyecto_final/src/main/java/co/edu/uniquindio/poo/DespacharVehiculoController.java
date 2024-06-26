package co.edu.uniquindio.poo;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.clases.Parqueadero;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class DespacharVehiculoController {
    private static DespacharVehiculoController despacharVehiculoController;
    private Parqueadero parqueadero;
    DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");


    public DespacharVehiculoController(){

    }
    //metodo singleton
    public static DespacharVehiculoController getDespacharVehiculoController() {
        if (despacharVehiculoController == null) {
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
    private Button btnRegistro;

    @FXML
    private Button btnRegresar;

    @FXML
    private TextField txtHorasalida;

    @FXML
    private TextArea txtPago;

    @FXML
    private TextField txtPlaca;

    @FXML
    private TextArea txtRegistro;

    @FXML
    void calcularTarifa(ActionEvent event) {
        parqueadero = despacharVehiculoController.parqueadero;
        String placa = txtPlaca.getText();
        String horaSalidastr = txtHorasalida.getText();
        LocalTime horasalida = LocalTime.parse(horaSalidastr,timeFormatter);
        if(placa != null && horaSalidastr != null){
            parqueadero.horaSalida(horasalida, placa);
            txtPago.setText(parqueadero.calcularTarifa(placa));
            parqueadero.retirarVehiculo(placa);
            
        }
    }

    @FXML
    void registro(ActionEvent event) {
        parqueadero=despacharVehiculoController.parqueadero;
       txtRegistro.setText( parqueadero.obtenerRegistro());
    }

    @FXML
    void regresar() throws IOException {
        parqueadero=despacharVehiculoController.parqueadero;
        ControlParqueaderoController.getcontrolParqueaderoController().recibirParqueadero(parqueadero);
        System.out.println("Parqueadero enviado a ControlParqueadero");
        App.setRoot("menuParqueadero");
    }

 }


