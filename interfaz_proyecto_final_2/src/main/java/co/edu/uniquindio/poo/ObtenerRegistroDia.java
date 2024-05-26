package co.edu.uniquindio.poo;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.clases.Parqueadero;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class ObtenerRegistroDia {
    private Parqueadero parqueadero;
    private static ObtenerRegistroDia obtenerRegistroDia;
    public ObtenerRegistroDia() {
        // Deja este constructor privado para evitar múltiples instancias
    }

    public static ObtenerRegistroDia getObtenerRegistroDia() {
        if (obtenerRegistroDia == null) {
            obtenerRegistroDia = new ObtenerRegistroDia();
        }
        return obtenerRegistroDia;
    }

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
    private Button btnObtenerInforme;

    @FXML
    private Button btnRegresar;

    @FXML
    private TextArea txtInformeDiario;

    @FXML
    void obtenerInforme(ActionEvent event) {
      
    }

    @FXML
    void regresar( ) throws IOException {

    }

   

}
