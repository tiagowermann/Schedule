/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entidade.Agenda;
import apoio.ComboItem;
import apoio.ConexaoBD;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import apoio.IDAOT;
import java.sql.Date;
import java.sql.SQLException;

/**
 *
 * @author Tiago
 */
public class AgendamentoDAO implements IDAOT<Agenda> {

    ResultSet resultadoQ = null;

    @Override
    public boolean cadastrarCliente(Agenda o) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "";

            if (o.getIdCliente() == 0) {
                sql = "INSERT into cliente VALUES ( "
                        + "default,"
                        + "'" + o.getNomeCliente() + "',"
                        + "'" + o.getEmailCliente() + "',"
                        + "'" + o.getUsuario() + "',"
                        + " md5('" + o.getSenha() + "'),"
                        + "" + o.getSituacaoCliente() + ""
                        + ")";
            } else {
                sql = "UPDATE cliente "
                        + "SET nome_cliente = '" + o.getNomeCliente() + "',"
                        + "email_cliente = '" + o.getEmailCliente() + "',"
                        + "usuario = '" + o.getUsuario() + "',"
                        + "senha = md5('" + o.getSenha() + "'),"
                        + "situacao_cliente = " + o.getSituacaoCliente() + ""
                        + "WHERE id_cliente = " + o.getIdCliente();
            }

            System.out.println("SQL: " + sql);

            st.executeUpdate(sql);

