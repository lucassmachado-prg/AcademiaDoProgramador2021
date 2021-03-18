/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADP.controller;

import ADP.model.Chamado;
import ADP.model.DAO.ChamadosDAO;
import ADP.model.Equipamento;
import ADP.view.Chamados;
import ADP.view.Equipamentos;
import ADP.view.Inventário;

import ADP.view.MainFrame;
import ADP.view.RegistroChamados;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class ControllerCadChamados implements ActionListener {
    
    RegistroChamados rChamados = new RegistroChamados();
    
    public static int codigo = 0;
    
    public ControllerCadChamados(RegistroChamados rChamados) {

        //atribuido o parametro(tela) para o atributo.
        this.rChamados = rChamados;

        //criando os Listener(ouvintes) para os objetos que desejo, da tela de cadastro
        this.rChamados.getbtnLimpar().addActionListener(this);
        this.rChamados.getbtnSalvar().addActionListener(this);
        
        
        
        

    }

  

    @Override
    public void actionPerformed(ActionEvent e) {
              if (e.getSource() == this.rChamados.gettxfData()) {
                  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                 
             //this.rChamados.gettxfData().setText(formatter);
            
            
        }else if (e.getSource() == this.rChamados.getbtnFechar()) {
            this.rChamados.dispose();
        } else if (e.getSource() == this.rChamados.getbtnLimpar()) {
            
            this.codigo = 0;
          
           
        } else if (e.getSource() == this.rChamados.getbtnSalvar()) {
            
            //acionar camada responsável pela gravação dos dados
            Chamado chamado = new Chamado();
            Equipamento eqp = new Equipamento();
            
            eqp.setNome(this.rChamados.gettxfEqp().getText());

            //estou concatenando com "0" para evitar erros de conversão...
           
            chamado.setTitulo(this.rChamados.gettxfTitulo().getText());
            chamado.setDescricao_chamado(this.rChamados.gettxfDescricao().getText());
            chamado.setTitulo(this.rChamados.gettxfEqp().getText());
            chamado.setEquipamento(eqp);
           

          

            if (this.codigo == 0) {
                ADP.services.ChamadosServices.adicionar(chamado);
                JOptionPane.showMessageDialog(null, "Chamado inserido com sucesso! ");
                // instanciando a classe UsuarioDAO do pacote dao e criando seu objeto da

            } else {
                
                ADP.services.ChamadosServices.Alterar(chamado , codigo);
                
                JOptionPane.showMessageDialog(null, "Chamado alterado com sucesso!");
            }

           
        }else if (e.getSource() == this.rChamados.getbtnProcurarEqp()) {

            this.codigo = 0;

            
            Inventário tela = new Inventário();
            ControllerBuscaEquipamentos busca = new ControllerBuscaEquipamentos(tela);
            MainFrame.getPane().add(tela);
            
            tela.setVisible(true);

            
              if (this.codigo != 0) { 
              
             
            
             Chamado chamados = ChamadosDAO.carregaId(codigo);
             
              
              this.rChamados.gettxfEqp().setText(chamados.getEquipamento().toString());
             
             
              
             
             
              }
             
        } 

    }
    }