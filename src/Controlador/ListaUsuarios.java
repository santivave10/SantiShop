/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Usuario;
import Modelo.nodo;

/**
 *
 * @author santi
 */
public class ListaUsuarios {
    
    //creamos la cabecera del nodo
    public nodo <Usuario> cabeza;
    
    //la inicializamos como nula
     public ListaUsuarios(){
        cabeza=null;
    }
     
    //metodo para ver si la lista es vacia
    public boolean ListaEsVacia(){
        return cabeza ==null?true:false;
    }
    
    //Método para agregar un usuario
    public void agregarUsuario(Usuario nuevoUsuario) {
        nodo<Usuario> p = new nodo<>(nuevoUsuario);

        if (ListaEsVacia()) {
            cabeza = p;
        } else {
            nodo<Usuario> actual = cabeza;
            while (actual.sig != null) {
                actual = actual.sig;
            }
            actual.sig = p;
        }
    }
    
    //Método para buscar un usuario por usuario y contraseña
    public Usuario buscarUsuario(String usuario, String contrasena) {
        nodo<Usuario> actual = cabeza;
        
        while (actual != null) {
            if (actual.dato.getUsuario().equalsIgnoreCase(usuario) && actual.dato.getContrasena().equals(contrasena)) {
                return actual.dato; // Usuario encontrado
            }
            actual = actual.sig;
        }
        
        return null; // No encontrado
    }

    //Método para verificar si ya existe un usuario registrado
    public boolean existeUsuario(String usuario) {
        nodo<Usuario> actual = cabeza;

        while (actual != null) {
            if (actual.dato.getUsuario().equalsIgnoreCase(usuario)) {
                return true;
            }
            actual = actual.sig;
        }

        return false;
    }
     
    //metodo para actualizar la contraseña del usuario
    public void actualizarContrasena(String usuario, String nuevaContrasena) {
        nodo<Usuario> actual = cabeza;

        while (actual != null) {
            if (actual.dato.getUsuario().equalsIgnoreCase(usuario)) {
                actual.dato.setContrasena(nuevaContrasena);
                break;
            }
            actual = actual.sig;
        }
    }
}
