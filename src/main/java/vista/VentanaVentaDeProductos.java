/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.GestionProducto;
import static controlador.GestionProducto.getListaProductos;
import controlador.GestionProvedor;
import java.util.Vector;
import javax.swing.JOptionPane;
import static vista.VentanaGestionProducto.isNotNumeric;

/**
 * @authors:
 * Jhonnier Hernandez
 * Juan Cifuentes
 * Alejandra Carvajal
 */
public class VentanaVentaDeProductos extends javax.swing.JFrame {
    
    Vector<Integer> vectorDeCodigos;
    Vector<Integer> vectorDeUnidadesAComprar;
    Vector<Integer> vectorDePrecios;
    

    /**
     * Creates new form VentanaVentaDeProductos
     */
    public VentanaVentaDeProductos() {
    }
    
    public VentanaVentaDeProductos(GestionProducto gestionProducto,GestionProvedor gestionProvedor) {
        initComponents();
        this.gestionProducto = gestionProducto;
        this.gestionProvedor = gestionProvedor;
        
        vectorDeCodigos = new Vector<>();
        vectorDeUnidadesAComprar = new Vector<>();
        vectorDePrecios = new Vector<>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("VENTA DE PRODUCTOS");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("VENTA"));

        jLabel1.setText("CODIGO DEL PRODUCTO:");

