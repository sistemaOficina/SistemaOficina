/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaOficina;

/**
 *
 * @author marcella
 */
public class CadastroClientes extends javax.swing.JFrame {

    /**
     * Creates new form CadastroClientes
     */
    public CadastroClientes() {
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

        jScrollBar1 = new javax.swing.JScrollBar();
        jLabelNome = new javax.swing.JLabel();
        jLabelCpf = new javax.swing.JLabel();
        jLabelTelefone = new javax.swing.JLabel();
        jLabelEndereco = new javax.swing.JLabel();
        jLabelData = new javax.swing.JLabel();
        jLabelRg = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldCpf = new javax.swing.JTextField();
        jTextFieldTelefone = new javax.swing.JTextField();
        jTextFieldEndereco = new javax.swing.JTextField();
        jTextFieldData = new javax.swing.JTextField();
        jTextFieldRg = new javax.swing.JTextField();
        jButtonGerarOS = new javax.swing.JButton();
        jButton2CadastrarVeiculo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonAdd = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableClientes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelNome.setText("Nome:");

        jLabelCpf.setText("Cpf/Cnpj:");

        jLabelTelefone.setText("Telefone:");

        jLabelEndereco.setText("Endereço:");

        jLabelData.setText("dd-mm-aa:");

        jLabelRg.setText("RG:");

        jButtonGerarOS.setText("Gerar O.S.");
        jButtonGerarOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGerarOSActionPerformed(evt);
            }
        });

        jButton2CadastrarVeiculo.setText("Cadastrar Veículo");

        jButtonSalvar.setText("Salvar");

        jButtonAdd.setText("Adicionar");

        jButtonEditar.setText("Editar");

        jButtonExcluir.setText("Excluir");

        jTableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cliente", "Cpf"
            }
        ));
        jScrollPane2.setViewportView(jTableClientes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelRg)
                    .addComponent(jLabelData, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelTelefone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAdd)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEditar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSalvar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabelCpf)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabelNome)
                                    .addGap(32, 32, 32)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelEndereco)
                                .addGap(6, 6, 6)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldEndereco)
                            .addComponent(jTextFieldNome)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldRg, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addComponent(jButton2CadastrarVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(jButtonGerarOS, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane2))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonAdd)
                    .addComponent(jButtonEditar)
                    .addComponent(jButtonExcluir))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelNome)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEndereco)
                    .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCpf, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTelefone, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelData)
                    .addComponent(jTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRg)
                    .addComponent(jTextFieldRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonGerarOS)
                    .addComponent(jButton2CadastrarVeiculo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGerarOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGerarOSActionPerformed
    CadastroOrdemDeServico cadastro = new CadastroOrdemDeServico(new javax.swing.JFrame(), true);
    cadastro.setVisible(true);
    //if (cadastro.getHisto() != null) {
    //    historicoListModel.addElement(cadastro.getHistorico());
    //}
    cadastro.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonGerarOSActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroClientes().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2CadastrarVeiculo;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonGerarOS;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabelCpf;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelRg;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableClientes;
    private javax.swing.JTextField jTextFieldCpf;
    private javax.swing.JTextField jTextFieldData;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldRg;
    private javax.swing.JTextField jTextFieldTelefone;
    // End of variables declaration//GEN-END:variables
}
