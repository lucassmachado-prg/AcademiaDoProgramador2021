/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADP.model.DAO;

import ADP.model.Chamado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lucas
 */
public class ChamadosDAO {
    
    public static  void adiciona(Chamado chamado){
        String sqlaExecutar = "INSERT INTO chamados(titulo,descricao,equipamento,dataAbertura) VALUES(?,?,?,?)";
        PreparedStatement stmt = null;
        Connection con = conexao.getConnection();
             try {
            stmt = con.prepareStatement(sqlaExecutar);
            stmt.setString(1, chamado.getTitulo());
            stmt.setString(2, chamado.getDescricao_chamado());
            stmt.setInt(3, chamado.getEqp());
           // stmt.setString(4, LocalDate.parse(chamado.getData_abertura()));
            
            
            stmt.executeUpdate();
            
        } catch (SQLException u) {
            u.printStackTrace();
        } finally {
            conexao.closeConnection(con, stmt);
        }   
    }
    
    public static List<Chamado> carrega() {
        Connection con = conexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Chamado> chamados = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM chamados");
            
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                Chamado chamado = new Chamado();
                chamado.setId(rs.getInt("idchamados"));
                chamado.setTitulo(rs.getString("titulo"));
                chamado.setDescricao_chamado(rs.getString("descricao"));
                chamado.setEqp(rs.getInt("equipamento"));
                chamado.setData_abertura((rs.getString("dataAbertura")));
                
                chamados.add(chamado);
                
            }
        } catch (SQLException ex) {
            
            Logger.getLogger(EquipamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally {
            conexao.closeConnection(con, stmt, rs);
        }
        return chamados;
        
    }
    
   public static Boolean delete(Chamado c) {
        
        String sqlaExecutar = "DELETE FROM chamados WHERE idchamados = ?";
        PreparedStatement stmt = null;
        Connection con = conexao.getConnection();
        try {
            stmt = con.prepareStatement(sqlaExecutar);
            stmt.setInt(1, c.getId());
            
            
            stmt.executeUpdate();
            return true;
            
        } catch (SQLException u) {
            u.printStackTrace();
            return false;
            
        } finally {
            conexao.closeConnection(con, stmt);
        }
        
        
   }
    
    
        public static Chamado carregaId( int id) {
        Connection con = conexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        
        Chamado c = new Chamado();
        try {
            stmt = con.prepareStatement("SELECT * FROM chamados WHERE chamados.idchamados = ?");
            stmt.setInt(1,id);
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                
                
                c.setTitulo(rs.getString("titulo"));
               
                c.setDescricao_chamado(rs.getString("descricao"));
                c.setEqp(rs.getInt("equipamento"));
              //  c.setData_abertura((rs.getDate().now));
                
               
                
                
            }
        } catch (SQLException ex) {
            
            Logger.getLogger(EquipamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
              
        } finally {
            conexao.closeConnection(con, stmt, rs);
          
        }
        return c;
        
        
               
        
        
    }
        
                public static void update(Chamado c, int codigo) {

        //Requerendo uma conexao
        Connection con = conexao.getConnection();
        
        String sqlaExecutar = "update chamados "
                + "set titulo = ?, "
                + "descricao = ?, "
                + "equipamento = ?, "                                    
                + "dataAbertura = ?, ";
                
        PreparedStatement pstm = null;

        try {
             pstm = con.prepareStatement(sqlaExecutar);
                
                pstm.setString(1, c.getTitulo());
                pstm.setString(2, c.getDescricao_chamado());
                pstm.setInt(3, c.getEquipamento().getId());
                //pstm.setString(4, c.getData_abertura());
                
                
                pstm.setInt(5, codigo);
            
                
                
                
            pstm.executeUpdate();
            
            
        } catch (SQLException erro) {
            erro.printStackTrace();
              
            
        }conexao.closeConnection(con, pstm);
        
    }
     
    
}
