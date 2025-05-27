/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author santi
 */
public class HistorialCompra {
    private Producto producto;
    private String fechaCompra;
    private double precioCompra;
    
    public HistorialCompra(Producto producto, String fechaCompra, double precioCompra) {
        this.producto = producto;
        this.fechaCompra = fechaCompra;
        this.precioCompra = precioCompra;
    }
    
    // Getters
    public Producto getProducto() { return producto; }
    public String getFechaCompra() { return fechaCompra; }
    public double getPrecioCompra() { return precioCompra; }
}
