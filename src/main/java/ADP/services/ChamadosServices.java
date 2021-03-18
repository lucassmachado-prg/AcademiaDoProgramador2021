/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADP.services;

import ADP.model.DAO.ChamadosDAO;
import ADP.model.Chamado;
import java.util.List;

/**
 *
 * @author lucas
 */
public class ChamadosServices { 
    
    public static List<Chamado> Buscar() {
        return ChamadosDAO.carrega();
    }
    public static void adicionar(Chamado c) {
        ChamadosDAO.adiciona(c);
    }
     public static Chamado BuscarUmPorId(int id) {
        return ChamadosDAO.carregaId(id);
    }
     
     public static void Alterar(Chamado c, int codigo) {
        ChamadosDAO.update(c , codigo);
    }
    
    
}