            return true;

        } catch (Exception e) {
            System.out.println("Erro ao salvar cliente: " + e);
            return false;
        }
        
    }
    
    
    public boolean cadastrarClienteSemSenha(Agenda o) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "";

            if (o.getIdCliente() != 0) {
                
                sql = "UPDATE cliente "
                        + "SET nome_cliente = '" + o.getNomeCliente() + "',"
                        + "email_cliente = '" + o.getEmailCliente() + "',"
                        + "usuario = '" + o.getUsuario() + "',"
                        //+ "senha = md5('" + o.getSenha() + "'),"
                        + "situacao_cliente = " + o.getSituacaoCliente() + ""
                        + "WHERE id_cliente = " + o.getIdCliente();
            }

            System.out.println("SQL: " + sql);

            st.executeUpdate(sql);

            return true;

        } catch (Exception e) {
            System.out.println("Erro ao salvar cliente: " + e);
            return false;
        }
        
    }
    
    
    @Override
    public boolean cadastrarAgendamento(Agenda o) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "";

            if (o.getIdCliente() == 0) {
                sql = "INSERT into agenda VALUES ( "
                        + "default,"
                        + "'" + o.getNomeAgenda() + "',"
                        + "'" + o.getServicoAgenda() + "',"
                        + "'" + o.getHorarioAgenda() + "',"
                        + "'" + o.getDataAgenda() + "'"
                        + ")";
            } else {
                sql = "UPDATE agenda "
                        + "SET nome_agendado = '" + o.getNomeAgenda() + "',"
                        + "servico_agendado = '" + o.getServicoAgenda() + "',"
                        + "horario_agendado = '" + o.getHorarioAgenda() + "',"
                        + "data_agenda = '" + o.getDataAgenda() + "'"
                        + "WHERE id_agenda = " + o.getIdCliente();
            }
            
            System.out.println("CADASTRA AGENDAMENTO");
            System.out.println("SQL: " + sql);

            st.executeUpdate(sql);

            return true;

        } catch (Exception e) {
            System.out.println("Erro ao salvar agendamento: " + e);
            return false;
        }
    }
    
    
    
    
    public boolean cadastrarServico(Agenda o) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "";

            if (o.getIdServico()== 0) {
                sql = "INSERT into servico VALUES ( "
                        + "default,"
                        + "'" + o.getNomeServico()+ "',"
                        + "'" + o.getValorServico()+ "',"
                        + "'" + o.getTempoServico()+ "'"
                        + ")";
            } else {
                sql = "UPDATE servico "
                        + "SET nome_servico = '" + o.getNomeServico() + "',"
                        + "valor_servico = '" + o.getValorServico() + "',"
                        + "tempo_servico = '" + o.getTempoServico() + "'"
                        + "WHERE id_servico = " + o.getIdServico();
            }
            
            System.out.println("CADASTRA SERVIÇO");
            System.out.println("SQL: " + sql);

            st.executeUpdate(sql);

            return true;

        } catch (Exception e) {
            System.out.println("Erro ao salvar serviço: " + e);
            return false;
        }
    }
    
    
    

    

    

    
    
    @Override
    public boolean excluirAgendamento(int id) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "DELETE FROM agenda "
                    + "WHERE id_agenda = " + id;

            System.out.println("SQL: " + sql);

            st.executeUpdate(sql);

            return true;

        } catch (Exception e) {
            System.out.println("Erro ao excluir agendamento: " + e);
            return false;
        }
    }
    
    
    
    
    public boolean excluirCliente(int id) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "DELETE FROM cliente "
                    + "WHERE id_cliente = " + id;

            System.out.println("SQL: " + sql);

            st.executeUpdate(sql);

            return true;

        } catch (Exception e) {
            System.out.println("Erro ao excluir cadastro de cliente: " + e);
            return false;
        }
    }
    
    
    
    
    
    public boolean excluirServico(int id) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "DELETE FROM servico "
                    + "WHERE id_servico = " + id;
            
            System.out.println("EXCLUIR SERVIÇO");
            System.out.println("SQL: " + sql);

            st.executeUpdate(sql);

            return true;

        } catch (Exception e) {
            System.out.println("Erro ao excluir cadastro do serviço: " + e);
            return false;
        }
    }
    
    
    
    
    

    @Override
    public ArrayList<Agenda> consultarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public Agenda consultarTabelaCliente(String criterio) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Agenda apresentacao = null;

        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "SELECT * "
                    + "FROM cliente "
                    + "WHERE nome_cliente = '" + criterio + "'";
            System.out.println("CONSULTA CLIENTE");
            System.out.println("SQL: " + sql);

            resultadoQ = st.executeQuery(sql);

            if (resultadoQ.next()) {
                apresentacao = new Agenda();
                
                
                apresentacao.setIdCliente(resultadoQ.getInt("id_cliente"));
                apresentacao.setNomeCliente(resultadoQ.getString("nome_cliente"));
                apresentacao.setEmailCliente(resultadoQ.getString("email_cliente"));
                apresentacao.setUsuario(resultadoQ.getString("usuario"));
                apresentacao.setSenha(resultadoQ.getString("senha"));
                apresentacao.setSituacaoCliente(Integer.parseInt(resultadoQ.getString("situacao_cliente")));
            }

        } catch (Exception e) {
            System.out.println("Erro ao consultar cliente: " + e);
        }

        return apresentacao;
    }

    
    public Agenda consultarTabelaServico(String criterio) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Agenda apresentacao = null;

        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "SELECT * "
                    + "FROM servico "
                    + "WHERE nome_servico = '" + criterio + "'";
            System.out.println("CONSULTA SERVICO    ");
            System.out.println("SQL: " + sql);

            resultadoQ = st.executeQuery(sql);

            if (resultadoQ.next()) {
                apresentacao = new Agenda();
                
                
                apresentacao.setIdServico(resultadoQ.getInt("id_servico"));
                apresentacao.setNomeServico(resultadoQ.getString("nome_servico"));
                apresentacao.setValorServico(resultadoQ.getString("valor_servico"));
                apresentacao.setTempoServico(resultadoQ.getString("tempo_servico"));
            }

        } catch (Exception e) {
            System.out.println("Erro ao consultar servico: " + e);
        }

        return apresentacao;
    }
    
    
    
    public boolean consultarTabelaAgenda(String criterio, String criterio2) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Agenda apresentacao = null;
        boolean ap = false;
        

        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "SELECT * "
                    + "FROM agenda "
                    + "WHERE data_agenda = '" + criterio + "' AND horario_agendado '"+ criterio2 + "'";
            System.out.println("CONSULTA AGENDA COM MESMA DATA E HORARIO");
            System.out.println("SQL: " + sql);

            resultadoQ = st.executeQuery(sql);

            if (resultadoQ.next()) {
                apresentacao = new Agenda();
                
                
                apresentacao.setIdServico(resultadoQ.getInt("id_agenda"));
                apresentacao.setNomeAgenda(resultadoQ.getString("nome_agendado"));
                apresentacao.setServicoAgenda(resultadoQ.getString("servico_agendado"));
                apresentacao.setHorarioAgenda(resultadoQ.getString("horario_agendado"));
                apresentacao.setDataAgenda(resultadoQ.getString("data_agenda"));
                
                return ap = true;
            }

        } catch (Exception e) {
            System.out.println("Erro ao consultar agendamento: " + e);
        }
        //return apresentacao;
        return ap;
    }
    
    
    
    @Override
    public Agenda consultarAgenda(int id) {
        Agenda apresentacao = null;

        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "SELECT * "
                    + "FROM agenda "
                    + "WHERE id_agenda = " + id;
            System.out.println("CONSULTA NA AGENDA");
            System.out.println("SQL: " + sql);

            resultadoQ = st.executeQuery(sql);

            if (resultadoQ.next()) {
                apresentacao = new Agenda();
                
                
                apresentacao.setIdAgenda(resultadoQ.getInt("id_agenda"));
                apresentacao.setNomeAgenda(resultadoQ.getString("nome_agendado"));
                apresentacao.setServicoAgenda(resultadoQ.getString("servico_agendado"));
                apresentacao.setHorarioAgenda(resultadoQ.getString("horario_agendado"));
                apresentacao.setDataAgenda(resultadoQ.getString("data_agenda"));
            }

        } catch (Exception e) {
            System.out.println("Erro ao consultar agenda: " + e);
        }

        return apresentacao;
    }

    
    
    
    public Agenda consultarCliente(int id) {
        Agenda apresentacao = null;

        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "SELECT * "
                    + "FROM cliente "
                    + "WHERE id_cliente = " + id;
            System.out.println("CONSULTA CLIENTE");
            System.out.println("SQL: " + sql);

            resultadoQ = st.executeQuery(sql);

            if (resultadoQ.next()) {
                apresentacao = new Agenda();

                apresentacao.setIdCliente(resultadoQ.getInt("id_cliente"));
                apresentacao.setNomeCliente(resultadoQ.getString("nome_cliente"));
                apresentacao.setEmailCliente(resultadoQ.getString("email_cliente"));
                apresentacao.setUsuario(resultadoQ.getString("usuario"));
                apresentacao.setSenha(resultadoQ.getString("senha"));
                apresentacao.setSituacaoCliente(Integer.parseInt(resultadoQ.getString("situacao_cliente")));
            }

        } catch (Exception e) {
            System.out.println("Erro ao consultar cliente: " + e);
        }

        return apresentacao;
    }
    
    
    
    
     public Agenda consultarServico(int id) {
        Agenda apresentacao = null;

        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "SELECT * "
                    + "FROM servico "
                    + "WHERE id_servico = " + id;
            System.out.println("CONSULTA SERVIÇO");
            System.out.println("SQL: " + sql);

            resultadoQ = st.executeQuery(sql);

            if (resultadoQ.next()) {
                apresentacao = new Agenda();

                apresentacao.setIdCliente(resultadoQ.getInt("id_servico"));
                apresentacao.setNomeServico(resultadoQ.getString("nome_servico"));
                apresentacao.setValorServico(resultadoQ.getString("valor_servico"));
                apresentacao.setTempoServico(resultadoQ.getString("tempo_servico"));
            }

        } catch (Exception e) {
            System.out.println("Erro ao consultar servico: " + e);
        }

        return apresentacao;
    }
    
    
    
    
    
    // Consulta o usuario e senha cadastrado no banco de dados (schedule)
    public Agenda consultarLogin(String usuario, String senha) {
        Agenda apresentacao = null;

        //consulta na tabela cliente pelo usuario e senha informados na tela de login.
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "SELECT * "
                    + "FROM cliente "
                    + "WHERE usuario = '" + usuario + "' AND senha = md5('" + senha + "') AND situacao_cliente = '1' ";
            System.out.println("CONSULTA USUARIO E SENHA DO LOGIN");
            System.out.println("SQL: " + sql);

            resultadoQ = st.executeQuery(sql);

            if (resultadoQ.next()) {
                apresentacao = new Agenda();

                apresentacao.setIdCliente(resultadoQ.getInt("id_cliente"));
                apresentacao.setNomeCliente(resultadoQ.getString("nome_cliente"));
                apresentacao.setEmailCliente(resultadoQ.getString("email_cliente"));
                apresentacao.setUsuario(resultadoQ.getString("usuario"));
                apresentacao.setSenha(resultadoQ.getString("senha"));
                apresentacao.setSituacaoCliente(Integer.parseInt(resultadoQ.getString("situacao_cliente")));
            }

            // muda a situação do usuario logado.
            /*try {
                if (apresentacao.getSituacao_cliente() == 0) {
                    sql = "UPDATE cliente "
                            + "SET situacao_cliente = 1 "
                            + "WHERE usuario = '" + usuario + "' AND senha = md5('" + senha + "')";
                }
                
                System.out.println("MUDA A SITUAÇÃO DO USUARIO LOGADO");
                System.out.println("SQL: " + sql);

                st.executeUpdate(sql);
                
                apresentacao.setUsuariologado(usuario);
                System.out.println("Usuario logado: " + apresentacao.getUsuariologado());

            } catch (Exception e) {
                System.out.println("Erro ao mudar situaçao: " + e);
            }*/
            
            // ATÉ AQUI

        } catch (Exception e) {
            System.out.println("Erro ao consultar login: " + e);
        }

        return apresentacao;
    }

    
    
    
    
    
    public void popularTabelaAgendamento(JTable tabela, String criterio) {
        // dados da tabela
        Object[][] dadosTabela = null;

        // cabecalho da tabela
        Object[] cabecalho = new Object[5];
        cabecalho[0] = "Id";
        cabecalho[1] = "Data";
        cabecalho[2] = "Cliente";
        cabecalho[3] = "Ser. Agendado";
        cabecalho[4] = "Hor. Agendado";

        // cria matriz de acordo com nº de registros da tabela
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT count(*) "
                    + "FROM agenda "
                    + "WHERE NOME_AGENDADO ILIKE '%" + criterio + "%'");// AND DATA_AGENDA ILIKE '%" + criterio2 + "%'");

            resultadoQ.next();

            dadosTabela = new Object[resultadoQ.getInt(1)][5];

        } catch (Exception e) {
            System.out.println("Erro ao cria matriz de acordo com nº de registros da tabela: " + e);
        }

        int lin = 0;

        // efetua consulta na tabela
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT * FROM "
                    + "agenda WHERE "
                    + "NOME_AGENDADO ILIKE '%" + criterio + "%'"// AND DATA_AGENDA ILIKE '%" + criterio2 + "%'"
                    + "ORDER BY data_agenda , horario_agendado");

            while (resultadoQ.next()) {
                
                dadosTabela[lin][0] = resultadoQ.getInt("id_agenda");
                dadosTabela[lin][1] = resultadoQ.getString("data_agenda");
                dadosTabela[lin][2] = resultadoQ.getString("nome_agendado");
                dadosTabela[lin][3] = resultadoQ.getString("servico_agendado");
                dadosTabela[lin][4] = resultadoQ.getString("horario_agendado");

                // caso a coluna precise exibir uma imagem
//                if (resultadoQ.getBoolean("Situacao")) {
//                    dadosTabela[lin][2] = new ImageIcon(getClass().getClassLoader().getResource("Interface/imagens/status_ativo.png"));
//                } else {
//                    dadosTabela[lin][2] = new ImageIcon(getClass().getClassLoader().getResource("Interface/imagens/status_inativo.png"));
//                }
                lin++;
            }
        } catch (Exception e) {
            System.out.println("problemas para popular tabela agendamento");
            System.out.println(e);
        }
        
        /*
        // CONSULTA NA TABELA AGENDA ENTRE DATAS
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "SELECT * "
                    + "FROM agenda "
                    + "WHERE data_agenda BETWEEN = '" + criterio2 + "' AND = '" + criterio3 + "'";
            System.out.println("CONSULTA AGENDA ENTRE DATAS");
            System.out.println("SQL: " + sql);

            resultadoQ = st.executeQuery(sql);

            if (resultadoQ.next()) {
                Agenda apresentacao = new Agenda();

                apresentacao.setIdCliente(resultadoQ.getInt("id_cliente"));
                apresentacao.setNomeCliente(resultadoQ.getString("nome_cliente"));
                apresentacao.setEmailCliente(resultadoQ.getString("email_cliente"));
                apresentacao.setUsuario(resultadoQ.getString("usuario"));
                apresentacao.setSenha(resultadoQ.getString("senha"));
                apresentacao.setSituacaoCliente(Integer.parseInt(resultadoQ.getString("situacao_cliente")));
            }

        } catch (Exception e) {
            System.out.println("Erro ao consultar angenda entre datas: " + e);
        }
        */
        
        
        // configuracoes adicionais no componente tabela
        tabela.setModel(new DefaultTableModel(dadosTabela, cabecalho) {
            @Override
            // quando retorno for FALSE, a tabela nao é editavel
            public boolean isCellEditable(int row, int column) {
                return false;
                /*  
                 if (column == 3) {  // apenas a coluna 3 sera editavel
                 return true;
                 } else {
                 return false;
                 }
                 */
            }

            // alteracao no metodo que determina a coluna em que o objeto ImageIcon devera aparecer
            @Override
            public Class getColumnClass(int column) {

                if (column == 5) {
                    //  return ImageIcon.class;
                }
                return Object.class;
            }
        });

        // permite seleção de apenas uma linha da tabela
        tabela.setSelectionMode(0);

        // redimensiona as colunas de uma tabela
        TableColumn column = null;
        for (int i = 0; i < tabela.getColumnCount(); i++) {
            column = tabela.getColumnModel().getColumn(i);
            switch (i) {
                case 0:
                    column.setPreferredWidth(17);
                    break;
                case 1:
                    column.setPreferredWidth(140);
                    break;
//                case 2:
//                    column.setPreferredWidth(14);
//                    break;
            }
        }
        // renderizacao das linhas da tabela = mudar a cor
