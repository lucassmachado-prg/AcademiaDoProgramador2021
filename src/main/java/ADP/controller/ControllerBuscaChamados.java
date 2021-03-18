/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADP.controller;

import ADP.model.DAO.ChamadosDAO;
import ADP.model.Chamado;
import ADP.view.Chamados;
import ADP.view.MainFrame;
import ADP.view.RegistroChamados;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lucas
 */
public class ControllerBuscaChamados implements ActionListener {
    
    Chamados c = new Chamados();

    public static int codigo = 0;

    public ControllerBuscaChamados(Chamados c) {

        this.c = c;

        this.c.getbtnSelecionar().addActionListener(this);
        
        
        this.c.getbtnDeleteChamado().addActionListener(this);
       

        //Criando uma tabela de defaultableModel recuperando o modelo da jTable inserida no form
        DefaultTableModel tabela = (DefaultTableModel) this.c.getjtChamados().getModel();

        //Aqui estou montando uma lista com os pesquisadores que mandei vir do banco através do DAO.retrieve....
        List<Chamado> listaBancoChamado = ChamadosDAO.carrega();

        for (Chamado cAtual : listaBancoChamado) {

            //inserir um objeto na jtable
            tabela.addRow(new Object[]{
                cAtual.getId(),
                cAtual.getTitulo(),

                cAtual.getEquipamento().getNome(),
                cAtual.getData_abertura(),
                geraDataAberto(cAtual.getData_abertura())
                
        });
        }
    }
    public int geraDataAberto(LocalDate data) {
		
		final LocalDate dataAtual = LocalDate.now();
		final Period periodo = Period.between(data, dataAtual);
		int dias = periodo.getDays();
		return dias;
	}

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.c.getbtnSelecionar()) {
            int a = (int) this.c.getjtChamados().getValueAt(this.c.getjtChamados().getSelectedRow(), 0);
            
            this.codigo = a;
            Chamado c = new ChamadosDAO().carregaId(codigo);
            RegistroChamados chamaTela = new RegistroChamados();
            ControllerCadChamados controll = new ControllerCadChamados(chamaTela);
            controll.codigo = a;
            
            chamaTela.gettxfTitulo().setText(c.getTitulo());
            chamaTela.gettxfData().setText(c.getData_abertura().toString());
            chamaTela.gettxfEqp().setText(c.getEquipamento().getNome());
            chamaTela.gettxfDescricao().setText(c.getDescricao_chamado());
            
            
            this.c.dispose();
            MainFrame.getPane().add(chamaTela);
            chamaTela.setVisible(true);
           
        
        } else if (e.getSource() == this.c.getbtnDeleteChamado()) {
            if (this.c.getjtChamados().getSelectedRow() != -1) {
                Chamado chamado = new Chamado();
                ChamadosDAO dao = new ChamadosDAO();

                chamado.setId((int) this.c.getjtChamados().getValueAt(this.c.getjtChamados().getSelectedRow(), 0));
                if (dao.delete(chamado)) {
                    JOptionPane.showMessageDialog(null, "O equipamento foi excluído com sucesso!");
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Selecione o equipamento para excluir.");
                }
            }
        } /**else if(e.getSource() == this.c.getbtnSelecionar()){
            int a = (int) this.c.getjtChamados().getValueAt(this.c.getjtChamados().getSelectedRow(), 0);
            this.codigo = a;
            if (codigo != 0) {
                
            Chamado chamado = new ChamadosDAO().carregaId(codigo);
            RegistroChamados chamaAtual = new RegistroChamados();
            ControllerCadChamados controll = new ControllerCadChamados(chamaAtual);
            controll.codigo = a;
            
            chamaAtual.setText(chamado.getTitulo());
            chamaAtual.getDescricao_chamado().setText(chamado.getDescricao_chamado());
            chamaAtual.gettxfDataEqp().setText(eqp.getData_fabricacao());
            chamaAtual.gettxfPreco().setText(eqp.getPreco());
            chamaAtual.gettxfSerie().setText(eqp.getSerie());
                
                
                this.i.dispose();
                MainFrame.getPane().add(r);
                r.setVisible(true);

            }
        }*/
    }
    
}