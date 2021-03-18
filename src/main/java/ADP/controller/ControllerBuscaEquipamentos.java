/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADP.controller;

import ADP.model.DAO.EquipamentoDAO;
import ADP.model.Equipamento;
import ADP.view.Inventário;
import ADP.view.Registro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ADP.view.MainFrame;

/**
 *
 * @author lucas
 */
public class ControllerBuscaEquipamentos implements ActionListener {
    
    Inventário i = new Inventário();

    public static int codigo = 0;

    public ControllerBuscaEquipamentos(Inventário i) {

        this.i = i;

        this.i.getbtnSelecionar().addActionListener(this);
        
        
        this.i.getbtnDelete().addActionListener(this);
        this.i.getbtnAtualizar().addActionListener(this);

        //Criando uma tabela de defaultableModel recuperando o modelo da jTable inserida no form
        DefaultTableModel tabela = (DefaultTableModel) this.i.getjtAlunos().getModel();

        //Aqui estou montando uma lista com os pesquisadores que mandei vir do banco através do DAO.retrieve....
        List<Equipamento> listaBancoAlunos = EquipamentoDAO.carrega();

        for (Equipamento equipAtual : listaBancoAlunos) {

            //inserir um objeto na jtable
            tabela.addRow(new Object[]{
                equipAtual.getId(),
                equipAtual.getNome(),
                equipAtual.getSerie(),
                equipAtual.getFabricante()
                
        });
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.i.getbtnSelecionar()) {
            int a = (int) this.i.getjtAlunos().getValueAt(this.i.getjtAlunos().getSelectedRow(), 0);
            
            this.codigo = a;
            Equipamento eqp = new EquipamentoDAO().carregaId(codigo);
            Registro r = new Registro();
            ControllerCadEquipamento controll = new ControllerCadEquipamento(r);
            controll.codigo = a;
            
            r.gettxfNome().setText(eqp.getNome());
            this.i.dispose();
            MainFrame.getPane().add(i);
            i.setVisible(true);
            
                    
            
            
           
            
            
            
            

        } else if (e.getSource() == this.i.getbtnDelete()) {
            if (this.i.getjtAlunos().getSelectedRow() != -1) {
                Equipamento eqp = new Equipamento();
                EquipamentoDAO dao = new EquipamentoDAO();

                eqp.setId((int) this.i.getjtAlunos().getValueAt(this.i.getjtAlunos().getSelectedRow(), 0));
                if (dao.delete(eqp)) {
                    JOptionPane.showMessageDialog(null, "O aluno foi excluído com sucesso!");
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Selecione o aluno para excluir.");
                }
            }
        } else if(e.getSource() == this.i.getbtnAtualizar()){
            int a = (int) this.i.getjtAlunos().getValueAt(this.i.getjtAlunos().getSelectedRow(), 0);
            this.codigo = a;
            if (codigo != 0) {
                
                Registro r = new Registro();
                ControllerCadEquipamento eqp = new ControllerCadEquipamento(r);
                eqp.codigo = this.codigo;
                Equipamento eqpt = EquipamentoDAO.carregaId(codigo);
                r.gettxfNome().setText(eqpt.getNome());
                r.gettxfSerie().setText(eqpt.getSerie());
                r.gettxfFabriEqp().setText(eqpt.getFabricante());
                
                
                this.i.dispose();
                MainFrame.getPane().add(r);
                r.setVisible(true);

            }
        }
    }
    
}
