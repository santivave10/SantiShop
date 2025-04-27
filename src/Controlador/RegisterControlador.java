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
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 *
 * @author santi                                                                
 */
public class RegisterControlador implements Initializable{


    @FXML
    private ComboBox<String> comboSexo;
    
    @Override
    public void initialize(URL url, ResourceBundle rb){
        comboSexo.getItems().addAll("Masculino", "Femenino", "Otro", "Prefiero no decirlo");
    }
    
     @FXML
    private void volverLogin(MouseEvent event){
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/Login.fxml"));
            Parent root = loader.load();

            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("SantiShop - Login");
            stage.setResizable(false);
            stage.centerOnScreen();
            stage.show();

            ((Stage)(((Label)event.getSource()).getScene().getWindow())).close();

        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