        jButton2.setText("AGREGAR AL CARRITO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("NÚMERO DE UNIDADES:");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton1.setText("ELIMINAR DEL CARRITO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(22, 22, 22)))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                            .addComponent(jTextField2))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setText("CARRITO DE COMPRAS:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel4.setText("TOTAL:");

        jButton3.setText("REALIZAR VENTA");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(275, 275, 275)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(64, 64, 64))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton4.setText("CONSULTAR ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Integer posicion = 0;
        Integer unidades;
        Integer codigo2;
        for (Integer codigo : vectorDeCodigos){
            codigo2 = vectorDeCodigos.get(posicion);
            unidades = vectorDeUnidadesAComprar.get(posicion);
            gestionProducto.venderUnidades(codigo,unidades);
            posicion++;

    //        for (Integer unidad : vectorDeCodigos){
    //            if (vectorDeCodigos.indexOf(codigo)== vectorDeUnidadesAComprar.indexOf(unidad)){
    //                gestionProducto.venderUnidades(codigo,unidad);
    //
    //            }
    //        }

        }jTextArea1.setText(null);
        this.dispose();
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jTextArea2.setText(gestionProducto.listar());
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
    String sCodigo= jTextField1.getText();
    String sUnidadesAComprar= jTextField2.getText();
        
    if (isNotNumeric(sCodigo)||isNotNumeric(sUnidadesAComprar)){
                
        JOptionPane.showMessageDialog(null, "Por favor ingrese un código y/o una cantidad válida");
                
    }else{
        Integer codigo = Integer.valueOf(jTextField1.getText());
        Integer unidadesAComprar = Integer.valueOf(jTextField2.getText());
                              
        if(GestionProducto.getListaProductos().containsKey(codigo)){
            Integer uDisponibles = gestionProducto.obtenerCantidad(codigo);
                       
            if(unidadesAComprar > uDisponibles|| gestionProducto.obtenerCantidad(codigo)<=0){
                            
                JOptionPane.showMessageDialog(null, "No puedes comprar mas productos de los disponibles");
                            
            }else{
                
////////////                if (vectorDeCodigos.contains(codigo)){
////////////                    Integer posicionDelProductoAModificarDelCarrito = vectorDeCodigos.indexOf(codigo);
////////////
////////////                    vectorDeUnidadesAComprar.removeElementAt(posicionDelProductoAModificarDelCarrito);
////////////                    vectorDePrecios.removeElementAt(posicionDelProductoAModificarDelCarrito);
////////////
////////////                    vectorDeUnidadesAComprar.insertElementAt(unidadesAComprar, posicionDelProductoAModificarDelCarrito);
////////////                    vectorDePrecios.insertElementAt(gestionProducto.obtenerPrecioUnitarioDeVentaInteger(codigo)*unidadesAComprar, posicionDelProductoAModificarDelCarrito);
////////////                } else {

                    Integer precio = gestionProducto.obtenerPrecioUnitarioDeVentaInteger(codigo)*unidadesAComprar;

                    vectorDeCodigos.add(codigo);
                    vectorDeUnidadesAComprar.add(unidadesAComprar);
                    vectorDePrecios.add(precio);

                    String textoDelCarritoDeCompras = "------------ Carrito de compras ------------\n";

                    Integer precioTotal = 0;
                    int c = 0;
                    for (int i : vectorDeCodigos){
                        textoDelCarritoDeCompras +=  "{Codigo: " + i + ", Producto: " + gestionProducto.obtenerNombre(i) + ", Unidades a comprar: " + vectorDeUnidadesAComprar.get(c) + ", Precio unitario: " + gestionProducto.obtenerPrecioUnitarioDeVentaInteger(i)  + ", Precio total: " + vectorDePrecios.get(c) + "}\n";
                        precioTotal += vectorDePrecios.get(c);
                        c++;
                    }

                    jTextArea1.setText(textoDelCarritoDeCompras);
                    jTextField3.setText(String.valueOf(precioTotal));
////////////                }
        }


                        
                    }else{

                        JOptionPane.showMessageDialog(null, "El código "+ sCodigo + " no existe");
                    }
                }jTextField1.setText(null);
                jTextField2.setText(null);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Integer codigo = Integer.valueOf(jTextField1.getText());
        Integer unidadesAQuitar = Integer.valueOf(jTextField2.getText());
        Integer precioAQuitar = gestionProducto.obtenerPrecioUnitarioDeVentaInteger(codigo)*unidadesAQuitar;
        
        if (vectorDeCodigos.contains(codigo)){
            Integer posicionDelProductoAQuitarDelCarrito = vectorDeCodigos.indexOf(codigo);
            Integer unidadesRestantes = vectorDeUnidadesAComprar.get(posicionDelProductoAQuitarDelCarrito)-unidadesAQuitar;
            Integer precioRestante = vectorDePrecios.get(posicionDelProductoAQuitarDelCarrito)-precioAQuitar;
            
            vectorDeUnidadesAComprar.removeElementAt(posicionDelProductoAQuitarDelCarrito);
            vectorDePrecios.removeElementAt(posicionDelProductoAQuitarDelCarrito);
            
            vectorDeUnidadesAComprar.insertElementAt(unidadesRestantes, posicionDelProductoAQuitarDelCarrito);
            vectorDePrecios.insertElementAt(precioRestante, posicionDelProductoAQuitarDelCarrito);
        } 
        
        String textoDelCarritoDeCompras = "------------ Carrito de compras ------------\n";
        
        Integer precioTotal = 0;
        int c = 0;
        for (int i : vectorDeCodigos){
            textoDelCarritoDeCompras += "{Codigo: " + i + ", Producto: " + gestionProducto.obtenerNombre(i) + ", Unidades a comprar: " + vectorDeUnidadesAComprar.get(c) + ", Precio unitario: " + gestionProducto.obtenerPrecioUnitarioDeVentaInteger(i)  + ", Precio total: " + vectorDePrecios.get(c) + "}\n";
            precioTotal += vectorDePrecios.get(c);
            c++;
        }
        
        jTextArea1.setText(textoDelCarritoDeCompras);
        jTextField3.setText(String.valueOf(precioTotal));
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaVentaDeProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaVentaDeProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaVentaDeProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaVentaDeProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaVentaDeProductos().setVisible(true);
            }
        });
    }
    
    private GestionProducto gestionProducto;
    private GestionProvedor gestionProvedor;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

    public static boolean isNotNumeric(String s)
    {
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException ex) {
            return true;
        }
        return false;
    }}
