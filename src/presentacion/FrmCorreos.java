/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import clasesCorreo.Correo;
import colecciones.GestorDeCorreos;

/**
 *
 * @author ninavaldivia
 */
public class FrmCorreos extends javax.swing.JFrame {
    private GestorDeCorreos gc;
   
    /**
     * Creates new form FrmCorreos
     */
    public FrmCorreos() {
        initComponents();
        this.setSize(700,700);
        this.setLocationRelativeTo(null);
        gc= new GestorDeCorreos("correos.txt");
        this.txtCorreosEntrada.setText(gc.toStringEntrada());
               
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        btgBandejas = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCorreosEntrada = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        btnLeer = new javax.swing.JButton();
        lblCorreoActual = new javax.swing.JLabel();
        rdbLeido = new javax.swing.JRadioButton();
        rdbUrgente = new javax.swing.JRadioButton();
        rdbRevisar = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtBandeja = new javax.swing.JTextArea();
        lblBandeja = new javax.swing.JLabel();
        btnBandejaLeidos = new javax.swing.JButton();
        btnBandejaRevisar = new javax.swing.JButton();
        btnBandejaUrgentes = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gestionador de Correos");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 10, 720, 20);

        txtCorreosEntrada.setColumns(15);
        txtCorreosEntrada.setRows(5);
        jScrollPane1.setViewportView(txtCorreosEntrada);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 60, 360, 270);

        jLabel2.setText("Bandeja de Entrada");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 40, 170, 16);

        btnLeer.setText("Leer");
        btnLeer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeerActionPerformed(evt);
            }
        });
        getContentPane().add(btnLeer);
        btnLeer.setBounds(400, 90, 97, 29);

        lblCorreoActual.setBackground(new java.awt.Color(204, 255, 255));
        lblCorreoActual.setOpaque(true);
        getContentPane().add(lblCorreoActual);
        lblCorreoActual.setBounds(410, 130, 270, 30);

        btgBandejas.add(rdbLeido);
        rdbLeido.setText("Le??do");
        rdbLeido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbLeidoActionPerformed(evt);
            }
        });
        getContentPane().add(rdbLeido);
        rdbLeido.setBounds(410, 180, 80, 23);

        btgBandejas.add(rdbUrgente);
        rdbUrgente.setText("Urgente");
        getContentPane().add(rdbUrgente);
        rdbUrgente.setBounds(480, 180, 90, 23);

        btgBandejas.add(rdbRevisar);
        rdbRevisar.setText("Revisar");
        getContentPane().add(rdbRevisar);
        rdbRevisar.setBounds(570, 180, 80, 23);

        txtBandeja.setColumns(15);
        txtBandeja.setRows(5);
        jScrollPane2.setViewportView(txtBandeja);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 370, 360, 210);
        getContentPane().add(lblBandeja);
        lblBandeja.setBounds(10, 340, 360, 30);

        btnBandejaLeidos.setText("Mostrar Bandeja Le??dos");
        btnBandejaLeidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBandejaLeidosActionPerformed(evt);
            }
        });
        getContentPane().add(btnBandejaLeidos);
        btnBandejaLeidos.setBounds(430, 370, 189, 29);

        btnBandejaRevisar.setText("Mostrar Bandeja Revisar");
        btnBandejaRevisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBandejaRevisarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBandejaRevisar);
        btnBandejaRevisar.setBounds(430, 410, 190, 29);

        btnBandejaUrgentes.setText("Mostrar Bandeja Urgentes");
        btnBandejaUrgentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBandejaUrgentesActionPerformed(evt);
            }
        });
        getContentPane().add(btnBandejaUrgentes);
        btnBandejaUrgentes.setBounds(430, 450, 190, 29);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdbLeidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbLeidoActionPerformed
        // TODO add your handling code here:
        String strCorreo= lblCorreoActual.getText();
        if (strCorreo !=null){
            Correo correo= new Correo(strCorreo);
            gc.agregarEnLeidos(correo);
            this.lblBandeja.setText("Bandeja Le??dos");
            this.txtBandeja.setText(gc.toStringLeidos());
            this.lblCorreoActual.setText(null);
            
           
        }
       
    }//GEN-LAST:event_rdbLeidoActionPerformed

    private void btnLeerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeerActionPerformed
        // TODO add your handling code here:
        Correo correo= gc.obtenerDeEntrada();
        if (correo!=null){
            this.lblCorreoActual.setText(correo.toString());
            this.txtCorreosEntrada.setText(gc.toStringEntrada());
        } 
        else{
            this.lblCorreoActual.setText(null);
        }
        
    }//GEN-LAST:event_btnLeerActionPerformed

    private void btnBandejaLeidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBandejaLeidosActionPerformed
        // TODO add your handling code here:
        this.lblBandeja.setText("Bandeja Le??dos");
        this.txtBandeja.setText(gc.toStringLeidos());
    }//GEN-LAST:event_btnBandejaLeidosActionPerformed

    private void btnBandejaRevisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBandejaRevisarActionPerformed
        // TODO add your handling code here:
        this.lblBandeja.setText("Bandeja Revisar");
        this.txtBandeja.setText(gc.toStringRecibidos());
    }//GEN-LAST:event_btnBandejaRevisarActionPerformed

    private void btnBandejaUrgentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBandejaUrgentesActionPerformed
        // TODO add your handling code here:
        this.lblBandeja.setText("Bandeja Urgentes");
        this.txtBandeja.setText(gc.toStringUrgentes());
    }//GEN-LAST:event_btnBandejaUrgentesActionPerformed

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
            java.util.logging.Logger.getLogger(FrmCorreos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCorreos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCorreos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCorreos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCorreos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgBandejas;
    private javax.swing.JButton btnBandejaLeidos;
    private javax.swing.JButton btnBandejaRevisar;
    private javax.swing.JButton btnBandejaUrgentes;
    private javax.swing.JButton btnLeer;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBandeja;
    private javax.swing.JLabel lblCorreoActual;
    private javax.swing.JRadioButton rdbLeido;
    private javax.swing.JRadioButton rdbRevisar;
    private javax.swing.JRadioButton rdbUrgente;
    private javax.swing.JTextArea txtBandeja;
    private javax.swing.JTextArea txtCorreosEntrada;
    // End of variables declaration//GEN-END:variables
}