//        jTable1.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
//
//            @Override
//            public Component getTableCellRendererComponent(JTable table, Object value,
//                    boolean isSelected, boolean hasFocus, int row, int column) {
//                super.getTableCellRendererComponent(table, value, isSelected,
//                        hasFocus, row, column);
//                if (row % 2 == 0) {
//                    setBackground(Color.GREEN);
//                } else {
//                    setBackground(Color.LIGHT_GRAY);
//                }
//                return this;
//            }
//        });
    }
    
    
    
    
    public void popularTabelaAgendamentoDataInicial(JTable tabela, String criterio) {
        // dados da tabela
        Object[][] dadosTabela = null;

        // cabecalho da tabela
        Object[] cabecalho = new Object[5];
        cabecalho[0] = "Id";
        cabecalho[1] = "Data";
        cabecalho[2] = "Cliente";
        cabecalho[3] = "Ser. Agendado";
        cabecalho[4] = "Hor. Agendado";

        // cria matriz de acordo com nº de registros da tabela
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT count(*) "
                    + "FROM agenda "
                    + "WHERE DATA_AGENDA ILIKE '%" + criterio + "%'");

            resultadoQ.next();

            dadosTabela = new Object[resultadoQ.getInt(1)][5];

        } catch (Exception e) {
            System.out.println("Erro ao cria matriz de acordo com nº de registros da tabela: " + e);
        }

        int lin = 0;

        // efetua consulta na tabela
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT * FROM "
                    + "agenda WHERE "
                    + "DATA_AGENDA ILIKE '%" + criterio + "%'"
                    + "ORDER BY data_agenda , horario_agendado");

            while (resultadoQ.next()) {
                
                dadosTabela[lin][0] = resultadoQ.getInt("id_agenda");
                dadosTabela[lin][1] = resultadoQ.getString("data_agenda");
                dadosTabela[lin][2] = resultadoQ.getString("nome_agendado");
                dadosTabela[lin][3] = resultadoQ.getString("servico_agendado");
                dadosTabela[lin][4] = resultadoQ.getString("horario_agendado");

                // caso a coluna precise exibir uma imagem
//                if (resultadoQ.getBoolean("Situacao")) {
//                    dadosTabela[lin][2] = new ImageIcon(getClass().getClassLoader().getResource("Interface/imagens/status_ativo.png"));
//                } else {
//                    dadosTabela[lin][2] = new ImageIcon(getClass().getClassLoader().getResource("Interface/imagens/status_inativo.png"));
//                }
                lin++;
            }
        } catch (Exception e) {
            System.out.println("problemas para popular tabela agendamento por data inicial");
            System.out.println(e);
        }
        
        /*
        // CONSULTA NA TABELA AGENDA ENTRE DATAS
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "SELECT * "
                    + "FROM agenda "
                    + "WHERE data_agenda BETWEEN = '" + criterio2 + "' AND = '" + criterio3 + "'";
            System.out.println("CONSULTA AGENDA ENTRE DATAS");
            System.out.println("SQL: " + sql);

            resultadoQ = st.executeQuery(sql);

            if (resultadoQ.next()) {
                Agenda apresentacao = new Agenda();

                apresentacao.setIdCliente(resultadoQ.getInt("id_cliente"));
                apresentacao.setNomeCliente(resultadoQ.getString("nome_cliente"));
                apresentacao.setEmailCliente(resultadoQ.getString("email_cliente"));
                apresentacao.setUsuario(resultadoQ.getString("usuario"));
                apresentacao.setSenha(resultadoQ.getString("senha"));
                apresentacao.setSituacaoCliente(Integer.parseInt(resultadoQ.getString("situacao_cliente")));
            }

        } catch (Exception e) {
            System.out.println("Erro ao consultar angenda entre datas: " + e);
        }
        */
        
        
        // configuracoes adicionais no componente tabela
        tabela.setModel(new DefaultTableModel(dadosTabela, cabecalho) {
            @Override
            // quando retorno for FALSE, a tabela nao é editavel
            public boolean isCellEditable(int row, int column) {
                return false;
                /*  
                 if (column == 3) {  // apenas a coluna 3 sera editavel
                 return true;
                 } else {
                 return false;
                 }
                 */
            }

            // alteracao no metodo que determina a coluna em que o objeto ImageIcon devera aparecer
            @Override
            public Class getColumnClass(int column) {

                if (column == 5) {
                    //  return ImageIcon.class;
                }
                return Object.class;
            }
        });

        // permite seleção de apenas uma linha da tabela
        tabela.setSelectionMode(0);

        // redimensiona as colunas de uma tabela
        TableColumn column = null;
        for (int i = 0; i < tabela.getColumnCount(); i++) {
            column = tabela.getColumnModel().getColumn(i);
            switch (i) {
                case 0:
                    column.setPreferredWidth(17);
                    break;
                case 1:
                    column.setPreferredWidth(140);
                    break;
//                case 2:
//                    column.setPreferredWidth(14);
//                    break;
            }
        }
        // renderizacao das linhas da tabela = mudar a cor
