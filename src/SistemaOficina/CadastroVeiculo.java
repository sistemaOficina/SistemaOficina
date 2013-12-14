package SistemaOficina;

import java.util.ArrayList;
import javax.swing.DefaultListModel;

 

public class CadastroVeiculo extends javax.swing.JFrame {

    private Veiculo umVeiculo;
    private DefaultListModel AcessorioListModel;
    private DefaultListModel DefeitoListModel;
    
     
    
        public CadastroVeiculo() {
        initComponents();
        this.DefeitoListModel = new DefaultListModel();
        this.jListDefeitos.setModel(DefeitoListModel);
        this.AcessorioListModel = new DefaultListModel();
        this.jListAcessorios.setModel(AcessorioListModel);
        umVeiculo = new Veiculo(" ", 0000, " "," "); 
        this.setTitle("Cadastro de Veículos");
    }

   private void limparCampos() {
        jTextChassi.setText(null);
        jTextQuilometragem.setText("0");
        modeloText.setText(null);
        placaText.setText(null);
        anoText.setText("0");
        veiculoText.setText(null);
        AcessorioListModel.clear();
        DefeitoListModel.clear();
            }
   
   private void preencherCampos() {
       
        ArrayList<String> acessorios;
        ArrayList<String> defeito;     
         
        
        AcessorioListModel.clear();
        acessorios = umVeiculo.getAcessorios();
        for (String t : acessorios){
            AcessorioListModel.addElement(t);
        }
        
        
        DefeitoListModel.clear();
        defeito = umVeiculo.getDefeito();
        for (String p : defeito) {
            DefeitoListModel.addElement(p);
        }

        jTextChassi.setText(umVeiculo.getNumChassi());
        jTextQuilometragem.setText(Integer.toString(umVeiculo.getQuilometragem()));
        modeloText.setText(umVeiculo.getModelo());
        placaText.setText(umVeiculo.getPlaca());
        anoText.setText(Integer.toString(umVeiculo.getAno()));
        veiculoText.setText(umVeiculo.getVeiculo());

        
    }
   
   // VALIDAR CAMPOS DEPOIS
   
   private void salvarRegistro() {
        ArrayList<String> acessorio;
        ArrayList<String> defeito; 
        
        
        acessorio = new ArrayList<String>();
        for (int i = 0; i < AcessorioListModel.size(); i++) {
            acessorio.add(AcessorioListModel.getElementAt(i).toString());
        }

        defeito = new ArrayList<String>();
        for (int i = 0; i < DefeitoListModel.size(); i++) {
            defeito.add(DefeitoListModel.getElementAt(i).toString());
        }

        umVeiculo.setAcessorios(acessorio);
        umVeiculo.setDefeito(defeito);
        umVeiculo.setModelo(modeloText.getText());
        umVeiculo.setPlaca(placaText.getText());
        umVeiculo.setNumChassi(jTextChassi.getText());
        umVeiculo.setAno(Integer.parseInt(anoText.getText()));
        umVeiculo.setQuilometragem(Integer.parseInt(jTextQuilometragem.getText()));
        umVeiculo.setVeiculo(veiculoText.getText());
        
   }   
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Veiculo = new javax.swing.JLabel();
        veiculoText = new javax.swing.JTextField();
        modeloText = new javax.swing.JTextField();
        anoText = new javax.swing.JTextField();
        placaText = new javax.swing.JTextField();
        jScrollPaneAcessorio = new javax.swing.JScrollPane();
        jListAcessorios = new javax.swing.JList();
        jTextQuilometragem = new javax.swing.JTextField();
        jTextChassi = new javax.swing.JTextField();
        Modelo = new javax.swing.JLabel();
        ano = new javax.swing.JLabel();
        placa = new javax.swing.JLabel();
        quilometragem = new javax.swing.JLabel();
        numChassi = new javax.swing.JLabel();
        acessorios = new javax.swing.JLabel();
        defeitos = new javax.swing.JLabel();
        jScrollPaneDefeito = new javax.swing.JScrollPane();
        jListDefeitos = new javax.swing.JList();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonAddAce = new javax.swing.JButton();
        jButtonRemoveAce = new javax.swing.JButton();
        jButtonAddDef = new javax.swing.JButton();
        jButtonRemoveDef = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Veiculo.setText("Veiculo:");

        veiculoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veiculoTextActionPerformed(evt);
            }
        });

        modeloText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modeloTextActionPerformed(evt);
            }
        });

        placaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placaTextActionPerformed(evt);
            }
        });

        jListAcessorios.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jListAcessorios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListAcessoriosMouseClicked(evt);
            }
        });
        jScrollPaneAcessorio.setViewportView(jListAcessorios);

        jTextQuilometragem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextQuilometragemActionPerformed(evt);
            }
        });

        jTextChassi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextChassiActionPerformed(evt);
            }
        });

        Modelo.setText("Modelo:");

        ano.setText("Ano:");

        placa.setText("Placa:");

        quilometragem.setText("Quilometragem:");

        numChassi.setText("Nº Chassi:");

        acessorios.setText("Acessórios");

        defeitos.setText("Defeitos:");

        jListDefeitos.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPaneDefeito.setViewportView(jListDefeitos);

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonAddAce.setText("+");
        jButtonAddAce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddAceActionPerformed(evt);
            }
        });

        jButtonRemoveAce.setText("-");
        jButtonRemoveAce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveAceActionPerformed(evt);
            }
        });

        jButtonAddDef.setText("+");
        jButtonAddDef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddDefActionPerformed(evt);
            }
        });

        jButtonRemoveDef.setText("-");
        jButtonRemoveDef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveDefActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAddDef, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonRemoveDef, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Veiculo)
                                    .addComponent(Modelo)
                                    .addComponent(ano)
                                    .addComponent(placa)
                                    .addComponent(quilometragem)
                                    .addComponent(numChassi)
                                    .addComponent(defeitos))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(placaText)
                                    .addComponent(jTextQuilometragem)
                                    .addComponent(jTextChassi)
                                    .addComponent(veiculoText, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                    .addComponent(modeloText)
                                    .addComponent(anoText))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                                .addComponent(jScrollPaneAcessorio, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPaneDefeito))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonRemoveAce, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(jButtonAddAce, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(16, 16, 16))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonCancelar)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(acessorios)
                        .addGap(156, 156, 156))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(acessorios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Veiculo)
                            .addComponent(veiculoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(modeloText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Modelo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(anoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ano))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(placaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(placa))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextQuilometragem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quilometragem))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextChassi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numChassi)))
                    .addComponent(jScrollPaneAcessorio, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAddAce)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonRemoveAce)))
                .addGap(31, 31, 31)
                .addComponent(defeitos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPaneDefeito, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAddDef)
                    .addComponent(jButtonRemoveDef))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonCancelar))
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void veiculoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veiculoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_veiculoTextActionPerformed

    private void modeloTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modeloTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modeloTextActionPerformed

    private void placaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_placaTextActionPerformed

    private void jTextChassiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextChassiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextChassiActionPerformed

    private void jListAcessoriosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListAcessoriosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jListAcessoriosMouseClicked

    private void jTextQuilometragemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextQuilometragemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextQuilometragemActionPerformed

    private void jButtonAddAceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddAceActionPerformed
      
    CadastroAcessorio cadastro = new CadastroAcessorio(this, true);
    cadastro.setVisible(true);
   
    if (cadastro.getAcessorio()!= null) {
        AcessorioListModel.addElement(cadastro.getAcessorio());
    }
    cadastro.dispose();
    
    }//GEN-LAST:event_jButtonAddAceActionPerformed

    private void jButtonRemoveAceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveAceActionPerformed
    if (jListAcessorios.getSelectedIndex() != -1) {
        AcessorioListModel.removeElementAt(jListAcessorios.getSelectedIndex());
    }        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRemoveAceActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        this.salvarRegistro(); 
      
           //  TODO add your handling code here:
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.limparCampos();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonAddDefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddDefActionPerformed
    CadastroDefeito cadastro = new CadastroDefeito(this, true);
    cadastro.setVisible(true);
        if (cadastro.getDefeito()!= null) {
       DefeitoListModel.addElement(cadastro.getDefeito());
    }
    cadastro.dispose();
    
                   
    }//GEN-LAST:event_jButtonAddDefActionPerformed

    private void jButtonRemoveDefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveDefActionPerformed
     if (jListDefeitos.getSelectedIndex() != -1) {
        DefeitoListModel.removeElementAt(jListDefeitos.getSelectedIndex());
    }
    }//GEN-LAST:event_jButtonRemoveDefActionPerformed

    
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
            java.util.logging.Logger.getLogger(CadastroVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            new CadastroVeiculo().setVisible(true);
       
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Modelo;
    private javax.swing.JLabel Veiculo;
    private javax.swing.JLabel acessorios;
    private javax.swing.JLabel ano;
    private javax.swing.JTextField anoText;
    private javax.swing.JLabel defeitos;
    private javax.swing.JButton jButtonAddAce;
    private javax.swing.JButton jButtonAddDef;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonRemoveAce;
    private javax.swing.JButton jButtonRemoveDef;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JList jListAcessorios;
    private javax.swing.JList jListDefeitos;
    private javax.swing.JScrollPane jScrollPaneAcessorio;
    private javax.swing.JScrollPane jScrollPaneDefeito;
    private javax.swing.JTextField jTextChassi;
    private javax.swing.JTextField jTextQuilometragem;
    private javax.swing.JTextField modeloText;
    private javax.swing.JLabel numChassi;
    private javax.swing.JLabel placa;
    private javax.swing.JTextField placaText;
    private javax.swing.JLabel quilometragem;
    private javax.swing.JTextField veiculoText;
    // End of variables declaration//GEN-END:variables
}
