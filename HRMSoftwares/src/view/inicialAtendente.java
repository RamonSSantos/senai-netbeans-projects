/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author alessandro
 */
public class inicialAtendente extends javax.swing.JFrame {

    /**
     * Creates new form inicialAtendente
     */
    public inicialAtendente() {
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

        jLabel4 = new javax.swing.JLabel();
        sftwName = new javax.swing.JLabel();
        saHoteis = new javax.swing.JLabel();
        iAtTitle = new javax.swing.JLabel();
        iAtBTCadastroCliente = new javax.swing.JButton();
        iAtBTCheckIn = new javax.swing.JButton();
        iAtBTConsultaCliente = new javax.swing.JButton();
        iAtBTConsultaQuarto = new javax.swing.JButton();
        iAtBTCheckOut = new javax.swing.JButton();
        iAtBTlogout = new javax.swing.JButton();
        iAtBTHelp = new javax.swing.JButton();

        jLabel4.setFont(new java.awt.Font("Dual-300", 0, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Informe o Login e Senha:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sftwName.setFont(new java.awt.Font("Enter The Grid", 0, 16)); // NOI18N
        sftwName.setText("Hotel Manager v1.0");

        saHoteis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo2.png"))); // NOI18N

        iAtTitle.setFont(new java.awt.Font("Dual-300", 0, 36)); // NOI18N
        iAtTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iAtTitle.setText("Selecione a opção desejada:");

        iAtBTCadastroCliente.setText("Cadastro de cliente");

        iAtBTCheckIn.setText("Check-in");

        iAtBTConsultaCliente.setText("Consulta de cliente");

        iAtBTConsultaQuarto.setText("Consulta de quarto");

        iAtBTCheckOut.setText("Check-out");

        iAtBTlogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sign_out2.png"))); // NOI18N

        iAtBTHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/help2.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(iAtTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 112, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iAtBTCadastroCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iAtBTCheckIn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iAtBTConsultaCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iAtBTConsultaQuarto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iAtBTCheckOut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(112, 112, 112))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sftwName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saHoteis))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(iAtBTHelp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(iAtBTlogout)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sftwName, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saHoteis))
                    .addComponent(iAtBTHelp)
                    .addComponent(iAtBTlogout))
                .addGap(18, 18, 18)
                .addComponent(iAtTitle)
                .addGap(53, 53, 53)
                .addComponent(iAtBTCadastroCliente)
                .addGap(26, 26, 26)
                .addComponent(iAtBTCheckIn)
                .addGap(26, 26, 26)
                .addComponent(iAtBTConsultaCliente)
                .addGap(26, 26, 26)
                .addComponent(iAtBTConsultaQuarto)
                .addGap(26, 26, 26)
                .addComponent(iAtBTCheckOut)
                .addContainerGap(335, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(inicialAtendente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicialAtendente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicialAtendente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicialAtendente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicialAtendente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton iAtBTCadastroCliente;
    private javax.swing.JButton iAtBTCheckIn;
    private javax.swing.JButton iAtBTCheckOut;
    private javax.swing.JButton iAtBTConsultaCliente;
    private javax.swing.JButton iAtBTConsultaQuarto;
    private javax.swing.JButton iAtBTHelp;
    private javax.swing.JButton iAtBTlogout;
    private javax.swing.JLabel iAtTitle;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel saHoteis;
    private javax.swing.JLabel sftwName;
    // End of variables declaration//GEN-END:variables
}
