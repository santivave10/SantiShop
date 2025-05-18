/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controlador;

import Modelo.Producto;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

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
    @FXML private ImageView imgProducto2;
    @FXML private Label lblNombre2;
    @FXML private Label lblPrecioOriginal2;
    @FXML private Label lblPrecioDescuento2;
    @FXML private Label lblPorcentaje2;
    @FXML private Label lblMarca2;
    @FXML private ComboBox<String> comboFiltro;
    @FXML private Pane panelCarrito;
    @FXML private Pane opacidad;
    @FXML private VBox contenedorCarrito;
   
    private Producto producto1;
    private Producto producto2;
    private Producto producto3;
    private Producto producto4;
    private Producto producto5;
    private Producto producto6;
    private Producto producto7;
    private Producto producto8;
    private Producto producto9;
    private Producto producto10;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        comboFiltro.getItems().addAll("Precio Mayor", "Precio Menor", "Descuento");  
        
        producto1 = new Producto(
        "Portátil ASUS 16GB RAM, 1TB almacenamiento, tarjeta gráfica NVIDIA 4050RX",
        5200000,
        0.25,
        "ASUS",
        "Producto1.png"
        );  
        lblNombre1.setText(producto1.getNombre());
        lblPrecioOriginal1.setText("$" + String.format("%,.0f", producto1.getPrecio()));
        lblPrecioDescuento1.setText("$" + String.format("%,.0f", producto1.getPrecio() * (1 - producto1.getDescuento())));
        lblPorcentaje1.setText((int)(producto1.getDescuento() * 100) + "% OFF");
        lblMarca1.setText(producto1.getMarca());
        Image imagen1 = new Image(getClass().getResourceAsStream("/Vista/Imagenes/Productos/" + producto1.getImagenUrl()));
        imgProducto1.setImage(imagen1);
        
        producto2 = new Producto(
        "Portátil HP Victus Gaming, AMD Ryzen 5 con IA, 16GB RAM, 1TB SSD Almacenamiento, NVIDIA® GeForce RTX 3050",
        4370000,
        0.25,
        "HP",
        "Producto2.jpg"
        );  
        lblNombre2.setText(producto2.getNombre());
        lblPrecioOriginal2.setText("$" + String.format("%,.0f", producto2.getPrecio()));
        lblPrecioDescuento2.setText("$" + String.format("%,.0f", producto2.getPrecio() * (1 - producto2.getDescuento())));
        lblPorcentaje2.setText((int)(producto2.getDescuento() * 100) + "% OFF");
        lblMarca2.setText(producto2.getMarca());
        Image imagen2 = new Image(getClass().getResourceAsStream("/Vista/Imagenes/Productos/" + producto2.getImagenUrl()));
        imgProducto2.setImage(imagen2);
        
    }
    
    
    @FXML
    private void mostrarCarrito(MouseEvent event) {
        panelCarrito.setVisible(true);
        panelCarrito.setManaged(true);
        opacidad.setVisible(true);
        opacidad.setManaged(true);
        opacidad.setOpacity(0.5);
    }
    
    @FXML
    private void volver(MouseEvent event){
        panelCarrito.setVisible(false);
        panelCarrito.setManaged(false);
        opacidad.setVisible(false);
        opacidad.setManaged(false);
    }
    
    private void agregarProductoAlCarrito(Producto producto) {
    // Primero verificar si el producto ya existe en el carrito
    for (Node node : contenedorCarrito.getChildren()) {
        if (node instanceof HBox) {
            HBox existingItem = (HBox) node;
            // Obtener el VBox de información del producto (segunda posición)
            if (existingItem.getChildren().size() > 1) {
                VBox infoBox = (VBox) existingItem.getChildren().get(1);
                if (infoBox.getChildren().size() > 0) {
                    Label nameLabel = (Label) infoBox.getChildren().get(0);
                    // Si encontramos el mismo nombre de producto, solo incrementamos la cantidad
                    if (nameLabel.getText().equals(producto.getNombre())) {
                        // El producto ya existe, solo incrementar la cantidad
                        HBox controles = (HBox) existingItem.getChildren().get(2);
                        Label lblCantidad = (Label) controles.getChildren().get(1);
                        // Incrementar la cantidad
                        int cantidad = Integer.parseInt(lblCantidad.getText()) + 1;
                        lblCantidad.setText(String.valueOf(cantidad));
                        return; // Terminar aquí ya que hemos actualizado el producto existente
                    }
                }
            }
        }
    }
    
    // Si llegamos aquí, el producto no existe en el carrito, creamos un nuevo item
    HBox contenedor = new HBox(8); // Espaciado horizontal
    contenedor.setAlignment(Pos.CENTER_LEFT);
    contenedor.setPadding(new Insets(10));
    contenedor.setStyle("-fx-background-color: white; -fx-border-color: lightgray;");
    contenedor.setPrefWidth(397); // Establecer ancho preferido
    
    // Imagen del producto
    ImageView imagen = new ImageView(new Image(getClass().getResourceAsStream("/Vista/Imagenes/Productos/" + producto.getImagenUrl())));
    imagen.setFitWidth(50);
    imagen.setFitHeight(50);
    
    // Información del producto
    VBox infoProducto = new VBox(5);
    infoProducto.setPrefWidth(150);
    infoProducto.setMinWidth(100);
    
    Label lblNombre = new Label(producto.getNombre());
    lblNombre.setStyle("-fx-font-weight: bold;");
    lblNombre.setWrapText(true);
    
    Label lblPrecio = new Label("$" + String.format("%,.0f", producto.getPrecio() * (1 - producto.getDescuento())));
    
    infoProducto.getChildren().addAll(lblNombre, lblPrecio);
    
    // Controles de cantidad
    HBox controles = new HBox(5);
    controles.setAlignment(Pos.CENTER_RIGHT);
    HBox.setHgrow(controles, Priority.ALWAYS);
    
    Label lblTextoCantidad = new Label("Cant:");
    
    Label lblCantidad = new Label("1");
    lblCantidad.setStyle("-fx-font-size: 12px; -fx-font-weight: bold;");
    lblCantidad.setMinWidth(15);
    
    Button btnAumentar = new Button("+");
    btnAumentar.setMinWidth(30);
    btnAumentar.setPrefWidth(30);
    
    Button btnDisminuir = new Button("-");
    btnDisminuir.setMinWidth(30);
    btnDisminuir.setPrefWidth(30);
    
    // Botón eliminar
    ImageView iconoBorrar = new ImageView(new Image(getClass().getResourceAsStream("/Vista/Imagenes/borrarindividual.png")));
    iconoBorrar.setFitWidth(20);
    iconoBorrar.setFitHeight(20);
    Button btnBorrar = new Button();
    btnBorrar.setGraphic(iconoBorrar);
    btnBorrar.setStyle("-fx-background-color: transparent;");
    
    // Eventos
    btnAumentar.setOnAction(e -> {
        int cantidad = Integer.parseInt(lblCantidad.getText()) + 1;
        lblCantidad.setText(String.valueOf(cantidad));
    });
    
    btnDisminuir.setOnAction(e -> {
        int cantidad = Integer.parseInt(lblCantidad.getText()) - 1;
        if (cantidad <= 0) {
            contenedorCarrito.getChildren().remove(contenedor);
        } else {
            lblCantidad.setText(String.valueOf(cantidad));
        }
    });
    
    btnBorrar.setOnAction(e -> {
        contenedorCarrito.getChildren().remove(contenedor);
    });
    
    controles.getChildren().addAll(lblTextoCantidad, lblCantidad, btnAumentar, btnDisminuir, btnBorrar);
    
    HBox.setHgrow(infoProducto, Priority.ALWAYS);
    
    contenedor.getChildren().addAll(imagen, infoProducto, controles);
    contenedorCarrito.getChildren().add(contenedor);
}

    @FXML
    private void agregarAlCarritoProducto1(ActionEvent event) {
        agregarProductoAlCarrito(producto1);
    }
    
    @FXML
    private void agregarAlCarritoProducto2(ActionEvent event) {
        agregarProductoAlCarrito(producto2);
    }

}
