/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controlador;

import Modelo.HistorialCompra;
import Modelo.Producto;
import Modelo.Usuario;
import Modelo.nodo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import static javafx.scene.Cursor.cursor;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;

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
    @FXML private Label lblPrecioOriginal4;
    @FXML private Label lblPrecioDescuento4;
    @FXML private Label lblPorcentaje4;
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
    @FXML private Pane panelFavoritos;
    @FXML private Pane panelOpciones;
    @FXML private Pane panelListaDeseos;
    @FXML private Pane panelHistorialCompra;
    @FXML private Pane opacidad;
    @FXML private VBox contenedorCarrito;
    @FXML private VBox contenedorFavoritos;
    @FXML private VBox contenedorListaDeseos;
    @FXML private VBox contenedorHistorialCompra;
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
    
    @FXML private Pane panelCuenta;
    @FXML private TextField txtNombres;
    @FXML private TextField txtApellidos;
    @FXML private TextField txtSexo;
    @FXML private TextField txtEdad;
    @FXML private TextField txtPais;
    @FXML private TextField txtDireccion;

    @FXML private ImageView btnEditarNombre;
    @FXML private ImageView btnEditarApellidos;
    @FXML private ImageView btnEditarSexo;
    @FXML private ImageView btnEditarEdad;
    @FXML private ImageView btnEditarPais;
    @FXML private ImageView btnEditarDireccion;

    @FXML private Button btnGuardar;
    @FXML private Button btnCancelar;
    
    
    private String nombresOriginal;
    private String apellidosOriginal;
    private String sexoOriginal;
    private String edadOriginal;
    private String paisOriginal;
    private String direccionOriginal;   
    
    private Usuario usuarioActivo;
    
    
    private ListaProductos listaCarrito = new ListaProductos();
    // Agregar al inicio de tu clase principal
    private List<HistorialCompra> historialCompras = new ArrayList<>();
    // Declarar un mapa para rastrear los productos en favoritos
    private Map<String, Boolean> productosEnFavoritos = new HashMap<>();
    private Map<String, ImageView> iconosFavoritos = new HashMap<>();
    private Map<String, Boolean> productosEnListaDeseos = new HashMap<>();
    private Map<String, ImageView> iconosListaDeseos = new HashMap<>();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        comboFiltro.getItems().addAll("Precio Mayor", "Precio Menor", "Descuento");  
        //Configurar el evento de selección para el ComboBox
        comboFiltro.setOnAction(this::filtrarProductos);

        // Inicializar el arreglo de productos para el filtrado
        inicializarArregloProductos();
        
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
        lblPrecioOriginal4.setText("$" + String.format("%,.0f", producto4.getPrecio()));
        lblPrecioDescuento4.setText("$" + String.format("%,.0f", producto4.getPrecio() * (1 - producto4.getDescuento())));
        lblMarca4.setText(producto4.getMarca());
        lblPorcentaje4.setText((int)(producto4.getDescuento() * 100) + "% OFF");
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
        panelOpciones.setVisible(false);
        panelOpciones.setManaged(false);
        opacidad.setOpacity(0.5);
        
    }
    
    @FXML
    private void volver(MouseEvent event){
    volverCarrito();
    volverFavoritos();
    volverListaDeseos();
    volverCuenta();
    volverHistorialCompra();
    }
    
    @FXML
    private void volverCarrito(){
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

    // Crear un arreglo de productos para facilitar su ordenamiento
private Producto[] productosArray;

// Método para inicializar el arreglo de productos
private void inicializarArregloProductos() {
    // Verificar que todas las referencias a productos existan
    if (producto1 == null || producto2 == null || producto3 == null || producto4 == null || producto5 == null ||
        producto6 == null || producto7 == null || producto8 == null || producto9 == null || producto10 == null) {
        System.out.println("ERROR: Uno o más productos no han sido inicializados correctamente");
        // Podríamos intentar inicializarlos aquí si es necesario
        return;
    }
    
    // Si todos los productos existen, crear el arreglo
    productosArray = new Producto[]{
        producto1, producto2, producto3, producto4, producto5,
        producto6, producto7, producto8, producto9, producto10
    };
    
    System.out.println("Arreglo de productos inicializado correctamente");
}

// Método que se ejecuta cuando el usuario selecciona una opción en el ComboBox
@FXML
private void filtrarProductos(ActionEvent event) {
    String criterio = comboFiltro.getValue();
    if (criterio == null) return;
    
    System.out.println("Criterio de filtrado seleccionado: " + criterio);
    
    try {
        // Asegurarnos que el arreglo está inicializado
        if (productosArray == null) {
            inicializarArregloProductos();
        }
        
        // Verificar si el arreglo se inicializó correctamente
        if (productosArray == null) {
            System.out.println("ERROR: No se pudo inicializar el arreglo de productos");
            return;
        }
        
        // Ordenar según el criterio seleccionado
        switch (criterio) {
            case "Precio Mayor":
                ordenarPorPrecioMayor();
                break;
            case "Precio Menor":
                ordenarPorPrecioMenor();
                break;
            case "Descuento":
                ordenarPorDescuento();
                break;
            default:
                System.out.println("Criterio no reconocido: " + criterio);
                return;
        }
        
        // Actualizar la visualización con el nuevo orden
        actualizarVisualizacionProductos();
        
    } catch (Exception e) {
        System.out.println("ERROR durante el filtrado: " + e.getMessage());
        e.printStackTrace();
    }
}


// Ordena los productos de mayor a menor precio CON DESCUENTO APLICADO
private void ordenarPorPrecioMayor() {
    // Verificar si hay elementos nulos en el arreglo
    boolean hayElementosNulos = false;
    for (int i = 0; i < productosArray.length; i++) {
        if (productosArray[i] == null) {
            hayElementosNulos = true;
            System.out.println("ADVERTENCIA: Elemento nulo encontrado en la posición " + i);
        }
    }
    
    // Si hay elementos nulos, inicializar o reinicializar el arreglo
    if (hayElementosNulos) {
        inicializarArregloProductos();
        System.out.println("Se ha reinicializado el arreglo de productos debido a elementos nulos");
        return; // Salimos para evitar ordenar un arreglo potencialmente incompleto
    }
    
    // Continuar con el ordenamiento normal si no hay elementos nulos
    for (int i = 0; i < productosArray.length - 1; i++) {
        for (int j = 0; j < productosArray.length - i - 1; j++) {
            // Comparar precios CON descuento aplicado
            double precioDespuesDescuentoJ = productosArray[j].getPrecio() * (1 - productosArray[j].getDescuento());
            double precioDespuesDescuentoJPlus1 = productosArray[j + 1].getPrecio() * (1 - productosArray[j + 1].getDescuento());
            
            if (precioDespuesDescuentoJ < precioDespuesDescuentoJPlus1) {
                // Intercambiar productos
                Producto temp = productosArray[j];
                productosArray[j] = productosArray[j + 1];
                productosArray[j + 1] = temp;
            }
        }
    }
}

// Ordena los productos de menor a mayor precio CON DESCUENTO APLICADO
private void ordenarPorPrecioMenor() {
    // Verificar si hay elementos nulos en el arreglo
    boolean hayElementosNulos = false;
    for (int i = 0; i < productosArray.length; i++) {
        if (productosArray[i] == null) {
            hayElementosNulos = true;
            System.out.println("ADVERTENCIA: Elemento nulo encontrado en la posición " + i);
        }
    }
    
    // Si hay elementos nulos, inicializar o reinicializar el arreglo
    if (hayElementosNulos) {
        inicializarArregloProductos();
        System.out.println("Se ha reinicializado el arreglo de productos debido a elementos nulos");
        return; // Salimos para evitar ordenar un arreglo potencialmente incompleto
    }
    
    // Continuar con el ordenamiento normal si no hay elementos nulos
    for (int i = 0; i < productosArray.length - 1; i++) {
        for (int j = 0; j < productosArray.length - i - 1; j++) {
            // Comparar precios CON descuento aplicado
            double precioDespuesDescuentoJ = productosArray[j].getPrecio() * (1 - productosArray[j].getDescuento());
            double precioDespuesDescuentoJPlus1 = productosArray[j + 1].getPrecio() * (1 - productosArray[j + 1].getDescuento());
            
            if (precioDespuesDescuentoJ > precioDespuesDescuentoJPlus1) {
                // Intercambiar productos
                Producto temp = productosArray[j];
                productosArray[j] = productosArray[j + 1];
                productosArray[j + 1] = temp;
            }
        }
    }
}

// Ordena los productos por porcentaje de descuento (de mayor a menor)
private void ordenarPorDescuento() {
    // Verificar si hay elementos nulos en el arreglo
    boolean hayElementosNulos = false;
    for (int i = 0; i < productosArray.length; i++) {
        if (productosArray[i] == null) {
            hayElementosNulos = true;
            System.out.println("ADVERTENCIA: Elemento nulo encontrado en la posición " + i);
        }
    }
    
    // Si hay elementos nulos, inicializar o reinicializar el arreglo
    if (hayElementosNulos) {
        inicializarArregloProductos();
        System.out.println("Se ha reinicializado el arreglo de productos debido a elementos nulos");
        return; // Salimos para evitar ordenar un arreglo potencialmente incompleto
    }
    
    // Continuar con el ordenamiento normal si no hay elementos nulos
    for (int i = 0; i < productosArray.length - 1; i++) {
        for (int j = 0; j < productosArray.length - i - 1; j++) {
            // Comparar porcentajes de descuento
            if (productosArray[j].getDescuento() < productosArray[j + 1].getDescuento()) {
                // Intercambiar productos
                Producto temp = productosArray[j];
                productosArray[j] = productosArray[j + 1];
                productosArray[j + 1] = temp;
            }
        }
    }
}

// Actualiza la visualización de los productos según el nuevo orden
private void actualizarVisualizacionProductos() {
    // Actualizar producto 1
    lblNombre1.setText(productosArray[0].getNombre());
    lblPrecioOriginal1.setText("$" + String.format("%,.0f", productosArray[0].getPrecio()));
    lblPrecioDescuento1.setText("$" + String.format("%,.0f", productosArray[0].getPrecio() * (1 - productosArray[0].getDescuento())));
    lblPorcentaje1.setText((int)(productosArray[0].getDescuento() * 100) + "% OFF");
    lblMarca1.setText(productosArray[0].getMarca());
    Image imagen1 = new Image(getClass().getResourceAsStream("/Vista/Imagenes/Productos/" + productosArray[0].getImagenUrl()));
    imgProducto1.setImage(imagen1);
    
    // Actualizar producto 2
    lblNombre2.setText(productosArray[1].getNombre());
    lblPrecioOriginal2.setText("$" + String.format("%,.0f", productosArray[1].getPrecio()));
    lblPrecioDescuento2.setText("$" + String.format("%,.0f", productosArray[1].getPrecio() * (1 - productosArray[1].getDescuento())));
    lblPorcentaje2.setText((int)(productosArray[1].getDescuento() * 100) + "% OFF");
    lblMarca2.setText(productosArray[1].getMarca());
    Image imagen2 = new Image(getClass().getResourceAsStream("/Vista/Imagenes/Productos/" + productosArray[1].getImagenUrl()));
    imgProducto2.setImage(imagen2);
    
    // Actualizar producto 3
    lblNombre3.setText(productosArray[2].getNombre());
    lblPrecioOriginal3.setText("$" + String.format("%,.0f", productosArray[2].getPrecio()));
    lblPrecioDescuento3.setText("$" + String.format("%,.0f", productosArray[2].getPrecio() * (1 - productosArray[2].getDescuento())));
    lblPorcentaje3.setText((int)(productosArray[2].getDescuento() * 100) + "% OFF");
    lblMarca3.setText(productosArray[2].getMarca());
    Image imagen3 = new Image(getClass().getResourceAsStream("/Vista/Imagenes/Productos/" + productosArray[2].getImagenUrl()));
    imgProducto3.setImage(imagen3);
    
    // Actualizar producto 4
    lblNombre4.setText(productosArray[3].getNombre());
    lblPrecioOriginal4.setText("$" + String.format("%,.0f", productosArray[3].getPrecio()));
    lblPrecioDescuento4.setText("$" + String.format("%,.0f", productosArray[3].getPrecio() * (1 - productosArray[3].getDescuento())));
    lblPorcentaje4.setText((int)(productosArray[3].getDescuento() * 100) + "% OFF");
    lblMarca4.setText(productosArray[3].getMarca());
    Image imagen4 = new Image(getClass().getResourceAsStream("/Vista/Imagenes/Productos/" + productosArray[3].getImagenUrl()));
    imgProducto4.setImage(imagen4);

    // Actualizar producto 5
    lblNombre5.setText(productosArray[4].getNombre());
    lblPrecioOriginal5.setText("$" + String.format("%,.0f", productosArray[4].getPrecio()));
    lblPrecioDescuento5.setText("$" + String.format("%,.0f", productosArray[4].getPrecio() * (1 - productosArray[4].getDescuento())));
    lblPorcentaje5.setText((int)(productosArray[4].getDescuento() * 100) + "% OFF");
    lblMarca5.setText(productosArray[4].getMarca());
    Image imagen5 = new Image(getClass().getResourceAsStream("/Vista/Imagenes/Productos/" + productosArray[4].getImagenUrl()));
    imgProducto5.setImage(imagen5);
    
    // Actualizar producto 6
    lblNombre6.setText(productosArray[5].getNombre());
    lblPrecioOriginal6.setText("$" + String.format("%,.0f", productosArray[5].getPrecio()));
    lblPrecioDescuento6.setText("$" + String.format("%,.0f", productosArray[5].getPrecio() * (1 - productosArray[5].getDescuento())));
    lblPorcentaje6.setText((int)(productosArray[5].getDescuento() * 100) + "% OFF");
    lblMarca6.setText(productosArray[5].getMarca());
    Image imagen6 = new Image(getClass().getResourceAsStream("/Vista/Imagenes/Productos/" + productosArray[5].getImagenUrl()));
    imgProducto6.setImage(imagen6);
    
    // Actualizar producto 7
    lblNombre7.setText(productosArray[6].getNombre());
    lblPrecioOriginal7.setText("$" + String.format("%,.0f", productosArray[6].getPrecio()));
    lblPrecioDescuento7.setText("$" + String.format("%,.0f", productosArray[6].getPrecio() * (1 - productosArray[6].getDescuento())));
    lblPorcentaje7.setText((int)(productosArray[6].getDescuento() * 100) + "% OFF");
    lblMarca7.setText(productosArray[6].getMarca());
    Image imagen7 = new Image(getClass().getResourceAsStream("/Vista/Imagenes/Productos/" + productosArray[6].getImagenUrl()));
    imgProducto7.setImage(imagen7);
    
    // Actualizar producto 8
    lblNombre8.setText(productosArray[7].getNombre());
    lblPrecioOriginal8.setText("$" + String.format("%,.0f", productosArray[7].getPrecio()));
    lblPrecioDescuento8.setText("$" + String.format("%,.0f", productosArray[7].getPrecio() * (1 - productosArray[7].getDescuento())));
    lblPorcentaje8.setText((int)(productosArray[7].getDescuento() * 100) + "% OFF");
    lblMarca8.setText(productosArray[7].getMarca());
    Image imagen8 = new Image(getClass().getResourceAsStream("/Vista/Imagenes/Productos/" + productosArray[7].getImagenUrl()));
    imgProducto8.setImage(imagen8);
    
    // Actualizar producto 9
    lblNombre9.setText(productosArray[8].getNombre());
    lblPrecioOriginal9.setText("$" + String.format("%,.0f", productosArray[8].getPrecio()));
    lblPrecioDescuento9.setText("$" + String.format("%,.0f", productosArray[8].getPrecio() * (1 - productosArray[8].getDescuento())));
    lblPorcentaje9.setText((int)(productosArray[8].getDescuento() * 100) + "% OFF");
    lblMarca9.setText(productosArray[8].getMarca());
    Image imagen9 = new Image(getClass().getResourceAsStream("/Vista/Imagenes/Productos/" + productosArray[8].getImagenUrl()));
    imgProducto9.setImage(imagen9);
    
    // Actualizar producto 10
    lblNombre10.setText(productosArray[9].getNombre());
    lblPrecioOriginal10.setText("$" + String.format("%,.0f", productosArray[9].getPrecio()));
    lblPrecioDescuento10.setText("$" + String.format("%,.0f", productosArray[9].getPrecio() * (1 - productosArray[9].getDescuento())));
    lblPorcentaje10.setText((int)(productosArray[9].getDescuento() * 100) + "% OFF");
    lblMarca10.setText(productosArray[9].getMarca());
    Image imagen10 = new Image(getClass().getResourceAsStream("/Vista/Imagenes/Productos/" + productosArray[9].getImagenUrl()));
    imgProducto10.setImage(imagen10);
    
    // También actualizamos las referencias de productos originales para mantener la coherencia
    producto1 = productosArray[0];
    producto2 = productosArray[1];
    producto3 = productosArray[2];
    producto4 = productosArray[3];
    producto5 = productosArray[4];
    producto6 = productosArray[5];
    producto7 = productosArray[6];
    producto8 = productosArray[7];
    producto9 = productosArray[8];
    producto10 = productosArray[9];
}

    @FXML
    private void mostrarOpciones(MouseEvent event) {
        panelOpciones.setVisible(true);
        panelOpciones.setManaged(true);   
    }
    
    @FXML
    private void volverOpciones(MouseEvent event) {
        panelOpciones.setVisible(false);
        panelOpciones.setManaged(false);   
    }
    
    @FXML
    private void mostrarFavoritos(MouseEvent event) {
        panelOpciones.setVisible(false);
        panelOpciones.setManaged(false); 
        panelFavoritos.setVisible(true);
        panelFavoritos.setManaged(true); 
        opacidad.setVisible(true);
        opacidad.setManaged(true);
        opacidad.setOpacity(0.5);
    }
    
    @FXML
    private void volverFavoritos(){
        panelFavoritos.setVisible(false);
        panelFavoritos.setManaged(false);
        opacidad.setVisible(false);
        opacidad.setManaged(false);
    }
    
    
  private void agregarProductoAFavoritos(Producto producto) {
    // Buscar si el producto ya existe en favoritos
    for (Node node : contenedorFavoritos.getChildren()) {
        if (node instanceof HBox) {
            HBox item = (HBox) node;
            VBox infoBox = (VBox) item.getChildren().get(1);
            Label nameLabel = (Label) infoBox.getChildren().get(0);

            if (nameLabel.getText().equals(producto.getNombre())) {
                // El producto ya existe en favoritos, mostramos mensaje o no hacemos nada
                // Opcional: mostrar alerta de que ya está en favoritos
                return; // Terminar la función aquí
            }
        }
    }
    // Si llegamos aquí, el producto no existe en favoritos, añadimos uno nuevo
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
    infoProducto.setPrefWidth(250);
    infoProducto.setMinWidth(150);

    Label lblNombre = new Label(producto.getNombre());
    lblNombre.setStyle("-fx-font-weight: bold;");
    lblNombre.setWrapText(true);

    // Mostrar el precio con descuento si existe
    Label lblPrecio = new Label("$" + String.format("%,.0f", producto.getPrecio() * (1 - producto.getDescuento())));
    
    // Si tiene descuento, mostrar el precio original tachado
    if (producto.getDescuento() > 0) {
        Label lblPrecioOriginal = new Label("$" + String.format("%,.0f", producto.getPrecio()));
        lblPrecioOriginal.setStyle("-fx-text-fill: gray; -fx-strikethrough: true;");
        infoProducto.getChildren().addAll(lblNombre, lblPrecioOriginal, lblPrecio);
    } else {
        infoProducto.getChildren().addAll(lblNombre, lblPrecio);
    }

    // Botón para eliminar de favoritos
    HBox controles = new HBox(5);
    controles.setAlignment(Pos.CENTER_RIGHT);
    HBox.setHgrow(controles, Priority.ALWAYS);

    // Botón para eliminar de favoritos con ícono
    ImageView iconoEliminar = new ImageView(new Image(getClass().getResourceAsStream("/Vista/Imagenes/borrarindividual.png")));
    iconoEliminar.setFitWidth(20);
    iconoEliminar.setFitHeight(20);
    
    Button btnEliminar = new Button();
    btnEliminar.setGraphic(iconoEliminar);
    btnEliminar.setStyle("-fx-background-color: transparent; -fx-cursor: hand;");

    // Evento para eliminar de favoritos
    btnEliminar.setOnAction(e -> {
    contenedorFavoritos.getChildren().remove(contenedor);

    // Cambiar el estado en el mapa
    productosEnFavoritos.put(producto.getNombre(), false);

    // Cambiar la imagen del producto, si está registrada
    ImageView imgFavorito = iconosFavoritos.get(producto.getNombre());
    if (imgFavorito != null) {
        imgFavorito.setImage(new Image(getClass().getResourceAsStream("/Vista/Imagenes/favoritos.png")));
    }
});


    controles.getChildren().add(btnEliminar);
    HBox.setHgrow(infoProducto, Priority.ALWAYS);

    contenedor.getChildren().addAll(imagen, infoProducto, controles);
    contenedorFavoritos.getChildren().add(contenedor);   
}
  

// Método que se llama cuando se hace clic en el botón de favorito
// Este método debes asignarlo al evento "On Mouse Clicked" en el SceneBuilder
@FXML
private void imagenFavoritos(MouseEvent event) {
    // Obtener la fuente del evento (la ImageView en la que se hizo clic)
    ImageView imgFavorito = (ImageView) event.getSource();
    
    
    // Determinar qué producto corresponde a esta ImageView
    Producto productoSeleccionado = obtenerProductoPorImageViewFavorito(imgFavorito);
    iconosFavoritos.put(productoSeleccionado.getNombre(), imgFavorito);
    
    // Si no se pudo determinar el producto, salir
    if (productoSeleccionado == null) return;
    
    // Verificar si el producto ya está en favoritos
    boolean estaEnFavoritos = productosEnFavoritos.getOrDefault(productoSeleccionado.getNombre(), false);
    
    if (estaEnFavoritos) {
        // Si ya está en favoritos, eliminarlo
        eliminarProductoDeFavoritos(productoSeleccionado);
        // Cambiar imagen a "favorito.png"
        imgFavorito.setImage(new Image(getClass().getResourceAsStream("/Vista/Imagenes/favoritos.png")));
        // Actualizar estado
        productosEnFavoritos.put(productoSeleccionado.getNombre(), false);
    } else {
        // Si no está en favoritos, agregarlo
        agregarProductoAFavoritos(productoSeleccionado);
        // Cambiar imagen a "favoritoAgregado.png"
        imgFavorito.setImage(new Image(getClass().getResourceAsStream("/Vista/Imagenes/favoritoAgregado.png")));
        // Actualizar estado
        productosEnFavoritos.put(productoSeleccionado.getNombre(), true);
    }
}

// Determinar qué producto corresponde a la ImageView en la que se hizo clic
private Producto obtenerProductoPorImageViewFavorito(ImageView imgFavorito) {
    // Obtener el ID de la ImageView para identificar qué producto es
    String id = imgFavorito.getId();
    
    // Según el id de la ImageView, devolvemos el producto correspondiente
    if (id.equals("imgFavorito1")) return producto1;
    if (id.equals("imgFavorito2")) return producto2;
    if (id.equals("imgFavorito3")) return producto3;
    if (id.equals("imgFavorito4")) return producto4;
    if (id.equals("imgFavorito5")) return producto5;
    if (id.equals("imgFavorito6")) return producto6;
    if (id.equals("imgFavorito7")) return producto7;
    if (id.equals("imgFavorito8")) return producto8;
    if (id.equals("imgFavorito9")) return producto9;
    if (id.equals("imgFavorito10")) return producto10;
    
    // Si no coincide con ninguno, puedes intentar otro enfoque
    // Por ejemplo, revisar el padre del ImageView para identificar el contenedor
    
    // Si todo falla, devolver null
    System.out.println("No se pudo determinar el producto para la ImageView: " + id);
    return null;
}

// Eliminar un producto de la lista de favoritos
private void eliminarProductoDeFavoritos(Producto producto) {
    // Buscar y eliminar el producto de la vista de favoritos
    for (Node node : contenedorFavoritos.getChildren()) {
        if (node instanceof HBox) {
            HBox item = (HBox) node;
            // Verificar que hay al menos 2 elementos en el HBox
            if (item.getChildren().size() >= 2) {
                VBox infoBox = (VBox) item.getChildren().get(1);
                // Verificar que hay elementos en el VBox
                if (!infoBox.getChildren().isEmpty()) {
                    Label nameLabel = (Label) infoBox.getChildren().get(0);
                    
                    if (nameLabel.getText().equals(producto.getNombre())) {
                        // Encontramos el producto, lo eliminamos
                        contenedorFavoritos.getChildren().remove(node);
                        return;
                    }
                }
            }
        }
    }
}
    @FXML
    private void vaciarFavoritos(MouseEvent event) {
        // 1. Vaciar visualmente
        contenedorFavoritos.getChildren().clear();

        // 2. Cambiar estado en el Map
        for (String nombreProducto : productosEnFavoritos.keySet()) {
            productosEnFavoritos.put(nombreProducto, false);

            // 3. Cambiar la imagen si está registrada
            ImageView img = iconosFavoritos.get(nombreProducto);
            if (img != null) {
                img.setImage(new Image(getClass().getResourceAsStream("/Vista/Imagenes/favoritos.png")));
            }
        }
    }
    
    private void agregarProductoAListaDeseos(Producto producto) {
    // Crear el contenedor del producto
    HBox contenedor = new HBox(10);
    contenedor.setAlignment(Pos.CENTER_LEFT);
    contenedor.setPadding(new Insets(10));
    contenedor.setStyle("-fx-background-color: white; -fx-border-color: lightgray;");
    contenedor.setPrefWidth(400);

    // Imagen del producto
    ImageView imagen = new ImageView(new Image(getClass().getResourceAsStream("/Vista/Imagenes/Productos/" + producto.getImagenUrl())));
    imagen.setFitWidth(50);
    imagen.setFitHeight(50);

    // Información del producto
    VBox infoProducto = new VBox(5);
    infoProducto.setPrefWidth(220);

    Label lblNombre = new Label(producto.getNombre());
    lblNombre.setStyle("-fx-font-weight: bold;");
    lblNombre.setWrapText(true);

    Label lblPrecioConDescuento = new Label("$" + String.format("%,.0f", producto.getPrecio() * (1 - producto.getDescuento())));

    if (producto.getDescuento() > 0) {
        Label lblPrecioOriginal = new Label("$" + String.format("%,.0f", producto.getPrecio()));
        lblPrecioOriginal.setStyle("-fx-text-fill: gray; -fx-strikethrough: true;");
        infoProducto.getChildren().addAll(lblNombre, lblPrecioOriginal, lblPrecioConDescuento);
    } else {
        infoProducto.getChildren().addAll(lblNombre, lblPrecioConDescuento);
    }

    // Botón para añadir al carrito
    Button btnAgregarCarrito = new Button("Añadir al carrito");
    btnAgregarCarrito.setStyle("-fx-background-color: #56D23D; -fx-text-fill: white; -fx-cursor: hand;");
    btnAgregarCarrito.setOnAction(e -> {
        agregarProductoAlCarrito(producto);
        actualizarCantidadCarrito();
        actualizarTotales();
        contenedorListaDeseos.getChildren().remove(contenedor); 
        // Cambiar el estado en el mapa
        productosEnListaDeseos.put(producto.getNombre(), false);
        // Cambiar la imagen del producto, si está registrada
        ImageView imgListaDeseos = iconosListaDeseos.get(producto.getNombre());
        if (imgListaDeseos != null) {
            imgListaDeseos.setImage(new Image(getClass().getResourceAsStream("/Vista/Imagenes/Listadeseos.png")));
        }
    });

    // Botón para eliminar de lista de deseos
    ImageView iconoEliminar = new ImageView(new Image(getClass().getResourceAsStream("/Vista/Imagenes/borrarindividual.png")));
    iconoEliminar.setFitWidth(20);
    iconoEliminar.setFitHeight(20);
    
    Button btnEliminar = new Button();
    btnEliminar.setGraphic(iconoEliminar);
    btnEliminar.setStyle("-fx-background-color: transparent; -fx-cursor: hand;");
    btnEliminar.setOnAction(e -> {
    contenedorListaDeseos.getChildren().remove(contenedor);

    // Cambiar el estado en el mapa
    productosEnListaDeseos.put(producto.getNombre(), false);

    // Cambiar la imagen del producto, si está registrada
    ImageView imgListaDeseos = iconosListaDeseos.get(producto.getNombre());
    if (imgListaDeseos != null) {
        imgListaDeseos.setImage(new Image(getClass().getResourceAsStream("/Vista/Imagenes/Listadeseos.png")));
    }
});


    VBox botones = new VBox(5, btnAgregarCarrito, btnEliminar);
    botones.setAlignment(Pos.CENTER_RIGHT);
    botones.setPrefWidth(120);

    // Agregar elementos al contenedor
    contenedor.getChildren().addAll(imagen, infoProducto, botones);
    contenedorListaDeseos.getChildren().add(contenedor);
}

    // Método que se llama cuando se hace clic en el botón de favorito
    // Este método debes asignarlo al evento "On Mouse Clicked" en el SceneBuilder
    @FXML
    private void imagenListaDeseos(MouseEvent event) {
        // Obtener la fuente del evento (la ImageView en la que se hizo clic)
        ImageView imgListaDeseos = (ImageView) event.getSource();


        // Determinar qué producto corresponde a esta ImageView
        Producto productoSeleccionado = obtenerProductoPorImageViewDeseo(imgListaDeseos);
        iconosListaDeseos.put(productoSeleccionado.getNombre(), imgListaDeseos);

        // Si no se pudo determinar el producto, salir
        if (productoSeleccionado == null) return;

        // Verificar si el producto ya está en favoritos
        boolean estaEnListaDeseos = productosEnListaDeseos.getOrDefault(productoSeleccionado.getNombre(), false);

        if (estaEnListaDeseos) {
            // Si ya está en favoritos, eliminarlo
            eliminarProductoDeListaDeseos(productoSeleccionado);
            // Cambiar imagen a "favorito.png"
            imgListaDeseos.setImage(new Image(getClass().getResourceAsStream("/Vista/Imagenes/Listadeseos.png")));
            // Actualizar estado
            productosEnListaDeseos.put(productoSeleccionado.getNombre(), false);
        } else {
            // Si no está en favoritos, agregarlo
            agregarProductoAListaDeseos(productoSeleccionado);
            // Cambiar imagen a "favoritoAgregado.png"
            imgListaDeseos.setImage(new Image(getClass().getResourceAsStream("/Vista/Imagenes/ListadeseosAgregado.png")));
            // Actualizar estado
            productosEnListaDeseos.put(productoSeleccionado.getNombre(), true);
        }
    }

    // Determinar qué producto corresponde a la ImageView en la que se hizo clic
    private Producto obtenerProductoPorImageViewDeseo(ImageView imgListaDeseos) {
    // Obtener el ID de la ImageView para identificar qué producto es
    String id = imgListaDeseos.getId();
    
    // Según el id de la ImageView, devolvemos el producto correspondiente
    if (id.equals("imgDeseos1")) return producto1;
    if (id.equals("imgDeseos2")) return producto2;
    if (id.equals("imgDeseos3")) return producto3;
    if (id.equals("imgDeseos4")) return producto4;
    if (id.equals("imgDeseos5")) return producto5;
    if (id.equals("imgDeseos6")) return producto6;
    if (id.equals("imgDeseos7")) return producto7;
    if (id.equals("imgDeseos8")) return producto8;
    if (id.equals("imgDeseos9")) return producto9;
    if (id.equals("imgDeseos10")) return producto10;
    
    // Si no coincide con ninguno, puedes intentar otro enfoque
    // Por ejemplo, revisar el padre del ImageView para identificar el contenedor
    
    // Si todo falla, devolver null
    System.out.println("No se pudo determinar el producto para la ImageView: " + id);
    return null;
}

// Eliminar un producto de la lista de favoritos
private void eliminarProductoDeListaDeseos(Producto producto) {
    // Buscar y eliminar el producto de la vista de favoritos
    for (Node node : contenedorListaDeseos.getChildren()) {
        if (node instanceof HBox) {
            HBox item = (HBox) node;
            // Verificar que hay al menos 2 elementos en el HBox
            if (item.getChildren().size() >= 2) {
                VBox infoBox = (VBox) item.getChildren().get(1);
                // Verificar que hay elementos en el VBox
                if (!infoBox.getChildren().isEmpty()) {
                    Label nameLabel = (Label) infoBox.getChildren().get(0);
                    
                    if (nameLabel.getText().equals(producto.getNombre())) {
                        // Encontramos el producto, lo eliminamos
                        contenedorListaDeseos.getChildren().remove(node);
                        return;
                    }
                }
            }
        }
    }
}
    @FXML
    private void vaciarListaDeseos(MouseEvent event) {
        // 1. Vaciar visualmente
        contenedorListaDeseos.getChildren().clear();

        // 2. Cambiar estado en el Map
        for (String nombreProducto : productosEnListaDeseos.keySet()) {
            productosEnListaDeseos.put(nombreProducto, false);

            // 3. Cambiar la imagen si está registrada
            ImageView img = iconosListaDeseos.get(nombreProducto);
            if (img != null) {
                img.setImage(new Image(getClass().getResourceAsStream("/Vista/Imagenes/Listadeseos.png")));
            }
        }
    }
    @FXML
    private void mostrarListaDeseos(MouseEvent event) {
        panelOpciones.setVisible(false);
        panelOpciones.setManaged(false); 
        panelListaDeseos.setVisible(true);
        panelListaDeseos.setManaged(true); 
        opacidad.setVisible(true);
        opacidad.setManaged(true);
        opacidad.setOpacity(0.5);
    }
    
    @FXML
    private void volverListaDeseos(){
        panelListaDeseos.setVisible(false);
        panelListaDeseos.setManaged(false);
        opacidad.setVisible(false);
        opacidad.setManaged(false);
    }
    
    @FXML
    private void agregarTodosAlCarrito(ActionEvent event) {
    // Si no hay productos en la lista de deseos, salimos del método
    if (contenedorListaDeseos.getChildren().isEmpty()) {
        return;
    }
    
    // Crear una copia de los elementos para evitar problemas de concurrencia
    List<Node> elementosAEliminar = new ArrayList<>(contenedorListaDeseos.getChildren());
    
    // Iterar por cada elemento en la lista de deseos
    for (Node node : elementosAEliminar) {
        if (node instanceof HBox) {
            HBox item = (HBox) node;
            // Verificar que hay al menos 2 elementos en el HBox
            if (item.getChildren().size() >= 2) {
                VBox infoBox = (VBox) item.getChildren().get(1);
                // Verificar que hay elementos en el VBox
                if (!infoBox.getChildren().isEmpty()) {
                    Label nameLabel = (Label) infoBox.getChildren().get(0);
                    String nombreProducto = nameLabel.getText();
                    
                    // Buscar el producto correspondiente usando nuestro método auxiliar
                    Producto producto = buscarProductoPorNombre(nombreProducto);
                    
                    if (producto != null) {
                        // Agregar al carrito
                        agregarProductoAlCarrito(producto);
                        
                        // Actualizar el estado en el mapa
                        productosEnListaDeseos.put(nombreProducto, false);
                        
                        // Cambiar la imagen del producto si está registrada
                        ImageView imgListaDeseos = iconosListaDeseos.get(nombreProducto);
                        if (imgListaDeseos != null) {
                            imgListaDeseos.setImage(new Image(getClass().getResourceAsStream("/Vista/Imagenes/Listadeseos.png")));
                        }
                    }
                }
            }
        }
    }
    
    // Vaciar la lista de deseos
    contenedorListaDeseos.getChildren().clear();
    
    // Actualizar los totales y la cantidad en el carrito
    actualizarCantidadCarrito();
    actualizarTotales();
}

// Método auxiliar para buscar un producto por su nombre
private Producto buscarProductoPorNombre(String nombre) {
        // Verificar cada producto
        if (producto1 != null && producto1.getNombre().equals(nombre)) return producto1;
        if (producto2 != null && producto2.getNombre().equals(nombre)) return producto2;
        if (producto3 != null && producto3.getNombre().equals(nombre)) return producto3;
        if (producto4 != null && producto4.getNombre().equals(nombre)) return producto4;
        if (producto5 != null && producto5.getNombre().equals(nombre)) return producto5;
        if (producto6 != null && producto6.getNombre().equals(nombre)) return producto6;
        if (producto7 != null && producto7.getNombre().equals(nombre)) return producto7;
        if (producto8 != null && producto8.getNombre().equals(nombre)) return producto8;
        if (producto9 != null && producto9.getNombre().equals(nombre)) return producto9;
        if (producto10 != null && producto10.getNombre().equals(nombre)) return producto10;

        System.out.println("No se encontró un producto con el nombre: " + nombre);
        return null;
    }

    @FXML
    private void comprarProducto(Producto producto) {
    try {
        // Calcular precio con descuento si aplica
        double precioFinal = producto.getPrecio() * (1 - producto.getDescuento());

        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/PaginaPagos.fxml"));
        Parent root = loader.load();

        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setTitle("Pagos");
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.show();

        // Obtener el controlador y pasar el total
        PaginaPagosControlador pagosControlador = loader.getController();
        pagosControlador.setTotalPagar(precioFinal);
        
        // *** NUEVO: Configurar producto y callback para historial ***
        pagosControlador.setProductoComprado(producto);
        pagosControlador.setCallbackAgregarHistorial(() -> {
            String fechaActual = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            HistorialCompra compra = new HistorialCompra(producto, fechaActual, precioFinal);
            historialCompras.add(compra);
        });

    } catch (IOException e) {
        e.printStackTrace();
        System.err.println("Error al cargar la página de pagos: " + e.getMessage());
    }
}

    @FXML
    private void comprarProducto1(ActionEvent event) {
        comprarProducto(producto1);
    }
    @FXML
    private void comprarProducto2(ActionEvent event) {
        comprarProducto(producto2);
    }
    @FXML
    private void comprarProducto3(ActionEvent event) {
        comprarProducto(producto3);
    }
    @FXML
    private void comprarProducto4(ActionEvent event) {
        comprarProducto(producto4);
    }
    @FXML
    private void comprarProducto5(ActionEvent event) {
        comprarProducto(producto5);
    }
    @FXML
    private void comprarProducto6(ActionEvent event) {
        comprarProducto(producto6);
    }
    @FXML
    private void comprarProducto7(ActionEvent event) {
        comprarProducto(producto7);
    }
    @FXML
    private void comprarProducto8(ActionEvent event) {
        comprarProducto(producto8);
    }
    @FXML
    private void comprarProducto9(ActionEvent event) {
        comprarProducto(producto9);
    }
    @FXML
    private void comprarProducto10(ActionEvent event) {
        comprarProducto(producto10);
    }
    
@FXML
private void comprarCarritoCompleto(ActionEvent event) {
    try {
        double total = 0;
        List<Producto> productosEnCarrito = new ArrayList<>();

        for (Node node : contenedorCarrito.getChildren()) {
            if (node instanceof HBox) {
                HBox item = (HBox) node;
                VBox infoBox = (VBox) item.getChildren().get(1);
                Label lblNombre = (Label) infoBox.getChildren().get(0);
                Label lblPrecio = (Label) infoBox.getChildren().get(infoBox.getChildren().size() - 1);

                HBox controles = (HBox) item.getChildren().get(2);
                Label lblCantidad = (Label) controles.getChildren().get(1);

                String nombre = lblNombre.getText();
                int cantidad = Integer.parseInt(lblCantidad.getText());

                // El precio debe venir del objeto Producto
                Producto producto = buscarProductoPorNombre(nombre);
                if (producto != null) {
                    double precioConDescuento = producto.getPrecio() * (1 - producto.getDescuento());
                    total += precioConDescuento * cantidad;
                }
            }
        }

        // Abrir ventana de pago
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/PaginaPagos.fxml"));
        Parent root = loader.load();

        PaginaPagosControlador pagosControlador = loader.getController();
        pagosControlador.setTotalPagar(total);

        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setTitle("Información de Pago");
        stage.setScene(scene);
        stage.show();

        // Pasar total y bandera
    pagosControlador.setTotalPagar(total);
    pagosControlador.setEsCompraDesdeCarrito(true);
    
    pagosControlador.setProductosComprados(productosEnCarrito);
    pagosControlador.setCallbackAgregarHistorial(() -> {
        String fechaActual = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        for (Producto producto : productosEnCarrito) {
            double precioConDescuento = producto.getPrecio() * (1 - producto.getDescuento());
            HistorialCompra compra = new HistorialCompra(producto, fechaActual, precioConDescuento);
            historialCompras.add(compra);
        }
    });

    // Pasar método para vaciar carrito
    pagosControlador.setCallbackVaciarCarrito(() -> {
    listaCarrito.vaciarCarrito();
    contenedorCarrito.getChildren().clear();
    actualizarCantidadCarrito();
    actualizarTotales();
});
    } catch (IOException e) {
        e.printStackTrace();
    }
}

    public void setUsuarioActivo(Usuario usuario) {
    System.out.println("setUsuarioActivo llamado con: " + (usuario != null ? usuario.getNombres() : "null"));
    this.usuarioActivo = usuario;
    mostrarDatosUsuario();
}

private void mostrarDatosUsuario() {
    System.out.println("mostrarDatosUsuario llamado");
    if (usuarioActivo == null) {
        System.out.println("usuarioActivo es null!");
        return;
    }
    
    System.out.println("Mostrando datos de: " + usuarioActivo.getNombres());
    txtNombres.setText(usuarioActivo.getNombres());
    txtApellidos.setText(usuarioActivo.getApellidos());
    txtSexo.setText(usuarioActivo.getSexo());
    txtEdad.setText(String.valueOf(usuarioActivo.getEdad()));
    txtPais.setText(usuarioActivo.getPais());
    txtDireccion.setText(usuarioActivo.getDireccion());
}
    @FXML
    private void mostrarCuenta(MouseEvent event) {
        panelOpciones.setVisible(false);
        panelOpciones.setManaged(false); 
        panelCuenta.setVisible(true);
        panelCuenta.setManaged(true); 
        opacidad.setVisible(true);
        opacidad.setManaged(true);
        opacidad.setOpacity(0.5);
        mostrarDatosUsuario();
    }
    
    @FXML
    private void volverCuenta(){
        panelCuenta.setVisible(false);
        panelCuenta.setManaged(false);
        opacidad.setVisible(false);
        opacidad.setManaged(false);
    }


private void habilitarCampo(TextField campo) {
    campo.setEditable(true);
    campo.requestFocus();
}

@FXML
private void editarNombre(MouseEvent e) {
    habilitarCampo(txtNombres);
}

@FXML
private void editarApellidos(MouseEvent e) {
    habilitarCampo(txtApellidos);
}

@FXML
private void editarSexo(MouseEvent e) {
    habilitarCampo(txtSexo);
}

@FXML
private void editarEdad(MouseEvent e) {
    habilitarCampo(txtEdad);
}

@FXML
private void editarPais(MouseEvent e) {
    habilitarCampo(txtPais);
}

@FXML
private void editarDireccion(MouseEvent e) {
    habilitarCampo(txtDireccion);
}

    @FXML
    private void guardarCambios(ActionEvent event) {
    // Deshabilitar edición
    txtNombres.setEditable(false);
    txtApellidos.setEditable(false);
    txtSexo.setEditable(false);
    txtEdad.setEditable(false);
    txtPais.setEditable(false);
    txtDireccion.setEditable(false);
    
    // Actualizar los datos en el objeto Usuario
    if (usuarioActivo != null) {
        usuarioActivo.setNombre(txtNombres.getText());
        usuarioActivo.setApellido(txtApellidos.getText());
        usuarioActivo.setSexo(txtSexo.getText());
        usuarioActivo.setEdad(txtEdad.getText());
        usuarioActivo.setPais(txtPais.getText());
        usuarioActivo.setDireccion(txtDireccion.getText());
        
        // IMPORTANTE: Actualizar en la lista enlazada de usuarios
        // Buscar y actualizar el usuario en la lista enlazada
        nodo<Usuario> actual = Controlador.RegisterControlador.listaUsuarios.cabeza;
        while (actual != null) {
            if (actual.dato.getUsuario().equals(usuarioActivo.getUsuario())) {
                // Actualizar el usuario en el nodo
                actual.dato = usuarioActivo;
                break;
            }
            actual = actual.sig;
        }
        
        guardarTodosLosUsuarios();
    }
    // Mostrar mensaje de confirmación
    Alert alerta = new Alert(Alert.AlertType.INFORMATION);
    alerta.setTitle("Información actualizada");
    alerta.setHeaderText(null);
    alerta.setContentText("Tu información fue actualizada correctamente.");
    alerta.showAndWait();
}

@FXML
private void cancelarCambios(ActionEvent event) {
    // Restaurar los valores originales
    if (usuarioActivo != null) {
    
        nombresOriginal = usuarioActivo.getNombres();
        apellidosOriginal = usuarioActivo.getApellidos();
        sexoOriginal = usuarioActivo.getSexo();
        edadOriginal = usuarioActivo.getEdad();
        paisOriginal = usuarioActivo.getPais();
        direccionOriginal = usuarioActivo.getDireccion();
        
        txtNombres.setText(nombresOriginal);
        txtApellidos.setText(apellidosOriginal);
        txtSexo.setText(sexoOriginal);
        txtEdad.setText(edadOriginal);
        txtPais.setText(paisOriginal);
        txtDireccion.setText(direccionOriginal);
    }
    
    // Deshabilitar edición
    txtNombres.setEditable(false);
    txtApellidos.setEditable(false);
    txtSexo.setEditable(false);
    txtEdad.setEditable(false);
    txtPais.setEditable(false);
    txtDireccion.setEditable(false);
    
    // Mostrar mensaje de cancelación
    Alert alerta = new Alert(Alert.AlertType.INFORMATION);
    alerta.setTitle("Cambios cancelados");
    alerta.setHeaderText(null);
    alerta.setContentText("Los cambios han sido cancelados.");
    alerta.show();
}

private void guardarTodosLosUsuarios() {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("usuarios.txt", false))) {
        nodo<Usuario> actual = Controlador.RegisterControlador.listaUsuarios.cabeza;
        while (actual != null) {
            Usuario u = actual.dato;
            writer.write(u.getUsuario() + ";" +
                        u.getContrasena() + ";" +
                        u.getNombres() + ";" +
                        u.getApellidos() + ";" +
                        u.getSexo() + ";" +
                        u.getEdad() + ";" +
                        u.getPais() + ";" +
                        (u.getDireccion() != null ? u.getDireccion() : ""));
            writer.newLine();
            actual = actual.sig;
        }
    } catch (IOException e) {
        e.printStackTrace();
        System.out.println("Error al guardar los usuarios.");
    }
}

    @FXML
    private void cerrarSesion(MouseEvent event){
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle("Cierre de sesión exitoso");
        alerta.setHeaderText(null);
        alerta.setContentText("¡Gracias por comprar con nosotros, te esperamos nuevamente!");
        alerta.show();
        // Pausa de 2 segundos antes de abrir página principal
        PauseTransition pausa = new PauseTransition(Duration.seconds(2));
        pausa.setOnFinished(e -> {
            try {
                alerta.close(); // Cerramos la alerta
                
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/Login.fxml"));
                Parent root = loader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.setTitle("SantiShop - Inicio de sesión");
                stage.getIcons().add(new Image(getClass().getResourceAsStream("/Vista/Imagenes/LOGO FONDO BLANCO SANTISHOP.png")));
                stage.setResizable(false);
                stage.centerOnScreen();
                stage.show();
                
                ((Stage)(((Label)event.getSource()).getScene().getWindow())).close();
            } catch (IOException ex) {
                Logger.getLogger(PaginaPrincipalControlador.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        });
        pausa.play();
    }
    
     @FXML
    private void mostrarHistorialCompra(MouseEvent event) {
        panelOpciones.setVisible(false);
        panelOpciones.setManaged(false); 
        panelHistorialCompra.setVisible(true);
        panelHistorialCompra.setManaged(true); 
        opacidad.setVisible(true);
        opacidad.setManaged(true);
        opacidad.setOpacity(0.5);
        mostrarHistorialCompleto();
    }
    
    @FXML
    private void volverHistorialCompra(){
        panelHistorialCompra.setVisible(false);
        panelHistorialCompra.setManaged(false);
        opacidad.setVisible(false);
        opacidad.setManaged(false);
    }
    
    private void agregarProductoAHistorial(HistorialCompra historialCompra) {
    // Crear el contenedor del producto
    HBox contenedor = new HBox(10);
    contenedor.setAlignment(Pos.CENTER_LEFT);
    contenedor.setPadding(new Insets(10));
    contenedor.setStyle("-fx-background-color: white; -fx-border-color: lightgray;");
    contenedor.setPrefWidth(400);
    
    // Imagen del producto
    ImageView imagen = new ImageView(new Image(getClass().getResourceAsStream("/Vista/Imagenes/Productos/" + historialCompra.getProducto().getImagenUrl())));
    imagen.setFitWidth(50);
    imagen.setFitHeight(50);
    
    // Información del producto
    VBox infoProducto = new VBox(5);
    infoProducto.setPrefWidth(300);
    
    Label lblNombre = new Label(historialCompra.getProducto().getNombre());
    lblNombre.setStyle("-fx-font-weight: bold;");
    lblNombre.setWrapText(true);
    
    Label lblPrecioCompra = new Label("$" + String.format("%,.0f", historialCompra.getPrecioCompra()));
    lblPrecioCompra.setStyle("-fx-font-weight: bold; -fx-text-fill: #2E8B57;");
    
    Label lblFecha = new Label(historialCompra.getFechaCompra());
    lblFecha.setStyle("-fx-font-size: 12px; -fx-text-fill: #666666;");
    
    infoProducto.getChildren().addAll(lblNombre, lblPrecioCompra, lblFecha);
    
    // Agregar elementos al contenedor
    contenedor.getChildren().addAll(imagen, infoProducto);
    
    // Agregar al contenedor del historial (asumiendo que tienes un contenedorHistorial)
    contenedorHistorialCompra.getChildren().add(contenedor);
}

    private void mostrarHistorialCompleto() {
    contenedorHistorialCompra.getChildren().clear();
    for (HistorialCompra compra : historialCompras) {
        agregarProductoAHistorial(compra);
    }
}
  

}
