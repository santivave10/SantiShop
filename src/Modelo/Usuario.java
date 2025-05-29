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
    private String Direccion;

    public Usuario(String Usuario, String Contrasena, String Nombre, String Apellido, String Sexo, String Edad, String Pais) {
        this.Usuario = Usuario;
        this.Contrasena = Contrasena;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Sexo = Sexo;
        this.Edad = Edad;
        this.Pais = Pais;
        this.Direccion = Direccion;
    }
    
    public String getUsuario() { return Usuario; }
    public String getContrasena() { return Contrasena; }
    public String getNombres() { return Nombre; }
    public String getApellidos() { return Apellido; }
    public String getSexo() { return Sexo; }
    public String getEdad() { return Edad; }
    public String getPais() { return Pais; }
    public String getDireccion() { return Direccion; }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }
    public void setContrasena(String nuevaContrasena) {
        this.Contrasena = nuevaContrasena;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }
    public void setEdad(String Edad) {
        this.Edad = Edad;
    }
    public void setPais(String Pais) {
        this.Pais = Pais;
    }
    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    } 
}

