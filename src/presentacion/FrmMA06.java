/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;


/**
 *
 * @author NVA
 */
public class FrmMA06 extends javax.swing.JFrame {
    
    
    
    /**
     * Creates new form FrmMA06
     */
    public FrmMA06() {
        initComponents();
        this.setSize(600,600);
        this.setLocationRelativeTo(null);  
        
    }
    
    
            
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtColaEspera = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        txtTiempo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnSimular = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtColaProcesos = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtColaTerminados = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        lblEnEspera = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblTerminados = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnReIniciar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ATENCI??N DE PROCESOS  SIMULACI??N ROUND ROBIN");
        jLabel1.setOpaque(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("ATENCI??N DE PROCESOS  SIMULACI??N ROUND ROBIN");
        jLabel9.setOpaque(true);
        getContentPane().add(jLabel9);
        jLabel9.setBounds(10, 10, 560, 30);

        jLabel3.setText("Cola de Espera de procesos:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 50, 220, 16);

        txtColaEspera.setColumns(20);
        txtColaEspera.setRows(5);
        jScrollPane1.setViewportView(txtColaEspera);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 70, 550, 120);

        jLabel2.setText("Tiempo de Simulaci??n:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 200, 190, 30);
        getContentPane().add(txtTiempo);
        txtTiempo.setBounds(210, 200, 30, 30);

        jLabel4.setText("ms");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(250, 210, 20, 16);

        btnSimular.setText("Simular");
        btnSimular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimularActionPerformed(evt);
            }
        });
        getContentPane().add(btnSimular);
        btnSimular.setBounds(380, 200, 100, 40);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(null);

        jLabel5.setText("Cola de Espera de procesos:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 10, 200, 16);

        txtColaProcesos.setColumns(20);
        txtColaProcesos.setRows(5);
        jScrollPane2.setViewportView(txtColaProcesos);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(10, 30, 270, 110);

        jLabel7.setText("Total Procesos en Espera:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 160, 180, 16);

        txtColaTerminados.setColumns(20);
        txtColaTerminados.setRows(5);
        jScrollPane3.setViewportView(txtColaTerminados);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(300, 30, 260, 110);

        jLabel6.setText("Cola de procesos terminados:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(300, 10, 220, 16);

        lblEnEspera.setBackground(new java.awt.Color(255, 255, 255));
        lblEnEspera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEnEspera.setOpaque(true);
        jPanel1.add(lblEnEspera);
        lblEnEspera.setBounds(200, 160, 50, 30);

        jLabel8.setText("Total Procesos terminados:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(280, 160, 180, 16);

        lblTerminados.setBackground(new java.awt.Color(255, 255, 255));
        lblTerminados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTerminados.setOpaque(true);
        jPanel1.add(lblTerminados);
        lblTerminados.setBounds(470, 160, 40, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 260, 570, 200);

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.jpeg"))); // NOI18N
        getContentPane().add(btnLimpiar);
        btnLimpiar.setBounds(100, 480, 60, 40);

        btnReIniciar.setText("Re-Iniciar");
        btnReIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReIniciarActionPerformed(evt);
            }
        });
        getContentPane().add(btnReIniciar);
        btnReIniciar.setBounds(240, 480, 120, 40);

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.jpeg"))); // NOI18N
        getContentPane().add(btnSalir);
        btnSalir.setBounds(440, 480, 60, 40);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(null);
        getContentPane().add(jPanel2);
        jPanel2.setBounds(430, 470, 0, 0);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimularActionPerformed
        
    }//GEN-LAST:event_btnSimularActionPerformed

    
    
 
    
   
    private void btnReIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReIniciarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReIniciarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMA06.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMA06.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMA06.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMA06.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMA06().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnReIniciar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSimular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblEnEspera;
    private javax.swing.JLabel lblTerminados;
    private javax.swing.JTextArea txtColaEspera;
    private javax.swing.JTextArea txtColaProcesos;
    private javax.swing.JTextArea txtColaTerminados;
    private javax.swing.JTextField txtTiempo;
    // End of variables declaration//GEN-END:variables
}
