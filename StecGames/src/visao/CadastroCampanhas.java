/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import javax.swing.JOptionPane;

/**
 *
 * @author Fulvio
 */
public class CadastroCampanhas extends javax.swing.JFrame {
    
       

    /**
     * Creates new form CadastroCampanhas
     */
    public CadastroCampanhas() {
        initComponents();
         jLabelMsgObrigatotioNome.setVisible(false);
         jLabelMsgObrigatotioPeriodo.setVisible(false);
         jLabelMsgObrigatotioLink.setVisible(false);
    }
     
    
    CadastroPracas janela2 = new CadastroPracas ();
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPeriodo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabSlcPraca = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        textAreaDescrição = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        txtLink = new javax.swing.JTextField();
        btCadastrar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        jLabelMsgObrigatotioNome = new javax.swing.JLabel();
        jLabelMsgObrigatotioPeriodo = new javax.swing.JLabel();
        jLabelMsgObrigatotioLink = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btNovaPraca = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Praça", "Tipo", "Valor diario"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("cadastro de campanahs");

        jLabel1.setText("cadastrar novas campanhas");

        jLabel2.setText("<html>Nome do Produto<font color=\"red\">*</font>");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        jLabel3.setText("<html>Periodo em dias<font color=\"red\">*</font>");

        jLabel4.setText("Selecione uma praça");

        tabSlcPraca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Praça", "Tipo", "Valor"
            }
        ));
        jScrollPane2.setViewportView(tabSlcPraca);

        jLabel5.setText("Descrição");

        textAreaDescrição.setColumns(20);
        textAreaDescrição.setRows(5);
        jScrollPane3.setViewportView(textAreaDescrição);

        jLabel6.setText("<html>link da localização da imagem ou video a ser veiculado<font color=\"red\">*</font>");

        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");

        btVoltar.setText("Voltar");

        jLabelMsgObrigatotioNome.setForeground(new java.awt.Color(255, 0, 0));
        jLabelMsgObrigatotioNome.setText("Campo Obrigatório");

        jLabelMsgObrigatotioPeriodo.setForeground(new java.awt.Color(255, 0, 0));
        jLabelMsgObrigatotioPeriodo.setText("Campo Obrigatório");

        jLabelMsgObrigatotioLink.setForeground(new java.awt.Color(255, 0, 0));
        jLabelMsgObrigatotioLink.setText("Campo Obrigatório");

        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("* Campo Obrigatório");

        btNovaPraca.setText("+");
        btNovaPraca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovaPracaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelMsgObrigatotioPeriodo)))
                            .addComponent(txtLink, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btCadastrar)
                                .addGap(81, 81, 81)
                                .addComponent(btLimpar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btVoltar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelMsgObrigatotioNome)
                                    .addComponent(jLabelMsgObrigatotioLink)
                                    .addComponent(jLabel8)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(70, 70, 70)
                                        .addComponent(btNovaPraca)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMsgObrigatotioNome)
                    .addComponent(jLabelMsgObrigatotioPeriodo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(btNovaPraca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabelMsgObrigatotioLink)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar)
                    .addComponent(btLimpar)
                    .addComponent(btVoltar))
                .addGap(29, 29, 29)
                .addComponent(jLabel8)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
      
        
            
                    
         
        
        
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        
        
         
         if (txtNome.getText().length()>0) {
            jLabelMsgObrigatotioNome.setVisible(false);
        } else {
             jLabelMsgObrigatotioNome.setVisible(true);
        }
         if(txtPeriodo.getText().length()>0){
            jLabelMsgObrigatotioPeriodo.setVisible(false);
         } else {
            jLabelMsgObrigatotioPeriodo.setVisible(true); 
         }
         if(txtLink.getText().length()>0){
            jLabelMsgObrigatotioLink.setVisible(false);
         } else {
            jLabelMsgObrigatotioLink.setVisible(true);
         }
         if ((txtNome.getText().length()>0)
                &&(txtPeriodo.getText().length()> 0)
                && (txtLink.getText().length() > 0)) {
            JOptionPane.showMessageDialog(null, "Dados Validados !!");
        } else {
            JOptionPane.showMessageDialog(null, "Preencha os campos Obrigatórios !!");
         }
         
         /*
         if (txtNome.getText().length()>5) {
           JOptionPane.showMessageDialog(rootPane,"Esse Campo não pode conter mais de 5 caracteres!");
         } else if (txtPeriodo.getText().length() > 5){
           JOptionPane.showMessageDialog(rootPane,"Esse Campo não pode conter mais de 5 caracteres!");  
         } else if (txtLink.getText().length()>5){
           JOptionPane.showMessageDialog(rootPane,"Esse Campo não pode conter mais de 5 caracteres!");     
         }
         */
        
        if(!txtNome.getText().isEmpty()){
        
        if(janela2==null){
           janela2 = new CadastroPracas();
           janela2.setLocationRelativeTo(null);
           janela2.setVisible(true);
           janela2.setResizable(false);
        }else{
           janela2.setLocationRelativeTo(null);
           janela2.setVisible(true);
           janela2.setResizable(false); 
        } 
        
        janela2.enviar(this, txtNome.getText());
    }
        
        
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btNovaPracaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovaPracaActionPerformed
SelecionarPraca frame = new SelecionarPraca();
frame.setVisible(true);
    }//GEN-LAST:event_btNovaPracaActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroCampanhas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCampanhas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCampanhas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCampanhas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCampanhas().setVisible(true);
                  
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btNovaPraca;
    private javax.swing.JButton btVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelMsgObrigatotioLink;
    private javax.swing.JLabel jLabelMsgObrigatotioNome;
    private javax.swing.JLabel jLabelMsgObrigatotioPeriodo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tabSlcPraca;
    private javax.swing.JTextArea textAreaDescrição;
    private javax.swing.JTextField txtLink;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPeriodo;
    // End of variables declaration//GEN-END:variables
}
