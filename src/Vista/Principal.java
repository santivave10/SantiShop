/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Vista;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author santi
 */
public class Principal extends Application{

    @Override
    public void start(Stage primaryStage){
        Parent root = null;
        
         try { 
                root = FXMLLoader.load(getClass().getResource("Login.fxml"));
         } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
         }
        
        Scene escena = new Scene(root);
        primaryStage.setScene(escena);
        primaryStage.setTitle("SantiShop - Inicio de sesión");
        primaryStage.setResizable(false);
        primaryStage.show();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        launch(args);
    }
}
