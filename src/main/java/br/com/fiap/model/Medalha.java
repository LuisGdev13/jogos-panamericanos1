package br.com.fiap.model;

public class Medalha {
    private long id;
    private String tipo;
    private String modalidade;
    private String submodalidade;
    private String pais;
    private String genero;

    public Medalha() {
    }

    public Medalha(long id, String tipo, String modalidade, String submodalidade, String pais, String genero) {
        this.id = id;
        this.tipo = tipo;
        this.modalidade = modalidade;
        this.submodalidade = submodalidade;
        this.pais = pais;
        this.genero = genero;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
