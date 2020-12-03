/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidade;

/**
 *
 * @author Tiago
 */
public class Servico {
    
    private int idServico;
    private String nomeServico;
    private String valorServico;
    private String tempoServico;
    private int situacaoServico;
    
    
    

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

    public int getSituacaoServico() {
        return situacaoServico;
    }

    public void setSituacaoServico(int situacaoServico) {
        this.situacaoServico = situacaoServico;
    }
    
}
