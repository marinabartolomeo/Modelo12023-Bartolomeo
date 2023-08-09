/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ej26menubart;

/**
 *
 * @author Marina
 */
public class Escritorio extends javax.swing.JFrame {

    /**
     * Creates new form Escritorio
     */
    public Escritorio() {
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

        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Colores = new javax.swing.JMenu();
        Azul = new javax.swing.JCheckBoxMenuItem();
        Rojo = new javax.swing.JCheckBoxMenuItem();
        Verde = new javax.swing.JCheckBoxMenuItem();
        Tamaño = new javax.swing.JMenu();
        Tam1 = new javax.swing.JCheckBoxMenuItem();
        Tam2 = new javax.swing.JCheckBoxMenuItem();
        Tam3 = new javax.swing.JCheckBoxMenuItem();
        Acciones = new javax.swing.JMenu();
        Salir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        Colores.setText("Colores");

        Azul.setBackground(java.awt.Color.blue);
        Azul.setSelected(true);
        Azul.setText("Azul");
        Azul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AzulActionPerformed(evt);
            }
        });
        Colores.add(Azul);

        Rojo.setBackground(java.awt.Color.red);
        Rojo.setSelected(true);
        Rojo.setText("Rojo");
        Colores.add(Rojo);

        Verde.setBackground(java.awt.Color.green);
        Verde.setSelected(true);
        Verde.setText("Verde");
        Colores.add(Verde);

        jMenuBar1.add(Colores);

        Tamaño.setText("Tamaño");
        Tamaño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TamañoActionPerformed(evt);
            }
        });

        Tam1.setSelected(true);
        Tam1.setText("800x600");
        Tam1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tam1ActionPerformed(evt);
            }
        });
        Tamaño.add(Tam1);

        Tam2.setSelected(true);
        Tam2.setText("1000x800");
        Tam2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tam2ActionPerformed(evt);
            }
        });
        Tamaño.add(Tam2);

        Tam3.setSelected(true);
        Tam3.setText("1200x840");
        Tam3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tam3ActionPerformed(evt);
            }
        });
        Tamaño.add(Tam3);

        jMenuBar1.add(Tamaño);

        Acciones.setText("Acciones");
        Acciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccionesActionPerformed(evt);
            }
        });

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        Acciones.add(Salir);

        jMenuBar1.add(Acciones);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Tam1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tam1ActionPerformed
      this.setSize(800,600);
    }//GEN-LAST:event_Tam1ActionPerformed

    private void Tam2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tam2ActionPerformed
       this.setSize(1000,800);
                                        
    }//GEN-LAST:event_Tam2ActionPerformed

    private void Tam3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tam3ActionPerformed
       this.setSize(1200,840);

    }//GEN-LAST:event_Tam3ActionPerformed

    private void TamañoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TamañoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TamañoActionPerformed

    private void AzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AzulActionPerformed
       
    }//GEN-LAST:event_AzulActionPerformed

    private void AccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AccionesActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

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
            java.util.logging.Logger.getLogger(Escritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Escritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Escritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Escritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Escritorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Acciones;
    private javax.swing.JCheckBoxMenuItem Azul;
    private javax.swing.JMenu Colores;
    private javax.swing.JCheckBoxMenuItem Rojo;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JCheckBoxMenuItem Tam1;
    private javax.swing.JCheckBoxMenuItem Tam2;
    private javax.swing.JCheckBoxMenuItem Tam3;
    private javax.swing.JMenu Tamaño;
    private javax.swing.JCheckBoxMenuItem Verde;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
