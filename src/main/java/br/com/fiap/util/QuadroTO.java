package br.com.fiap.util;

import br.com.fiap.util.QuadroTO;

public class QuadroTO {
    private String modalidade;
    private String submodalidade;
    private Integer colocacao;
    private String pais;
    private Integer ouro;
    private Integer prata;
    private Integer bronze;

    public QuadroTO(String modalidade, String submodalidade, Integer colocacao, String pais, Integer ouro, Integer prata, Integer bronze) {
        this.modalidade = modalidade;
        this.submodalidade = submodalidade;
        this.colocacao = colocacao;
        this.pais = pais;
        this.ouro = ouro;
        this.prata = prata;
        this.bronze = bronze;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public String getSubmodalidade() {
        return submodalidade;
    }

    public void setSubmodalidade(String submodalidade) {
        this.submodalidade = submodalidade;
    }

    public Integer getColocacao() {
        return colocacao;
    }

    public void setColocacao(Integer colocacao) {
        this.colocacao = colocacao;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Integer getOuro() {
        return ouro;
    }

    public void setOuro(Integer ouro) {
        this.ouro = ouro;
    }

    public Integer getPrata() {
        return prata;
    }

    public void setPrata(Integer prata) {
        this.prata = prata;
    }

    public Integer getBronze() {
        return bronze;
    }

    public void setBronze(Integer bronze) {
        this.bronze = bronze;
    }
}