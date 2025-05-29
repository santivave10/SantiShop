/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import static Controlador.LoginControlador.cargarUsuariosDesdeArchivo;
import Modelo.Usuario;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.PauseTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author santi                                                                
 */
public class RegisterControlador implements Initializable{
    
    public static ListaUsuarios listaUsuarios = new ListaUsuarios();
    @FXML
    private TextField txtUsuario;
    @FXML
    private PasswordField txtContrasena;
    @FXML
    private TextField txtNombres;
    @FXML
    private TextField txtApellidos;
    @FXML
    private ComboBox<String> comboSexo;
    @FXML
    private TextField txtEdad;
    @FXML
    private TextField txtPais;
    
    @Override
    public void initialize(URL url, ResourceBundle rb){
        comboSexo.getItems().addAll("Masculino", "Femenino", "Otro", "Prefiero no decirlo");
    }
    
    //metodo para Regresar al login
    @FXML
    private void irAlLogin() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/Login.fxml"));
            Parent root = loader.load();

            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("SantiShop - Login");
            stage.getIcons().add(new Image(getClass().getResourceAsStream("/Vista/Imagenes/LOGO FONDO BLANCO SANTISHOP.png")));
            stage.setResizable(false);
            stage.centerOnScreen();
            stage.show();

            // Cerrar la ventana actual
            Stage ventanaActual = (Stage) txtUsuario.getScene().getWindow();
            ventanaActual.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }  
    
    //metodo para regresar al login al hacer click en un label
    @FXML
    private void volverLogin(MouseEvent event) {
        irAlLogin();
    }
    
    //metodo para regresar al login al hacer click en un botón
    private void volverLoginBoton() {
        irAlLogin();
    }   

    //metodo para registar un usuario en un nodo
    @FXML
    private void registrarUsuario() {
        
        String usuario = txtUsuario.getText();
        String contrasena = txtContrasena.getText();
        String nombres = txtNombres.getText();
        String apellidos = txtApellidos.getText();
        String sexo = comboSexo.getValue(); 
        String edad = txtEdad.getText();
        String pais = txtPais.getText();
        
        //validamos que los campos no estén vacios
        if (usuario.isEmpty() || contrasena.isEmpty() || nombres.isEmpty() || apellidos.isEmpty() || sexo == null || edad.isEmpty() || pais.isEmpty()) {
            Alert alerta = new Alert(Alert.AlertType.WARNING);
            alerta.setTitle("Campos incompletos");
            alerta.setHeaderText(null);
            alerta.setContentText("Por favor, completa todos los campos.");
            alerta.show();
            txtUsuario.requestFocus();
            return; 
        }else{
            
        // Validar que la edad sea un valor aceptado
        int edad1;
        try {
            edad1 = Integer.parseInt(edad);
            if (edad1 <= 0) {
                Alert alerta = new Alert(Alert.AlertType.WARNING);
                alerta.setTitle("Edad no válida");
                alerta.setHeaderText(null);
                alerta.setContentText("La edad debe ser un número mayor a cero.");
                alerta.show();
                txtEdad.setText("");
                txtEdad.requestFocus();
                return;
            }
        }catch (NumberFormatException e) {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Error en la edad");
            alerta.setHeaderText(null);
            alerta.setContentText("Debes ingresar un número válido para la edad.");
            alerta.show();
            txtEdad.setText("");
            txtEdad.requestFocus();
            return;
        }
            // Verificar que el usuario no esté ya registrado
            if (listaUsuarios.existeUsuario(usuario)) {
                Alert alerta = new Alert(Alert.AlertType.ERROR);
                alerta.setTitle("Error de Registro");
                alerta.setHeaderText(null);
                alerta.setContentText("El usuario ya existe. Intenta con otro nombre de usuario.");
                alerta.showAndWait();
                txtUsuario.requestFocus();
            } else {
                // Se crea el usuario
                Usuario nuevoUsuario = new Usuario(usuario, contrasena, nombres, apellidos, sexo, edad, pais);
                listaUsuarios.agregarUsuario(nuevoUsuario);
                guardarUsuarioEnArchivo(nuevoUsuario);

                Alert alerta = new Alert(Alert.AlertType.INFORMATION);
                alerta.setTitle("Registro Exitoso");
                alerta.setHeaderText(null);
                alerta.setContentText("Usuario registrado exitosamente.\nCargando login...");
                alerta.show();

                //una pequeña pausa luego de crear el usuario para volver al login
                PauseTransition pausa = new PauseTransition(Duration.seconds(3));
                pausa.setOnFinished(event -> {
                alerta.close();
                volverLoginBoton();
                });
                pausa.play();
            }
        }
    }
    
    //metodo para guardar el usuario en un archivo txt
    private void guardarUsuarioEnArchivo(Usuario usuario) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("usuarios.txt", true))) {
            // Guardar datos separados por punto y coma
            writer.write(usuario.getUsuario() + ";" +
                         usuario.getContrasena() + ";" +
                         usuario.getNombres() + ";" +
                         usuario.getApellidos() + ";" +
                         usuario.getSexo() + ";" +
                         usuario.getEdad() + ";" +
                         usuario.getPais() + ";" +
                         (usuario.getDireccion() != null ? usuario.getDireccion() : ""));
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error al guardar el usuario.");
        }
    }
}
