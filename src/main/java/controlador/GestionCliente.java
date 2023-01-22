/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

//import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
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
    public void actualizar(Integer cedula, String nombres, String apellidos, Integer tarjetaDeCredito) {
        if(listaClientes.containsKey(cedula)){
            if (nombres != null)
                (listaClientes.get(cedula)).setNombres(nombres);
            if (nombres != null)
                (listaClientes.get(cedula)).setApellidos(apellidos);
            if (nombres != null)
                (listaClientes.get(cedula)).setTarjetaDeCredito(tarjetaDeCredito);
        } else {
            JOptionPane.showMessageDialog(null, "El usuario no se encuentra registrado en la lista de afiliados");
        }
    }

//    @Override
    public void eliminar(Integer cedula) {
        
        if(listaClientes.containsKey(cedula)){
            listaClientes.remove(cedula);
            JOptionPane.showMessageDialog(null, "Afiliado eliminado con exito del registro de afiliados");
        } else {
            JOptionPane.showMessageDialog(null, "El usuario no se encuentra registrado en la lista de afiliados o el id ingresado es incorrecto");
        }
    }

//    @Override
    public String listar() {
        String cadena = "---------- Afiliados ----------\n";
        for(int cedula : listaClientes.keySet()){
            cadena += listaClientes.get(cedula) + "\n";
        }
        return cadena;
    }

//    @Override
    public void generarCSV() {
    
    }

//    @Override
    public void restaurarDatos() {
    
    }

    public static Map<Integer, Cliente> getListaClientes() {
        return listaClientes;
    }
    
    public String obtenerApellidos(Integer cedula) {
        return listaClientes.get(cedula).getApellidos();
    }
    
    public String obtenerNombres(Integer cedula) {
        return listaClientes.get(cedula).getNombres();
    }
    
        public String obtenerTarjetaDeCredito(Integer cedula) {
        return String.valueOf(listaClientes.get(cedula).getTarjetaDeCredito());
    }
    
}