//        jTable1.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
//
//            @Override
//            public Component getTableCellRendererComponent(JTable table, Object value,
//                    boolean isSelected, boolean hasFocus, int row, int column) {
//                super.getTableCellRendererComponent(table, value, isSelected,
//                        hasFocus, row, column);
//                if (row % 2 == 0) {
//                    setBackground(Color.GREEN);
//                } else {
//                    setBackground(Color.LIGHT_GRAY);
//                }
//                return this;
//            }
//        });
    }
    
    
    
    
    public void popularTabelaCliente(JTable tabela, String criterio) {
        // dados da tabela
        Object[][] dadosTabela = null;

        // cabecalho da tabela
        Object[] cabecalho = new Object[6];
        cabecalho[0] = "Id";
        cabecalho[1] = "Nome";
        cabecalho[2] = "E-mail";
        cabecalho[3] = "Usuario";
        cabecalho[4] = "Senha";
        cabecalho[5] = "Situaçao";

        // cria matriz de acordo com nº de registros da tabela
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT count(*) "
                    + "FROM cliente "
                    + "WHERE NOME_CLIENTE ILIKE '%" + criterio + "%'");

            resultadoQ.next();

            dadosTabela = new Object[resultadoQ.getInt(1)][6];

        } catch (Exception e) {
            System.out.println("Erro ao consultar XXX2: " + e);
        }

        int lin = 0;

        // efetua consulta na tabela
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT * FROM "
                    + "cliente WHERE "
                    + "NOME_CLIENTE ILIKE '%" + criterio + "%'"
                    + "ORDER BY nome_cliente");

            while (resultadoQ.next()) {

                dadosTabela[lin][0] = resultadoQ.getInt("id_cliente");
                dadosTabela[lin][1] = resultadoQ.getString("nome_cliente");
                dadosTabela[lin][2] = resultadoQ.getString("email_cliente");
                dadosTabela[lin][3] = resultadoQ.getString("usuario");
                dadosTabela[lin][4] = resultadoQ.getString("senha");
                dadosTabela[lin][5] = resultadoQ.getString("situacao_cliente");

                // caso a coluna precise exibir uma imagem
//                if (resultadoQ.getBoolean("Situacao")) {
//                    dadosTabela[lin][2] = new ImageIcon(getClass().getClassLoader().getResource("Interface/imagens/status_ativo.png"));
//                } else {
//                    dadosTabela[lin][2] = new ImageIcon(getClass().getClassLoader().getResource("Interface/imagens/status_inativo.png"));
//                }
                lin++;
            }
        } catch (Exception e) {
            System.out.println("problemas para popular tabela cliente");
            System.out.println(e);
        }

        // configuracoes adicionais no componente tabela
        tabela.setModel(new DefaultTableModel(dadosTabela, cabecalho) {
            @Override
            // quando retorno for FALSE, a tabela nao é editavel
            public boolean isCellEditable(int row, int column) {
                return false;
                /*  
                 if (column == 3) {  // apenas a coluna 3 sera editavel
                 return true;
                 } else {
                 return false;
                 }
                 */
            }

            // alteracao no metodo que determina a coluna em que o objeto ImageIcon devera aparecer
            @Override
            public Class getColumnClass(int column) {

                if (column == 6) {
                    //  return ImageIcon.class;
                }
                return Object.class;
            }
        });

        // permite seleção de apenas uma linha da tabela
        tabela.setSelectionMode(0);

        // redimensiona as colunas de uma tabela
        TableColumn column = null;
        for (int i = 0; i < tabela.getColumnCount(); i++) {
            column = tabela.getColumnModel().getColumn(i);
            switch (i) {
                case 0:
                    column.setPreferredWidth(17);
                    break;
                case 1:
                    column.setPreferredWidth(140);
                    break;
//                case 2:
//                    column.setPreferredWidth(14);
//                    break;
            }
        }
        // renderizacao das linhas da tabela = mudar a cor
