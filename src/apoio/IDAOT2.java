/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apoio;

import java.util.ArrayList;

/**
 *
 * @author Tiago
 */
public interface IDAOT2 <t> {
    
    public boolean cadastrarEditar (t o);
    public boolean excluir (int id);
    public t consultar (int id);
    public ArrayList<t> consultarTodos();
    public ArrayList<t> consultar (String criterio);
    
}
