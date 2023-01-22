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
    
    private final Integer Codigo;
    private String Nombre;
    private String ListaDeProductos;

    public Provedor(Integer Codigo, String Nombre, String ListaDeProductos) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.ListaDeProductos = ListaDeProductos;
    }

    public Integer getCodigo() {
        return Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getListaDeProductos() {
        return ListaDeProductos;
    }

    public void setListaDeProductos(String ListaDeProductos) {
        this.ListaDeProductos = ListaDeProductos;
    }
    
        @Override
    public String toString() {
        return "Provedor{" + "Código: " + this.getCodigo() + ", Nombre: " + this.getNombre() + ", Lista de productos: " + this.getListaDeProductos() + "}";
    }
    
    
}
