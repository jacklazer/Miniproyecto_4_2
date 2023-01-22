/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Arrays;

/**
 * @authors:
 * Jhonnier Hernandez
 * Juan Cifuentes
 * Alejandra Carvajal
 */

public class Provedor {
    
    private final String Codigo;
    private String Nombre;
    private String[] ListaDeProductos;

    public Provedor(String Codigo, String Nombre, String[] ListaDeProductos) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.ListaDeProductos = ListaDeProductos;
    }

    public String getCodigo() {
        return Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String[] getListaDeProductos() {
        return ListaDeProductos;
    }

    public void setListaDeProductos(String[] ListaDeProductos) {
        this.ListaDeProductos = ListaDeProductos;
    }
    
        @Override
    public String toString() {
        return "Provedor{" + "código=" + this.getCodigo() + ", nombre=" + this.getNombre() +
                ", lista de productos=" + Arrays.toString(this.getListaDeProductos()) + '}';
    }
    
    
}
