/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADP.view;

import javax.swing.JButton;
import javax.swing.JTable;

/**
 *
 * @author lucas
 */
public class Chamados extends javax.swing.JInternalFrame {

    public MainFrame menu;
    
    
    public Chamados() {
        initComponents();
    }
    
    
    public JButton getbtnSelecionar() {
        return btnAtualizarChamado;
    }

    public void setbtnSelecionar(JButton btnAtualizarChamado) {
        this.btnAtualizarChamado = btnAtualizarChamado;
    }
    

   
    
    public JButton getbtnDeleteChamado() {
        return btnExcluirChamado;
    }

    public void setbtnDelente(JButton btnExcluirChamado) {
        this.btnExcluirChamado = btnExcluirChamado;
    }    
    
      public JTable getjtChamados() {
        return jtChamados;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jtChamados = new javax.swing.JTable();
        btnAtualizarChamado = new javax.swing.JButton();
        btnExcluirChamado = new javax.swing.JButton();
        jpChamados = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jtChamados.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jtChamados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Título", "Equipamento", "Data Abertura", "nº de dias em aberto:"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtChamados);

        btnAtualizarChamado.setText("Selecionar");
        btnAtualizarChamado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarChamadoActionPerformed(evt);
            }
        });

        btnExcluirChamado.setText("Excluir");
        btnExcluirChamado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirChamadoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("CHAMADOS");

        javax.swing.GroupLayout jpChamadosLayout = new javax.swing.GroupLayout(jpChamados);
        jpChamados.setLayout(jpChamadosLayout);
        jpChamadosLayout.setHorizontalGroup(
            jpChamadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpChamadosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(186, 186, 186))
        );
        jpChamadosLayout.setVerticalGroup(
            jpChamadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpChamadosLayout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpChamados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnAtualizarChamado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExcluirChamado)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpChamados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtualizarChamado)
                    .addComponent(btnExcluirChamado))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtualizarChamadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarChamadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtualizarChamadoActionPerformed

    private void btnExcluirChamadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirChamadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirChamadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizarChamado;
    private javax.swing.JButton btnExcluirChamado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jpChamados;
    private javax.swing.JTable jtChamados;
    // End of variables declaration//GEN-END:variables
}
