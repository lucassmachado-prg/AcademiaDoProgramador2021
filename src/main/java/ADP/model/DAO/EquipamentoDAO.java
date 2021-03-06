package ADP.model.DAO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import ADP.model.DAO.conexao;
import ADP.model.Equipamento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author lucas
 */
public class EquipamentoDAO {
    
    public static  void adiciona(Equipamento equipamento){
        String sqlaExecutar = "INSERT INTO equipamento(nome,serie,fabricante,data_fabricacao,preco) VALUES(?,?,?,?,?)";
        PreparedStatement stmt = null;
        Connection con = conexao.getConnection();
             try {
            stmt = con.prepareStatement(sqlaExecutar);
            stmt.setString(1, equipamento.getNome());
            stmt.setString(2, equipamento.getSerie());
            stmt.setString(3, equipamento.getFabricante());
            stmt.setString(4, equipamento.getData_fabricacao().toString());
            stmt.setString(5, equipamento.getPreco());
            
            stmt.executeUpdate();
            
        } catch (SQLException u) {
            u.printStackTrace();
        } finally {
            conexao.closeConnection(con, stmt);
        }   
    }
    
    public static List<Equipamento> carrega() {
        Connection con = conexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Equipamento> eqps = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM equipamento");
            
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                Equipamento eqp = new Equipamento();
                eqp.setId(rs.getInt("idequipamento"));
                eqp.setNome(rs.getString("nome"));
                eqp.setSerie(rs.getString("serie"));
                eqp.setFabricante(rs.getString("fabricante"));
                eqp.setData_fabricacao((rs.getString("data_fabricacao")));
                eqp.setPreco(rs.getString("preco"));
                eqps.add(eqp);
                
            }
        } catch (SQLException ex) {
            
            Logger.getLogger(EquipamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally {
            conexao.closeConnection(con, stmt, rs);
        }
        return eqps;
        
    }
    
   public static Boolean delete(Equipamento eqp) {
        
        String sqlaExecutar = "DELETE FROM equipamento WHERE idequipamento = ?";
        PreparedStatement stmt = null;
        Connection con = conexao.getConnection();
        try {
            stmt = con.prepareStatement(sqlaExecutar);
            stmt.setInt(1, eqp.getId());
            
            
            stmt.executeUpdate();
            return true;
            
        } catch (SQLException u) {
            
            JOptionPane.showMessageDialog(null, "O equipamento n??o pode ser deletado, pois est?? vinculado a um chamado.");
            return false;
            
            
        } finally {
            conexao.closeConnection(con, stmt);
            
            
        }
        
        
   }
    
    
        public static Equipamento carregaId( int id) {
        Connection con = conexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        
        Equipamento eqp = new Equipamento();
        try {
            stmt = con.prepareStatement("SELECT * FROM equipamento WHERE equipamento.idequipamento = ?");
            stmt.setInt(1,id);
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                
                
                eqp.setNome(rs.getString("nome"));
               eqp.setId(rs.getInt("idequipamento"));
                
                eqp.setSerie(rs.getString("serie"));
                eqp.setFabricante(rs.getString("fabricante"));
                eqp.setData_fabricacao((rs.getString("data_fabricacao")));
                eqp.setPreco(rs.getString("Preco"));
               
                
                
            }
        } catch (SQLException ex) {
            
            Logger.getLogger(EquipamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
              
        } finally {
            conexao.closeConnection(con, stmt, rs);
          
        }
        return eqp;
        
        
               
        
        
    }
        
                public static void update(Equipamento eqp, int codigo) {

        //Requerendo uma conexao
        Connection con = conexao.getConnection();
        
        String sqlaExecutar = "update equipamento "
                + "set nome = ?, "
                + "serie = ?, "
                + "fabricante = ?, "                                    
                + "data_fabricacao = ?, "
                + "preco = ? "
                + "where equipamento.idequipamento = ? ";
                
        PreparedStatement pstm = null;

        try {
             pstm = con.prepareStatement(sqlaExecutar);
                
                pstm.setString(1, eqp.getNome());
                pstm.setString(2, eqp.getSerie());
                pstm.setString(3, eqp.getFabricante());
                pstm.setString(4, eqp.getData_fabricacao());
                pstm.setString(5, eqp.getPreco());
                
                pstm.setInt(6, codigo);
            
                
                
                
            pstm.executeUpdate();
            
            
        } catch (SQLException erro) {
            erro.printStackTrace();
              
            
        }conexao.closeConnection(con, pstm);
        
    }
 

    
    
    
    
    
    
}
