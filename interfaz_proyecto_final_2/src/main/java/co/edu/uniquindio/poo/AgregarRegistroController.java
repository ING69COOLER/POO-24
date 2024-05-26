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

public class AgregarRegistroController {
    private static AgregarRegistroController agregarRegistroController;
    private Parqueadero parqueadero;

    public AgregarRegistroController() {

    }

    public static AgregarRegistroController getaAgregarRegistroController() {
        if (agregarRegistroController == null) {
            agregarRegistroController = new AgregarRegistroController();
        }
        return agregarRegistroController;
    }

    // Metdoodo que recibe "parqueadero" de la clase ""ControlParqeuadero"
    @SuppressWarnings("exports")
    public void recibirParqueadero(Parqueadero parqueadero) {
        if (parqueadero != null) {
            System.out.println("Parqueadero recibido en AgregarVehiculoController: " + parqueadero.getNombre());
            this.parqueadero = parqueadero;
            System.out.println(parqueadero.obtenerRegistro());
        } else {
            System.out.println("El objeto parqueadero es null en AgregarVehiculoController");
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
    private TextField txtModelo;

    @FXML
    private MenuItem txtObtenerCarro;

    @FXML
    private MenuItem txtObtenerMotoClasica;

    @FXML
    private MenuItem txtObtenerMotoHibrida;

    @FXML
    private TextField txtPlaca;

    @FXML
    private TextField txtPropietario;

    @FXML
    private TextField txtVelocidad;

    @FXML
    void agregarVehiculo(ActionEvent event) {

    }

    @FXML
    void handleTipoVehiculo(ActionEvent event) {
        MenuItem menuItem = (MenuItem) event.getSource();
        String tipoVehiculo = menuItem.getText();
        spltTipoVehiculo.setText(tipoVehiculo); // Actualiza el texto del SplitMenuButton con la selección
        System.out.println("Tipo de Vehículo seleccionado: " + tipoVehiculo);
    }

    @FXML
    void regresar() throws IOException {
        parqueadero = agregarRegistroController.parqueadero;
        ControlParqueaderoController.getcontrolParqueaderoController().recibirParqueadero(parqueadero);
        System.out.println("Parqueadero enviado a ControlParqueadero");
        App.setRoot("menuParqueadero");
    }

}
