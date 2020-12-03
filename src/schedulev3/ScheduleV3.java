/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schedulev3;

import Apresentacao.TelaLogin;
import Apresentacao.TelaPrincipal;
import apoio.ConexaoBD;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Tiago
 */
public class ScheduleV3 {
    
    public static Connection conexao = null;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // abrir uma tela de TelaLogin
        
        
                
        
        // deixa de existir
        if (ConexaoBD.getInstance() != null) {
            System.out.println("abriu");
            new TelaLogin().setVisible(true);
        } else {
            System.out.println("deu problema");
        }
        
        
        
    }

    
}
