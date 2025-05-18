/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author santi
 */
public class Producto {
    private String nombre;
    private double precio;
    private double descuento;
    private String marca;
    private String imagenUrl;

    public Producto(String nombre, double precio, double descuento, String marca, String imagenUrl) {
        this.nombre = nombre;
        this.precio = precio;
        this.descuento = descuento;
        this.marca = marca;
        this.imagenUrl = imagenUrl;
    }

    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public double getDescuento() { return descuento; }
    public String getMarca() { return marca; }
    public String getImagenUrl() { return imagenUrl; }

}
