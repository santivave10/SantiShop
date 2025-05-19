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
import static javafx.scene.Cursor.cursor;
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
    @FXML private ImageView imgProducto3;
    @FXML private Label lblNombre3;
    @FXML private Label lblPrecioOriginal3;
    @FXML private Label lblPrecioDescuento3;
    @FXML private Label lblPorcentaje3;
    @FXML private Label lblMarca3;
    @FXML private ImageView imgProducto4;
    @FXML private Label lblNombre4;
    @FXML private Label lblPrecioDescuento4;
    @FXML private Label lblMarca4;
    @FXML private ImageView imgProducto5;
    @FXML private Label lblNombre5;
    @FXML private Label lblPrecioOriginal5;
    @FXML private Label lblPrecioDescuento5;
    @FXML private Label lblPorcentaje5;
    @FXML private Label lblMarca5;
    @FXML private ImageView imgProducto6;
    @FXML private Label lblNombre6;
    @FXML private Label lblPrecioOriginal6;
    @FXML private Label lblPrecioDescuento6;
    @FXML private Label lblPorcentaje6;
    @FXML private Label lblMarca6;
    @FXML private ImageView imgProducto7;
    @FXML private Label lblNombre7;
    @FXML private Label lblPrecioOriginal7;
    @FXML private Label lblPrecioDescuento7;
    @FXML private Label lblPorcentaje7;
    @FXML private Label lblMarca7;
    @FXML private ImageView imgProducto8;
    @FXML private Label lblNombre8;
    @FXML private Label lblPrecioOriginal8;
    @FXML private Label lblPrecioDescuento8;
    @FXML private Label lblPorcentaje8;
    @FXML private Label lblMarca8;
    @FXML private ImageView imgProducto9;
    @FXML private Label lblNombre9;
    @FXML private Label lblPrecioOriginal9;
    @FXML private Label lblPrecioDescuento9;
    @FXML private Label lblPorcentaje9;
    @FXML private Label lblMarca9;
    @FXML private ImageView imgProducto10;
    @FXML private Label lblNombre10;
    @FXML private Label lblPrecioOriginal10;
    @FXML private Label lblPrecioDescuento10;
    @FXML private Label lblPorcentaje10;
    @FXML private Label lblMarca10;
    @FXML private ComboBox<String> comboFiltro;
    @FXML private Pane panelCarrito;
    @FXML private Pane opacidad;
    @FXML private VBox contenedorCarrito;
    @FXML private Label lblCantidadCarrito;
    @FXML private Label lblSubtotal;
    @FXML private Label lblDescuento;
    @FXML private Label lblTotal;
   
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

    
    private ListaProductos listaCarrito = new ListaProductos();
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
        
        producto3 = new Producto(
        "Consola Playstation 5 Slim 1tb Con 2 Controles y Juego Fc 25 Ps5 Fisico",
        4360000,
        0.2,
        "SONY",
        "Producto3.jpg"
        );  
        lblNombre3.setText(producto3.getNombre());
        lblPrecioOriginal3.setText("$" + String.format("%,.0f", producto3.getPrecio()));
        lblPrecioDescuento3.setText("$" + String.format("%,.0f", producto3.getPrecio() * (1 - producto3.getDescuento())));
        lblPorcentaje3.setText((int)(producto3.getDescuento() * 100) + "% OFF");
        lblMarca3.setText(producto3.getMarca());
        Image imagen3 = new Image(getClass().getResourceAsStream("/Vista/Imagenes/Productos/" + producto3.getImagenUrl()));
        imgProducto3.setImage(imagen3);
        
        producto4 = new Producto(
        "Mouse Gamer T-Dagger Imperial RGB",
        100000,
        0,
        "IMPERIAL",
        "Producto4.jpg"
        );  
        lblNombre4.setText(producto4.getNombre());
        lblPrecioDescuento4.setText("$" + String.format("%,.0f", producto4.getPrecio() * (1 - producto4.getDescuento())));
        lblMarca4.setText(producto4.getMarca());
        Image imagen4 = new Image(getClass().getResourceAsStream("/Vista/Imagenes/Productos/" + producto4.getImagenUrl()));
        imgProducto4.setImage(imagen4);
        
        producto5 = new Producto(
        "iPhone 16 Pro-Max 1TB, color Desierto",
        9240000,
        0.4,
        "APPLE",
        "Producto5.jpg"
        );  
        lblNombre5.setText(producto5.getNombre());
        lblPrecioOriginal5.setText("$" + String.format("%,.0f", producto5.getPrecio()));
        lblPrecioDescuento5.setText("$" + String.format("%,.0f", producto5.getPrecio() * (1 - producto5.getDescuento())));
        lblPorcentaje5.setText((int)(producto5.getDescuento() * 100) + "% OFF");
        lblMarca5.setText(producto5.getMarca());
        Image imagen5 = new Image(getClass().getResourceAsStream("/Vista/Imagenes/Productos/" + producto5.getImagenUrl()));
        imgProducto5.setImage(imagen5);
        
        producto6 = new Producto(
        "Samsung Galaxy S25 ultra 256 GB, color Gris titani",
        7360000,
        0.3,
        "SAMSUNG",
        "Producto6.png"
        );  
        lblNombre6.setText(producto6.getNombre());
        lblPrecioOriginal6.setText("$" + String.format("%,.0f", producto6.getPrecio()));
        lblPrecioDescuento6.setText("$" + String.format("%,.0f", producto6.getPrecio() * (1 - producto6.getDescuento())));
        lblPorcentaje6.setText((int)(producto6.getDescuento() * 100) + "% OFF");
        lblMarca6.setText(producto6.getMarca());
        Image imagen6 = new Image(getClass().getResourceAsStream("/Vista/Imagenes/Productos/" + producto6.getImagenUrl()));
        imgProducto6.setImage(imagen6);
        
        producto7 = new Producto(
        "Televisor SAMSUNG 75 pulgadas LED Uhd4K Smart TV",
        8470000,
        0.1,
        "SAMSUNG",
        "Producto7.jpg"
        );  
        lblNombre7.setText(producto7.getNombre());
        lblPrecioOriginal7.setText("$" + String.format("%,.0f", producto7.getPrecio()));
        lblPrecioDescuento7.setText("$" + String.format("%,.0f", producto7.getPrecio() * (1 - producto7.getDescuento())));
        lblPorcentaje7.setText((int)(producto7.getDescuento() * 100) + "% OFF");
        lblMarca7.setText(producto7.getMarca());
        Image imagen7 = new Image(getClass().getResourceAsStream("/Vista/Imagenes/Productos/" + producto7.getImagenUrl()));
        imgProducto7.setImage(imagen7);
        
        producto8 = new Producto(
        "Impresora Multifuncional Epson L5590 Wifi Ecotank",
        5230000,
        0.2,
        "EPSON",
        "Producto8.png"
        );  
        lblNombre8.setText(producto8.getNombre());
        lblPrecioOriginal8.setText("$" + String.format("%,.0f", producto8.getPrecio()));
        lblPrecioDescuento8.setText("$" + String.format("%,.0f", producto8.getPrecio() * (1 - producto8.getDescuento())));
        lblPorcentaje8.setText((int)(producto8.getDescuento() * 100) + "% OFF");
        lblMarca8.setText(producto8.getMarca());
        Image imagen8 = new Image(getClass().getResourceAsStream("/Vista/Imagenes/Productos/" + producto8.getImagenUrl()));
        imgProducto8.setImage(imagen8);
        
        producto9 = new Producto(
        "Apple iPad (10th Generation): with A14 Bionic chip, 64GB, 4 RAM",
        6580000,
        0.5,
        "APPLE",
        "Producto9.jpg"
        );  
        lblNombre9.setText(producto9.getNombre());
        lblPrecioOriginal9.setText("$" + String.format("%,.0f", producto9.getPrecio()));
        lblPrecioDescuento9.setText("$" + String.format("%,.0f", producto9.getPrecio() * (1 - producto9.getDescuento())));
        lblPorcentaje9.setText((int)(producto9.getDescuento() * 100) + "% OFF");
        lblMarca9.setText(producto9.getMarca());
        Image imagen9 = new Image(getClass().getResourceAsStream("/Vista/Imagenes/Productos/" + producto9.getImagenUrl()));
        imgProducto9.setImage(imagen9);
        
        producto10 = new Producto(
        "AirPods Pro 2",
        4370000,
        0.25,
        "APPLE",
        "Producto10.jpg"
        );  
        lblNombre10.setText(producto10.getNombre());
        lblPrecioOriginal10.setText("$" + String.format("%,.0f", producto10.getPrecio()));
        lblPrecioDescuento10.setText("$" + String.format("%,.0f", producto10.getPrecio() * (1 - producto10.getDescuento())));
        lblPorcentaje10.setText((int)(producto10.getDescuento() * 100) + "% OFF");
        lblMarca10.setText(producto10.getMarca());
        Image imagen10 = new Image(getClass().getResourceAsStream("/Vista/Imagenes/Productos/" + producto10.getImagenUrl()));
        imgProducto10.setImage(imagen10);
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
    
    

    private void actualizarTotales() {
    double subtotal = 0;
    double descuento = 0;
    double total = 0;

    for (Node node : contenedorCarrito.getChildren()) {
        if (node instanceof HBox) {
            HBox item = (HBox) node;
            VBox info = (VBox) item.getChildren().get(1);
            Label lblNombre = (Label) info.getChildren().get(0);
            String nombreProducto = lblNombre.getText();

            // Busca el producto en la lista lógica
            Producto producto = listaCarrito.buscarPorNombre(nombreProducto);

            if (producto != null) {
                double precio = producto.getPrecio();
                double porcDesc = producto.getDescuento();

                HBox controles = (HBox) item.getChildren().get(2);
                Label lblCantidad = (Label) controles.getChildren().get(1);
                int cantidad = Integer.parseInt(lblCantidad.getText());

                subtotal += precio * cantidad;
                descuento += precio * porcDesc * cantidad;
                total += (precio * (1 - porcDesc)) * cantidad;
            }
        }
    }
    lblSubtotal.setText("$" + String.format("%,.0f", subtotal));
    lblDescuento.setText("$" + String.format("%,.0f", descuento));
    lblTotal.setText("$" + String.format("%,.0f", total));
}

   private void agregarProductoAlCarrito(Producto producto) {
        // Buscar si el producto ya existe en el carrito visual
        for (Node node : contenedorCarrito.getChildren()) {
            if (node instanceof HBox) {
                HBox item = (HBox) node;
                VBox infoBox = (VBox) item.getChildren().get(1);
                Label nameLabel = (Label) infoBox.getChildren().get(0);

                if (nameLabel.getText().equals(producto.getNombre())) {
                    // El producto ya existe, solo incrementamos la cantidad
                    HBox controles = (HBox) item.getChildren().get(2);
                    Label lblCantidad = (Label) controles.getChildren().get(1);
                    int cantidad = Integer.parseInt(lblCantidad.getText()) + 1;
                    lblCantidad.setText(String.valueOf(cantidad));
                    return; // Terminar la función aquí
                }
            }
        }

        // Si llegamos aquí, el producto no existe en el carrito, añadimos uno nuevo
        HBox contenedor = new HBox(8);
        contenedor.setAlignment(Pos.CENTER_LEFT);
        contenedor.setPadding(new Insets(10));
        contenedor.setStyle("-fx-background-color: white; -fx-border-color: lightgray;");
        contenedor.setPrefWidth(397);

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
        btnAumentar.setStyle("-fx-cursor: hand; -fx-background-color: #56D23D");
        btnAumentar.setMinWidth(30);
        btnAumentar.setPrefWidth(30);

        Button btnDisminuir = new Button("-");
        btnDisminuir.setStyle("-fx-cursor: hand; -fx-background-color: #FA3C3C");
        btnDisminuir.setMinWidth(30);
        btnDisminuir.setPrefWidth(30);

        ImageView iconoBorrar = new ImageView(new Image(getClass().getResourceAsStream("/Vista/Imagenes/borrarindividual.png")));
        iconoBorrar.setFitWidth(20);
        iconoBorrar.setFitHeight(20);
        Button btnBorrar = new Button();
        btnBorrar.setGraphic(iconoBorrar);
        btnBorrar.setStyle("-fx-background-color: transparent;-fx-cursor: hand");

        // Eventos
        btnAumentar.setOnAction(e -> {
            int cantidad = Integer.parseInt(lblCantidad.getText()) + 1;
            lblCantidad.setText(String.valueOf(cantidad));
            actualizarCantidadCarrito();
            actualizarTotales();
            
        });

        btnDisminuir.setOnAction(e -> {
            int cantidad = Integer.parseInt(lblCantidad.getText()) - 1;
            if (cantidad <= 0) {
                contenedorCarrito.getChildren().remove(contenedor);
                actualizarCantidadCarrito();
                actualizarTotales();

            } else {
                lblCantidad.setText(String.valueOf(cantidad));
                actualizarCantidadCarrito();
                actualizarTotales();
            }
            
        });

        btnBorrar.setOnAction(e -> {
            contenedorCarrito.getChildren().remove(contenedor);
            actualizarCantidadCarrito();
            actualizarTotales();
            
        });

        controles.getChildren().addAll(lblTextoCantidad, lblCantidad, btnAumentar, btnDisminuir, btnBorrar);

        HBox.setHgrow(infoProducto, Priority.ALWAYS);

        contenedor.getChildren().addAll(imagen, infoProducto, controles);
        contenedorCarrito.getChildren().add(contenedor);   

        listaCarrito.agregarProducto(producto);
        actualizarTotales();
    }

    
    @FXML
    private void agregarAlCarritoProducto1(ActionEvent event) {
        agregarProductoAlCarrito(producto1);
        actualizarCantidadCarrito();
    }
    
    @FXML
    private void agregarAlCarritoProducto2(ActionEvent event) {
        agregarProductoAlCarrito(producto2);
        actualizarCantidadCarrito();
    }
    
    @FXML
    private void agregarAlCarritoProducto3(ActionEvent event) {
        agregarProductoAlCarrito(producto3);
        actualizarCantidadCarrito();
    }
    
    @FXML
    private void agregarAlCarritoProducto4(ActionEvent event) {
        agregarProductoAlCarrito(producto4);
        actualizarCantidadCarrito();
    }
    
    @FXML
    private void agregarAlCarritoProducto5(ActionEvent event) {
        agregarProductoAlCarrito(producto5);
        actualizarCantidadCarrito();
    }
    
    @FXML
    private void agregarAlCarritoProducto6(ActionEvent event) {
        agregarProductoAlCarrito(producto6);
        actualizarCantidadCarrito();
    }
    
    @FXML
    private void agregarAlCarritoProducto7(ActionEvent event) {
        agregarProductoAlCarrito(producto7);
        actualizarCantidadCarrito();
    }
    
    @FXML
    private void agregarAlCarritoProducto8(ActionEvent event) {
        agregarProductoAlCarrito(producto8);
        actualizarCantidadCarrito();
    }
    
    @FXML
    private void agregarAlCarritoProducto9(ActionEvent event) {
        agregarProductoAlCarrito(producto9);
        actualizarCantidadCarrito();
    }
    
    @FXML
    private void agregarAlCarritoProducto10(ActionEvent event) {
        agregarProductoAlCarrito(producto10);
        actualizarCantidadCarrito();
    }

    private void actualizarCantidadCarrito() {
        int total = 0;
        for (Node node : contenedorCarrito.getChildren()) {
            if (node instanceof HBox) {
                HBox item = (HBox) node;
                HBox controles = (HBox) item.getChildren().get(2); // donde están los botones y la cantidad
                Label lblCantidad = (Label) controles.getChildren().get(1); // el número
                total += Integer.parseInt(lblCantidad.getText());
            }
        }
        lblCantidadCarrito.setText(String.valueOf(total));
    }
    
    @FXML
    private void vaciarCarrito(MouseEvent event) {
        // Eliminar todos los productos de la lista lógica
        listaCarrito.vaciarCarrito();

        // Eliminar todos los elementos visuales del contenedor
        contenedorCarrito.getChildren().clear();

        // Actualizar etiquetas de cantidad y totales
        lblCantidadCarrito.setText("0");
        lblSubtotal.setText("$0");
        lblDescuento.setText("$0");
        lblTotal.setText("$0");
    }


}
