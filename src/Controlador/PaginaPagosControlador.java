/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controlador;

import Modelo.HistorialCompra;
import Modelo.Producto;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.animation.PauseTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author santi
 */
public class PaginaPagosControlador implements Initializable {

    @FXML
    private ComboBox<String> comboBanco;
    @FXML
    private TextField txtNumeroCuenta;
    @FXML
    private ComboBox<String> comboTipoCuenta;
    @FXML
    private PasswordField txtClave;
    @FXML
    private Label lblTotal;
    @FXML
    private Button btnPagar;
    @FXML
    private Button btnCancelar;
    
    //declaramos e inicializamos una lista que almacenará objetos de tipo
    private List<Producto> productosComprados = new ArrayList<>();
    //Declara una variable de tipo Runnable.
    private Runnable callbackAgregarHistorial;
    
    private boolean esCompraDesdeCarrito = false;
    
    private Runnable callbackVaciarCarrito = null;
    
    @Override 
    public void initialize(URL url, ResourceBundle rb) {
        comboBanco.getItems().addAll("Bancolombia", "Davivienda", "Nequi");
        comboTipoCuenta.getItems().addAll("Ahorros", "Corriente", "Cuenta Digital");
    }    

    //método que marca de dónde proviene la compra
    public void setEsCompraDesdeCarrito(boolean valor) {
        this.esCompraDesdeCarrito = valor;
    }

    //método que asigna un bloque de código (callback) que permite que otra clase defina qué debe ocurrir automáticamente cuando se vacíe el carrito
    public void setCallbackVaciarCarrito(Runnable callback) {
        this.callbackVaciarCarrito = callback;
    }
   
    //metodo que se ejecuta cuando el usuario le da en el boton pagar
    @FXML
    private void pagar() {
        String banco = comboBanco.getValue();
        String numeroCuenta = txtNumeroCuenta.getText();
        String tipoCuenta = comboTipoCuenta.getValue();
        String clave = txtClave.getText();

        // Verificar si alguno está vacío o no seleccionado
        if (banco == null || banco.isEmpty() ||
            numeroCuenta == null || numeroCuenta.isEmpty() ||
            tipoCuenta == null || tipoCuenta.isEmpty() ||
            clave == null || clave.isEmpty()) {

            // Mostrar alerta de advertencia
            Alert alerta = new Alert(Alert.AlertType.WARNING);
            alerta.setTitle("Campos incompletos");
            alerta.setHeaderText(null);
            alerta.setContentText("Por favor, complete todos los campos para continuar con el pago.");
            alerta.showAndWait();
            return;
        }

        // Mostrar alerta de "Procesando pago..."
        Alert procesando = new Alert(Alert.AlertType.INFORMATION);
        procesando.setTitle("Pago");
        procesando.setHeaderText(null);
        procesando.setContentText("Procesando pago...");
        procesando.show();
        // Esperar 3 segundos y luego mostrar mensaje de éxito
        PauseTransition espera = new PauseTransition(Duration.seconds(3));
        espera.setOnFinished(e -> {
            procesando.close();
            //Agregar al historial antes de mostrar exito
            if (callbackAgregarHistorial != null) {
                callbackAgregarHistorial.run();
            }

            Alert exito = new Alert(Alert.AlertType.INFORMATION);
            exito.setTitle("Compra exitosa");
            exito.setHeaderText(null);
            exito.setContentText("Compra completada. Los productos serán enviados a tu dirección registrada. ¡Gracias por comprar con nosotros!");
            exito.show();
            // Esperar otros 3 segundos y cerrar ventana actual, volver al principal
            PauseTransition volver = new PauseTransition(Duration.seconds(3));
            volver.setOnFinished(ev -> {
                // Cerrar esta ventana
                Stage stage = (Stage) comboBanco.getScene().getWindow();
                stage.close();

                // Volver al principal (asegúrate de tener acceso)
                // Y vaciar el carrito si fue una compra desde ahí
                if (esCompraDesdeCarrito && callbackVaciarCarrito != null) {
                    callbackVaciarCarrito.run();           
                }
            });
            volver.play();
        });
        espera.play();
    }


    //metodo que se ejecuta cuando la persona cancela la compra de un producto
    @FXML
    private void cancelar() {
        // Aquí va la lógica para cancelar el pago
        // Por ejemplo, limpiar los campos o cerrar la ventana
        txtNumeroCuenta.clear();
        txtClave.clear();
        // Para cerrar la ventana:
        Stage stage = (Stage) btnCancelar.getScene().getWindow();
        stage.close();
    }
    
    //metodo que muestra el total a pagar
    public void setTotalPagar(double precioFinal) {
        // Formatear el número con puntos de miles y sin decimales
        String precioFormateado = String.format("%,.0f", precioFinal);
        lblTotal.setText("Total a pagar: $" + precioFormateado);
    }
    
    //metodo para ver los productos comprados
    public void setProductoComprado(Producto producto) {
        this.productosComprados.clear();
        this.productosComprados.add(producto);
    }

    // Método para recibir lista de productos del carrito
    public void setProductosComprados(List<Producto> productos) {
        this.productosComprados = new ArrayList<>(productos);
    }

    // Método para recibir el callback del historial
    public void setCallbackAgregarHistorial(Runnable callback) {
        this.callbackAgregarHistorial = callback;
    }
}
