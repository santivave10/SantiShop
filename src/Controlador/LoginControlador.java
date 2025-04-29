/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Usuario;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

/**
 *
 * @author santi                                                                
 */
public class LoginControlador implements Initializable{


    @Override
    public void initialize(URL url, ResourceBundle rb){
    
    }
    
    @FXML
    private void openRegister(MouseEvent event){
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/Register.fxml"));
            Parent root = loader.load();

            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("SantiShop - Registro");
            stage.setResizable(false);
            stage.centerOnScreen();
            stage.show();

            ((Stage)(((Label)event.getSource()).getScene().getWindow())).close();

        }catch (IOException e) {
            e.printStackTrace();
        }
    }
      
    @FXML
    private TextField txtUsuario;
    @FXML
    private PasswordField txtContrasena;
    
    private void abrirPaginaPrincipal(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/paginaPrincipal.fxml"));
            Parent root = loader.load();

            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("SantiShop - Página Principal");
            stage.setResizable(false);
            stage.centerOnScreen();
            stage.show();

            // Cerrar la ventana de login
            ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void iniciarSesion(ActionEvent event) {
        String usuarioIngresado = txtUsuario.getText();
        String contrasenaIngresada = txtContrasena.getText();

        // Primero verificar si el usuario existe
        boolean usuarioExiste = Controlador.RegisterControlador.listaUsuarios.existeUsuario(usuarioIngresado);

        if (!usuarioExiste) {
            // Usuario no encontrado
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Error de inicio de sesión");
            alerta.setHeaderText(null);
            alerta.setContentText("El usuario no existe. Regístrate primero.");
            alerta.show();
            txtUsuario.setText("");
            txtContrasena.setText("");
            txtUsuario.requestFocus();
            return;
        }

        // Si el usuario existe, ahora validar la contraseña
        Usuario usuarioEncontrado = Controlador.RegisterControlador.listaUsuarios.buscarUsuario(usuarioIngresado, contrasenaIngresada);

        if (usuarioEncontrado == null) {
            // Contraseña incorrecta
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Error de inicio de sesión");
            alerta.setHeaderText(null);
            alerta.setContentText("La contraseña es incorrecta.");
            alerta.show();
            txtContrasena.setText("");
            txtContrasena.requestFocus();
        } else {
            // Usuario y contraseña correctos
            Alert alerta = new Alert(Alert.AlertType.INFORMATION);
            alerta.setTitle("Inicio de sesión exitoso");
            alerta.setHeaderText(null);
            alerta.setContentText("¡Bienvenido a SantiShop, " + usuarioEncontrado.getNombres() + "!");
            alerta.show();

            // Pausa de 2 segundos antes de abrir página principal
            PauseTransition pausa = new PauseTransition(Duration.seconds(2));
            pausa.setOnFinished(e -> {
            alerta.close(); // Cerramos la alerta
            abrirPaginaPrincipal(event); // Llamamos método que abre la página principal
            });
            pausa.play();
        }
    }


}
