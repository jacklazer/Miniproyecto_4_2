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

public class Cliente {
    
    private final Integer cedula;
    private String apellidos;
    private String nombres;
    private Integer tarjetaDeCredito;

    public Cliente(Integer cedula, String apellidos, String nombres, Integer tarjetaDeCredito) {
        this.cedula = cedula;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.tarjetaDeCredito = tarjetaDeCredito;
    }

    public Integer getCedula() {
        return cedula;
    }
    
    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public Integer getTarjetaDeCredito() {
        return tarjetaDeCredito;
    }

    public void setTarjetaDeCredito(Integer tarjetaDeCredito) {
        this.tarjetaDeCredito = tarjetaDeCredito;
    }
    
    @Override
    public String toString() {
        return "Cliente{" + "Cedula: " + this.getCedula() + ", Apellidos: " + this.getApellidos() + ", Nombres: " + this.getNombres() + ", Tarjeta de credito: " + this.getTarjetaDeCredito() + "}";
    }

}
