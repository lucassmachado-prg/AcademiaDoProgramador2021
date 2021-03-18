/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADP.services;

import ADP.model.DAO.EquipamentoDAO;
import ADP.model.Equipamento;
import java.util.List;

/**
 *
 * @author lucas
 */
public class EquipamentoServices { public static List<Equipamento> Buscar() {
        return EquipamentoDAO.carrega();
    }
    public static void adicionar(Equipamento eqp) {
        EquipamentoDAO.adiciona(eqp);
    }
     public static Equipamento BuscarUmPorId(int idequipamento) {
        return EquipamentoDAO.carregaId(idequipamento);
    }
     
     public static void Alterar(Equipamento eqp, int codigo) {
        EquipamentoDAO.update(eqp , codigo);
    }
     public static Equipamento BuscarUm(String nomeAluno) {
        return EquipamentoDAO.RetrieveOneNome(nomeAluno);
    }
    /**public static void apagar(int idequipamento) {
        EquipamentoDAO.delete(idequipamento);
      }*/
    
}
