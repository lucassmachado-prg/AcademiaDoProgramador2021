/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADP.model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author lucas
 */
public class conexao {
    
    private static final String driver = "com.mysql.jdbc.Driver";

    private static final String banco = "jdbc:mysql://localhost:3306/equipamento";
    private static final String usuario = "root";
    private static final String senha = "lucas123";
  
    public static Connection getConnection() {

        try {
            
            return DriverManager.getConnection(banco + "?verifyServerCertificate=false"
                    + "&useSSL=false"
                    + "&requireSSL=false"
                    + "&user=" + usuario + "&password=" + senha + "&serverTimezone=UTC");

        } catch (SQLException erroSLQ) {
            throw new RuntimeException("ERRO " + erroSLQ);
        }

    }
    
    public static void closeConnection(Connection con) {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException errorSQL) {
            throw new RuntimeException("ERRO : nÃ£o foi possivel fechar a conexao. " + errorSQL);

        
    
        }
    }
    
     public static void closeConnection(Connection con, PreparedStatement pstm) {
        closeConnection(con);
        try {
            if (pstm != null) {
                pstm.close();
            }
        } catch (SQLException errorSQL) {
            throw new RuntimeException("ERRO : nÃ£o foi possivel fechar o PrepareStatement. " + errorSQL);

        }
    }
     
      public static void closeConnection(Connection con, PreparedStatement pstm, ResultSet rs) {
        closeConnection(con, pstm);
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException errorSQL) {
            throw new RuntimeException("ERRO : nÃ£o foi possivel fechar o ResultSet. " + errorSQL);

        }
    }
      
      static PreparedStatement stmt(String sqlAExecutar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
    
