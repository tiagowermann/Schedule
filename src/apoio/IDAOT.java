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
public interface IDAOT <t> {

    public boolean cadastrarCliente (t o);
    public boolean cadastrarAgendamento (t o);
    //public t zerarSituacao (t o);
    public boolean excluirAgendamento (int id);
    public ArrayList<t> consultarTodos();
    //public ArrayList<t> consultaCliente (String criterio);
    public t consultarAgenda (int id);

}
