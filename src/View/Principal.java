package View;

import javax.swing.JFrame;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        this.setVisible(true);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_principal = new javax.swing.JPanel();
        mnu_Bar = new javax.swing.JMenuBar();
        mnuArquivo = new javax.swing.JMenu();
        mnuCliente = new javax.swing.JMenuItem();
        mnuFilme = new javax.swing.JMenuItem();
        mnuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout pnl_principalLayout = new javax.swing.GroupLayout(pnl_principal);
        pnl_principal.setLayout(pnl_principalLayout);
        pnl_principalLayout.setHorizontalGroup(
            pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        pnl_principalLayout.setVerticalGroup(
            pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        mnuArquivo.setText("Arquivo");

        mnuCliente.setText("Cliente");
        mnuArquivo.add(mnuCliente);

        mnuFilme.setText("Filme");
        mnuFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFilmeActionPerformed(evt);
            }
        });
        mnuArquivo.add(mnuFilme);

        mnu_Bar.add(mnuArquivo);

        mnuSair.setText("Sair");
        mnu_Bar.add(mnuSair);

        setJMenuBar(mnu_Bar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_principal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFilmeActionPerformed
        FilmeView filme = new FilmeView();
        pnl_principal.removeAll();
        pnl_principal.add(filme);
        pnl_principal.updateUI();
    }//GEN-LAST:event_mnuFilmeActionPerformed

    private void mnuClienteActionPerformed(java.awt.event.ActionEvent evt) {
        ClienteView cliente = new ClienteView();
        pnl_principal.removeAll();
        pnl_principal.add(cliente);
        pnl_principal.updateUI();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu mnuArquivo;
    private javax.swing.JMenuItem mnuCliente;
    private javax.swing.JMenuItem mnuFilme;
    private javax.swing.JMenu mnuSair;
    private javax.swing.JMenuBar mnu_Bar;
    private javax.swing.JPanel pnl_principal;
    // End of variables declaration//GEN-END:variables
}
