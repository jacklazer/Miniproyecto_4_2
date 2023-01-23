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
import modelo.Producto;


/**
 * @authors:
 * Jhonnier Hernandez
 * Juan Cifuentes
 * Alejandra Carvajal
 */

public class GestionProducto {
    
    
    private static Map <Integer, Producto> listaProductos;

    public GestionProducto(){
        listaProductos = new HashMap<>();
//        
    }

    public void agregar(Integer Codigo, String Nombre, Integer PrecioUnitarioDeCompra, Integer PrecioUnitarioDeVenta) {
        Producto producto = new Producto(Codigo, Nombre, PrecioUnitarioDeCompra, PrecioUnitarioDeVenta);
        listaProductos.put(Codigo, producto);
    }
    
    public void actualizar(Integer codigo, String nombre, Integer precioUnitarioDeCompra, Integer precioUnitarioDeVenta) {
            if(listaProductos.containsKey(codigo)){
            if (nombre != null)
                (listaProductos.get(codigo)).setNombre(nombre);
            if (precioUnitarioDeCompra != null)
                (listaProductos.get(codigo)).setPrecioUnitarioDeCompra(precioUnitarioDeCompra);
            if (precioUnitarioDeVenta != null)
                (listaProductos.get(codigo)).setPrecioUnitarioDeVenta(precioUnitarioDeVenta);
        } else {
            JOptionPane.showMessageDialog(null, "El producto no se encuentra registrado en la lista de productos");
        }
    }
    
    public void eliminar(Integer codigo) {
        
        if(listaProductos.containsKey(codigo)){
            listaProductos.remove(codigo);
            JOptionPane.showMessageDialog(null, "Producto eliminado con exito del registro de productos");
        } else {
            JOptionPane.showMessageDialog(null, "El producto no se encuentra registrado en la lista de productos o el codigo ingresado es incorrecto");
        }
    }
    
    public String listar() {
        
        String lista = "---------- Productos ----------\n";
        for(int codigo : listaProductos.keySet()){
            lista += listaProductos.get(codigo) + "\n";
        }
        return lista;
    }
    
    
    public void generarCSV() {

        String archivoCsv = "";
        for(int codigo : listaProductos.keySet()){
            archivoCsv += listaProductos.get(codigo) + "\n";
        }
        try {
            FileOutputStream os = new FileOutputStream(new File("src\\main\\java\\persistencia\\productos_csv.txt"));
            os.write(archivoCsv.getBytes());
            System.out.println("Copiado con exito!");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GestionCliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GestionCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
  
    public void restaurarDatos() {
        File archivo = new File("src\\main\\java\\persistencia\\productos_csv.txt");
        StringTokenizer stringTokenizer;
  
        String cadena1;
        String cadena2;
        
        Integer codigo;
        String nombre;
        Integer precioUnitarioDeCompra;
        Integer precioUnitarioDeVenta;
        Integer cantidadDeUnidadesDisponibles;
        
        try {
            FileReader fileReader = new FileReader(archivo);
            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {

                while ((cadena1 = bufferedReader.readLine()) != null){
                    cadena2 = cadena1.replace("Producto{", "");
                    cadena1 = cadena2.replace("Codigo: ", "");
                    cadena2 = cadena1.replace(" Nombre: ", "");
                    cadena1 = cadena2.replace(" Precio unitario de compra: ", "");
                    cadena2 = cadena1.replace(" Precio unitario de venta: ", "");
                    cadena1 = cadena2.replace(" Cantidad de unidades disponibles: ", "");
                    cadena2 = cadena1.replace("}", "");
//                   
                    stringTokenizer = new StringTokenizer(cadena2,",");
//                    
                    if (stringTokenizer.countTokens() == 5) {
                        codigo = Integer.valueOf(stringTokenizer.nextToken());
                        nombre = stringTokenizer.nextToken();
                        precioUnitarioDeCompra = Integer.valueOf(stringTokenizer.nextToken());
                        precioUnitarioDeVenta = Integer.valueOf(stringTokenizer.nextToken());
                        cantidadDeUnidadesDisponibles = Integer.valueOf(stringTokenizer.nextToken());
                        
                        Producto producto = new Producto(codigo, nombre, precioUnitarioDeCompra, precioUnitarioDeVenta);
                        producto.setCantidadDeUnidadesDisponibles(cantidadDeUnidadesDisponibles);
                        listaProductos.put(codigo, producto);
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

    public static Map<Integer, Producto> getListaProductos() {
        return listaProductos;
    }
    
    public String obtenerNombre(Integer codigo) {
        return listaProductos.get(codigo).getNombre();
    }
    
    public Integer obtenerCantidad(Integer codigo) {
        return listaProductos.get(codigo).getCantidadDeUnidadesDisponibles();
    }
    
    public String obtenerPrecioUnitarioDeCompra(Integer codigo) {
        return String.valueOf(listaProductos.get(codigo).getPrecioUnitarioDeCompra());
    }
    
    public Integer obtenerPrecioUnitarioDeCompraInteger(Integer codigo) {
        return listaProductos.get(codigo).getPrecioUnitarioDeCompra();
    }
    
    public String obtenerPrecioUnitarioDeVenta(Integer codigo) {
        return String.valueOf(listaProductos.get(codigo).getPrecioUnitarioDeVenta());
    }

    public Integer obtenerPrecioUnitarioDeVentaInteger(Integer codigo) {
        return listaProductos.get(codigo).getPrecioUnitarioDeVenta();
    }    
   
    public void comprarUnidades(Integer codigo, Integer cantidad) {
        listaProductos.get(codigo).setCantidadDeUnidadesDisponibles(listaProductos.get(codigo).getCantidadDeUnidadesDisponibles()+cantidad);
    }
    
    public void venderUnidades(Integer codigo, Integer cantidad) {
        listaProductos.get(codigo).setCantidadDeUnidadesDisponibles(listaProductos.get(codigo).getCantidadDeUnidadesDisponibles()+cantidad);
    }
    
//    public boolean productoEnLista(Integer codigo) {
//        for(int codigo : listaProductos.keySet()){
//            lista += listaProductos.get(codigo) + "\n";
//        }
//        return true;
//    }

    
}
