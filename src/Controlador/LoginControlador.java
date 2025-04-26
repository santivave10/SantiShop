/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author santi                                                                
 */
public class LoginControlador implements Initializable{


    @Override
    public void initialize(URL url, ResourceBundle rb){
    
    }
    
    @FXML
    private void BotonCerrar(MouseEvent event){
        System.exit(0);
    }
    
    @FXML
    private void openRegister(MouseEvent event){
         try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/Register.fxml"));
        Parent root = loader.load();

        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setTitle("SantiShop - Registro");
        stage.initStyle(StageStyle.UNDECORATED);
        stage.centerOnScreen();
        stage.show();

        // Cerrar la ventana de login actual
        ((Stage)(((Label)event.getSource()).getScene().getWindow())).close();
        
    } catch (IOException e) {
        e.printStackTrace();
    }
    }
      
}
