/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADP.view;

import ADP.controller.ControllerCadEquipamento;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author lucas
 */
public class Registro extends javax.swing.JInternalFrame {
    
    public MainFrame menu;

    /**
     * Creates new form Registro
     */
    public Registro() {
        initComponents();
    }

    public JButton getbtnSalvar() {
        return btnSalvar;
    }
    public JButton getbtnLimpar() {
        return btnLimpar;
    }
    public JButton getbtnFechar(){
        return btnFechar;
    }
    
    public JTextField gettxfNome() {
        return txfNomeEqp ;
    }

    public JTextField gettxfDataEqp() {
        return txfDataEqp ;
    }

    public JTextField gettxfFabriEqp() {
        return txfFabriEqp ;
    }
    
    public JTextField gettxfSerie(){
        return txfSerieEqp;
    }
    
    public JTextField gettxfPreco(){
        return txfPrecoEqp;
    }

   

    public void settxfNome(JTextField txfNomeEqp) {
        this.txfNomeEqp = txfNomeEqp;
    }
    public void settxfDataEqp(JTextField txfDataEqp) {
        this.txfDataEqp = txfDataEqp;
    }
    public void settxfFabriEqp(JTextField gettxfFabriEqp) {
        this.txfFabriEqp = txfFabriEqp;
    }
    public void settxfSerie(JTextField txfSerieEqp) {
        this.txfSerieEqp = txfSerieEqp;
    }
    public void gettxfPreco(JTextField txfPrecoEqp) {
        this.txfPrecoEqp = txfPrecoEqp;
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txfNomeEqp = new javax.swing.JTextField();
        txfPrecoEqp = new javax.swing.JTextField();
        try{ 
            javax.swing.text.MaskFormatter hora= new javax.swing.text.MaskFormatter("#.###,##");
            txfPrecoEqp = new javax.swing.JFormattedTextField(hora);
        }
        catch (Exception e){
        }
        txfSerieEqp = new javax.swing.JTextField();
        txfDataEqp = new javax.swing.JTextField();
        try{ 
            javax.swing.text.MaskFormatter hora= new javax.swing.text.MaskFormatter("##/##/####");
            txfDataEqp = new javax.swing.JFormattedTextField(hora);
        }
        catch (Exception e){
        }
        txfFabriEqp = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        jLabel1.setText("Nome:");

        jLabel2.setText("Preço:");

        jLabel3.setText("Série:");

        jLabel4.setText("Data Fabricação:");

        jLabel5.setText("Fabricante:");

        txfDataEqp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfDataEqpActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnFechar.setText("Fechar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnFechar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txfPrecoEqp)
                            .addComponent(txfSerieEqp)
                            .addComponent(txfDataEqp)
                            .addComponent(txfFabriEqp)
                            .addComponent(txfNomeEqp, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txfNomeEqp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txfPrecoEqp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txfSerieEqp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txfDataEqp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txfFabriEqp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnLimpar)
                    .addComponent(btnFechar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
         
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txfDataEqp.setText("");
        txfFabriEqp.setText("");
        txfNomeEqp.setText("");
        txfPrecoEqp.setText("");
        txfSerieEqp.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void txfDataEqpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfDataEqpActionPerformed
        
    }//GEN-LAST:event_txfDataEqpActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txfDataEqp;
    private javax.swing.JTextField txfFabriEqp;
    private javax.swing.JTextField txfNomeEqp;
    private javax.swing.JTextField txfPrecoEqp;
    private javax.swing.JTextField txfSerieEqp;
    // End of variables declaration//GEN-END:variables
}
