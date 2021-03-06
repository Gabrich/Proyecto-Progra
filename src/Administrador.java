import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Administrador extends javax.swing.JFrame {

    Manager m;
    DefaultTableModel Admin;   
   
    Object columnas[]={"Nº Venta","Fecha","Codigo Producto","Cantidad","Vendedor","rut cliente","monto"};
    DefaultTableModel Datos = new DefaultTableModel(null, columnas);                     
                
    public Administrador(Manager m) {
        this.m=m;
        initComponents();
        
        jComboBox2.setVisible(false);
        jLabel1.setVisible(false);
        jTextField1.setVisible(false);
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        jSpinner1.setVisible(false);
        jSpinner2.setVisible(false);
        jButton1.setVisible(false);   
        jButton2.setVisible(false);
    }

    public Administrador(DefaultTableModel Admin) {
        this.Admin = m.ptoVenta.Admin;
        initComponents();
        jTable1.setModel(Admin);         
    }   
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "Ventas Totales", "Ventas por Empleados", "Ventas por Clientes", "Ventas por Monto" }));
        jComboBox1.setToolTipText("Seleccione un Informe");
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nº Venta", "Fecha", "Codigo Producto", "Cantidad", "Vendedor", "Rut Cliente", "Monto"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton3.setText("Cerrar Sesion");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "Edgardo", "Gabriel", "Jorge" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Ingrese Rut");

        jLabel2.setText("Desde");

        jLabel3.setText("Hasta");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Filtrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("Limpiar tabla");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton4)
                                    .addGap(422, 422, 422)
                                    .addComponent(jButton3))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton1)
                                    .addGap(138, 138, 138)
                                    .addComponent(jButton2))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(51, 51, 51)
                                            .addComponent(jLabel2)
                                            .addGap(89, 89, 89)
                                            .addComponent(jLabel3))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(36, 36, 36)
                                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(57, 57, 57)
                                            .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(37, 37, 37))
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setVisible(false);
        m.login.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
      /*
       * Método que hace visible los campos necesarios para realizar la busqueda de los datos, según los 
       * requerimientos para cada informe al seleccionar cada opcion del ComboBox
       */  
        
        
        switch(jComboBox1.getSelectedIndex()){
            case 1:     
                jTable1.setVisible(true);
                jComboBox2.setVisible(false);
                jLabel1.setVisible(false);
                jTextField1.setVisible(false);
                jLabel2.setVisible(false);
                jLabel3.setVisible(false);
                jSpinner1.setVisible(false);
                jSpinner2.setVisible(false);
                jButton1.setVisible(false);  
                jButton2.setVisible(false);
                break;
            case 2:
                jComboBox2.setVisible(true);               
                jLabel1.setVisible(false);
                jTextField1.setVisible(false);
                jLabel2.setVisible(false);
                jLabel3.setVisible(false);
                jSpinner1.setVisible(false);
                jSpinner2.setVisible(false);
                jButton1.setVisible(false); 
                jButton2.setVisible(false);
                break;
            case 3: 
                jLabel1.setVisible(true);
                jTextField1.setVisible(true);
                jButton1.setVisible(true);                
                jComboBox2.setVisible(false);
                jLabel2.setVisible(false);
                jLabel3.setVisible(false);
                jSpinner1.setVisible(false);
                jSpinner2.setVisible(false);
                jButton2.setVisible(false);
                break;                
            case 4: 
                jLabel2.setVisible(true);
                jLabel3.setVisible(true);
                jSpinner1.setVisible(true);
                jSpinner2.setVisible(true); 
                jButton2.setVisible(true);
                jComboBox2.setVisible(false);
                jLabel1.setVisible(false);
                jTextField1.setVisible(false);
                jButton1.setVisible(false);
                break;
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        /*Metodo que muestra los datos de las ventas realizas por el vendedor selecionado en el Combobox, 
         *  los datos son agregados a un arreglo y visulaizados en la tabla 2.
         */
        
         switch(jComboBox2.getSelectedIndex()){             
            case 1:                 
                jTable1.setVisible(true);
                boolean match=false;
                for(int i=0;i<jTable1.getRowCount();i++){
                    if(jTable1.getValueAt(i, 4).equals("edgardo")){
                        match=true;
                        }
                    if(match==true){
                        Object ed[]={jTable1.getValueAt(i, 0),jTable1.getValueAt(i, 1),jTable1.getValueAt(i, 2),
                                     jTable1.getValueAt(i, 3),jTable1.getValueAt(i, 4),jTable1.getValueAt(i, 5),
                                     jTable1.getValueAt(i, 6)};                        
                        Datos.addRow(ed);
                        jTable2.setModel(Datos);
                    }
              }                 
                break;
            case 2: jTable1.setVisible(true);
                boolean match2=false;
                for(int i=0;i<jTable1.getRowCount();i++){
                    if(jTable1.getValueAt(i, 4).equals("gabriel")){
                        match2=true;
                        }
                    if(match2==true){
                        Object ed[]={jTable1.getValueAt(i, 0),jTable1.getValueAt(i, 1),jTable1.getValueAt(i, 2),
                             jTable1.getValueAt(i, 3),jTable1.getValueAt(i, 4),jTable1.getValueAt(i, 5),jTable1.getValueAt(i, 6)};
                        
                        Datos.addRow(ed);
                        jTable2.setModel(Datos);
                    }
              }      
                break;                
            case 3:
                jTable1.setVisible(true);
                boolean match1=false;
                for(int i=0;i<jTable1.getRowCount();i++){
                    if(jTable1.getValueAt(i, 4).equals("jorge")){
                        match1=true;
                        }
                    if(match1==true){
                        Object ed[]={jTable1.getValueAt(i, 0),jTable1.getValueAt(i, 1),jTable1.getValueAt(i, 2),
                             jTable1.getValueAt(i, 3),jTable1.getValueAt(i, 4),jTable1.getValueAt(i, 5),jTable1.getValueAt(i, 6)};
                        
                        Datos.addRow(ed);
                        jTable2.setModel(Datos);
                    }
              }
                break;
         }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    /* Muestra los datos de las ventas realizadas filtradas segun el rut del cliente que realizó la compra,
     * los datos son almacenados en un TableModel y mostrados en la tabla 2 de la clase administrador.
     */
        
         boolean match=false;
                for(int i=0;i<jTable1.getRowCount();i++){
                    if(jTable1.getValueAt(i, 5).equals(jTextField1.getText())){
                        match=true;
                    }
                    if(match==true){
                        Object ed[]={jTable1.getValueAt(i, 0),jTable1.getValueAt(i, 1),jTable1.getValueAt(i, 2),
                                     jTable1.getValueAt(i, 3),jTable1.getValueAt(i, 4),jTable1.getValueAt(i, 5),
                                     jTable1.getValueAt(i, 6)};
                        
                        Datos.addRow(ed);
                        jTable2.setModel(Datos);
                    }
                }
                if(match==false){
                    JOptionPane.showMessageDialog(this, "El cliente no ha realizado compras");
                }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        /* Muestra los datos de las ventas comprendidas entre los montos ingresados en los Spinner,
         * estos valores son validados de modo que el valor maximo sea mayor que el mínimo requerido.  
         */ 
        if((int) jSpinner1.getValue() > (int) jSpinner2.getValue()){
            JOptionPane.showMessageDialog(this, "Ingrese montos en forma correcta");
        }
        
        int a = (int) jSpinner1.getValue();
        int b = (int) jSpinner2.getValue();
        boolean match=false;
                for(int i=0;i<jTable1.getRowCount();i++){
                    if((Integer.parseInt(String.valueOf(jTable1.getValueAt(i, 6))) >= a) && (Integer.parseInt(String.valueOf(jTable1.getValueAt(i, 6))) <= b)){
                        match=true;
                    }
                    if(match==true){
                        Object ed[]={jTable1.getValueAt(i, 0),jTable1.getValueAt(i, 1),jTable1.getValueAt(i, 2),
                                     jTable1.getValueAt(i, 3),jTable1.getValueAt(i, 4),jTable1.getValueAt(i, 5),
                                     jTable1.getValueAt(i, 6)};
                        
                        Datos.addRow(ed);
                        jTable2.setModel(Datos);
                    }
                }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int a =Datos.getRowCount()-1;         
        for(int i=a;i>=0;i--){            
            Datos.removeRow(i);
        } 
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    public javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
