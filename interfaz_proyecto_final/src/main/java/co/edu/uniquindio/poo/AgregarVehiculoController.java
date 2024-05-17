package co.edu.uniquindio.poo;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.clases.Parqueadero;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextField;

public class AgregarVehiculoController {
    private static AgregarVehiculoController agregarVehiculoController;
    private Parqueadero parqueadero;

    private AgregarVehiculoController() {
        // Deja este constructor privado para evitar múltiples instancias
    }

    public static AgregarVehiculoController getaAgregarVehiculoController() {
        if (agregarVehiculoController == null) {
            agregarVehiculoController = new AgregarVehiculoController();
        }
        return agregarVehiculoController;
    }

    @SuppressWarnings("exports")
    public void recibirParqueadero(Parqueadero parqueaderoActualizado) {
        parqueadero = parqueaderoActualizado;
        if (parqueadero != null) {
            System.out.println(parqueadero.getNombre());
        } else {
            System.out.println("El objeto parqueadero es null");
        }
    }

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnRegresar;

    @FXML
    private Button btnagregarVehiculo;

    @FXML
    private SplitMenuButton spltTipoVehiculo;

    @FXML
    private MenuItem txObtenerMotoClasica;

    @FXML
    private TextField txtHoraEntrada;

    @FXML
    private TextField txtModelo;

    @FXML
    private MenuItem txtObtenerCarro;

    @FXML
    private MenuItem txtObtenerMotoHibrida;

    @FXML
    private TextField txtPlaca;

    @FXML
    private TextField txtPropietario;

    @FXML
    private TextField txtTarifa;

    @FXML
    private TextField txtVelocidad;

    @FXML
    void agregarVehiculo(ActionEvent event) {
        // Implementar lógica para agregar vehículo
    }

    @FXML
    void obtenerTIpo(ActionEvent event) {
        // Implementar lógica para obtener tipo de vehículo
    }

    @FXML
    void regresar() throws IOException {
        ControlParqueaderoController.getcontrolParqueaderoController().recibirParqueadero(parqueadero);
        App.setRoot("menuParqueadero");
    }
}
