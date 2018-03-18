
package GUIA5;

import com.sun.glass.events.KeyEvent;
import javax.swing.JOptionPane;

public class GUIA2 extends javax.swing.JFrame {

    public GUIA2() {
        initComponents();
     
        this.setLocationRelativeTo(null);
        setResizable(false);
        this.setTitle("Guia # 2");
        btnInsertar.setEnabled(false);
        panel1.setVisible(false);
      
        this.txtOpcion.requestFocus();
    }

    String[] letras = new String[10];

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        txtletra = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnInsertar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        txtOpcion = new javax.swing.JTextField();
        btnProcesarMenu = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel1.setBackground(new java.awt.Color(102, 102, 102));

        txtletra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtletraKeyTyped(evt);
            }
        });

        jLabel6.setText("ingrese las letras (10 en total)");

        btnInsertar.setFont(new java.awt.Font("Hall Fetica Wide", 0, 11)); // NOI18N
        btnInsertar.setText("Insertar");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });
        btnInsertar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnInsertarKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(txtletra, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(110, 110, 110))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtletra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        getContentPane().add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 400, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 47, 470, -1));

        txtOpcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOpcionActionPerformed(evt);
            }
        });
        txtOpcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtOpcionKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtOpcionKeyTyped(evt);
            }
        });
        getContentPane().add(txtOpcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 162, -1));

        btnProcesarMenu.setFont(new java.awt.Font("Hall Fetica Wide", 0, 11)); // NOI18N
        btnProcesarMenu.setText("Procesar");
        btnProcesarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarMenuActionPerformed(evt);
            }
        });
        btnProcesarMenu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnProcesarMenuKeyPressed(evt);
            }
        });
        getContentPane().add(btnProcesarMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, -1, -1));

        jButton1.setFont(new java.awt.Font("Hall Fetica Wide", 0, 12)); // NOI18N
        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 470, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("1. Para ingresar las letras");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 240, 29));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("2. Ordenar de manera Ascendente ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 320, -1));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("3. Mostrar letras Ingresadas");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 270, -1));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(" Ingrese la opción que Desea:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 280, -1));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("0. Salir");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 140, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/newpackage/FondoAzul.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

  

    public void burbuja() {
        //metodo de la burbuja para ordenar el array
         String aux="";
         String salida="";
         int j,i;
        for ( j = 0; j < 9; j++) {
            
            
            
         
            for ( i = 0; i < 9 - j; i++) {
                if (letras[i].compareTo(letras[i + 1]) > 0) {
                   
                    aux = letras[i];
                    letras[i] = letras[i + 1];
                    letras[i + 1] = aux;
          
                }
                        
           
            }
        }
       for ( i = 0; i < 10 ; i++) {
           salida+=letras[i]+"";
       }
         
               JOptionPane.showMessageDialog(null, salida);
       }
       
    

    public void impresion() {
        String cadena="";
        
        for (int i = 0; i <txtletra.getText().length(); i++) {
            cadena=cadena+letras[i]+",";
         
          
        
        }
        JOptionPane.showMessageDialog(null,cadena);
    }


    private void txtOpcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOpcionActionPerformed

    }//GEN-LAST:event_txtOpcionActionPerformed

    private void btnProcesarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarMenuActionPerformed

        String eleccion;
        int num;

        eleccion = txtOpcion.getText();
        num = Integer.parseInt(eleccion);
        txtOpcion.setText("");

        if (num < 0 || num > 3) {
            JOptionPane.showMessageDialog(null, "ingrese una opcion valida");

        } else {

            switch (num) {
                case 1:
                    txtletra.setText("");
                    txtletra.setEnabled(true);
                    btnInsertar.setEnabled(false);
                    panel1.setVisible(true);
                    btnProcesarMenu.setEnabled(false);
                    txtOpcion.setEnabled(false);
                    
                   break;
                case 2:
               
//                    if(txtletra.getText().equals("")){
//                        JOptionPane.showMessageDialog(null,"aun no se ingresa una cadena de texto para ordenar!");
//                    
                    
                    burbuja();
                    JOptionPane.showMessageDialog(null, "serie de letras ordenadas !");
                    
                    btnProcesarMenu.setEnabled(true);
                    txtOpcion.setEnabled(true);
            
                    
//                    }
                    break;
                case 3:
                   
                    impresion();
                      
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }

    }//GEN-LAST:event_btnProcesarMenuActionPerformed

    private void txtOpcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOpcionKeyTyped
//validacion para que ingrese letras
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtOpcionKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       frmPrincipal ventana= new frmPrincipal();
        this.setVisible(false);
        ventana.setVisible(true);
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtOpcionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOpcionKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
        btnProcesarMenu.requestFocus();
        
        }
        
    }//GEN-LAST:event_txtOpcionKeyPressed

    private void btnProcesarMenuKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnProcesarMenuKeyPressed
        // TODO add your handling code here:
          if (evt.getKeyCode()==KeyEvent.VK_ENTER){
              btnProcesarMenuActionPerformed(null);
      
        }
          txtOpcion.requestFocus();
    }//GEN-LAST:event_btnProcesarMenuKeyPressed

    private void btnInsertarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnInsertarKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){

            btnInsertarActionPerformed(null);
        }

    }//GEN-LAST:event_btnInsertarKeyPressed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        for (int i = 0; i < 10; i++) {
            letras[i] = "";
        }

        int i;
        String letritas = txtletra.getText();
        for (i = 0; i < 10; i++) {
            letras[i] = Character.toString(letritas.charAt(i));
        }

        panel1.setVisible(false);//ocultar el panel al presionar el boton
        btnProcesarMenu.setEnabled(true);
        txtOpcion.setEnabled(true);
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void txtletraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtletraKeyTyped
        // TODO add your handling code here:

        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
        } else {
            evt.consume();
        }
        if (txtletra.getText().length() >= 10) {
            evt.consume();//validacion de maximo de letras

        }
        if (txtletra.getText().length() > 9) {
            btnInsertar.setEnabled(true);
            txtletra.setEnabled(false);
        }
    }//GEN-LAST:event_txtletraKeyTyped

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
            java.util.logging.Logger.getLogger(GUIA2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIA2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIA2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIA2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIA2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnProcesarMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panel1;
    private javax.swing.JTextField txtOpcion;
    private javax.swing.JTextField txtletra;
    // End of variables declaration//GEN-END:variables
}
