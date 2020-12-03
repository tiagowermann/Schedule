/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidade;

import javafx.scene.chart.PieChart.Data;

/**
 *
 * @author Tiago
 */
public class Agenda {
    // Agenda
    private int idAgenda;
    private String nomeAgenda;
    private String servicoAgenda;
    private String horarioAgenda;
    private String dataAgenda;
    
    
    //Cliente
    private int idCliente;
    private String nomeCliente;
    private String emailCliente;
    private String usuario;
    private String senha;
    private int situacaoCliente;
    
    
    
    // cliente_agenda
    private int idCli;
    private int idAge;
   
    
    
    public String usuarioLogado;
    
    // servicos
    private int idServico;
    private String nomeServico;
    private String valorServico;
    private String tempoServico;
    private int situacaoServico;
    
    
    
    
    

    public String getNomeAgenda() {
        return nomeAgenda;
    }

    public void setNomeAgenda(String nomeAgenda) {
        this.nomeAgenda = nomeAgenda;
    }

    
    

    public String getServicoAgenda() {
        return servicoAgenda;
    }

    public void setServicoAgenda(String servicoAgenda) {
        this.servicoAgenda = servicoAgenda;
    }

    
    
    
    public String getHorarioAgenda() {
        return horarioAgenda;
    }

    public void setHorarioAgenda(String horarioAgenda) {
        this.horarioAgenda = horarioAgenda;
    }

    

    public int getIdAgenda() {
        return idAgenda;
    }

    public void setIdAgenda(int idAgenda) {
        this.idAgenda = idAgenda;
    }

    

    public String getUsuarioLogado() {
        return usuarioLogado;
    }

    public void setUsuarioLogado(String usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }

    public int getIdServico() {
        return idServico;
    }

    public void setIdServico(int idServico) {
        this.idServico = idServico;
    }

    public String getNomeServico() {
        return nomeServico;
    }

    public void setNomeServico(String nomeServico) {
        this.nomeServico = nomeServico;
    }

    public String getValorServico() {
        return valorServico;
    }

    public void setValorServico(String valorServico) {
        this.valorServico = valorServico;
    }

    public String getTempoServico() {
        return tempoServico;
    }

    public void setTempoServico(String tempoServico) {
        this.tempoServico = tempoServico;
    }

    public String getDataAgenda() {
        return dataAgenda;
    }

    public void setDataAgenda(String dataAgenda) {
        this.dataAgenda = dataAgenda;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getSituacaoCliente() {
        return situacaoCliente;
    }

    public void setSituacaoCliente(int situacaoCliente) {
        this.situacaoCliente = situacaoCliente;
    }

    public int getIdCli() {
        return idCli;
    }

    public void setIdCli(int idCli) {
        this.idCli = idCli;
    }

    public int getIdAge() {
        return idAge;
    }

    public void setIdAge(int idAge) {
        this.idAge = idAge;
    }

    public int getSituacaoServico() {
        return situacaoServico;
    }

    public void setSituacaoServico(int situacaoServico) {
        this.situacaoServico = situacaoServico;
    }
    
    
}
