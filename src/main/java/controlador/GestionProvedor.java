/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

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
import modelo.Provedor;

/**
 *
 * @author juanc
 */
public class GestionProvedor {
    private static Map <Integer, Provedor> listaProvedores;
    
    public GestionProvedor(){
        listaProvedores = new HashMap<>();
    }
    
    public void agregar(Integer codigo, String nombre, String listaDeProductos) {
        Provedor provedor = new Provedor(codigo, nombre, listaDeProductos);
        listaProvedores.put(codigo, provedor);
    }

    public void actualizar(Integer codigo, String nombre, String listaDeProductos) {
        if(listaProvedores.containsKey(codigo)){
            if (nombre != null)
                (listaProvedores.get(codigo)).setNombre(nombre);
            if (listaDeProductos != null)
                (listaProvedores.get(codigo)).setListaDeProductos(listaDeProductos);
        } else {
            JOptionPane.showMessageDialog(null, "El provedor no se encuentra registrado en la lista de afiliados");
        }
    }

    public void eliminar(Integer codigo) {
        if(listaProvedores.containsKey(codigo)){
            listaProvedores.remove(codigo);
            JOptionPane.showMessageDialog(null, "Provedor eliminado con exito del registro de afiliados");
        } else {
            JOptionPane.showMessageDialog(null, "El provedor no se encuentra registrado en la lista de provedores o el codigo ingresado es incorrecto");
        }
    }

    public String listar() {
        String lista = "---------- Provedores ----------\n";
        for(int codigo : listaProvedores.keySet()){
            lista += listaProvedores.get(codigo) + "\n";
        }
        return lista;
    }

    public void generarCSV() {
        String archivoCsv = "";
        for(int cedula : listaProvedores.keySet()){
            archivoCsv += listaProvedores.get(cedula) + "\n";
        }
        try {
            FileOutputStream os = new FileOutputStream(new File("src\\main\\java\\persistencia\\provedores_csv.txt"));
            os.write(archivoCsv.getBytes());
            System.out.println("Copiado con exito!");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GestionCliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GestionCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void restaurarDatos() {
        File archivo = new File("src\\main\\java\\persistencia\\provedores_csv.txt");
        StringTokenizer stringTokenizer;
        
        String cadena1;
        String cadena2;
        
        Integer codigo;
        String nombre;
        String listaDeProductos;
        
        try {
            FileReader fileReader = new FileReader(archivo);
            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
////////////                for(int i=1; i <= 3; i++){
////////////                    cadena1 = bufferedReader.readLine();
////////////                    
////////////                    if (cadena1 == null) {
////////////                        break;
////////////                    }
////////////                    
////////////                    cadena2 = cadena1.replace("Provedor{", "");
////////////                    cadena1 = cadena2.replace("Código: ", "");
////////////                    cadena2 = cadena1.replace(" Nombre: ", "");
////////////                    cadena1 = cadena2.replace(" Lista de productos: ", "");
////////////                    cadena2 = cadena1.replace("}", "");
////////////                    
//////////////                    if (cadena2 == null) {
//////////////                        break;
//////////////                    }
////////////                    
////////////                    stringTokenizer = new StringTokenizer(cadena2,",");
////////////                    
////////////                    codigo = Integer.valueOf(stringTokenizer.nextToken());
////////////                    nombre = stringTokenizer.nextToken();
////////////                    listaDeProductos = stringTokenizer.nextToken();
////////////
////////////                    Provedor provedor = new Provedor(codigo, nombre, listaDeProductos);
////////////                    listaProvedores.put(codigo, provedor);
////////////                }
                
                while ((cadena1 = bufferedReader.readLine()) != null){
                    cadena2 = cadena1.replace("Provedor{", "");
                    cadena1 = cadena2.replace("Código: ", "");
                    cadena2 = cadena1.replace(" Nombre: ", "");
                    cadena1 = cadena2.replace(" Lista de productos que provee: ", "");
                    cadena2 = cadena1.replace("}", "");
                    
                    stringTokenizer = new StringTokenizer(cadena2,",");
                    
                    if (stringTokenizer.countTokens() == 3) {
                        codigo = Integer.valueOf(stringTokenizer.nextToken());
                        nombre = stringTokenizer.nextToken();
                        listaDeProductos = stringTokenizer.nextToken();

                        Provedor provedor = new Provedor(codigo, nombre, listaDeProductos);
                        listaProvedores.put(codigo, provedor);
                    } 
                }
            }
        }
         catch (FileNotFoundException ex) {
            Logger.getLogger(GestionCliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GestionCliente.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }

    public static Map<Integer, Provedor> getListaClientes() {
        return listaProvedores;
    }
    
    public String obtenerNombre(Integer codigo) {
        return listaProvedores.get(codigo).getNombre();
    }
    
    public String obtenerListaDeProductos(Integer codigo) {
        return listaProvedores.get(codigo).getListaDeProductos();
    }
}
