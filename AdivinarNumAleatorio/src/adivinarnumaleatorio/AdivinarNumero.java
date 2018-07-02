package adivinarnumaleatorio;

import java.awt.Color;
import java.util.Random;

public class AdivinarNumero extends javax.swing.JFrame {
    
    Random numAleatorio = new Random();             
    int numeroRandom = numAleatorio.nextInt(1000);  
    
    public AdivinarNumero() {

        initComponents();
               
        System.out.println("El numero es: " + numeroRandom);
        this.getContentPane().setBackground(Color.gray); //**********Color
                                                        
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblsubTitulo = new javax.swing.JLabel();
        lblNombreProyecto = new javax.swing.JLabel();
        txtIngresoNumero = new javax.swing.JTextField();
        btnAdivinar = new javax.swing.JButton();
        btnReiniciar = new javax.swing.JButton();
        lblMensaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTitulo.setText("Tengo un numero entre 1 y 1000. Puede usted adivinarlo? ");

        lblsubTitulo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblsubTitulo.setText("Por favor escriba su primer intento.");

        lblNombreProyecto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNombreProyecto.setText("Adivinar Número Aleatorio");

        btnAdivinar.setText("Adivinar");
        btnAdivinar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdivinarActionPerformed(evt);
            }
        });

        btnReiniciar.setText("Reiniciar");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblsubTitulo)
                            .addComponent(lblTitulo)
                            .addComponent(btnReiniciar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblMensaje, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(txtIngresoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(43, 43, 43)
                                    .addComponent(btnAdivinar)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(lblNombreProyecto)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNombreProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(lblsubTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIngresoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdivinar))
                .addGap(18, 18, 18)
                .addComponent(lblMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReiniciar)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        
        this.getContentPane().setBackground(Color.gray);
        
        numeroRandom = numAleatorio.nextInt(1000);
        System.out.println("El nuevo numero es: " +numeroRandom);
        
        txtIngresoNumero.setEditable(true);
        txtIngresoNumero.setEnabled(true); 
        
        lblMensaje.setText("");
        txtIngresoNumero.setText("");
        
    }//GEN-LAST:event_btnReiniciarActionPerformed

    private void btnAdivinarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdivinarActionPerformed
        // TODO add your handling code here:
        
        int numAdivinado = Integer.parseInt(txtIngresoNumero.getText());
        
        if(numAdivinado == numeroRandom){
           lblMensaje.setText("ADIVINO EL NUMERO !!");
           this.getContentPane().setBackground(Color.gray);
           txtIngresoNumero.setEditable(false);
           txtIngresoNumero.setEnabled(false);  
        }else if(numAdivinado < numeroRandom){
            lblMensaje.setText("Su numero " +numAdivinado + " se esta ACERCANDO al numero!");
            this.getContentPane().setBackground(Color.RED);
            txtIngresoNumero.setText("");
        }else if(numAdivinado > numeroRandom){
            lblMensaje.setText("Su numero " +numAdivinado + " se esta ALEJANDO del numero !");
            this.getContentPane().setBackground(Color.BLUE);
            txtIngresoNumero.setText("");
        }
        
        
    }//GEN-LAST:event_btnAdivinarActionPerformed

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
            java.util.logging.Logger.getLogger(AdivinarNumero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdivinarNumero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdivinarNumero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdivinarNumero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdivinarNumero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdivinar;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblNombreProyecto;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblsubTitulo;
    private javax.swing.JTextField txtIngresoNumero;
    // End of variables declaration//GEN-END:variables
}
