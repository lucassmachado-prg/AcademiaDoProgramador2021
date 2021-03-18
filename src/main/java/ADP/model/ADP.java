/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADP.model;

import ADP.model.DAO.EquipamentoDAO;
import java.awt.BorderLayout;
import java.time.LocalDate;

/**
 *
 * @author lucas
 */
public class ADP {
    
    public static void main(String[] args) {
        EquipamentoDAO eqp = new EquipamentoDAO();
        Equipamento eqpmento = new Equipamento();
        eqpmento.setNome("lucas");
        eqpmento.setData_fabricacao("11-09-2019");
        eqpmento.setSerie("123456");
        eqpmento.setPreco("112412");
        eqpmento.setFabricante("volkswagen");
        System.out.println("adicionando");
        eqp.adiciona(eqpmento);
        System.out.println("concluido");
    }
    
}
