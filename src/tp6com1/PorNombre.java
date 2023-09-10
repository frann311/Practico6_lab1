/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tp6com1;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tp6com1.modelo.Producto;

/**
 *
 * @author Celia
 */
public class PorNombre extends javax.swing.JInternalFrame {
private DefaultTableModel modelo= new DefaultTableModel(){
    
    public boolean isCellEditable (int f, int c){
        return false;
    }
};
    /** Creates new form PorNombre */
    public PorNombre() {
        initComponents();
        armarCabecera();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlNombre = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProductos = new javax.swing.JTable();
        jtNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jlNombre.setText("Escriba los primeros caracteres:");

        setBackground(new java.awt.Color(102, 102, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Listado Por Nombre");

        jtProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtProductos);

        jtNombre.setForeground(new java.awt.Color(153, 153, 153));
        jtNombre.setText("      -------busque su articulo-------");
        jtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNombreActionPerformed(evt);
            }
        });
        jtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtNombreKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 153, 255));
        jLabel1.setText("LISTADO POR NOMBRE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(133, 133, 133))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNombreKeyReleased
    borrarFilas();
        for(Producto prod:MenuGeneral.productos){
    
            if(prod.getDescripcion().toLowerCase().startsWith(jtNombre.getText().toLowerCase())){
                    modelo.addRow(new Object[]{
                            prod.getCodigo(),
                            prod.getDescripcion(),
                            prod.getPrecio(),
                            prod.getStock(),
           });
    }
}       

    }//GEN-LAST:event_jtNombreKeyReleased

    private void jtProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtProductosMouseClicked
        // TODO add your handling code here:
        int filaSeleccionada=jtProductos.getSelectedRow();
        int codigo=(Integer)jtProductos.getValueAt(filaSeleccionada, 0);
        JOptionPane.showMessageDialog(this,"El codigo "+codigo);
    }//GEN-LAST:event_jtProductosMouseClicked

    private void jtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNombreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTable jtProductos;
    // End of variables declaration//GEN-END:variables

    
  private void armarCabecera(){
    modelo.addColumn("Codigo");
    modelo.addColumn("Descripcion");
    modelo.addColumn("Precio");
    modelo.addColumn("Stock");
    jtProductos.setModel(modelo);
}

private void borrarFilas(){
    int f= modelo.getRowCount()-1;
    for (;f>=0;f--){
        modelo.removeRow(f);
    }
}
}
