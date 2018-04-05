/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Camila
 */
public class ModeloContasAReceber {
     private int id_parc;
     private int cod_venda;
     private int id_cli;
     private float valor_venda;
     private float valor_total;
     private String datavenc;
     private float valor_parc;
     private String situacao;

    /**
     * @return the id_parc
     */
    public int getId_parc() {
        return id_parc;
    }

    /**
     * @param id_parc the id_parc to set
     */
    public void setId_parc(int id_parc) {
        this.id_parc = id_parc;
    }

    /**
     * @return the cod_venda
     */
    public int getCod_venda() {
        return cod_venda;
    }

    /**
     * @param cod_venda the cod_venda to set
     */
    public void setCod_venda(int cod_venda) {
        this.cod_venda = cod_venda;
    }

    /**
     * @return the id_cli
     */
    public int getId_cli() {
        return id_cli;
    }

    /**
     * @param id_cli the id_cli to set
     */
    public void setId_cli(int id_cli) {
        this.id_cli = id_cli;
    }

    /**
     * @return the valor_venda
     */
    public float getValor_venda() {
        return valor_venda;
    }

    /**
     * @param valor_venda the valor_venda to set
     */
    public void setValor_venda(float valor_venda) {
        this.valor_venda = valor_venda;
    }

    /**
     * @return the valor_total
     */
    public float getValor_total() {
        return valor_total;
    }

    /**
     * @param valor_total the valor_total to set
     */
    public void setValor_total(float valor_total) {
        this.valor_total = valor_total;
    }

    /**
     * @return the datavenc
     */
    public String getDatavenc() {
        return datavenc;
    }

    /**
     * @param datavenc the datavenc to set
     */
    public void setDatavenc(String datavenc) {
        this.datavenc = datavenc;
    }

    /**
     * @return the valor_parc
     */
    public float getValor_parc() {
        return valor_parc;
    }

    /**
     * @param valor_parc the valor_parc to set
     */
    public void setValor_parc(float valor_parc) {
        this.valor_parc = valor_parc;
    }

    /**
     * @return the situacao
     */
    public String getSituacao() {
        return situacao;
    }

    /**
     * @param situacao the situacao to set
     */
    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

}
