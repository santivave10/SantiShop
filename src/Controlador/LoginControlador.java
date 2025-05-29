/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Usuario;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Optional;
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
import javafx.scene.control.TextInputDialog;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

/**
 *
 * @author santi                                                                
 */
public class LoginControlador implements Initializable{


          
    @FXML
    private TextField txtUsuario;
    @FXML
    private PasswordField txtContrasena;
    
    private Usuario usuarioCargado;
    
    @Override
    public void initialize(URL url, ResourceBundle rb){
        RegisterControlador.listaUsuarios = cargarUsuariosDesdeArchivo();
    }
    
    //metodo para abrir el registro mediante un label
    @FXML
    private void openRegister(MouseEvent event){
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/Register.fxml"));
            Parent root = loader.load();

            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("SantiShop - Registro");
            stage.getIcons().add(new Image(getClass().getResourceAsStream("/Vista/Imagenes/LOGO FONDO BLANCO SANTISHOP.png")));
            stage.setResizable(false);
            stage.centerOnScreen();
            stage.show();

            ((Stage)(((Label)event.getSource()).getScene().getWindow())).close();

        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    //metodo para abrir la pagina principal en un boton siempre y cuando exista el usuario
    private void abrirPaginaPrincipal(ActionEvent event, Usuario usuarioEncontrado) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/paginaPrincipal.fxml"));
            Parent root = loader.load();

            // Obtener el controlador de la página principal
            PaginaPrincipalControlador controladorPagina = loader.getController();
         
            // Pasar el usuario al controlador de la página principal
            controladorPagina.setUsuarioActivo(usuarioEncontrado);
            
            // 🔽 🔽 CARGA EL HISTORIAL DEL ARCHIVO (DESPUÉS DE ASIGNAR EL USUARIO)
            controladorPagina.cargarHistorialDesdeArchivo(usuarioEncontrado.getUsuario());
            
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("SantiShop - Página Principal");
            stage.getIcons().add(new Image(getClass().getResourceAsStream("/Vista/Imagenes/LOGO FONDO BLANCO SANTISHOP.png")));
            stage.setResizable(false);
            stage.centerOnScreen();
            stage.show();

            // Cerrar la ventana de login
            ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //metodo para iniciar sesión
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

            // Pausa de 2 segundos antes de abrir el form de página principal
            PauseTransition pausa = new PauseTransition(Duration.seconds(2));
            pausa.setOnFinished(e -> {
            alerta.close();
            abrirPaginaPrincipal(event, usuarioEncontrado); // Llamamos método que abre la página principal
            });
            pausa.play();
        }
    }
    
    //metodo para cambiar la contraseña si se olvidó
    @FXML
    private void olvidarContrasena() {
        // Solicitar nombre de usuario
        TextInputDialog dialogoUsuario = new TextInputDialog();
        dialogoUsuario.setTitle("Olvidé mi contraseña");
        dialogoUsuario.setHeaderText(null);
        dialogoUsuario.setContentText("Ingresa tu nombre de usuario:");

        Optional<String> resultadoUsuario = dialogoUsuario.showAndWait();

        if (resultadoUsuario.isPresent()) {
            String usuarioIngresado = resultadoUsuario.get();

            // Verificar si el usuario existe
            boolean usuarioExiste = Controlador.RegisterControlador.listaUsuarios.existeUsuario(usuarioIngresado);

            if (!usuarioExiste) {
                Alert alerta = new Alert(Alert.AlertType.ERROR);
                alerta.setTitle("Error");
                alerta.setHeaderText(null);
                alerta.setContentText("El usuario no existe.");
                alerta.show();
                return;
            }

            // Si existe, pedir nueva contraseña
            TextInputDialog dialogoNuevaClave = new TextInputDialog();
            dialogoNuevaClave.setTitle("Nueva contraseña");
            dialogoNuevaClave.setHeaderText(null);
            dialogoNuevaClave.setContentText("Ingresa tu nueva contraseña:");

            Optional<String> resultadoClave = dialogoNuevaClave.showAndWait();

            if (resultadoClave.isPresent()) {
                String nuevaContrasena = resultadoClave.get();

                // Actualizar contraseña
                Controlador.RegisterControlador.listaUsuarios.actualizarContrasena(usuarioIngresado, nuevaContrasena);

                Alert alerta = new Alert(Alert.AlertType.INFORMATION);
                alerta.setTitle("Contraseña actualizada");
                alerta.setHeaderText(null);
                alerta.setContentText("Tu contraseña ha sido actualizada exitosamente.");
                alerta.show();
            }
        }
    }

    //metodo para cargar un usuario desde el archivo txt
    public static ListaUsuarios cargarUsuariosDesdeArchivo() {
        ListaUsuarios lista = new ListaUsuarios();
        File archivo = new File("usuarios.txt");
        if (!archivo.exists()) return lista;

        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(";");
                if (datos.length >= 7) { // 7 campos mínimos requeridos
                    Usuario u = new Usuario(
                        datos[0], // usuario
                        datos[1], // contraseña
                        datos[2], // nombres
                        datos[3], // apellidos
                        datos[4], // sexo
                        datos[5], // edad (String)
                        datos[6]  // país
                    );

                    // Establecer dirección si existe y no está vacía
                    if (datos.length >= 8 && !datos[7].isEmpty()) {
                        u.setDireccion(datos[7]);
                    }

                    lista.agregarUsuario(u);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error al leer el archivo de usuarios.");
        }
        return lista;
    }
}
