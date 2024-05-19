package co.edu.uniquindio.poo;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.clases.Carro;
import co.edu.uniquindio.poo.clases.MotoClasica;
import co.edu.uniquindio.poo.clases.MotoHibrida;
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
    DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");

    public AgregarVehiculoController() {
        // Deja este constructor privado para evitar múltiples instancias
    }

    public static AgregarVehiculoController getaAgregarVehiculoController() {
        if (agregarVehiculoController == null) {
            agregarVehiculoController = new AgregarVehiculoController();
        }
        return agregarVehiculoController;
    }
    //Metdoodo que recibe "parqueadero" de la clase ""ControlParqeuadero"
    @SuppressWarnings("exports")
    public void recibirParqueadero(Parqueadero parqueadero) {
        if (parqueadero != null) {
            System.out.println("Parqueadero recibido en AgregarVehiculoController: " + parqueadero.getNombre());
            this.parqueadero=parqueadero;
            System.out.println(parqueadero.obtenerRegistro());
        } else {
            System.out.println("El objeto parqueadero es null en AgregarVehiculoController");
        }
    }
    @FXML
    void handleTipoVehiculo(ActionEvent event) {
        MenuItem menuItem = (MenuItem) event.getSource();
        String tipoVehiculo = menuItem.getText();
        spltTipoVehiculo.setText(tipoVehiculo); // Actualiza el texto del SplitMenuButton con la selección
        System.out.println("Tipo de Vehículo seleccionado: " + tipoVehiculo);
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
    private MenuItem txtObtenerCarro;
    
    @FXML
    private MenuItem txtObtenerMotoClasica;
    
    @FXML
    private MenuItem txtObtenerMotoHibrida;
    


 

    @FXML
    private TextField txtHoraEntrada;

    @FXML
    private TextField txtModelo;


   

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
        parqueadero = agregarVehiculoController.parqueadero;
        String tipo = spltTipoVehiculo.getText();
        String nombrePropietario = txtPropietario.getText();
        String placa = txtPlaca.getText();
        String modelo = txtModelo.getText();
        int tarifa = Integer.parseInt(txtTarifa.getText());
        String horaEntradaStr = txtHoraEntrada.getText();
        LocalTime horaEntrada = LocalTime.parse(horaEntradaStr, timeFormatter);
       
        if(tipo.equals("carro") ){
            Carro carro = new Carro(placa, modelo, nombrePropietario, horaEntrada, tarifa);
            parqueadero.agregarVehiculo(carro);
            System.out.println(parqueadero.obtenerRegistro());
            System.out.println("Agregar vehículo de tipo: " + tipo);
        }
        else if(tipo.equals("moto clásica")){
            int velocidad = Integer.parseInt(txtVelocidad.getText());
            MotoClasica motoClasica = new MotoClasica(placa, modelo, nombrePropietario, horaEntrada, velocidad,tarifa );
            parqueadero.agregarVehiculo(motoClasica);
            System.out.println(parqueadero.obtenerRegistro());
            System.out.println("Agregar vehículo de tipo: " + tipo);
        }
        else if(tipo.equals("moto híbrida")){
            int velocidad = Integer.parseInt(txtVelocidad.getText());
            MotoHibrida motoHibrida = new MotoHibrida(placa, modelo, nombrePropietario, horaEntrada, velocidad, tarifa);
            parqueadero.agregarVehiculo(motoHibrida);
            System.out.println(parqueadero.obtenerRegistro());
            System.out.println("Agregar vehículo de tipo: " + tipo);
        }
       
    }

    @FXML
    void obtenerTIpo(ActionEvent event) {
        // Implementar lógica para obtener tipo de vehículo
    }

    @FXML
    void regresar() throws IOException {
        parqueadero=agregarVehiculoController.parqueadero;
        ControlParqueaderoController.getcontrolParqueaderoController().recibirParqueadero(parqueadero);
        System.out.println("Parqueadero enviado a ControlParqueadero");
        App.setRoot("menuParqueadero");
    }
}
