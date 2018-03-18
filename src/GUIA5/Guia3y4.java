/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA5;

import javax.swing.JOptionPane;

/**
 *
 * @author kevin
 */
public class Guia3y4 extends javax.swing.JFrame {

    
    
    String salida="";
    private String bateriaPantalla(){
        Double bateria=Double.parseDouble(txtBateria.getText());
        if(Double.parseDouble(txtPantalla.getText())<=4){
            if(bateria<=1200){
                salida="3";
            }else if(bateria>1200 && bateria<=2400 ){
                salida="4";
            }else if(bateria>2400 && bateria<=3100){
                salida="5";
            }else if(bateria>3100){
                salida="6";
            }
        }else if(Double.parseDouble(txtPantalla.getText())<4 || Double.parseDouble(txtPantalla.getText())>8){
            if(bateria<=1200){
                salida="1";
            }else if(bateria>1200 && bateria<=2400){
                salida="2";
            }else if(bateria>2400 && bateria<3100){
                salida="3";
            }else if(bateria>3100){
                salida="4";
            }
        }else if(Double.parseDouble(txtPantalla.getText())<8 || Double.parseDouble(txtPantalla.getText())>12){
            if(bateria<=1200){
                salida="0";
            }else if(bateria>1200 && bateria<=2400){
                salida="1";
            }else if(bateria>2400 && bateria<3100){
                salida="2";
            }else if(bateria>3100){
                salida="3";
            }
        }
        
        return salida;
    }
    
    private String refdeMarca(){
       int marca=cmbMarca.getSelectedIndex();
       if(marca<=6){
           salida="4";
       }else if(marca>6 || marca<=9){
           salida="3";
       }else if(marca>9){
           salida="2";
       }
         
            return salida;
    }
    private String rangoPrecio(){
        Double precio=Double.parseDouble(txtPrecio.getText());
        if(precio<100){
            salida="2";
        }else if(precio<100 || precio>350){
            salida="3";
        }else if(precio>350){
            salida="4";
        }
        return salida;
    }
    
