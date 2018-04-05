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
public class ModeloParcelamentoVenda {
    private int codVenda;
    private int numeroParc;
    private float valor_venda;
    private float valor_total;
    private float valorParcela;
    private String dataVenc;
    private String nome_cliente;

    /**
     * @return the codVenda
     */
    public int getCodVenda() {
        return codVenda;
    }

    /**
     * @param codVenda the codVenda to set
     */
    public void setCodVenda(int codVenda) {
        this.codVenda = codVenda;
    }

    /**
     * @return the nymeroParc
     */
    public int getNumeroParc() {
        return numeroParc;
    }

    /**
     * @param nymeroParc the nymeroParc to set
     */
    public void setNumeroParc(int numeroParc) {
        this.numeroParc = numeroParc;
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
     * @return the valorParcela
     */
    public float getValorParcela() {
        return valorParcela;
    }

    /**
     * @param valorParcela the valorParcela to set
     */
    public void setValorParcela(float valorParcela) {
        this.valorParcela = valorParcela;
    }

    /**
     * @return the dataVenc
     */
    public String getDataVenc() {
        return dataVenc;
    }

    /**
     * @param dataVenc the dataVenc to set
     */
    public void setDataVenc(String dataVenc) {
        this.dataVenc = dataVenc;
    }
   
    /**
     * @return the nome_cliente
     */
    public String getNome_cliente() {
        return nome_cliente;
    }

    /**
     * @param nome_cliente the nome_cliente to set
     */
    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    /**
     * @return the nome_cliente
     */
   
}
