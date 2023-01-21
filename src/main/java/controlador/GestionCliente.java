/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

//import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import modelo.Cliente;


/**
 *
 * @author alejaXD
 */
//public class GestionCliente implements IGestionDatos{
public class GestionCliente{
    private static Map <Integer, Cliente> listaClientes;
//    private Map <Integer, Cliente> listaClientes;
//    private HashMap <Integer, Cliente> listaClientes;
//    private static HashMap <Integer, Cliente> listaClientes;
    
    public GestionCliente(){
        listaClientes = new HashMap<>();
//        listaClientes = new Map<>();
    }
    
//    @Override
    public void agregar(Integer cedula, String nombres, String apellidos, Integer tarjetaDeCredito) {
        Cliente cliente = new Cliente(cedula, nombres, apellidos, tarjetaDeCredito);
        listaClientes.put(cedula, cliente);
    }

//    @Override
    public void actualizar() {
    
    }

//    @Override
    public void eliminar() {
    
    }

//    @Override
    public String listar() {
        String cadena = "---------- Afiliados ----------\n";
        for(int clave : listaClientes.keySet()){
            Cliente cliente = listaClientes.get(clave);
            cadena += cliente + "\n";
        }
        return cadena;
    }

//    @Override
    public void generarCSV() {
    
    }

//    @Override
    public void restaurarDatos() {
    
    }
    
}
