/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controlador;

import Modelo.Producto;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author santi
 */
public class PaginaPrincipalControlador implements Initializable {

    @FXML private ImageView imgProducto1;
    @FXML private Label lblNombre1;
    @FXML private Label lblPrecioOriginal1;
    @FXML private Label lblPrecioDescuento1;
    @FXML private Label lblPorcentaje1;
    @FXML private Label lblMarca1;
       @FXML 
    private ComboBox<String> comboFiltro;
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        comboFiltro.getItems().addAll("Precio Mayor", "Precio Menor", "Descuento");
        
        Producto p = new Producto(
        "Portátil ASUS 16GB RAM, 1TB almacenamiento, tarjeta gráfica NVIDIA 4050RX",
        5200000,
        0.25,
        "ASUS",
        "Producto1.png"
        );  
        lblNombre1.setText(p.getNombre());
        lblPrecioOriginal1.setText("$" + String.format("%,.0f", p.getPrecio()));
        lblPrecioDescuento1.setText("$" + String.format("%,.0f", p.getPrecio() * (1 - p.getDescuento())));
        lblPorcentaje1.setText((int)(p.getDescuento() * 100) + "% OFF");
        lblMarca1.setText(p.getMarca());

        Image imagen = new Image(getClass().getResourceAsStream("/Vista/Imagenes/Productos/" + p.getImagenUrl()));
        imgProducto1.setImage(imagen);
    }
    
    @FXML
    private Pane panelCarrito;
    
     @FXML
    private Pane opacidad;
    
    @FXML
    private void mostrarCarrito(MouseEvent event) {
        panelCarrito.setVisible(true);
        panelCarrito.setManaged(true);
        opacidad.setVisible(true);
        opacidad.setManaged(true);
        opacidad.setOpacity(0.5);
    }

}
