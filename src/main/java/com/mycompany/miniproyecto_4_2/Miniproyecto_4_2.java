/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.miniproyecto_4_2;

//(A)import controlador.GestionCliente;
import vista.VentanaGestion;

/**
 * @authors:
 * Jhonnier Hernandez
 * Juan Cifuentes
 * Alejandra Carvajal
 */
public class Miniproyecto_4_2 {

    public static void main(String[] args) {
        System.out.println("Inicio de programa");
//(A)        GestionCliente gestionCliente = new GestionCliente;
        VentanaGestion ventanaGestion = new VentanaGestion();
        ventanaGestion.setVisible (true);
    }
}

// Cambio