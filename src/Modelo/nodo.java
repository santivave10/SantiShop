/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author santi
 */
    public class nodo<T>{
    
    public T dato;
    public nodo <T> sig;

    public nodo(T dato) {
        this.dato = dato;
        sig = null;
    }

}
