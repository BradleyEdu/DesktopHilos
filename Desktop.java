/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desktop;

/**
 *
 * @author bradl
 */
public class Desktop extends javax.swing.JFrame {

    /**
     * Creates new form Desktop
     */
    public Desktop() {
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        miDesktopPane = new javax.swing.JDesktopPane();
        jMenuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        elemV1 = new javax.swing.JMenuItem();
        elemV2 = new javax.swing.JMenuItem();
        elemSalir = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenu6.setText("File");
        jMenuBar1.add(jMenu6);

        jMenu7.setText("Edit");
        jMenuBar1.add(jMenu7);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout miDesktopPaneLayout = new javax.swing.GroupLayout(miDesktopPane);
        miDesktopPane.setLayout(miDesktopPaneLayout);
        miDesktopPaneLayout.setHorizontalGroup(
            miDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );
        miDesktopPaneLayout.setVerticalGroup(
            miDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 316, Short.MAX_VALUE)
        );

        jMenu1.setText("Men??");

        elemV1.setText("Ventana 1");
        elemV1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemV1ActionPerformed(evt);
            }
        });
        jMenu1.add(elemV1);

        elemV2.setText("Ventana 2");
        elemV2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemV2ActionPerformed(evt);
            }
        });
        jMenu1.add(elemV2);

        elemSalir.setText("Salir");
        elemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elemSalirActionPerformed(evt);
            }
        });
        jMenu1.add(elemSalir);

        jMenuBar.add(jMenu1);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(miDesktopPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(miDesktopPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void elemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elemSalirActionPerformed

    private void elemV1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemV1ActionPerformed
        Ventana1Interna v1=new Ventana1Interna();
        miDesktopPane.add(v1);
        v1.show();
    }//GEN-LAST:event_elemV1ActionPerformed

    private void elemV2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elemV2ActionPerformed
        Ventana2Interna v2=new Ventana2Interna();
        miDesktopPane.add(v2);
        v2.show();
    }//GEN-LAST:event_elemV2ActionPerformed

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
            java.util.logging.Logger.getLogger(Desktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Desktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Desktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Desktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Desktop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem elemSalir;
    private javax.swing.JMenuItem elemV1;
    private javax.swing.JMenuItem elemV2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JDesktopPane miDesktopPane;
    // End of variables declaration//GEN-END:variables
}
