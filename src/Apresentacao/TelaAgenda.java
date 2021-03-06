/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Apresentacao;

import apoio.ComboItem;
import Dao.AgendamentoDAO;
import Entidade.Agenda;
import apoio.ComboItem;
import apoio.CombosDAO;
import apoio.Formatacao;
import apoio.Validacao;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javafx.scene.chart.PieChart;
import javax.swing.JOptionPane;

/**
 *
 * @author Tiago
 */
public class TelaAgenda extends javax.swing.JInternalFrame {

    AgendamentoDAO apDAO = new AgendamentoDAO();
    int id = 0;

    /**
     * Creates new form CadastroNovo
     */
    public TelaAgenda() {
        initComponents();
        apDAO.popularTabelaAgendamento(jTableCadastroAgenda, jFormattedTextFieldPesquisaAgenda.getText());
        

        // popula Combo cliente
        new CombosDAO().popularCombo("cliente", jComboBoxClienteAgenda);
        // popula Combo serviço
        new CombosDAO().popularCombo("servico", jComboBoxServicoAgenda);

        jFormattedTextFieldPesquisaAgenda.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (Character.isDigit(c)) {
                    Toolkit.getDefaultToolkit().beep();
                    e.consume();
                }
            }
        });

        Date data = new Date(System.currentTimeMillis());
        SimpleDateFormat formatarData = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Data Sistema: " + formatarData.format(data));

        // DEIXA A DATA COM O DIA ATUAL.
        //jFTFDataInicialAgendamento.setText(formatarData.format(data));
        //jFTFDataFinalAgendamento.setText(formatarData.format(data));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPanePesquisar = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        BuscarNome = new javax.swing.JLabel();
        jButtonPesquisarAgenda = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCadastroAgenda = new javax.swing.JTable();
        jButtonExcluirAgenda = new javax.swing.JButton();
        jButtonEditarAgenda = new javax.swing.JButton();
        jFormattedTextFieldPesquisaAgenda = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jFTFDataInicialAgendamento = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jFTFDataFinalAgendamento = new javax.swing.JFormattedTextField();
        jButtonCancelarCadastroAgenda = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButtonCadastrarAgenda = new javax.swing.JButton();
        Cliente = new javax.swing.JLabel();
        Servico = new javax.swing.JLabel();
        Horario = new javax.swing.JLabel();
        jFTFDataAgenda = new javax.swing.JFormattedTextField();
        Data = new javax.swing.JLabel();
        jFTFHorarioAgenda = new javax.swing.JFormattedTextField();
        jComboBoxClienteAgenda = new javax.swing.JComboBox<>();
        jComboBoxServicoAgenda = new javax.swing.JComboBox<>();
        jTabbedPane2 = new javax.swing.JTabbedPane();

        setTitle("Agendamento");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Pesquisar Horários"));

        BuscarNome.setText("Nome:");

        jButtonPesquisarAgenda.setText("Pesquisar");
        jButtonPesquisarAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarAgendaActionPerformed(evt);
            }
        });

        jTableCadastroAgenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableCadastroAgenda);

        jButtonExcluirAgenda.setText("Excluir");
        jButtonExcluirAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirAgendaActionPerformed(evt);
            }
        });

        jButtonEditarAgenda.setText("Editar");
        jButtonEditarAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarAgendaActionPerformed(evt);
            }
        });

        jLabel1.setText("Data Inicial:");

        jFTFDataInicialAgendamento.setEditable(false);
        try {
            jFTFDataInicialAgendamento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel2.setText("Data Final:");

        jFTFDataFinalAgendamento.setEditable(false);
        try {
            jFTFDataFinalAgendamento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(BuscarNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldPesquisaAgenda)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFTFDataInicialAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFTFDataFinalAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonPesquisarAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonEditarAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonExcluirAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BuscarNome)
                    .addComponent(jButtonPesquisarAgenda)
                    .addComponent(jFormattedTextFieldPesquisaAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jFTFDataInicialAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jFTFDataFinalAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonExcluirAgenda)
                    .addComponent(jButtonEditarAgenda))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonCancelarCadastroAgenda.setText("Fechar");
        jButtonCancelarCadastroAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarCadastroAgendaActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Agendar Horario", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jButtonCadastrarAgenda.setText("Cadastrar");
        jButtonCadastrarAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarAgendaActionPerformed(evt);
            }
        });

        Cliente.setText("Cliente:");

        Servico.setText("Serviço:");

        Horario.setText("Horario:");

        try {
            jFTFDataAgenda.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        Data.setText("Data:");

        try {
            jFTFHorarioAgenda.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jComboBoxClienteAgenda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBoxServicoAgenda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonCadastrarAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Servico, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jComboBoxServicoAgenda, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(Data)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFTFDataAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Horario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFTFHorarioAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14))
                            .addComponent(jComboBoxClienteAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 17, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cliente)
                    .addComponent(jComboBoxClienteAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Servico)
                    .addComponent(jFTFDataAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Data)
                    .addComponent(jComboBoxServicoAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Horario)
                    .addComponent(jFTFHorarioAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jButtonCadastrarAgenda)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonCancelarCadastroAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButtonCancelarCadastroAgenda)
                .addContainerGap())
        );

        jTabbedPanePesquisar.addTab("Agenda", jPanel1);
        jTabbedPanePesquisar.addTab("", jTabbedPane2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPanePesquisar)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPanePesquisar)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastrarAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarAgendaActionPerformed

        // criar instancia Agenda
        Agenda agenda = new Agenda();
        // cria instancia Validacao
        Validacao v = new Validacao();

        // popular o obj
        agenda.setIdCliente(id);
        if (jComboBoxClienteAgenda.getSelectedIndex() == 0) { // VERIFICA SE A COMBO CLIENTE ESTA VAZIA
            System.out.println("ComboBox cliente agendado em branco !");
            JOptionPane.showMessageDialog(null, "Selecione um cliente!");

        } else { // INICIO else combobox cliente
            if (jComboBoxServicoAgenda.getSelectedIndex() == 0) { // VERIFICA SE A COMBO SERVIÇO ESTA VAZIA
                System.out.println("ComboBox serviço agendado em branco !");
                JOptionPane.showMessageDialog(null, "Selecione um serviço!");

            } else { // INICIO else combobox serviço
                if (jFTFDataAgenda.getText().equals("  /  /    ")) { // VERIFICA SE A DATA ESTA VAZIA
                    System.out.println("Data do agendamento em branco!");

                    JOptionPane.showMessageDialog(null, "Data em branco!");

                } else { // INICIO else data
                    if (jFTFHorarioAgenda.getText().trim().equals(":")) { // VERIFICA SE O HORARIO ESTA VAZIO
                        System.out.println("Horario do agendamento em branco");
                        System.out.println(jFTFDataAgenda.getText());
                        JOptionPane.showMessageDialog(null, "Horario está vazio!");

                    } else { // INICIO data em branco
                        if (!Validacao.validarDataFormatada(jFTFDataAgenda.getText())) { // VALIDAÇÃO DA DATA
                            System.out.println("Data do agendamento em branco");
                            JOptionPane.showMessageDialog(null, "Preencha a data adequadamente!");

                        } else { // INICIO confere se a data é inferior a data atual
                            if (v.comparaDatas(jFTFDataAgenda.getText()) < 0) { // VERIFICA SE A DATA É INFERIOR A DATA ATUAL
                                System.out.println("Data do agendamento inferior a data atual");
                                JOptionPane.showMessageDialog(null, "Data inferior a data de atual!");

                            } else { // Se tudo estiver correto, manda cadastrar agendamento.

                                // Popula objeto
                                agenda.setServicoAgenda(String.valueOf(jComboBoxServicoAgenda.getSelectedItem()));
                                agenda.setNomeAgenda(String.valueOf(jComboBoxClienteAgenda.getSelectedItem()));
                                agenda.setDataAgenda(jFTFDataAgenda.getText());
                                agenda.setHorarioAgenda(jFTFHorarioAgenda.getText());

                                // criar instancia AgendamentoDAO
                                AgendamentoDAO agDAO = new AgendamentoDAO();

                                if (!agDAO.consultarTabelaAgenda(agenda.getDataAgenda(), agenda.getHorarioAgenda())) {
                                    JOptionPane.showMessageDialog(null, "Aviso!! Cuidado para não agendar mais de dois serviços no mesmo horário!");
                                }
                                // vou mandar salvar
                                if (agDAO.cadastrarAgendamento(agenda)) {
                                    JOptionPane.showMessageDialog(null, "Agendamento cadastrado com sucesso!");
                                    apDAO.popularTabelaAgendamento(jTableCadastroAgenda, jFormattedTextFieldPesquisaAgenda.getText());
                                    

                                    // limpa os campos
                                    //jTextFieldCliente.setText("");
                                    //jTextTipoServicoAgendado.setText("");
                                    // popula Combo cliente
                                    new CombosDAO().popularCombo("cliente", jComboBoxClienteAgenda);

                                    // popula Combo serviço
                                    new CombosDAO().popularCombo("servico", jComboBoxServicoAgenda);
                                    jFTFHorarioAgenda.setText("");
                                    jFTFDataAgenda.setText("");

                                    // posiciona cursor
                                    //jTextFieldCliente.requestFocus();
                                    // resetar o id
                                    id = 0;
                                } else {
                                    JOptionPane.showMessageDialog(null, "Problemas ao cadastrar o agendamento.");
                                }

                            } // FIM do else se tudo estiver correto
                        }// FIM confere se a data é inferior a data atual
                    } // FIM else data em branco
                }// FIM else data 
            }// FIM do else combobox serviço
        }// FIM do combobox cliente
    }//GEN-LAST:event_jButtonCadastrarAgendaActionPerformed

    private void jButtonCancelarCadastroAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarCadastroAgendaActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarCadastroAgendaActionPerformed

    private void jButtonEditarAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarAgendaActionPerformed
        String idString = String.valueOf(jTableCadastroAgenda.getValueAt(jTableCadastroAgenda.getSelectedRow(), 0));

        id = Integer.parseInt(idString);

        AgendamentoDAO apDAO = new AgendamentoDAO();

        Agenda agenda = apDAO.consultarAgenda(id);
        Agenda cliente = apDAO.consultarTabelaCliente((String.valueOf(jTableCadastroAgenda.getValueAt(jTableCadastroAgenda.getSelectedRow(), 2))));
        Agenda servico = apDAO.consultarTabelaServico((String.valueOf(jTableCadastroAgenda.getValueAt(jTableCadastroAgenda.getSelectedRow(), 3))));

        System.out.println("nome cliente = " + cliente.getNomeCliente());
        System.out.println("nome servico = " + servico.getNomeServico());

        if (agenda != null) {
            // define os valores do obj nos campos da tela

            // captura o cliente da jTable e joga na comboBoxClienteAgenda
            ComboItem ci = new ComboItem();
            ci.setCodigo(cliente.getIdCliente());
            new CombosDAO().definirItemCombo(jComboBoxClienteAgenda, ci);
            System.out.println("id cliente = " + cliente.getIdCliente());

            // captura o servico da jTable e joga na comboBoxservicoAgenda
            //ComboItem cis = new ComboItem();
            ci.setCodigo(servico.getIdServico());
            new CombosDAO().definirItemCombo(jComboBoxServicoAgenda, ci);
            System.out.println("id servico = " + servico.getIdServico());

            jFTFHorarioAgenda.setText(String.valueOf(agenda.getHorarioAgenda()));
            jFTFDataAgenda.setText(agenda.getDataAgenda());

            apDAO.popularTabelaAgendamento(jTableCadastroAgenda, jFormattedTextFieldPesquisaAgenda.getText());
            

            // mudar de aba
            //jTabbedPane1.setSelectedIndex(0);
            // definir o foco
            //jTextFieldCliente.requestFocus();
        } else {
            JOptionPane.showMessageDialog(null, "Problemas ao editar agendamento.");
        }
    }//GEN-LAST:event_jButtonEditarAgendaActionPerformed

    private void jButtonExcluirAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirAgendaActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Deseja realmente excluir?") == JOptionPane.OK_OPTION) {

            String idString = String.valueOf(jTableCadastroAgenda.getValueAt(jTableCadastroAgenda.getSelectedRow(), 0));

            int idExclusao = Integer.parseInt(idString);

            AgendamentoDAO apDAO = new AgendamentoDAO();

            if (apDAO.excluirAgendamento(idExclusao)) {
                JOptionPane.showMessageDialog(null, "Agendamento excluído com sucesso!");
                apDAO.popularTabelaAgendamento(jTableCadastroAgenda, jFormattedTextFieldPesquisaAgenda.getText());
                

            } else {
                JOptionPane.showMessageDialog(null, "Problemas ao excluir agendamento.");
            }
        }
    }//GEN-LAST:event_jButtonExcluirAgendaActionPerformed

    private void jButtonPesquisarAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarAgendaActionPerformed

        /*if (jTextCampoBuscarData.getText().trim().length() == 10) {
            if (Validacao.validarDataFormatada(jTextCampoBuscarData.getText())) {
                //lblStatusData.setText("Data Ok");
                //lblStatusData.setForeground(Color.BLUE);
                new AgendamentoDAO().popularTabelaAgendamento(jTableApresentarPesquisa,(jTextCampoBuscarData.getText()));
            } else {
                JOptionPane.showMessageDialog(null, " Erro na data! ");
                //lblStatusData.setText("Erro na data");
                //lblStatusData.setForeground(Color.RED);
            }
        } else {
            JOptionPane.showMessageDialog(null, " Preencha a dat adequadamente! ");
            //lblStatusData.setText("Preencha adequadamente");
        }*/
       

        new AgendamentoDAO().popularTabelaAgendamento(jTableCadastroAgenda, jFormattedTextFieldPesquisaAgenda.getText());
    }//GEN-LAST:event_jButtonPesquisarAgendaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BuscarNome;
    private javax.swing.JLabel Cliente;
    private javax.swing.JLabel Data;
    private javax.swing.JLabel Horario;
    private javax.swing.JLabel Servico;
    private javax.swing.JButton jButtonCadastrarAgenda;
    private javax.swing.JButton jButtonCancelarCadastroAgenda;
    private javax.swing.JButton jButtonEditarAgenda;
    private javax.swing.JButton jButtonExcluirAgenda;
    private javax.swing.JButton jButtonPesquisarAgenda;
    private javax.swing.JComboBox<String> jComboBoxClienteAgenda;
    private javax.swing.JComboBox<String> jComboBoxServicoAgenda;
    private javax.swing.JFormattedTextField jFTFDataAgenda;
    private javax.swing.JFormattedTextField jFTFDataFinalAgendamento;
    private javax.swing.JFormattedTextField jFTFDataInicialAgendamento;
    private javax.swing.JFormattedTextField jFTFHorarioAgenda;
    private javax.swing.JFormattedTextField jFormattedTextFieldPesquisaAgenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPanePesquisar;
    private javax.swing.JTable jTableCadastroAgenda;
    // End of variables declaration//GEN-END:variables

}
