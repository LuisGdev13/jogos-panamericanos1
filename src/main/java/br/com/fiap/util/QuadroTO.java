package br.com.fiap.util;

import br.com.fiap.model.Medalha;

public class QuadroTO {
    private Medalha modalidade;
    private Medalha submodalidade;
    private Integer colocacao;
    private Medalha pais;
    private String ouro;
    private String prata;
    private String bronze;

    public QuadroTO(Medalha modalidade, Medalha submodalidade, Integer colocacao, Medalha pais, String ouro, String prata, String bronze) {
        this.modalidade = modalidade;
        this.submodalidade = submodalidade;
        this.colocacao = colocacao;
        this.pais = pais;
        this.ouro = ouro;
        this.prata = prata;
        this.bronze = bronze;
    }

    public Medalha getModalidade() {
        return modalidade;
    }

    public void setModalidade(Medalha modalidade) {
        this.modalidade = modalidade;
    }

    public Medalha getSubmodalidade() {
        return submodalidade;
    }

    public void setSubmodalidade(Medalha submodalidade) {
        this.submodalidade = submodalidade;
    }

    public Integer getColocacao() {
        return colocacao;
    }

    public void setColocacao(Integer colocacao) {
        this.colocacao = colocacao;
    }

    public Medalha getPais() {
        return pais;
    }

    public void setPais(Medalha pais) {
        this.pais = pais;
    }

    public String getOuro() {
        return ouro;
    }

    public void setOuro(String ouro) {
        this.ouro = ouro;
    }

    public String getPrata() {
        return prata;
    }

    public void setPrata(String prata) {
        this.prata = prata;
    }

    public String getBronze() {
        return bronze;
    }

    public void setBronze(String bronze) {
        this.bronze = bronze;
    }
}
