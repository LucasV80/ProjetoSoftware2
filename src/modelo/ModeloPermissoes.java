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
public class ModeloPermissoes {
    private int id_permissoes;
    private String nomePermissao;
    private Boolean editar;
    private Boolean excluir;
    private Boolean salvar;
    private Boolean novo;
    private Boolean pesquisar;
    private Boolean relatorio;
    private Boolean cad_cliente;
    private Boolean cad_fornecedor;
    private Boolean cad_produto;
    private Boolean consulta_venda;
    private Boolean pesquisa_venda;
    private Boolean vendas;    

    /**
     * @return the id_permissoes
     */
    public int getId_permissoes() {
        return id_permissoes;
    }

    /**
     * @param id_permissoes the id_permissoes to set
     */
    public void setId_permissoes(int id_permissoes) {
        this.id_permissoes = id_permissoes;
    }

    /**
     * @return the nomePermissao
     */
    public String getNomePermissao() {
        return nomePermissao;
    }

    /**
     * @param nomePermissao the nomePermissao to set
     */
    public void setNomePermissao(String nomePermissao) {
        this.nomePermissao = nomePermissao;
    }

    /**
     * @return the editar
     */
    public Boolean getEditar() {
        return editar;
    }

    /**
     * @param editar the editar to set
     */
    public void setEditar(Boolean editar) {
        this.editar = editar;
    }

    /**
     * @return the excluir
     */
    public Boolean getExcluir() {
        return excluir;
    }

    /**
     * @param excluir the excluir to set
     */
    public void setExcluir(Boolean excluir) {
        this.excluir = excluir;
    }

    /**
     * @return the salvar
     */
    public Boolean getSalvar() {
        return salvar;
    }

    /**
     * @param salvar the salvar to set
     */
    public void setSalvar(Boolean salvar) {
        this.salvar = salvar;
    }

    /**
     * @return the novo
     */
    public Boolean getNovo() {
        return novo;
    }

    /**
     * @param novo the novo to set
     */
    public void setNovo(Boolean novo) {
        this.novo = novo;
    }

    /**
     * @return the pesquisar
     */
    public Boolean getPesquisar() {
        return pesquisar;
    }

    /**
     * @param pesquisar the pesquisar to set
     */
    public void setPesquisar(Boolean pesquisar) {
        this.pesquisar = pesquisar;
    }

    /**
     * @return the relatorio
     */
    public Boolean getRelatorio() {
        return relatorio;
    }

    /**
     * @param relatorio the relatorio to set
     */
    public void setRelatorio(Boolean relatorio) {
        this.relatorio = relatorio;
    }

    /**
     * @return the cad_cliente
     */
    public Boolean getCad_cliente() {
        return cad_cliente;
    }

    /**
     * @param cad_cliente the cad_cliente to set
     */
    public void setCad_cliente(Boolean cad_cliente) {
        this.cad_cliente = cad_cliente;
    }

    /**
     * @return the cad_fornecedor
     */
    public Boolean getCad_fornecedor() {
        return cad_fornecedor;
    }

    /**
     * @param cad_fornecedor the cad_fornecedor to set
     */
    public void setCad_fornecedor(Boolean cad_fornecedor) {
        this.cad_fornecedor = cad_fornecedor;
    }

    /**
     * @return the cad_produto
     */
    public Boolean getCad_produto() {
        return cad_produto;
    }

    /**
     * @param cad_produto the cad_produto to set
     */
    public void setCad_produto(Boolean cad_produto) {
        this.cad_produto = cad_produto;
    }

    /**
     * @return the consulta_venda
     */
    public Boolean getConsulta_venda() {
        return consulta_venda;
    }

    /**
     * @param consulta_venda the consulta_venda to set
     */
    public void setConsulta_venda(Boolean consulta_venda) {
        this.consulta_venda = consulta_venda;
    }

    /**
     * @return the pesquisa_venda
     */
    public Boolean getPesquisa_venda() {
        return pesquisa_venda;
    }

    /**
     * @param pesquisa_venda the pesquisa_venda to set
     */
    public void setPesquisa_venda(Boolean pesquisa_venda) {
        this.pesquisa_venda = pesquisa_venda;
    }

    /**
     * @return the vendas
     */
    public Boolean getVendas() {
        return vendas;
    }

    /**
     * @param vendas the vendas to set
     */
    public void setVendas(Boolean vendas) {
        this.vendas = vendas;
    }
}
