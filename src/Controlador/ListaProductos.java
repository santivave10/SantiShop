/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.NodoDoble;
import Modelo.Producto;

/**
 *
 * @author santi
 */
public class ListaProductos {
    private NodoDoble cab;
    private NodoDoble cola;

    public ListaProductos() {
        cab = null;
        cola = null;
    }

    public void agregarProducto(Producto p) {
        NodoDoble nuevo = new NodoDoble(p);
        if (cab == null) {
            cab = cola = nuevo;
        } else {
            cola.sig = nuevo;
            nuevo.ant = cola;
            cola = nuevo;
        }
    }

    public NodoDoble getCabeza() {
        return cab;
    }

    public boolean estaVacia() {
        return cab == null;
    }
}
