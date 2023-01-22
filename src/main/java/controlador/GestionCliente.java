/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

//import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        String lista = "---------- Afiliados ----------\n";
        for(int cedula : listaClientes.keySet()){
            lista += listaClientes.get(cedula) + "\n";
        }
        return lista;
    }

//    @Override
    public void generarCSV() {
//        Cliente cliente;
        String archivoCsv = "";
        for(int cedula : listaClientes.keySet()){
            archivoCsv += listaClientes.get(cedula) + "\n";
        }
        try {
            FileOutputStream os = new FileOutputStream(new File("src\\main\\java\\persistencia\\clientes_csv.txt"));
            os.write(archivoCsv.getBytes());
            System.out.println("Copiado con exito!");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GestionCliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GestionCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

//    @Override
    public void restaurarDatos() {
        File archivo = new File("src\\main\\java\\persistencia\\clientes_csv.txt");
        StringTokenizer stringTokenizer;
//        String cadenaDatos = "";
        
        String cadena1;
        String cadena2;
        
        Integer cedula;
        String apellidos;
        String nombres;
        Integer tarjetaDeCredito;
        
        try {
            FileReader fileReader = new FileReader(archivo);
            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
////                cadena1 = bufferedReader.readLine();
//                for(int i=1; i <= 4; i++){
//                    cadena1 = bufferedReader.readLine();
//                    cadena2 = cadena1.replace("Cliente{Cedula: ", "");
//                    cadena1 = cadena2.replace(" Nombres: ", "");
//                    cadena2 = cadena1.replace(" Apellidos: ", "");
//                    cadena1 = cadena2.replace(" Tarjeta de credito: ", "");
//                    cadena2 = cadena1.replace("}", "");
//                    
//                    stringTokenizer = new StringTokenizer(cadena2,",");
//                    
//                    cedula = Integer.valueOf(stringTokenizer.nextToken());
//                    apellidos = stringTokenizer.nextToken();
//                    nombres = stringTokenizer.nextToken();
//                    tarjetaDeCredito = Integer.valueOf(stringTokenizer.nextToken());
//
//                    Cliente cliente = new Cliente(cedula, nombres, apellidos, tarjetaDeCredito);
//                    listaClientes.put(cedula, cliente);
//                    
//                    if (cadena1 != null) {
//                        break;
//                    }
//                }
                while ((cadena1 = bufferedReader.readLine()) != null){
                    cadena2 = cadena1.replace("Cliente{Cedula: ", "");
                    cadena1 = cadena2.replace(" Nombres: ", "");
                    cadena2 = cadena1.replace(" Apellidos: ", "");
                    cadena1 = cadena2.replace(" Tarjeta de credito: ", "");
                    cadena2 = cadena1.replace("}", "");
//                    cadenaDatos += cadena2;
                    stringTokenizer = new StringTokenizer(cadena2,",");
//                    if (st.countTokens() % 4 == 0 && st.countTokens() != 0) {
                    if (stringTokenizer.countTokens() == 4) {
                        cedula = Integer.valueOf(stringTokenizer.nextToken());
                        apellidos = stringTokenizer.nextToken();
                        nombres = stringTokenizer.nextToken();
                        tarjetaDeCredito = Integer.valueOf(stringTokenizer.nextToken());
                        
                        Cliente cliente = new Cliente(cedula, nombres, apellidos, tarjetaDeCredito);
                        listaClientes.put(cedula, cliente);
                    } 
                }
            }
        }
         catch (FileNotFoundException ex) {
            Logger.getLogger(GestionCliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GestionCliente.class.getName()).log(Level.SEVERE, null, ex);
        } 
//        finally {
//            System.out.println("Los datos contenidos en afiliados_csv son: \n" + cadenaDatos);
//            System.out.println("la lista de afiliados resultante es: " + listaClientes);
//        }    
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
