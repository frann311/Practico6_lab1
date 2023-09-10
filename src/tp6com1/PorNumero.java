
package tp6com1;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tp6com1.modelo.Producto;

/**
 *
 * @author Fran
 */
public class PorNumero extends javax.swing.JInternalFrame {
private DefaultTableModel modelo= new DefaultTableModel(){
    
    public boolean isCellEditable (int f, int c){
        return false;
    }
};
    /**
     * Creates new form PorNumero
     */
    public PorNumero() {
        initComponents();
        armarCabecera();
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTMinimo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTMaximo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProductos = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("listado por precio");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 153, 255));
        jLabel1.setText("LISTADO POR PRECIO");

        jLabel2.setText("Entre $");

        jTMinimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTMinimoActionPerformed(evt);
            }
        });

        jLabel3.setText("y");

        jTMaximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTMaximoActionPerformed(evt);
            }
        });
        jTMaximo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTMaximoKeyReleased(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 79, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel2)
                .addGap(48, 48, 48)
                .addComponent(jTMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(12, 12, 12)
                .addComponent(jTMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(147, 147, 147))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTMinimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTMinimoActionPerformed
        
    }//GEN-LAST:event_jTMinimoActionPerformed

    private void jtProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtProductosMouseClicked
        // TODO add your handling code here:
        int filaSeleccionada=jtProductos.getSelectedRow();
        int codigo=(Integer)jtProductos.getValueAt(filaSeleccionada, 0);
        JOptionPane.showMessageDialog(this,"El codigo "+codigo);
    }//GEN-LAST:event_jtProductosMouseClicked

    private void jTMaximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTMaximoActionPerformed

    }//GEN-LAST:event_jTMaximoActionPerformed

    private void jTMaximoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTMaximoKeyReleased
        // TODO add your handling code here:
            borrarFilas();
            double precioMin = Double.parseDouble(jTMinimo.getText());
            double precioMax = Double.parseDouble(jTMaximo.getText());

            for (Producto prod : MenuGeneral.productos) {
                double precioProducto = prod.getPrecio();
                 if (precioProducto >= precioMin && precioProducto <= precioMax) {
                    modelo.addRow(new Object[]{
                            prod.getCodigo(),
                            prod.getDescripcion(),
                            prod.getPrecio(),
                            prod.getStock(),
           });
            }
        }
    }//GEN-LAST:event_jTMaximoKeyReleased

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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTMaximo;
    private javax.swing.JTextField jTMinimo;
    private javax.swing.JTable jtProductos;
    // End of variables declaration//GEN-END:variables
}
