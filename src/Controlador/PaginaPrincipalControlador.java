/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

/**
 * FXML Controller class
 *
 * @author santi
 */
public class PaginaPrincipalControlador implements Initializable {

   @FXML 
    private ComboBox<String> comboFiltro;
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        comboFiltro.getItems().addAll("Precio Mayor", "Precio Menor", "Descuento");
    }    
    
}
