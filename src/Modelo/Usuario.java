/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author santi
 */
public class Usuario {
    
    private String Usuario;
    private String Contrasena;
    private String Nombre;
    private String Apellido;
    private String Sexo;
    private String Edad;
    private String Pais;

    public Usuario(String Usuario, String Contrasena, String Nombre, String Apellido, String Sexo, String Edad, String Pais) {
        this.Usuario = Usuario;
        this.Contrasena = Contrasena;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Sexo = Sexo;
        this.Edad = Edad;
        this.Pais = Pais;
    }
    
    public String getUsuario() { return Usuario; }
    public String getContrasena() { return Contrasena; }
    public String getNombres() { return Nombre; }
    public String getApellidos() { return Apellido; }
    public String getSexo() { return Sexo; }
    public String getEdad() { return Edad; }
    public String getPais() { return Pais; }

    public void setContraseña(String nuevaContrasena) {
        this.Contrasena = nuevaContrasena;
    }
}

