/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package capagrafica;

import capalogica.carrera;

/**
 *
 * @author Usuario
 */
public class Frmgenerar extends javax.swing.JFrame {

    carrera ocarrera = new carrera();
    public Frmgenerar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnmuestracompe = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txacompetencias = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaclasfcompe = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txacategorias = new javax.swing.JTextArea();
        btnclasf = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        txaclasfequipo = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        txaclasificaciongen = new javax.swing.JTextArea();
        btnmuestraganador = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnmuestracompe.setText("Mostrar competencias");
        btnmuestracompe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmuestracompeActionPerformed(evt);
            }
        });

        txacompetencias.setEditable(false);
        txacompetencias.setColumns(20);
        txacompetencias.setRows(5);
        txacompetencias.setBorder(javax.swing.BorderFactory.createTitledBorder("Competencias"));
        jScrollPane1.setViewportView(txacompetencias);

        txaclasfcompe.setEditable(false);
        txaclasfcompe.setColumns(20);
        txaclasfcompe.setRows(5);
        txaclasfcompe.setBorder(javax.swing.BorderFactory.createTitledBorder("Clasificación competencia"));
        jScrollPane2.setViewportView(txaclasfcompe);

        txacategorias.setEditable(false);
        txacategorias.setColumns(20);
        txacategorias.setRows(5);
        txacategorias.setBorder(javax.swing.BorderFactory.createTitledBorder("Clasificación categorias"));
        jScrollPane3.setViewportView(txacategorias);

        btnclasf.setText("Clasificacion");
        btnclasf.setActionCommand("Clasificación");

        txaclasfequipo.setEditable(false);
        txaclasfequipo.setColumns(20);
        txaclasfequipo.setRows(5);
        txaclasfequipo.setBorder(javax.swing.BorderFactory.createTitledBorder("Clasificación equipos"));
        jScrollPane4.setViewportView(txaclasfequipo);

        txaclasificaciongen.setEditable(false);
        txaclasificaciongen.setColumns(20);
        txaclasificaciongen.setRows(5);
        txaclasificaciongen.setBorder(javax.swing.BorderFactory.createTitledBorder("Clasificación general"));
        jScrollPane5.setViewportView(txaclasificaciongen);

        btnmuestraganador.setText("Mostrar ganadores");
        btnmuestraganador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmuestraganadorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnmuestracompe, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnclasf, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(49, 49, 49))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnmuestraganador, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(btnclasf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnmuestracompe, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btnmuestraganador, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3)))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnmuestraganadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmuestraganadorActionPerformed
        Frmganador gan = new Frmganador();
        gan.setVisible(true);
        gan.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_btnmuestraganadorActionPerformed

    private void btnmuestracompeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmuestracompeActionPerformed
        ocarrera.cantkm(WIDTH);
        
    }//GEN-LAST:event_btnmuestracompeActionPerformed

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
            java.util.logging.Logger.getLogger(Frmgenerar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frmgenerar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frmgenerar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frmgenerar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frmgenerar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclasf;
    private javax.swing.JButton btnmuestracompe;
    private javax.swing.JButton btnmuestraganador;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea txacategorias;
    private javax.swing.JTextArea txaclasfcompe;
    private javax.swing.JTextArea txaclasfequipo;
    private javax.swing.JTextArea txaclasificaciongen;
    private javax.swing.JTextArea txacompetencias;
    // End of variables declaration//GEN-END:variables
}
