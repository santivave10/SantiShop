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
    private NodoDoble<Producto> cab;
    private NodoDoble<Producto> cola;

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
    
    public Producto buscarPorNombre(String nombre) {
    NodoDoble<Producto> actual = cab;
    while (actual != null) {
        if (actual.dato.getNombre().equals(nombre)) {
            return actual.dato;
        }
        actual = actual.sig;
    }
    return null;
}
    public void vaciarCarrito() {
        // Liberar referencias para permitir la recolección de basura
        NodoDoble<Producto> actual = cab;
        while (actual != null) {
            NodoDoble<Producto> siguiente = actual.sig;
            actual.ant = null;
            actual.sig = null;
            actual = siguiente;
        }
        
        // Resetear la cabeza y cola de la lista
        cab = null;
        cola = null;
    }

}