//        jTable1.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
//
//            @Override
//            public Component getTableCellRendererComponent(JTable table, Object value,
//                    boolean isSelected, boolean hasFocus, int row, int column) {
//                super.getTableCellRendererComponent(table, value, isSelected,
//                        hasFocus, row, column);
//                if (row % 2 == 0) {
//                    setBackground(Color.GREEN);
//                } else {
//                    setBackground(Color.LIGHT_GRAY);
//                }
//                return this;
//            }
//        });
    }
    
    
    
    
    
    
    
    
    public void popularTabelaServico(JTable tabela, String criterio) {
        // dados da tabela
        Object[][] dadosTabela = null;

        // cabecalho da tabela
        Object[] cabecalho = new Object[4];
        cabecalho[0] = "Id";
        cabecalho[1] = "Descrição";
        cabecalho[2] = "Valor";
        cabecalho[3] = "Duração";
        //cabecalho[4] = "Situação";
        

        // cria matriz de acordo com nº de registros da tabela
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT count(*) "
                    + "FROM servico "
                    + "WHERE NOME_SERVICO ILIKE '%" + criterio + "%'");

            resultadoQ.next();

            dadosTabela = new Object[resultadoQ.getInt(1)][4];

        } catch (Exception e) {
            System.out.println("Erro ao consultar XXX3: " + e);
        }

        int lin = 0;

        // efetua consulta na tabela
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT * FROM "
                    + "servico WHERE "
                    + "NOME_SERVICO ILIKE '%" + criterio + "%'"
                    + "ORDER BY nome_servico");

            while (resultadoQ.next()) {

                dadosTabela[lin][0] = resultadoQ.getInt("id_servico");
                dadosTabela[lin][1] = resultadoQ.getString("nome_servico");
                dadosTabela[lin][2] = resultadoQ.getString("valor_servico");
                dadosTabela[lin][3] = resultadoQ.getString("tempo_servico");
                //dadosTabela[lin][4] = resultadoQ.getString("situacao_servico");
                

                // caso a coluna precise exibir uma imagem
//                if (resultadoQ.getBoolean("Situacao")) {
//                    dadosTabela[lin][2] = new ImageIcon(getClass().getClassLoader().getResource("Interface/imagens/status_ativo.png"));
//                } else {
//                    dadosTabela[lin][2] = new ImageIcon(getClass().getClassLoader().getResource("Interface/imagens/status_inativo.png"));
//                }
                lin++;
            }
        } catch (Exception e) {
            System.out.println("problemas para popular tabela serviço");
            System.out.println(e);
        }

        // configuracoes adicionais no componente tabela
        tabela.setModel(new DefaultTableModel(dadosTabela, cabecalho) {
            @Override
            // quando retorno for FALSE, a tabela nao é editavel
            public boolean isCellEditable(int row, int column) {
                return false;
                /*  
                 if (column == 3) {  // apenas a coluna 3 sera editavel
                 return true;
                 } else {
                 return false;
                 }
                 */
            }

            // alteracao no metodo que determina a coluna em que o objeto ImageIcon devera aparecer
            @Override
            public Class getColumnClass(int column) {

                if (column == 4) {
                    //  return ImageIcon.class;
                }
                return Object.class;
            }
        });

        // permite seleção de apenas uma linha da tabela
        tabela.setSelectionMode(0);

        // redimensiona as colunas de uma tabela
        TableColumn column = null;
        for (int i = 0; i < tabela.getColumnCount(); i++) {
            column = tabela.getColumnModel().getColumn(i);
            switch (i) {
                case 0:
                    column.setPreferredWidth(17);
                    break;
                case 1:
                    column.setPreferredWidth(140);
                    break;
//                case 2:
//                    column.setPreferredWidth(14);
//                    break;
            }
        }
        // renderizacao das linhas da tabela = mudar a cor
