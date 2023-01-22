/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 * @authors:
 * Jhonnier Hernandez
 * Juan Cifuentes
 * Alejandra Carvajal
 */


public class Producto {
    
    private final Integer Codigo;
    private String Nombre;
    private Integer PrecioUnitarioDeCompra;
    private Integer PrecioUnitarioDeVenta;
    private Integer cantidadDeUnidadesDisponibles;

    public Producto(Integer Codigo, String Nombre, Integer PrecioUnitarioDeCompra, Integer PrecioUnitarioDeVenta) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.PrecioUnitarioDeCompra = PrecioUnitarioDeCompra;
        this.PrecioUnitarioDeVenta = PrecioUnitarioDeVenta;
        cantidadDeUnidadesDisponibles = 0;
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

    public Integer getPrecioUnitarioDeCompra() {
        return PrecioUnitarioDeCompra;
    }

    public void setPrecioUnitarioDeCompra(Integer PrecioUnitarioDeCompra) {
        this.PrecioUnitarioDeCompra = PrecioUnitarioDeCompra;
    }

    public Integer getPrecioUnitarioDeVenta() {
        return PrecioUnitarioDeVenta;
    }

    public void setPrecioUnitarioDeVenta(Integer PrecioUnitarioDeVenta) {
        this.PrecioUnitarioDeVenta = PrecioUnitarioDeVenta;
    }
    
    public Integer getCantidadDeUnidadesDisponibles() {
        return cantidadDeUnidadesDisponibles;
    }
    
    public void setCantidadDeUnidadesDisponibles(Integer cantidad) {
        cantidadDeUnidadesDisponibles = cantidad;
    }
    
    @Override
    public String toString() {
        return "Producto{" + "Codigo: " + this.getCodigo() + ", Nombre: " + this.getNombre() + ", Precio unitario de compra: " + this.getPrecioUnitarioDeCompra() + ", Precio unitario de venta: " + this.getPrecioUnitarioDeVenta() + ", Cantidad de unidades disponibles: " + this.getCantidadDeUnidadesDisponibles() + "}";
    } 
    
    
}
