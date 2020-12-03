/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apoio;

import java.io.*;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Tiago
 */
public class ConexaoBD {

    private static ConexaoBD instancia = null;
    private Connection conexao = null;
    //public Statement stm;
    //public ResultSet rs;

    public  ConexaoBD() {
        try {
            
            // Carrega informações do arquivo de propriedades
            //Properties prop = new Properties();
            //prop.load(new FileInputStream("db.properties"));
            String dbdriver = "org.postgresql.Driver";
            String dburl = "jdbc:postgresql://localhost:5432/schedule";
            String dbuser = "postgres";
            String dbsenha = "postgres";

            // Carrega Driver do Banco de Dados
            Class.forName(dbdriver);

            // conexão COM usuário e senha
            if (dbuser.length() != 0) {
                conexao = DriverManager.getConnection(dburl, dbuser, dbsenha);
                //JOptionPane.showMessageDialog(null, " Conexão com o banco de dados com usuario e senha, criada com sucesso ! ");
            } else // conexão SEM usuário e senha
            {
                conexao = DriverManager.getConnection(dburl);
                //JOptionPane.showMessageDialog(null, " Conexão com o banco de dados padrão, criada com sucesso ! ");
            }

        } catch (Exception e) {
            System.err.println(e);
            JOptionPane.showMessageDialog(null, "Erro na conexão com o banco de dados !\n" + e.getMessage());
            System.exit(0);
        }

    }
    
    
    
    
    /*public void executaSql(String sql){
        try {
            stm = conexao.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao executar Query SQL");
        }
        
    }*/
    
    
    
    // Retorna instância
    public static ConexaoBD getInstance() {
        if (instancia == null) {
            instancia = new ConexaoBD();
        }
        return instancia;
    }

    // Retorna conexão
    public Connection getConnection() {
        if (conexao == null) {
            throw new RuntimeException("conexao==null");
        }
        return conexao;
    }

    // Efetua fechamento da conexão
    public void shutDown() {
        try {
            conexao.close();
            instancia = null;
            conexao = null;
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    


    

}