//        jTable1.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
//
//            @Override
//            public Component getTableCellRendererComponent(JTable table, Object value,
//                    boolean isSelected, boolean hasFocus, int row, int column) {
//                super.getTableCellRendererComponent(table, value, isSelected,
//                        hasFocus, row, column);
//                if (row % 2 == 0) {
//                    setBackground(Color.GREEN);
//                } else {
//                    setBackground(Color.LIGHT_GRAY);
//                }
//                return this;
//            }
//        });
    }
    
    
    
  // PARA REALIZAR A CONSULTA DO RELATORIO POR VIDEO
  public void popularTabelaRelatorio(JTable tabela, String criterio) {
        // dados da tabela
        Object[][] dadosTabela = null;

        // cabecalho da tabela
        Object[] cabecalho = new Object[4];
        cabecalho[0] = "Data";
        cabecalho[1] = "Cliente";
        cabecalho[2] = "Serviço";
        cabecalho[3] = "Horario Agendado";
        //cabecalho[2] = "Duração";
        //cabecalho[5] = "Situação";
        

        // cria matriz de acordo com nº de registros da tabela
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT count(*) "
                    + "FROM agenda "
                    + "WHERE SERVICO_AGENDADO ILIKE '%" + criterio + "%'"); // AND DATA_AGENDA ILIKE '%" + criterio2 + "%'" );

            resultadoQ.next();

            dadosTabela = new Object[resultadoQ.getInt(1)][4];

        } catch (Exception e) {
            System.out.println("Erro ao consultar XXX3: " + e);
        }

        int lin = 0;

        // efetua consulta na tabela
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT * FROM "
                    + "agenda WHERE "
                    + "SERVICO_AGENDADO ILIKE '" + criterio + "'"// AND DATA_AGENDA >= '%" + criterio2 + "%'" //);
                    + "ORDER BY data_agenda, horario_agendado");

            while (resultadoQ.next()) {

                dadosTabela[lin][0] = resultadoQ.getString("data_agenda");
                dadosTabela[lin][1] = resultadoQ.getString("nome_agendado");
                dadosTabela[lin][2] = resultadoQ.getString("servico_agendado");
                //dadosTabela[lin][1] = resultadoQ.getString("valor_servico");
                dadosTabela[lin][3] = resultadoQ.getString("horario_agendado");
                //dadosTabela[lin][5] = resultadoQ.getString("situacao_servico");
                

                // caso a coluna precise exibir uma imagem
//                if (resultadoQ.getBoolean("Situacao")) {
//                    dadosTabela[lin][2] = new ImageIcon(getClass().getClassLoader().getResource("Interface/imagens/status_ativo.png"));
//                } else {
//                    dadosTabela[lin][2] = new ImageIcon(getClass().getClassLoader().getResource("Interface/imagens/status_inativo.png"));
//                }
                lin++;
            }
        } catch (Exception e) {
            System.out.println("problemas para popular tabela de relatorio");
            System.out.println(e);
        }

        // configuracoes adicionais no componente tabela
        tabela.setModel(new DefaultTableModel(dadosTabela, cabecalho) {
            @Override
            // quando retorno for FALSE, a tabela nao é editavel
            public boolean isCellEditable(int row, int column) {
                return false;
                /*  
                 if (column == 3) {  // apenas a coluna 3 sera editavel
                 return true;
                 } else {
                 return false;
                 }
                 */
            }

            // alteracao no metodo que determina a coluna em que o objeto ImageIcon devera aparecer
            @Override
            public Class getColumnClass(int column) {

                if (column == 4) {
                    //  return ImageIcon.class;
                }
                return Object.class;
            }
        });

        // permite seleção de apenas uma linha da tabela
        tabela.setSelectionMode(0);

        // redimensiona as colunas de uma tabela
        TableColumn column = null;
        for (int i = 0; i < tabela.getColumnCount(); i++) {
            column = tabela.getColumnModel().getColumn(i);
            switch (i) {
                case 0:
                    column.setPreferredWidth(17);
                    break;
                case 1:
                    column.setPreferredWidth(140);
                    break;
//                case 2:
//                    column.setPreferredWidth(14);
//                    break;
            }
        }
        // renderizacao das linhas da tabela = mudar a cor
