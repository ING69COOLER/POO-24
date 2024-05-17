package co.edu.uniquindio.poo;

import java.io.IOException;
import java.net.URL;

import java.util.ResourceBundle;

import co.edu.uniquindio.poo.clases.Parqueadero;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class ControlParqueaderoController {

    private static ControlParqueaderoController controlParqueaderoController;
    private Parqueadero parqueadero;

    public ControlParqueaderoController() {

    }

    public static ControlParqueaderoController getcontrolParqueaderoController() {
        if (controlParqueaderoController == null) {
            controlParqueaderoController = new ControlParqueaderoController();
        }
        return controlParqueaderoController;
    }

    @SuppressWarnings("exports")
    public void recibirParqueadero(Parqueadero parqueaderoActualizado) {
        parqueadero = parqueaderoActualizado;
        System.out.println(parqueadero.getNombre());
    }

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnActivarRegistro;

    @FXML
    private Button btnAgregarVehiculo;

    @FXML
    private Button btnDespcharVehiculo;

    @FXML
    private Button btnObtenerPropietario;

    @FXML
    private Button btnObtenerVehiculo;

    @FXML
    private Button btnRegistroDia;

    @FXML
    private Button btnVerificarPuesto;

    @FXML
    private Button secondaryButton;

    @FXML
    private TextArea txtRegitroParqueadero;

    @FXML
    void inicializarRegistro(ActionEvent event) {
        txtRegitroParqueadero
                .setText(ControlParqueaderoController.getcontrolParqueaderoController().parqueadero.obtenerRegistro());

    }

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("crearParqueadero");
    }

    @FXML
    void ventanaAgregarVehiculo() throws IOException {
        if (parqueadero != null) {
            AgregarVehiculoController.getaAgregarVehiculoController().recibirParqueadero(parqueadero);
            App.setRoot("agregarVehiculo");
        } else {
            System.out.println("El objeto parqueadero es null. No se puede abrir la ventana de agregar vehículo.");
        }
        
    }

    @FXML
    void ventanaDespacho(ActionEvent event) {

    }

    @FXML
    void ventanaObtenerVehiculo(ActionEvent event) {

    }

    @FXML
    void ventanaOptenerPropietario(ActionEvent event) {

    }

    @FXML
    void ventanaRegistroDia(ActionEvent event) {

    }

    @FXML
    void ventanaVerificarPuesto(ActionEvent event) {

    }

}