    private String garantia(){
       if(Integer.parseInt(txtGarantia.getText())<=3){
           salida="1";
       }else if(Integer.parseInt(txtGarantia.getText())<3 || (Integer.parseInt(txtGarantia.getText())>6)){
           salida="2";
       }if(Integer.parseInt(txtGarantia.getText())>6){
           salida="4";
       }
       return salida;
    }
    private String cpu(){
        if(Double.parseDouble(txtCpu.getText())==2){
            salida="0";
        }else if(Double.parseDouble(txtCpu.getText())==4){
            salida="1";
        }else if(Double.parseDouble(txtCpu.getText())==6){
            salida="2";
        }else if(Double.parseDouble(txtCpu.getText())==8){
            salida="3";
        }
        else{
            salida="--";
        }
        return salida;
    }
    private String Ram(){
        if(Double.parseDouble(txtRam.getText())<1){
            salida="0";
        }else if(Double.parseDouble(txtRam.getText())<1 || Double.parseDouble(txtRam.getText())>2){
            salida="2";
        }else if(Double.parseDouble(txtRam.getText())<2 || Double.parseDouble(txtRam.getText())>4){
            salida="4";
        }else if(Double.parseDouble(txtRam.getText())>4 ){
            salida="6";
        }
        return salida;
    }
    private String pixelaje(){
        
        if(Double.parseDouble(txtPrincipal.getText())<=5){
            if(Double.parseDouble(txtSecundaria.getText())<2){
                salida="1";
            
            } else if(Double.parseDouble(txtSecundaria.getText())>2){
                salida="2";
            }
        }else if(Double.parseDouble(txtPrincipal.getText())<5 || Double.parseDouble(txtPrincipal.getText())>=8){
            if(Double.parseDouble(txtSecundaria.getText())<2){
                salida="1";
            }else if(Double.parseDouble(txtSecundaria.getText())<2 ||Double.parseDouble(txtSecundaria.getText())>=3 ){
                salida="2";
            } else if(Double.parseDouble(txtSecundaria.getText())>3){
                salida="3";
            }
        }else if(Double.parseDouble(txtPrincipal.getText())>8){
            if(Double.parseDouble(txtSecundaria.getText())<2){
                salida="1";
            }else if(Double.parseDouble(txtSecundaria.getText())<2 ||Double.parseDouble(txtSecundaria.getText())>=5 ){
                salida="2";
            } else if(Double.parseDouble(txtSecundaria.getText())>5){
                salida="3";
            }
        }else if(cbFlash.isSelected()==false){
            int resta=Integer.parseInt(salida);
            int r=resta-1;
            salida=""+r;
        }else{
            salida="";
        }
        
        return salida;
        }
    private String mostrar(){
        String salida="";
        int pantalla=Integer.parseInt(bateriaPantalla());
        int marca=Integer.parseInt(refdeMarca());
        int precio=Integer.parseInt(rangoPrecio());
        int garantia=Integer.parseInt(garantia());
        int cpu=Integer.parseInt(cpu());
        int ram=Integer.parseInt(Ram());
        int pixelaje=Integer.parseInt(pixelaje());
        
        int puntaje=pantalla+marca+precio+garantia+cpu+ram+pixelaje;
        
        if(puntaje<=7){
            salida+="Su puntaje es de : \nBateria:"+pantalla+"marca:"+marca+"Precio: $"+precio+"\ntiene una garantia de: "+garantia+"meses"
                    +"Numero de nucleos del Cpu: "+cpu+"\nCon una Memoria Ram de: "+ram+" gbt"+" Pixelaje: "+pixelaje+"\nLa Terminal no es buena";
        }else if(puntaje<7 || puntaje>14){
            salida+="Su puntaje es de : \nBateria: "+pantalla+" marca:"+marca+" Precio: $"+precio+"\ntiene una garantia de: "+garantia+" meses "
                    +"Numero de nucleos del Cpu: "+cpu+"\nCon una Memoria Ram de: "+ram+" gbt  "+"Pixelaje: "+pixelaje+"\nTiene una inversion de riesgo";
        }else if(puntaje<15 || puntaje >21){
         salida+="Su puntaje es de : \nBateria:"+pantalla+"marca:"+marca+"Precio: $"+precio+"\ntiene una garantia de: "+garantia+"meses"
                    +"Numero de nucleos del Cpu:"+cpu+"\nCon una Memoria Ram de: "+ram+"gbt"+"Pixelaje:"+pixelaje+"\nLa Inversion es viable";   
        }else if(puntaje>22){
            salida+="Su puntaje es de : \nBateria:"+pantalla+"marca:"+marca+"Precio: $"+precio+"\ntiene una garantia de: "+garantia+"meses"
                    +"Numero de nucleos del Cpu:"+cpu+"\nCon una Memoria Ram de: "+ram+"gbt"+"Pixelaje:"+pixelaje+"\nEs una buena Inversion";
        }
        return salida;
    }

    
    /**
     * Creates new form frmMoviles
     */
    public Guia3y4() {
        initComponents();
        
         txtPrincipal.setEnabled(false);
        txtSecundaria.setEnabled(false);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        txtCpu = new javax.swing.JTextField();
        txtPantalla = new javax.swing.JTextField();
        txtRam = new javax.swing.JTextField();
        txtGarantia = new javax.swing.JTextField();
        cbCamaraP = new javax.swing.JCheckBox();
        cbCamaraS = new javax.swing.JCheckBox();
        cbFlash = new javax.swing.JCheckBox();
        txtPrincipal = new javax.swing.JTextField();
        txtSecundaria = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSalida = new javax.swing.JTextArea();
        cmbMarca = new javax.swing.JComboBox<>();
        btnEjecutar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtBateria = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel1.setText("Puntaje de moviles");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 13, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cpu numeros de nucleos:");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 44, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tamaño de pantalla:");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 84, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cantidad de RAM:");
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 154, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tiempo de garantia:");
        jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 193, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Precio:");
        jLabel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 241, -1, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Marca:");
        jLabel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 283, -1, 16));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Camaras:");
        jLabel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 322, -1, -1));

        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });
        getContentPane().add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 107, -1));

        txtCpu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCpuKeyTyped(evt);
            }
        });
        getContentPane().add(txtCpu, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 43, 107, -1));

        txtPantalla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPantallaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPantallaKeyTyped(evt);
            }
        });
        getContentPane().add(txtPantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 83, 107, -1));

        txtRam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRamKeyTyped(evt);
            }
        });
        getContentPane().add(txtRam, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 158, 107, -1));

        txtGarantia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtGarantiaKeyTyped(evt);
            }
        });
        getContentPane().add(txtGarantia, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 192, 107, -1));

        cbCamaraP.setText("Principal");
        cbCamaraP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCamaraPActionPerformed(evt);
            }
        });
        getContentPane().add(cbCamaraP, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, -1, -1));

        cbCamaraS.setText("Secundaria");
        cbCamaraS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCamaraSActionPerformed(evt);
            }
        });
        getContentPane().add(cbCamaraS, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 320, -1, -1));

        cbFlash.setText("Flash");
        cbFlash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFlashActionPerformed(evt);
            }
        });
        getContentPane().add(cbFlash, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 320, -1, -1));

        txtPrincipal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrincipalActionPerformed(evt);
            }
        });
        txtPrincipal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrincipalKeyTyped(evt);
            }
        });
        getContentPane().add(txtPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 349, 71, -1));

        txtSecundaria.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtSecundaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSecundariaActionPerformed(evt);
            }
        });
        txtSecundaria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSecundariaKeyTyped(evt);
            }
        });
        getContentPane().add(txtSecundaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 349, 84, -1));

        txtSalida.setColumns(20);
        txtSalida.setRows(5);
        jScrollPane1.setViewportView(txtSalida);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 427, 408, 174));

        cmbMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NEXUS", "LENOVO", "HUAWEY", "GOOGLE", "SONY ", "APPLE", "SAMSUNG", "ALCATEL", "LG", "OTRA" }));
        getContentPane().add(cmbMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 280, -1, -1));

        btnEjecutar.setText("Ejecutar");
        btnEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjecutarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEjecutar, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 384, -1, -1));

        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 608, -1, -1));

        jButton2.setText("volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 608, -1, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Capacidad de la bateria");
        jLabel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 124, -1, -1));
        getContentPane().add(txtBateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 123, 107, -1));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, -1, 70));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 80, 120));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/newpackage/battlefield_1_squads-wallpaper-1920x1080.jpg"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCpuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCpuKeyTyped
       char caracter=evt.getKeyChar();
       
       if(caracter<'0' || caracter>'9'){
          
        evt.consume();
          if(Double.parseDouble(txtCpu.getText())<1 || Double.parseDouble(txtCpu.getText())>12){
              JOptionPane.showMessageDialog(null, "Solo digitos entre 1-12", "ERROR",JOptionPane.ERROR_MESSAGE);
          }
       }
       else if(txtCpu.getText().length()>=2){
           evt.consume();
           JOptionPane.showMessageDialog(null, "Solo se permiten un maximo de dos caracteres", "ERROR",JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_txtCpuKeyTyped

    private void txtPantallaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPantallaKeyTyped
      // double pantalla=Double.parseDouble(txtPantalla.getText());
        char caracter=evt.getKeyChar();
       if((caracter<'0' || caracter >'9')&& (caracter!='.') || (caracter=='.'&& txtPantalla.getText().contains("."))){
           evt.consume();
            double pantalla=Double.parseDouble(txtPantalla.getText());
            
                 if(pantalla< 3.0 || pantalla>= 12 ){
           
          JOptionPane.showMessageDialog(null,"Debe de estar entre el rango de (3.0-6.7)");
          txtPantalla.setText("");
                 }else{
                     evt.consume();
                 }
       }

       
       else if(txtPantalla.getText().length()>=3){
           evt.consume();
           JOptionPane.showMessageDialog(null,"solo se permiten un maximo de 3 caracteres", "ERROR", JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_txtPantallaKeyTyped

    private void txtRamKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRamKeyTyped
        char caracter=evt.getKeyChar();
        if((caracter<'0' || caracter>'9') && (caracter!='.') || (caracter=='.' && txtRam.getText().contains("."))){
            evt.consume();
            if(Double.parseDouble(txtRam.getText())<0.5 || Double.parseDouble(txtRam.getText())>6.0){
               JOptionPane.showMessageDialog(null,"Solo se permiten caracteres entre 0.5-6.0", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtRam.setText("");
            }
            
            
            
            
        }else if(txtRam.getText().length()>=3){
            evt.consume();
            JOptionPane.showMessageDialog(null,"Solo se permiten  un maximo de tres caracteres", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtRamKeyTyped

    private void txtGarantiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGarantiaKeyTyped
       char caracter=evt.getKeyChar();
       if((caracter<'0' || caracter>'9') && (caracter!='.') || (caracter=='.' && txtGarantia.getText().contains("."))){
           evt.consume();
           if(Double.parseDouble(txtGarantia.getText())<1 || Double.parseDouble(txtGarantia.getText())>24){
               JOptionPane.showMessageDialog(null,"Solo se permiten caracteres entre 1-24", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtGarantia.setText("");
            }
           
       }
       else if(txtGarantia.getText().length()>=3){
           evt.consume();
           JOptionPane.showMessageDialog(null,"Solo se permiten  un maximo de tres caracteres", "ERROR", JOptionPane.ERROR_MESSAGE);
       }
           
    }//GEN-LAST:event_txtGarantiaKeyTyped

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        char caracter=evt.getKeyChar();
        if((caracter<'0'|| caracter>'9') && caracter!='.' || (caracter=='.') && (txtPrecio.getText().contains("."))){
            evt.consume();
            if(Double.parseDouble(txtPrecio.getText())<0.01 || Double.parseDouble(txtPrecio.getText())>999.99){
               JOptionPane.showMessageDialog(null,"Solo se permiten caracteres entre 0.01-999.99", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtPrecio.setText("");
            }
            
            
        }else if(txtPrecio.getText().length()>=6){
            evt.consume();
            JOptionPane.showMessageDialog(null,"Solo se permiten  un maximo de seis caracteres", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void cbCamaraPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCamaraPActionPerformed
      if(cbCamaraP.isSelected()){
        txtPrincipal.setEnabled(true);
    }else if(cbCamaraP.isSelected()==false){
        txtPrincipal.setEnabled(false);
    }
        
      
    }//GEN-LAST:event_cbCamaraPActionPerformed

    private void cbCamaraSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCamaraSActionPerformed
        if(cbCamaraS.isSelected()){
             txtSecundaria.setEnabled(true);
        }else if(cbCamaraS.isSelected()==false){
            txtSecundaria.setEnabled(false);
        }
       
         
    }//GEN-LAST:event_cbCamaraSActionPerformed
public String validarBoton(){
    String salida = "";
    if(cbCamaraP.isSelected()){
      salida +=("Principal de "+txtPrincipal.getText()+" mpx ");
    }if(cbCamaraS.isSelected()){
       salida +=(" Secundaria de "+txtSecundaria.getText()+" mpx ");
    }if(cbFlash.isSelected()){
            salida +=(" Y flash");
        }
    return salida;
    
}

    private void btnEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjecutarActionPerformed
       if(txtPantalla.getText().equals("")){
           JOptionPane.showMessageDialog(null,"Asegurese de haber llenado todos los campos");
       }else if(txtCpu.getText().equals("")){
           JOptionPane.showMessageDialog(null,"Asegurese de haber llenado todos los campos");
       }else if(txtRam.getText().equals("")){
           JOptionPane.showMessageDialog(null,"Asegurese de haber llenado todos los campos");
       }else if(txtGarantia.getText().equals("")){
           JOptionPane.showMessageDialog(null,"Asegurese de haber llenado todos los campos");
       }else if(txtPrecio.getText().equals("")){
           JOptionPane.showMessageDialog(null,"Asegurese de haber llenado todos los campos");
       }
        
        txtSalida.setText("El numero de Cpu es:"+txtCpu.getText()+"\t"+"El tamaño de pantalla es:"+txtPantalla.getText()+"\n"+"La memoria Ram es de:"+txtRam.getText()+"\t"+"La garantia es de:"+txtGarantia.getText()
                +"\nSu precio es de:"+txtPrecio.getText()+"\tY la marca es de:"+cmbMarca.getSelectedItem()+"\nPosee camaras de:"+validarBoton()+"\n"+mostrar());
       
      
    }//GEN-LAST:event_btnEjecutarActionPerformed

    private void cbFlashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFlashActionPerformed
       
    }//GEN-LAST:event_cbFlashActionPerformed

    private void txtSecundariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSecundariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSecundariaActionPerformed

    private void txtPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrincipalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrincipalActionPerformed

    private void txtPrincipalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrincipalKeyTyped
        char caracter=evt.getKeyChar();
        if((caracter<'0' || caracter>'9') && (caracter!='.')|| (caracter=='.' && txtPrincipal.getText().contains("."))){
            evt.consume();
            
        }
        else if(txtPrincipal.getText().length()>=4){
            evt.consume();
            JOptionPane.showMessageDialog(null,"Solo se permiten  un maximo de 4 caracteres", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtPrincipalKeyTyped

    private void txtSecundariaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSecundariaKeyTyped
        char caracter=evt.getKeyChar();
        if((caracter<'0' || caracter>'9') && (caracter!='.')|| (caracter=='.' && txtSecundaria.getText().contains("."))){
            evt.consume();
          
        }
        else if(txtSecundaria.getText().length()>=4){
            evt.consume();
            JOptionPane.showMessageDialog(null,"Solo se permiten  un maximo de 4 caracteres", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtSecundariaKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       txtCpu.setText("");
       txtBateria.setText("");
               txtPantalla.setText("");
               txtRam.setText("");
               txtGarantia.setText("");
               txtPrecio.setText("");
               txtPrincipal.setText("");
               txtSecundaria.setText("");
               txtSalida.setText("");
               cbCamaraP.setSelected(false);
               cbCamaraS.setSelected(false);
               cbFlash.setSelected(false);
               txtPrincipal.setEnabled(false);
        txtSecundaria.setEnabled(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        frmPrincipal ventana= new frmPrincipal();
        this.setVisible(false);
        ventana.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtPantallaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPantallaKeyPressed
           
    }//GEN-LAST:event_txtPantallaKeyPressed

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
            java.util.logging.Logger.getLogger(Guia3y4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Guia3y4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Guia3y4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Guia3y4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Guia3y4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEjecutar;
    private javax.swing.JCheckBox cbCamaraP;
    private javax.swing.JCheckBox cbCamaraS;
    private javax.swing.JCheckBox cbFlash;
    private javax.swing.JComboBox<String> cmbMarca;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBateria;
    private javax.swing.JTextField txtCpu;
    private javax.swing.JTextField txtGarantia;
    private javax.swing.JTextField txtPantalla;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtPrincipal;
    private javax.swing.JTextField txtRam;
    private javax.swing.JTextArea txtSalida;
    private javax.swing.JTextField txtSecundaria;
    // End of variables declaration//GEN-END:variables

    
}
