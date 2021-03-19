/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADP.view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import ADP.model.Equipamento;

/**
 *
 * @author lucas
 */
public class RegistroChamados extends javax.swing.JInternalFrame {
    
       MainFrame menu;
     public Equipamento eqp;
    /**
     * Creates new form RegistroChamados
     */
    public RegistroChamados() {
        initComponents();
    }
    
    public RegistroChamados(Equipamento equipamento) {
        this.eqp = equipamento;
        initComponents();
        
    }
    public JButton getbtnFechar() {
        return btnFechar;
    }
    
    public JButton getbtnSalvar() {
        return btnSalvarChamado;
    }
    public JButton getbtnLimpar() {
        return btnLimpar;
    }
    
    public JTextField gettxfTitulo() {
        return txfTituloChamado ;
    }

    public JTextArea gettxfDescricao() {
        return txfDescricao ;
    }

    public JTextField gettxfData() {
        return txfData ;
    }
    
    public JTextField gettxfEqp(){
        return txfEqp;
    }
    public JButton getbtnProcurarEqp() {
        return btnProcurarEqp;
    }
   

   

    public void settxfNome(JTextField txfTituloChamado) {
        this.txfTituloChamado = txfTituloChamado;
    }
    public void settxfDataEqp(JTextArea txfDescricao) {
        this.txfDescricao = txfDescricao;
    }
    public void settxfData(JTextField txfData) {
        this.txfData = txfData;
    }
  
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txfTituloChamado = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnProcurarEqp = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txfDescricao = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        btnSalvarChamado = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        txfEqp = new javax.swing.JTextField();
        txfData = new javax.swing.JTextField();
        try{ 
            javax.swing.text.MaskFormatter hora= new javax.swing.text.MaskFormatter("####-##-##");
            txfData = new javax.swing.JFormattedTextField(hora);
        }
        catch (Exception e){
        }
        btnFechar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        jLabel1.setText("Título:");

        txfTituloChamado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfTituloChamadoActionPerformed(evt);
            }
        });

        jLabel2.setText("Equipamento:");

        btnProcurarEqp.setIcon(new javax.swing.ImageIcon("C:\\Users\\lucas\\Downloads\\xmag_search_find_export_locate_5984.png")); // NOI18N
        btnProcurarEqp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarEqpActionPerformed(evt);
            }
        });

        jLabel3.setText("Data:");

        txfDescricao.setColumns(20);
        txfDescricao.setRows(5);
        jScrollPane1.setViewportView(txfDescricao);

        jLabel4.setText("Descrição:");

        btnSalvarChamado.setText("Salvar");

        btnLimpar.setText("Limpar");

        btnFechar.setText("Sair");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel3))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txfData, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txfTituloChamado, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txfEqp, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btnProcurarEqp))))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnSalvarChamado)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnFechar))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(112, 112, 112)
                            .addComponent(jLabel4))))
                .addContainerGap(14, Short.MAX_VALUE))
            .addComponent(jSeparator1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txfTituloChamado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnProcurarEqp)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txfEqp, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txfData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarChamado)
                    .addComponent(btnLimpar)
                    .addComponent(btnFechar))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txfTituloChamadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfTituloChamadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfTituloChamadoActionPerformed

    private void btnProcurarEqpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarEqpActionPerformed
         
    }//GEN-LAST:event_btnProcurarEqpActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        dispose();
    }//GEN-LAST:event_btnFecharActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnProcurarEqp;
    private javax.swing.JButton btnSalvarChamado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txfData;
    private javax.swing.JTextArea txfDescricao;
    private javax.swing.JTextField txfEqp;
    private javax.swing.JTextField txfTituloChamado;
    // End of variables declaration//GEN-END:variables
}