//        jTable1.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
//
//            @Override
//            public Component getTableCellRendererComponent(JTable table, Object value,
//                    boolean isSelected, boolean hasFocus, int row, int column) {
//                super.getTableCellRendererComponent(table, value, isSelected,
//                        hasFocus, row, column);
//                if (row % 2 == 0) {
//                    setBackground(Color.GREEN);
//                } else {
//                    setBackground(Color.LIGHT_GRAY);
//                }
//                return this;
//            }
//        });
    }  
    

    
    public Agenda consultarAgendaServico(JTable tabela, String servico) {
        Agenda apresentacao = null;

        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();

            String sql = "SELECT * "
                    + "FROM agenda, servico "
                    + "WHERE nome_servico = '" + servico ;//+ "' AND data_agenda = '" + data + "'";
            System.out.println("CONSULTA RELATORIO: TIPO DE SERVIÇO");
            System.out.println("SQL: " + sql);

            resultadoQ = st.executeQuery(sql);

            if (resultadoQ.next()) {
                apresentacao = new Agenda();
                
                
                apresentacao.setIdAgenda(resultadoQ.getInt("id_agenda"));
                apresentacao.setNomeAgenda(resultadoQ.getString("nome_agendado"));
                apresentacao.setServicoAgenda(resultadoQ.getString("servico_agendado"));
                apresentacao.setHorarioAgenda(resultadoQ.getString("horario_agendado"));
                apresentacao.setDataAgenda(resultadoQ.getString("data_agenda"));
                apresentacao.setIdCliente(resultadoQ.getInt("id_servico"));
                apresentacao.setNomeServico(resultadoQ.getString("nome_servico"));
                apresentacao.setValorServico(resultadoQ.getString("valor_servico"));
                apresentacao.setTempoServico(resultadoQ.getString("tempo_servico"));
            }

        } catch (Exception e) {
            System.out.println("Erro ao consultar relatorio tipo de serviço: " + e);
        }

        return apresentacao;
    }
  

}
