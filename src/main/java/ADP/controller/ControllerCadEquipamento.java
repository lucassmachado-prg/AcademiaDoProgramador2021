/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADP.controller;

import ADP.model.Equipamento;
import ADP.view.Registro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class ControllerCadEquipamento implements ActionListener {
    
    Registro rEqp = new Registro();
    
    public static int codigo = 0;
    
    public ControllerCadEquipamento(Registro rEqp) {

        //atribuido o parametro(tela) para o atributo.
        this.rEqp = rEqp;

        //criando os Listener(ouvintes) para os objetos que desejo, da tela de cadastro
        this.rEqp.getbtnLimpar().addActionListener(this);
        this.rEqp.getbtnSalvar().addActionListener(this);
        this.rEqp.getbtnFechar().addActionListener(this);
        
        
        

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.rEqp.getbtnFechar()) {
            this.rEqp.dispose();
        } else if (e.getSource() == this.rEqp.getbtnLimpar()) {
            
            this.codigo = 0;
          
           
        } else if (e.getSource() == this.rEqp.getbtnSalvar()) {

            //acionar camada responsável pela gravação dos dados
            Equipamento eqp = new Equipamento();

            //estou concatenando com "0" para evitar erros de conversão...
           
            eqp.setNome(this.rEqp.gettxfNome().getText());
            eqp.setData_fabricacao(this.rEqp.gettxfDataEqp().getText());
            eqp.setFabricante(this.rEqp.gettxfFabriEqp().getText());
            eqp.setSerie(this.rEqp.gettxfSerie().getText());
            eqp.setPreco(this.rEqp.gettxfPreco().getText());

          

            if (this.codigo == 0) {
                ADP.services.EquipamentoServices.adicionar(eqp);
                JOptionPane.showMessageDialog(null, "Equipamento inserido com sucesso! ");
                // instanciando a classe UsuarioDAO do pacote dao e criando seu objeto da

            } else {
                
                ADP.services.EquipamentoServices.Alterar(eqp , codigo);
                
                JOptionPane.showMessageDialog(null, "Equipamento alterado com sucesso!");
            }

           
        } 

    }
    }
    

