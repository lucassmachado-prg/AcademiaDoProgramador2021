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
import ADP.view.RegistroChamados;

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
        DefaultTableModel tabela = (DefaultTableModel) this.i.getjtEquipamentos().getModel();

        //Aqui estou montando uma lista com os pesquisadores que mandei vir do banco através do DAO.retrieve....
        List<Equipamento> listaBancoEquipamentos = EquipamentoDAO.carrega();

        for (Equipamento equipAtual : listaBancoEquipamentos) {

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
            int a = (int) this.i.getjtEquipamentos().getValueAt(this.i.getjtEquipamentos().getSelectedRow(), 0);
            
            this.codigo = a;
            Equipamento eqp = new EquipamentoDAO().carregaId(codigo);
            RegistroChamados r = new RegistroChamados(eqp);
            ControllerCadChamados controll = new ControllerCadChamados(r);
            controll.codigo = a;
            
            
            
            
            r.gettxfEqp().setText(eqp.getId()+"- "+eqp.getNome());
            
            
            
            this.i.dispose();
            MainFrame.getPane().add(r);
            r.setVisible(true);
           
        
        } else if (e.getSource() == this.i.getbtnDelete()) {
            if (this.i.getjtEquipamentos().getSelectedRow() != -1) {
                Equipamento eqp = new Equipamento();
                EquipamentoDAO dao = new EquipamentoDAO();

                eqp.setId((int) this.i.getjtEquipamentos().getValueAt(this.i.getjtEquipamentos().getSelectedRow(), 0));
                if (dao.delete(eqp)) {
                    JOptionPane.showMessageDialog(null, "O equipamento foi excluído com sucesso!");
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Se deseja excluir outro equipamento, selecione-o para excluir.");
                }
            }
        } else if(e.getSource() == this.i.getbtnAtualizar()){
            int a = (int) this.i.getjtEquipamentos().getValueAt(this.i.getjtEquipamentos().getSelectedRow(), 0);
            this.codigo = a;
            if (codigo != 0) {
                
            Equipamento eqp = new EquipamentoDAO().carregaId(codigo);
            Registro r = new Registro();
            ControllerCadEquipamento controll = new ControllerCadEquipamento(r);
            controll.codigo = a;
            
            r.gettxfNome().setText(eqp.getNome());
            r.gettxfFabriEqp().setText(eqp.getFabricante());
            r.gettxfDataEqp().setText(eqp.getData_fabricacao());
            r.gettxfPreco().setText(eqp.getPreco());
            r.gettxfSerie().setText(eqp.getSerie());
                
                
                this.i.dispose();
                MainFrame.getPane().add(r);
                r.setVisible(true);

            }
        }
    }
    
}
