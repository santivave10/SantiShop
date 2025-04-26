/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 *
 * @author santi                                                                
 */
public class RegisterControlador implements Initializable{


    @Override
    public void initialize(URL url, ResourceBundle rb){
    
    }
    
    @FXML
    private void BotonCerrar(MouseEvent event){
    System.exit(0);
    }
    
}
