/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author santi
 */
public class NodoDoble {
    
    public Producto dato;
    public NodoDoble sig;
    public NodoDoble ant;

    public NodoDoble(Producto dato) {
        this.dato = dato;
        this.sig = null;
        this.ant = null;
    }
}
